package mop.emf.core;

import java.util.function.Consumer;

import mop.emf.core.api.EMOPCreate;
import mop.emf.core.api.EMOPModelCreate;
import mop.emf.core.api.EMOPModelLoad;
import mop.emf.core.api.EMOPModelSave;
import mop.emf.core.api.EMOPSet;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;

/**
 * A Meta-Object Protocol for EMF. The API is an internal DSL to
 * describe the hooks and events in which the user is interested.
 * 
 * The MOP is global to a thread.
 * 
 * @author jesus
 *
 */
public abstract class EMOP {

	public static boolean isInitialized = false;
	public static final ThreadLocal<EMOPContext> context; //new ThreadLocal<EMOPContext>();
	public static void init() {
		EcorePackage.eINSTANCE.eResource();
		isInitialized = true;
	}
	static {
		context = ThreadLocal.withInitial(() -> { return new EMOPContext(); });
	}
	
	public static EMOPContext ctx() {
		return context.get();
	}
	
	public static void activate() {
		ctx().activate();
	}

	public static EMOP global() {
		init();
		return new EMOPGlobal();
	}
	
	public static EMOP resource(Resource r) {
		init();
		return new EMOPResource();
	}

	// Another kind of the scope are the elements
	// created by some artefact like a transformation, etc.
	
	
	//
	// Events
	// 
	
	
	public EMOPSet onSet(EStructuralFeature f) {
		return new EMOPSet(this, f);
	}

	public EMOPCreate onInstantiate(EClass c, Consumer<EObject> callback) {
		return new EMOPCreate(c, callback);
	}

	
	/**
	 * Notifies when a new model (resource in EMF terminology is created).
	 * 
	 * This assumes that resources are created from resource sets,
	 * so the callbacks will only be invoked if the uri is in the resource set.
	 * 
	 * @param uri
	 * @return
	 */
	public EMOPModelCreate onModelCreate(String uri) {
		return new EMOPModelCreate(uri);
	}

	public EMOPModelCreate onModelCreate() {
		return new EMOPModelCreate();
	}

	
	/**
	 * Notifies when a model loaded (resource in EMF terminology is created).
	 * It does not distinguished the kind of model (meta-model or plain model).
	 * 
	 * TODO: In a load it is possible to know the meta-models "after" the load
	 * by looking at the created objects
	 * 
	 * 
	 * @param uri
	 * @return
	 */
	public EMOPModelLoad onModelLoad() {
		return new EMOPModelLoad();
	}

	/**
	 * Notifies when a model is persisted.
	 * 
	 * @return
	 */
	public EMOPModelSave onModelSave() {
		return new EMOPModelSave();
	}
	
	
//	public static EMOP object(EObject o) {
//		return new EMOPObject();
//	}
	
}
