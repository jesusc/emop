package mop.emf.annotations;

import mop.emf.core.functional.Consumer2;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;

public abstract class AbstractLibrary {

	protected void extractEAnnotations(Resource metamodel, String uri, Consumer2<EModelElement, EAnnotation> callback) {
		metamodel.getAllContents().forEachRemaining(obj -> {
			if ( obj instanceof EModelElement ) {
				EModelElement m = (EModelElement) obj;
				extractAnnotations(m, uri, callback);
			}
		});
	}

	protected EAnnotation extractAnnotation(EModelElement m, String uri) {
		return m.getEAnnotation(uri);
	}
	
	protected void extractAnnotations(EModelElement m, String uri, Consumer2<EModelElement, EAnnotation> callback) {
		EAnnotation ann = m.getEAnnotation(uri);
		if ( ann != null ) {
			callback.accept(m, ann);
		}
	}
	
	protected EStructuralFeature parseEStructuralFeature(EPackage metamodel, String field) {
		String[] parts = field.split("\\.");
		EClass container = (EClass) metamodel.getEClassifier(parts[0]);
		return container.getEStructuralFeature(parts[1]);
	}

}
