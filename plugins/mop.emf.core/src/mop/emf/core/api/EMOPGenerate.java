package mop.emf.core.api;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import org.eclipse.core.runtime.IProgressMonitor;


public class EMOPGenerate {

	protected static List<GenerateCallback> beforeCallbacks = new ArrayList<>();
	protected static List<GenerateCallback> afterCallbacks = new ArrayList<>();
	
	public EMOPGenerate after(GenerateCallback callback) {
		afterCallbacks.add(callback);
		return this;
	}
	
	public EMOPGenerate before(GenerateCallback callback) {
		beforeCallbacks.add(callback);
		return this;
	}

	public static void notify_beforeGenerate(List<Object[]> args, IProgressMonitor progressMonitor) {
		GenerationInformation info = new GenerationInformation(args, progressMonitor);
		beforeCallbacks.forEach(c -> c.accept(info));
	}	

	public static void notify_afterGenerate(List<Object[]> args, IProgressMonitor progressMonitor) {
		GenerationInformation info = new GenerationInformation(args, progressMonitor);
		afterCallbacks.forEach(c -> c.accept(info));
	}	

	@FunctionalInterface
	public static interface GenerateCallback extends Consumer<GenerationInformation> { }

	/**
	 * This class provides a wrapper to access the model generator information.
	 * 
	 * @author jesus
	 *
	 */
	public static class GenerationInformation {

		public GenerationInformation(List<Object[]> args, IProgressMonitor progressMonitor) {
			
		}
	}

}
