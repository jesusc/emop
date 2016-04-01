package mop.emf.xtext;

import java.util.ArrayList;
import java.util.List;

import mop.emf.core.functional.EmptyFunction;

import org.eclipse.core.runtime.jobs.Job;

public class XtextEMOP {
	private static List<EmptyFunction> callbacks = new ArrayList<EmptyFunction>();

	public static void onJob(EmptyFunction f) {
		callbacks.add(f);
	}
	
	public static void notify_beforeJob(Job job) {
		for (EmptyFunction f : callbacks) {
			f.exec();
		}
	}
	
}
