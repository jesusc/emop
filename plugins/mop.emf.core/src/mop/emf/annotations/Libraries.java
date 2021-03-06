package mop.emf.annotations;

import org.eclipse.emf.ecore.EPackage;

import mop.emf.core.EMOP;

public class Libraries {
	public static void install(MetamodelLibrary lib) {
		EMOP mop = EMOP.global();

		mop.onModelLoad().after(r -> {
			// I could add some filtering condition to onModelLoad...
			if ( r.getContents().size() > 0 && r.getContents().get(0) instanceof EPackage ) {
				lib.process(r);
			}
		});	
	}
	
	public static void install(GlobalLibrary lib) {
		lib.process(EMOP.global());
	}
}
