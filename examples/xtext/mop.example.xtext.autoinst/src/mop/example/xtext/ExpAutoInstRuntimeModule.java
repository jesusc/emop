/*
 * generated by Xtext
 */
package mop.example.xtext;

import mop.emf.annotations.Libraries;
import mop.emf.core.EMOP;
import mop.emf.core.api.EMOPModelLoad;
import mop.emf.libraries.autoinst.AutoInstLibrary;
import mop.emf.libraries.delayvalidation.DelayValidation;
import mop.emf.xtext.XtextEMOP;
import exp_autoinst.Exp_autoinstPackage;

/**
 * Use this class to register components to be used at runtime / without the Equinox extension registry.
 */
public class ExpAutoInstRuntimeModule extends mop.example.xtext.AbstractExpAutoInstRuntimeModule {

//	static {
//		XtextEMOP.onJob(() -> {
//			Libraries.install(new AutoInstLibrary("exp_autoinst"));
//			Libraries.install(new DelayValidation("exp_autoinst")); // How to set is working scope!!
//			EMOPModelLoad.notifyAfter(Exp_autoinstPackage.eINSTANCE.eResource());
//			
//			// Which is the right place to activate in Xtext?
//			EMOP.activate();
//		});
//		
//	}
//	
	
	

}
