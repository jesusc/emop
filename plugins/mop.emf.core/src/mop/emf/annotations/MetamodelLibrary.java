package mop.emf.annotations;

import mop.emf.core.functional.Consumer2;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.resource.Resource;

/**
 * Defines a library applicable at the meta-model level.
 * 
 * @author jesus
 */
public abstract class MetamodelLibrary {

	public abstract void process(Resource metamodel);	

	protected void extractEAnnotations(Resource metamodel, String uri, Consumer2<EModelElement, EAnnotation> callback) {
		metamodel.getAllContents().forEachRemaining(obj -> {
			if ( obj instanceof EModelElement ) {
				EModelElement m = (EModelElement) obj;
				EAnnotation ann = m.getEAnnotation("http://autoinst");
				if ( ann != null ) {
					callback.accept(m, ann);
				}
			}
		});
	}
}
