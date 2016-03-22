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
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.resource.Resource;
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
	
	public static final String TYPE_ANN     = "http://emop/typeobj/type";
	public static final String TYPE_PKG_ANN = "http://emop/typeobj/package";
	
	
	@Override
	public void process(EMOP mop) {
		// This is done for every save. How can I rapidly check
		// if I want to do this??
		mop.onModelSave().
			after(this::checkAnnotations);
	}

	public void checkAnnotations(Resource r) {
		// Which is the meta-model? We use the ResourceType library
		Metamodel m = ModelIndex.instance().getMetamodelOf(r);
		if ( m == null ) {
			System.out.println("Null metamodel: " + r);
			return;
		}
		
		ArrayList<EObject> typeObjects = new ArrayList<EObject>();
		TreeIterator<EObject> it = r.getAllContents();
		while ( it.hasNext() ) {
			EObject o = it.next();
			EClass  c = o.eClass();
			extractAnnotations(c, TYPE_ANN, (_me, _ann) -> {
				typeObjects.add(o);
			});
		}

		if ( m.getPackages().size() > 1 ) 
			throw new UnsupportedOperationException("Promotions with more than one meta-model not supported");
		if ( m.getPackages().isEmpty() ) {
			// It is likely that the model is just empty
			// (or the ResourceType library has not worked...) 
			return;
		}
		
		
		EPackage pkg = m.getPackages().get(0);
		EAnnotation ann = extractAnnotation(pkg, TYPE_PKG_ANN);
		String name = ann.getDetails().get("name");		
		String uri  = ann.getDetails().get("uri");
		String prefix = "prefix_" + name;
		
		EPackage pkgInstance = EcoreFactory.eINSTANCE.createEPackage();
		pkgInstance.setName(name);
		pkgInstance.setNsURI(uri);
		pkgInstance.setNsPrefix(prefix);
				
		// Create the meta-classes
		for (EObject to : typeObjects) {
			EAnnotation toAnn  = extractAnnotation(to.eClass(), TYPE_ANN);
			String featureName = toAnn.getDetails().get("fid");
			
			String className = to.eGet(to.eClass().getEStructuralFeature(featureName)).toString();
			EClass classInstance = EcoreFactory.eINSTANCE.createEClass();
			classInstance.setName(className);
			
			pkgInstance.getEClassifiers().add(classInstance);
		}
		
		String metamodelFile = r.getURI().toFileString() + ".ecore";
		Resource newResource = new EcoreResourceFactoryImpl().createResource(URI.createFileURI(metamodelFile));
		newResource.getContents().add(pkgInstance);
		try {
			newResource.save(null);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public List<Class<?>> dependences() {
		return Collections.singletonList(ResourceType.class);
	}
	
}
