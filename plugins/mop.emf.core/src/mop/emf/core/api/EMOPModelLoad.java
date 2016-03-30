package mop.emf.core.api;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.function.Function;

import mop.emf.core.api.EMOPModelAbstract.ModelLoadCallback_RS;

import org.eclipse.emf.ecore.resource.Resource;


public class EMOPModelLoad extends EMOPModelAbstract {

	protected static HashMap<String, List<ModelLoadCallback_RS>> beforeCallbacks_RS = new HashMap<String, List<ModelLoadCallback_RS>>();
	protected static HashMap<String, List<ModelLoadCallback_RS>> afterCallbacks_RS  = new HashMap<String, List<ModelLoadCallback_RS>>();

	protected static List<ModelLoadCallback> afterCallbacks = new ArrayList<>();
	protected static List<ModelLoadCallback> beforeCallbacks = new ArrayList<>();
	
	private String uri;
	protected static Function<Resource, Boolean> filter = r -> true; 
	
	public EMOPModelLoad() { }

	public EMOPModelLoad(String uri) {
		this.uri = uri;
	}

	public EMOPModelLoad filter(Function<Resource, Boolean> f) {
		filter = f;
		return this;
	}

	public EMOPModelLoad before(ModelLoadCallback callback) {
		beforeCallbacks.add(callback);
		return this;
	}
	
	
	public EMOPModelLoad after(ModelLoadCallback callback) {
		afterCallbacks.add(callback);
		return this;
	}

	
	public EMOPModelLoad before(ModelLoadCallback_RS callback) {
		beforeCallbacks_RS.computeIfAbsent(uri, (c1) -> new ArrayList<ModelLoadCallback_RS>());
		beforeCallbacks_RS.get(uri).add(callback);
		return this;
	}
	
	public EMOPModelLoad after(ModelLoadCallback_RS callback) {
		afterCallbacks_RS.computeIfAbsent(uri, (c1) -> new ArrayList<ModelLoadCallback_RS>());
		afterCallbacks_RS.get(uri).add(callback);
		return this;
	}

	public static void notifyAfter_loadResourceUsingRS(Resource r) {
		if ( ! filter.apply(r) )
			return;

		afterCallbacks.forEach(c -> c.accept(r));		
		dealWith_notify_operationOnResourceUsingRS(r, afterCallbacks_RS);		
	}

	public static void notifyBefore(Resource r) {
		if ( ! filter.apply(r) )
			return;
		
		beforeCallbacks.forEach(c -> c.accept(r) );
		if ( r.getResourceSet() != null ) {
			dealWith_notify_operationOnResourceUsingRS(r, beforeCallbacks_RS);
		}
	}

	public static void notifyAfter(Resource r) {
		if ( ! filter.apply(r) )
			return;

		afterCallbacks.forEach(c -> c.accept(r));
		if ( r.getResourceSet() != null ) {
			dealWith_notify_operationOnResourceUsingRS(r, afterCallbacks_RS);
		}
	}
	
}
