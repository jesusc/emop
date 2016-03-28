package mop.emf.libraries.proto;

import mop.emf.annotations.GlobalLibrary;
import mop.emf.core.EMOP;
import mop.emf.core.api.EMOPGet.ProceedGet;
import mop.emf.util.InternalUtil;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * This library provides facilities to implement prototype
 * based modelling.
 * 
 * @author jesus
 *
 */
public class Prototypes extends GlobalLibrary {


	@Override
	public void process(EMOP mop) {
		mop.onGet().around((obj, f, supplier) -> {
			return treatGet(obj, f, supplier);
		});
	
	}
	
	private Object treatGet(EObject obj, EStructuralFeature f, ProceedGet supplier) {
		if ( ! obj.eIsSet(f) ) {
			EObject clone = getClone(obj);
			if ( clone != null ) {
				return clone.eGet(f);
			}
		}
		
		return supplier.get();
	}

	// This will probably change to a meta-model based solution
	private EObject getClone(EObject obj) {
		return (EObject) InternalUtil.getExtraData(obj, "cloneOf");
	}

	@SuppressWarnings("unchecked")
	public static<T extends EObject> T clone(T obj) {
		EObject newObj = EcoreUtil.create(obj.eClass());
		InternalUtil.setExtraData(newObj, "cloneOf", obj);
		return  (T) newObj;
	}

	
}
