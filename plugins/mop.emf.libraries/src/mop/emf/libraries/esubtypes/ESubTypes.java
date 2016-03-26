package mop.emf.libraries.esubtypes;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import mop.emf.annotations.GlobalLibrary;
import mop.emf.core.EMOP;
import mop.emf.util.InternalUtil;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EOperation.Internal.InvocationDelegate;
import org.eclipse.emf.ecore.impl.EOperationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * This library is intended to add a "virtual" reference to 
 * each EClass containing its set of subclasses.
 * 
 * @author jesus
 *
 */
public class ESubTypes extends GlobalLibrary {

	public static final String ESUBCLASSES = "eSubClasses";	
	private static EOperation eSubclassesOp;
	
	public static EOperation getESubclassesOp() {
		return eSubclassesOp;
	}

	
	@Override
	public void process(EMOP mop) {
		if ( eSubclassesOp == null ) {
			EOperation op = EcoreFactory.eINSTANCE.createEOperation();
			op.setName("eSubClasses");

			EAnnotation ann = EcoreFactory.eINSTANCE.createEAnnotation();
			ann.setSource("http://emop/javadelegate");
			op.getEAnnotations().add(ann);
			
			EOperation.Internal.InvocationDelegate.Factory.Registry.INSTANCE.put("http://emop/javadelegate", new InvocationDelegate() {
	
				@Override
				public Object dynamicInvoke(InternalEObject target,
						EList<?> arguments) throws InvocationTargetException {
					System.out.println("Invoke!!");
					return null;
				}
				
			});

			((EOperationImpl) op).setOperationID(13); // ??? Otherwise it returns -1 unless doing step-by-step debugging...
			EcorePackage.Literals.ECLASS.getEOperations().add(op);
			System.out.println(op.getOperationID());
			eSubclassesOp = op;		
		}
		
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
