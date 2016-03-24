package mop.emf.ecore;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import mop.emf.core.api.EMOPValidate;
import mop.emf.util.InternalUtil;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EValidator;

public aspect ExtendValidation {
	
//	public ArrayList<Diagnostic> BasicDiagnostic.removedChildren = new ArrayList<Diagnostic>();
//	
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
	
}
