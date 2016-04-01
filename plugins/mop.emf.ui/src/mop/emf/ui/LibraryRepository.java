package mop.emf.ui;

import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.Platform;

public class LibraryRepository {

	private static final String ID = "mop.emf.ui.installLibrary";
	private static LibraryInfo[] libs = null;
	
	
	public static LibraryInfo[] getAllLibraries() {
		if ( libs != null )
			return libs;
		
		IConfigurationElement[] confs = Platform.getExtensionRegistry().getConfigurationElementsFor(ID);
		libs = new LibraryInfo[confs.length];
		
		for (int i = 0; i < confs.length; i++) {
			libs[i] = new LibraryInfo(confs[i]);
		}
		
		return libs;
	}

	
	
}
