package mop.emf.libraries.resourcetype;

import java.util.HashMap;

import org.eclipse.emf.ecore.resource.Resource;

public class ModelIndex {

	protected static ModelIndex singleton = new ModelIndex();
	protected HashMap<Resource, Metamodel> resourceToMetamodel = new HashMap<>();
	
	public static ModelIndex instance() {
		return singleton;
	}

	public boolean register(Resource r) {
		if ( resourceToMetamodel.containsKey(r) )
			return false;
		
		resourceToMetamodel.put(r, new Metamodel());
		return true;
	}

	public Metamodel getMetamodelOf(Resource r) {
		return resourceToMetamodel.get(r);
	}

	
	
}
