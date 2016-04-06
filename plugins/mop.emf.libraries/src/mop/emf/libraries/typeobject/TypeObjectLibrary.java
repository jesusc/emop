package mop.emf.libraries.typeobject;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;

import mop.emf.annotations.GlobalLibrary;
import mop.emf.core.EMOP;
import mop.emf.libraries.resourcetype.Metamodel;
import mop.emf.libraries.resourcetype.ModelIndex;
import mop.emf.libraries.resourcetype.ResourceType;


/**
 * Provides support for the type-object pattern by automatically
 * promoting models.
 *
 * Annotations:
 * <ul>
 *   <li>http://emop/typeobj/type</li>. Marks a class as a type. For each
 *       instantiation of the class a new EClass is created to enable
 *       its further instantiation.
 *   <li>http://emop/typeobj/package</li>. Indicates how a package is further
 *       instantiated. Attributes "name" and "uri" are required.    
 *       
 *   <li>http://emop/typeobj/type_id</li>. TODO: Indicates the attribute used as 
 *       identifier for the type with the instance marked with http://emop/type
 * </ul>
 * 
 * TODO: The library implements a validator to ensure the correctness
 * of the annotations.
 * 
 * @author jesus
 *
 */
public class TypeObjectLibrary extends GlobalLibrary {
	
	public static final String TYPE_ANN       = "http://emop/typeobj/type";
	public static final String TYPE_PKG_ANN   = "http://emop/typeobj/package";
	public static final String FEAT_LEVEL_ANN = "http://emop/typeobj/next_level";
	 
	
	@Override
	public void process(EMOP mop) {
		// This is done for every save. How can I rapidly check
		// if I want to do this??
		mop.onModelSave().
			after(this::checkAnnotations);
	}

	public void checkAnnotations(Resource r) {
		System.out.println("Checking on " + r);
		
		// Which is the meta-model? We use the ResourceType library
		Metamodel m = ModelIndex.instance().getMetamodelOf(r);
		if ( m == null ) {
			System.out.println("Null metamodel: " + r);
			return;
		}
		
		EPackage pkg = findPromotedPackage(m.getPackages());
		if ( pkg == null ) {
			// It is likely that the model is just empty
			// (or the ResourceType library has not worked...) 
			return;
		}		
		
		EAnnotation ann = extractAnnotation(pkg, TYPE_PKG_ANN);
		String annName = ann.getDetails().get("name");		
		String annUri  = ann.getDetails().get("uri");
		
		
		String name = null;
		String uri  = null;
		String prefix  = null;
		EStructuralFeature promotedPkgNameFeature = parseEStructuralFeature(pkg, annName);
	

		// Traverse the model to find relevan information
		ArrayList<EObject> typeObjects = new ArrayList<EObject>();
		TreeIterator<EObject> it = r.getAllContents();
		while ( it.hasNext() ) {
			EObject o = it.next();
			EClass  c = o.eClass();
			extractAnnotations(c, TYPE_ANN, (_me, _ann) -> {
				typeObjects.add(o);
			});
			
			// Find the feature to set the name of the package
			if ( c.getEStructuralFeatures().contains(promotedPkgNameFeature) ) {
				name = (String) o.eGet(promotedPkgNameFeature);
				// assument uri == "auto"
				uri    = "http://emop/" + name;
				prefix = name;
			}
		}

		if ( name == null )
			throw new IllegalStateException("No object for feature " + annName + " found");
		
		EPackage pkgInstance = EcoreFactory.eINSTANCE.createEPackage();
		pkgInstance.setName(name);
		pkgInstance.setNsURI(uri);
		pkgInstance.setNsPrefix(prefix);

		// Create a root class
		EClass rootClass = EcoreFactory.eINSTANCE.createEClass();
		rootClass.setName(name);
		pkgInstance.getEClassifiers().add(rootClass);

		
		// Create the meta-classes
		for (EObject to : typeObjects) {
			EAnnotation toAnn  = extractAnnotation(to.eClass(), TYPE_ANN);
			String featureName = toAnn.getDetails().get("fid");
			
			Object v = to.eGet(to.eClass().getEStructuralFeature(featureName));
			if ( v != null ) {
				String className = v.toString();
				EClass classInstance = EcoreFactory.eINSTANCE.createEClass();
				classInstance.setName(className);
	
				// create reference in the root class
				EReference ref = EcoreFactory.eINSTANCE.createEReference();
				ref.setName(getRootClassRefFeatureName(className));
				ref.setUpperBound(-1);
				ref.setEType(classInstance);
				ref.setContainment(true);
				rootClass.getEStructuralFeatures().add(ref);
				
				// set up features that must be instantiated in the next level
				createFeatures(to, classInstance);
				
				pkgInstance.getEClassifiers().add(classInstance);
			}
		}
		
		URI metamodelURI = r.getURI().appendFileExtension("ecore");
		Resource newResource = new EcoreResourceFactoryImpl().createResource(metamodelURI);
		newResource.getContents().add(pkgInstance);
		try {
			// This would be good moment to deactivate the onSave event, to avoid entering here again
			// (even though it this case it has no implication).
			newResource.save(null);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private EPackage findPromotedPackage(List<EPackage> packages) {
		for (EPackage pkg : packages) {
			EAnnotation ann = extractAnnotation(pkg, TYPE_PKG_ANN);
			if ( ann != null ) {
				return pkg;
			}			
		}
		return null;
	}

	private String getRootClassRefFeatureName(String className) {	
		String name = className.substring(0, 1).toLowerCase() + className.substring(1);
		if ( ! name.endsWith("s") )
			name = name + "s";
		return name;
	}

	private void createFeatures(EObject typeObject, EClass classInstance) {
		EClass typeAnnClass = typeObject.eClass();
		
		// Copy features with "potency" 
		for (EStructuralFeature f : typeAnnClass.getEAllStructuralFeatures()) {
			EAnnotation ann = extractAnnotation(f, FEAT_LEVEL_ANN);
			if ( ann != null ) {
				EStructuralFeature newFeature = EcoreUtil.copy(f);
				newFeature.getEAnnotations().clear();
				classInstance.getEStructuralFeatures().add(newFeature);
			}
		}
		
		// If the typeAnnClass inherits from EClass then it can define linguistic extensions.
		// Every feature defined in classInstance must be copied to allow its setting in the next level
		// if ( typeAnnClass.getEAllSuperTypes().contains(EcorePackage.Literals.ECLASS))
		if ( EcorePackage.Literals.ECLASS.isInstance(typeObject) ) {
			for (EObject eobj : typeObject.eContents()) {
				if ( eobj instanceof EStructuralFeature ) {
					EStructuralFeature newFeature = (EStructuralFeature) EcoreUtil.copy(eobj);
					classInstance.getEStructuralFeatures().add(newFeature);					
				}
			}
		}
		
		
	}

	@Override
	public List<Class<?>> dependences() {
		return Collections.singletonList(ResourceType.class);
	}
	
}
