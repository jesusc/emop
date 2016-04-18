package mop.emf.ecore;

import java.util.HashMap;
import java.util.Map;

import mop.emf.core.api.EMOPGet;
import mop.emf.core.api.EMOPValidate;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.impl.BasicEObjectImpl;

/**
 * This aspect adds a field to hold arbitrary data
 * in an EObject.
 * 
 * @author jesus
 */
public aspect ExtendEObject {
	
	public HashMap<Object, Object> BasicEObjectImpl.fData = new HashMap<>();

	public Object BasicEObjectImpl.getExtraData(Object key) {
		return fData.get(key);
	}
	
	public Object BasicEObjectImpl.setExtraData(Object key, Object value) {
		return fData.put(key, value);
	}
	
	// eGet
	Object around(EObject obj, EStructuralFeature f) :
		execution(Object EObject.eGet(EStructuralFeature)) && this(obj) && args(f) {
		
		EMOPGet.notify_beforeEGet(obj, f);
		Object value = proceed(obj, f);
		Object result = EMOPGet.notify_aroundEGet(obj, f, value);
		// TODO: Pass the old value as a closure to compute it lazily,
		// only if needed
		// EMOPGet.notify_afterEGet(obj, f, result);		
		return result;
	}
	
	
	
}
