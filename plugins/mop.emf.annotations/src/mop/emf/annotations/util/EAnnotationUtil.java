package mop.emf.annotations.util;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;

public class EAnnotationUtil {
	public static List<EModelElement> getAnnotated(Resource r, String uri) {
		ArrayList<EModelElement> result = new ArrayList<EModelElement>();
		r.getAllContents().forEachRemaining(obj -> {
			if ( obj instanceof EModelElement ) {
				EModelElement m = (EModelElement) obj;
				EAnnotation ann = m.getEAnnotation(uri);
				if ( ann != null )
					result.add(m);
			}
		});
		return result;
	}
	
	public static void setFeature(EModelElement m, String annURI, EObject target, String feature) {
		// f is the feature that we have to set, which has a direct correspondence (by name)
		// with the feature that was used as linguistic extension in the definition of the annotation (annURI)
		EStructuralFeature f = target.eClass().getEStructuralFeature(feature);
		
		EAnnotation eAnn = m.getEAnnotation(annURI);
		String annValue  = eAnn.getDetails().get(feature);
		if ( annValue == null ) {
			// I could have compulsory and optional features
			System.err.println("No value for attribute '" + feature + "' in annotation " + annURI);
			// throw new IllegalArgumentException("No value for attribute '" + feature + "' in annotation " + annURI);
		}
		
		// Consider the different coercions between string values and the type of the feature
		if ( f.getEType() == EcorePackage.Literals.ESTRUCTURAL_FEATURE || 
			 f.getEType() == EcorePackage.Literals.EREFERENCE || 
			 f.getEType() == EcorePackage.Literals.EATTRIBUTE ) {
			// Parse ClassName.featureName
			EPackage pkg = (EPackage) m.eResource().getContents().get(0);			
			EStructuralFeature value = parseEStructuralFeature(pkg, annValue);	
			target.eSet(f, value);
//		} else if ( EcorePackage.Literals.ESTRING.isInstance(f.getEType()) ) {
		} else if ( f.getEType().getInstanceClass() == String.class )  {
			target.eSet(f, annValue);
		} else {
			throw new UnsupportedOperationException();
		}
	}
	
	protected static EStructuralFeature parseEStructuralFeature(EPackage metamodel, String field) {
		String[] parts = field.split("\\.");
		EClass container = (EClass) metamodel.getEClassifier(parts[0]);
		return container.getEStructuralFeature(parts[1]);
	}
}
