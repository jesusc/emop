package mop.emf.ecore;

import mop.emf.core.api.EMOPModelCreate;
import mop.emf.core.api.EMOPModelLoad;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;

public aspect ExtendResource {
	
	// create
	
	pointcut createResourceUsingRS(URI uri, String contentType) :
		execution ( Resource ResourceSet.createResource(URI, String)) && args(uri, contentType);
	
	Resource around(URI uri, String ctype) : createResourceUsingRS(uri, ctype) {
		// TODO: call before callbacks
		Resource r = proceed(uri, ctype);
		EMOPModelCreate.notifyAfter_createResourceUsingRS(r);
		return r;
	}
	
	// load

	pointcut getResourceUsingRS(URI uri, boolean loadOnDemand) :
		execution ( Resource ResourceSet.getResource(URI, boolean)) && args(uri, loadOnDemand);

	Resource around(URI uri, boolean loadOnDemand) : getResourceUsingRS(uri, loadOnDemand) {
		// TODO: call before callbacks
		Resource r = proceed(uri, loadOnDemand);
		EMOPModelLoad.notifyAfter_createResourceUsingRS(r);
		return r;
	}


}
