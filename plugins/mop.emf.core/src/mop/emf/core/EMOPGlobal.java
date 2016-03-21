package mop.emf.core;

import java.util.function.Consumer;

import mop.emf.core.api.EMOPCreate;
import mop.emf.core.api.EMOPSet;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

/**
 * Meta-object protocol for EMF. It is based on dynamic EMF
 * so that it is usable with both generated and dynamic meta-models.
 * 
 * @author jesus
 */
public class EMOPGlobal extends EMOP {
	
	public EMOPCreate onInstantiate(EClass c, Consumer<EObject> callback) {
		return new EMOPCreate(c, callback);
	}

//	public EMOPSet onSet(EStructuralFeature f) {
//		return new EMOPSet(f);
//	}
	
	/**   public Resource createResource(URI uri, String contentType) */
	public void onCreate() {
		// TODO Auto-generated method stub
		
	}
	
}
