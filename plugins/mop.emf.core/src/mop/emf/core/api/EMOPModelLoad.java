package mop.emf.core.api;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.resource.Resource;


public class EMOPModelLoad extends EMOPModelAbstract {

	protected static List<ModelLoadCallback> afterCallbacks = new ArrayList<>();
	protected static List<ModelLoadCallback> beforeCallbacks = new ArrayList<>();
	
	public EMOPModelLoad() { }

	public EMOPModelLoad before(ModelLoadCallback callback) {
		beforeCallbacks.add(callback);
		return this;
	}
	
	public EMOPModelLoad after(ModelLoadCallback callback) {
		afterCallbacks.add(callback);
		return this;
	}

	public static void notifyAfter_createResourceUsingRS(Resource r) {
		afterCallbacks.forEach(c -> c.accept(r));		
		// TODO:
		// dealWith_notifyAfter_createResourceUsingRS(r, afterCallbacks_RS);		
	}

	public static void notifyBefore(Resource r) {
		beforeCallbacks.forEach(c -> c.accept(r) );
	}
	
}
