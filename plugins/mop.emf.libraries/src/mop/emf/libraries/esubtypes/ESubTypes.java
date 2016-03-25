package mop.emf.libraries.esubtypes;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EContentAdapter;

import mop.emf.annotations.AbstractLibrary;
import mop.emf.annotations.GlobalLibrary;
import mop.emf.core.EMOP;
import mop.emf.util.InternalUtil;

/**
 * This library is intended to add a "virtual" reference to 
 * each EClass containing its set of subclasses.
 * 
 * @author jesus
 *
 */
public class ESubTypes extends GlobalLibrary {

	public static final String ESUBCLASSES = "eSubClasses";	
	
	@Override
	public void process(EMOP mop) {
		mop.onInstantiate(EcorePackage.Literals.ECLASS, (obj) -> {
			// Not sure why this happens... 
			if ( obj == null )
				return;
			EClass c = (EClass) obj;
			c.eAdapters().add(new SetAdapter(c));
		});
	}

	public static class SetAdapter extends AdapterImpl {
		private EClass eClass;

		public SetAdapter(EClass c) {
			this.eClass = c;
		}

		@Override
		public void notifyChanged(Notification msg) {
			if ( msg.getEventType() == Notification.ADD && msg.getFeature() == EcorePackage.Literals.ECLASS__ESUPER_TYPES ) {
				EClass theSuperType = (EClass) msg.getNewValue();
				@SuppressWarnings("unchecked")
				List<EClass> subclasses = (List<EClass>) InternalUtil.getExtraData(theSuperType, ESUBCLASSES, new ArrayList<EObject>());
				subclasses.add(eClass);
			}
		}
	}
	
	@SuppressWarnings("unchecked")
	public static List<EClass> get(EClass c) {
		return (List<EClass>) InternalUtil.getExtraData(c, ESUBCLASSES, new ArrayList<EObject>());
	}
	
}
