package mop.emf.core.api;

import java.util.ArrayList;
import java.util.List;

import mop.emf.core.functional.Consumer2;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EObject;


public class EMOPValidate extends EMOPEvent {

	protected static List<ValidateCallback> afterCallbacks = new ArrayList<>();
	
	public EMOPValidate() { }

	public EMOPValidate after(ValidateCallback callback) {
		afterCallbacks.add(callback);
		return this;
	}

	public static void notifyAfter_Validate(EObject eobject, DiagnosticChain chain) {
		afterCallbacks.forEach(c -> c.accept(eobject, chain));		
	}
	
	@FunctionalInterface
	public static interface ValidateCallback extends Consumer2<EObject, DiagnosticChain> { }

	
}
