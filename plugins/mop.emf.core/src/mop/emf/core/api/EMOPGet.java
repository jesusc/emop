package mop.emf.core.api;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import mop.emf.core.functional.Consumer2;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;


public class EMOPGet {

	protected static List<BeforeGetCallback> beforeCallbacks = new ArrayList<>();
	protected static List<AfterGetCallback> afterCallbacks = new ArrayList<>();
	
	public EMOPGet after(AfterGetCallback callback) {
		afterCallbacks.add(callback);
		return this;
	}
	
	public EMOPGet before(BeforeGetCallback callback) {
		beforeCallbacks.add(callback);
		return this;
	}

	public static void notify_beforeEGet(EObject obj, EStructuralFeature f) {
		beforeCallbacks.forEach(c -> c.accept(obj, f));
	}	

	@FunctionalInterface
	public static interface BeforeGetCallback extends Consumer2<Object, EStructuralFeature> { }

	@FunctionalInterface
	public static interface AfterGetCallback extends Consumer2<Object, Object> { }


}
