package mop.emf.core.api;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.resource.Resource;


public class EMOPModelLoad extends EMOPModelAbstract {

	protected static List<ModelLoadCallback> afterCallbacks = new ArrayList<>();
	
	public EMOPModelLoad() { }

	public EMOPModelLoad after(ModelLoadCallback callback) {
		afterCallbacks.add(callback);
		return this;
	}

	public static void notifyAfter_createResourceUsingRS(Resource r) {
		afterCallbacks.forEach(c -> c.accept(r));		
		// TODO:
		// dealWith_notifyAfter_createResourceUsingRS(r, afterCallbacks_RS);		
	}
	
}
