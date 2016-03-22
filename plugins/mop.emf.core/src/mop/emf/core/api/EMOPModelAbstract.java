package mop.emf.core.api;

import java.util.HashMap;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

import mop.emf.core.EMOP;
import mop.emf.core.functional.Consumer3;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;

public abstract class EMOPModelAbstract extends EMOPEvent {
	protected static void dealWith_notifyAfter_createResourceUsingRS(Resource r, HashMap<String, List<ModelLoadCallback_RS>> afterCallbacks_RS) {
		if ( EMOP.ctx().isActivated() ) {
			if ( r.getResourceSet() != null ) {
				r.getResourceSet().getResources().stream().
					flatMap(EMOPModelCreate::toPackage).
					filter(p -> afterCallbacks_RS.containsKey(p.getNsURI()) ).
					forEach(p -> {
						afterCallbacks_RS.get(p.getNsURI()).forEach(c -> {
							c.accept(r.getResourceSet(), p, r);
						});
					});
			}
		}		
	}
	
	protected static void dealWith_notify(Resource r, List<ModelLoadCallback> callbacks) {
		callbacks.forEach(c -> c.accept(r));
	}

	
	protected static Stream<EPackage> toPackage(Resource r) {
		return r.getContents().stream().
				filter(c -> c instanceof EPackage).
				map(p -> (EPackage) p).
				filter(p -> p.getNsURI() != null);
		
	}
	
	@FunctionalInterface
	public static interface ModelLoadCallback_RS extends Consumer3<ResourceSet, EPackage, Resource> { }

	@FunctionalInterface
	public static interface ModelLoadCallback extends Consumer<Resource> { }

}
