package mop.emf.ecore;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Map;

import mop.emf.core.EMOP;
import mop.emf.core.api.EMOPModelCreate;
import mop.emf.core.api.EMOPModelLoad;
import mop.emf.core.api.EMOPModelSave;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.emf.ecore.plugin.RegistryReader;

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
		if ( r != null )
			EMOPModelLoad.notifyAfter_loadResourceUsingRS(r);
		return r;
	}
	
	before(Resource r) : loadResource(r) {
		EMOPModelLoad.notifyBefore(r);
	}

	pointcut loadGeneratedPackage(EPackage.Descriptor receptor) : 
		execution(RegistryReader.EPackageDescriptor.new(IConfigurationElement, String)) && this(receptor); // && args(element, attributeName) 
		
	// This does not make much sense, since packages will be loaded before the MOP is explicitly activated...
	after(EPackage.Descriptor receptor) : loadGeneratedPackage(receptor) {
		if ( EMOP.ctx().isActivated() ) {
			// Get the EPackage since the information is loaded in the constructor
			EMOPModelLoad.notifyAfter( receptor.getEPackage().eResource() );
		}
	}
	

	// save
	
	// pointcut saveResource(OutputStream outputStream, Map<?, ?> options) :
	pointcut saveResource(Resource r) :
		execution ( void Resource.save(OutputStream, Map<?, ?>)) && target(r);  // && args(outputStream, options)

	after(Resource r) : saveResource(r) {
		EMOPModelSave.notifyAfter_saveResource(r);
	}
	
	
}
