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
	
//	public void BasicDiagnostic.removeDiagnostic(Diagnostic d) {
//		System.out.println("Removed " + d);
//		this.removedChildren.add(d);
//	}
//	
//	// Each invocation to new BasicDiagnostic I am going to return MyBasicDiagnostic
//	
//	List<Diagnostic> around(BasicDiagnostic bd) : 
//		execution(List<Diagnostic> BasicDiagnostic.getChildren()) && this(bd) {
//		List<Diagnostic> r = new ArrayList<>(proceed(bd));
//		System.out.println("Getting children: " + r);
//		// r.removeAll(bd.removedChildren);
//		r.removeAll((Collection<?>) InternalUtil.getField(bd, "removedChildren"));
//		return r;
//	}
	
	BasicDiagnostic around() :
		call(BasicDiagnostic.new(..)) {
		
		BasicDiagnostic original = proceed();
		return new MyBasicDiagnostic(original);
		// return original;
	}
	
	pointcut validateEObject(EValidator v, EObject eObject, DiagnosticChain diagnostics, Map<Object, Object> map) :
		execution ( boolean EValidator.validate(EObject, DiagnosticChain, Map<Object, Object>) ) 
		&& args(eObject, diagnostics, map) 
		&& target(v);

//	after(Diagnostician v) : validateEObject(v) {
//		System.out.println("EValidator: " + v);
//	}

	after(EValidator v, EObject eObject, DiagnosticChain diagnostics, Map<Object, Object> map) : validateEObject(v, eObject, diagnostics, map) {		
		EMOPValidate.notifyAfter_Validate(eObject, diagnostics);
	}
	
	
	// EVALIDATOR METHODS
	/**
	 *   
   * Validates the object in the given context, optionally producing diagnostics.
   * @param diagnostics a place to accumulate diagnostics; if it's <code>null</code>, no diagnostics should be produced.
   * @param context a place to cache information, if it's <code>null</code>, no cache is supported.
   * @return whether the object is valid.
  boolean validate(EObject eObject, DiagnosticChain diagnostics, Map<Object, Object> context);

  boolean validate(EClass eClass, EObject eObject, DiagnosticChain diagnostics, Map<Object, Object> context);

  boolean validate(EDataType eDataType, Object value, DiagnosticChain diagnostics, Map<Object, Object> context);
  
	 */

	
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
