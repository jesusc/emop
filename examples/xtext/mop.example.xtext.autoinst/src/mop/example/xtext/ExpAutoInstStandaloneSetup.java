/*
* generated by Xtext
*/
package mop.example.xtext;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class ExpAutoInstStandaloneSetup extends ExpAutoInstStandaloneSetupGenerated{

	public static void doSetup() {
		new ExpAutoInstStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

