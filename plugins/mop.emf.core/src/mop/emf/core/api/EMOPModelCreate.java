package mop.emf.core.api;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import mop.emf.core.api.EMOPModelAbstract.ModelLoadCallback;

import org.eclipse.emf.ecore.resource.Resource;

public class EMOPModelCreate extends EMOPModelAbstract {
	protected static HashMap<String, List<ModelLoadCallback_RS>> beforeCallbacks_RS = new HashMap<String, List<ModelLoadCallback_RS>>();
	protected static HashMap<String, List<ModelLoadCallback_RS>> afterCallbacks_RS  = new HashMap<String, List<ModelLoadCallback_RS>>();

	protected String uri;

	public EMOPModelCreate(String uri) {
		this.uri = uri;
	}
	
	public EMOPModelCreate before(ModelLoadCallback_RS callback) {
		beforeCallbacks_RS.computeIfAbsent(uri, (c1) -> new ArrayList<ModelLoadCallback_RS>());
		beforeCallbacks_RS.get(uri).add(callback);
		return this;
	}
	
	public EMOPModelCreate after(ModelLoadCallback_RS callback) {
		afterCallbacks_RS.computeIfAbsent(uri, (c1) -> new ArrayList<ModelLoadCallback_RS>());
		afterCallbacks_RS.get(uri).add(callback);
		return this;
	}

	
	//
	// Notification methods for the aspect
	//
	
	public static void notifyAfter_createResourceUsingRS(Resource r) {
		dealWith_notifyAfter_createResourceUsingRS(r, afterCallbacks_RS);
	}
	
}
