package mop.emf.libraries.resourcetype;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EContentAdapter;

import mop.emf.annotations.AbstractLibrary;
import mop.emf.annotations.GlobalLibrary;
import mop.emf.core.EMOP;

/**
 * This library is intended to (partially) solve the lack of
 * linking between a Resource holding model elements and its
 * meta-model.
 * 
 * The library maintains an index of Resource (models) from
 * which it is possible to obtain the corresponding meta-model.
 * A meta-model is a
 * 
 * TODO: The library also provides the facility of extracting the
 * meta-model footprint of a model. This can be complemented with
 * the e.g., ATL/MOP to extract dynamic footprints.
 * 
 * @author jesus
 *
 */
public class ResourceType extends GlobalLibrary {

	@Override
	public void process(EMOP mop) {
		mop.onModelLoad().before(r -> newResource(r));
		mop.onModelCreate().after(r -> newResource(r));

	}

	private void newResource(Resource r) {
		// TODO: Subscribe to local MOP for add resource, for the moment doing with delegates

		// The resource is already registered (e.g., create + load) then exit
		if ( ! ModelIndex.instance().register(r) ) 
			return;
		
		EContentAdapter contentAdapter = new EContentAdapter() {
			@Override
			public void notifyChanged(Notification notification) {
				super.notifyChanged(notification);
				if ( notification.getEventType() == Notification.ADD && notification.getNewValue() instanceof EObject ) { // check ADD_MANY??
					Metamodel mm = ModelIndex.instance().getMetamodelOf(r);
					EObject  obj = (EObject) notification.getNewValue();  
					mm.addClass(obj.eClass());
				}
			}			
		};
		
		r.eAdapters().add(contentAdapter);		
	}

	
	
}
