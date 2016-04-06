package mop.emf.libraries.autoinst;

import java.util.Collection;

import mop.emf.annotations.MetamodelLibrary;
import mop.emf.core.EMOP;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;

public class AutoInst2Library extends MetamodelLibrary {
	public static String CLASS_ANN_URI = "http://autoinst";
	private String extension;
	
	public AutoInst2Library(String extension) {
		this.extension = extension;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public void process(Resource metamodel) {
		EMOP emop = EMOP.global();
		EPackage pkg = (EPackage) metamodel.getContents().get(0);
		
		extractEAnnotations(metamodel, "http://autoinst", (m, ann) -> {
			if ( ! ( m instanceof EClass) ) {
				System.err.println("Annotation only for Eclass");
				return;
			}
			
			EClass c = (EClass) m;

			
			String field = ann.getDetails().get("set");
			if ( field != null ) {
				String[] parts = field.split("\\.");
				EClass container = (EClass) c.getEPackage().getEClassifier(parts[0]);
				EStructuralFeature feature = container.getEStructuralFeature(parts[1]);
				
				
				emop.onInstantiate(container, (obj) -> {
					EObject newInstance = EcoreUtil.create(c);
					setFeatures(ann, c, newInstance);

					if ( feature.isMany() ) {
						((Collection<EObject>) obj.eGet(feature)).add(newInstance);
						System.out.println(newInstance);
					} else {
						obj.eSet(feature, newInstance);
					}
					
					// Need to indicate that this has alredy been set
				});
			}
			
			
			//			emop.onModelCreate(pkg.getNsURI()).
//				after((rs, p, r) -> {					
//					EObject obj = EcoreUtil.create(c);
//					r.getContents().add(obj);
//					
//					setFeatures(ann, c, obj);
//				});
			
	
		emop.onModelLoad().
			//filter(r -> r.getURI().fileExtension().equals(extension) ).
			before(r -> {	
				System.out.println(r);
				System.out.println(r.getContents());
			});

			
//			emop.onModelLoad().
//				filter(r -> r.getURI().fileExtension().equals(extension) ).
//				before(r -> {	
//					System.out.println(r);
//					System.out.println(r.getResourceSet());
//					System.out.println(r.getResourceSet().getResources());
//
//					EObject obj = EcoreUtil.create(c);
//					r.getContents().add(obj);
//
//					setFeatures(ann, c, obj);
//				});
		});
	}

	protected void setFeatures(EAnnotation ann, EClass c, EObject target) {
		ann.getDetails().forEach( entry -> {
			if ( entry.getKey().startsWith("_") ) {
				String fname = entry.getKey().substring(1);
				EStructuralFeature f = c.getEStructuralFeature(fname);
				
				if ( f == null) {
					System.err.println("No feature " + fname);
				} else if ( !( f instanceof EAttribute ) ) {
					System.err.println("Automatica setter only for attributes");
				}
				
				EDataType t = (EDataType) f.getEType();
				Object obj = EcoreFactory.eINSTANCE.createFromString(t, entry.getValue());
				
				target.eSet(f, obj);
				
			}
		});
	}	
}
