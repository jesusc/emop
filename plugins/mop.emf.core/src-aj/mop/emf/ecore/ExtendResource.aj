package mop.emf.ecore;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Map;

import mop.emf.core.api.EMOPModelCreate;
import mop.emf.core.api.EMOPModelLoad;
import mop.emf.core.api.EMOPModelSave;

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

	// This pointcut works for any loaded resource. This is the only way to pass the resource
	// before it is actually loaded
	pointcut loadResource(Resource r) : //, InputStream is, Map<?, ?> options) :
		execution ( void Resource.load(InputStream, Map<?, ?>)) && target(r); // && args(is, options) 
	
	Resource around(URI uri, boolean loadOnDemand) : getResourceUsingRS(uri, loadOnDemand) {
		// TODO: call before callbacks
		Resource r = proceed(uri, loadOnDemand);
		EMOPModelLoad.notifyAfter_createResourceUsingRS(r);
		return r;
	}
	
	before(Resource r) : loadResource(r) {
		EMOPModelLoad.notifyBefore(r);
	}


	// save
	
	// pointcut saveResource(OutputStream outputStream, Map<?, ?> options) :
	pointcut saveResource(Resource r) :
		execution ( void Resource.save(OutputStream, Map<?, ?>)) && target(r);  // && args(outputStream, options)

	after(Resource r) : saveResource(r) {
		EMOPModelSave.notifyAfter_saveResource(r);
	}
	
	
}
