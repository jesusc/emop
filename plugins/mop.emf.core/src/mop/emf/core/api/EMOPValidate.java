package mop.emf.core.api;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

import mop.emf.core.functional.Consumer2;
import mop.emf.ecore.MyBasicDiagnostic;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;


public class EMOPValidate extends EMOPEvent {

	protected static List<ValidateCallback> afterCallbacks = new ArrayList<>();
	
	public EMOPValidate() { }

	public EMOPValidate after(ValidateCallback callback) {
		afterCallbacks.add(callback);
		return this;
	}

	public static void notifyAfter_Validate(EObject eobject, DiagnosticChain chain) {
		afterCallbacks.forEach(c -> c.accept(eobject, new ValidationInformation(chain)));		
	}
	
	@FunctionalInterface
	public static interface ValidateCallback extends Consumer2<EObject, ValidationInformation> { }

	/**
	 * This class provides a wrapper to access diagnostic information.
	 * 
	 * @author jesus
	 *
	 */
	public static class ValidationInformation {
		
		private DiagnosticChain chain;

		public ValidationInformation(DiagnosticChain chain) {
			this.chain = chain;
		}
		
		public List<Diagnostic> getDiagnostics(EObject obj, Function<EObject, Boolean> f) {
			BasicDiagnostic bd = ((BasicDiagnostic) chain);
			ArrayList<Diagnostic> result = new ArrayList<>();
			for (Diagnostic diagnostic : bd.getChildren()) {
				// TODO: Provide a wrapper to select the diagnostics of this specific
				// object
				if ( diagnostic.getData().size() > 0 && diagnostic.getData().get(0) == obj ) {					
					EObject guiltyElement = (EObject) diagnostic.getData().get(1);
					if ( f.apply(guiltyElement) ) {
						result.add(diagnostic);
					}
				}
			}
			return result;
		}

		public void remove(List<Diagnostic> removalList) {
			for (Diagnostic diagnostic : removalList) {
				((MyBasicDiagnostic) chain).remove(diagnostic);
			}			
		}
		
	}
	
}
