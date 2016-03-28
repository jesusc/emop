package mop.emf.core.api;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;

import mop.emf.core.functional.Consumer2;
import mop.emf.core.functional.Consumer3;
import mop.emf.core.functional.TriFunction;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;


public class EMOPGet {

	protected static List<BeforeGetCallback> beforeCallbacks = new ArrayList<>();
	protected static List<AfterGetCallback> afterCallbacks = new ArrayList<>();
	protected static List<AroundGetCallback> aroundCallbacks = new ArrayList<>();
	
	public EMOPGet after(AfterGetCallback callback) {
		afterCallbacks.add(callback);
		return this;
	}
	
	public EMOPGet before(BeforeGetCallback callback) {
		beforeCallbacks.add(callback);
		return this;
	}

	public EMOPGet around(AroundGetCallback callback) {
		aroundCallbacks.add(callback);
		return this;
	}
	
	public static void notify_beforeEGet(EObject obj, EStructuralFeature f) {
		beforeCallbacks.forEach(c -> c.accept(obj, f));
	}	

	public static Object notify_aroundEGet(EObject obj, EStructuralFeature f, Object value) {
		Object result = value;
		for (AroundGetCallback around : aroundCallbacks) {
			// Null can only be return by throwing a NullGetValue
			final Object lResult = result;
			result = around.apply(obj, f, () -> lResult);
		} 
		return result;
	}	


	public static void notify_afterEGet(EObject obj, EStructuralFeature f, Object result) {
		throw new UnsupportedOperationException();
	}
	
	@FunctionalInterface
	public static interface BeforeGetCallback extends Consumer2<Object, EStructuralFeature> { }

	@FunctionalInterface
	public static interface AfterGetCallback extends Consumer3<Object, EStructuralFeature, Object> { }

	@FunctionalInterface
	public static interface AroundGetCallback extends TriFunction<EObject, EStructuralFeature, ProceedGet, Object> { }

	@FunctionalInterface
	public static interface ProceedGet extends Supplier<Object> { }

		

}
