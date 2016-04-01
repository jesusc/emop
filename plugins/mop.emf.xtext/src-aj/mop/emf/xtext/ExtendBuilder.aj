package mop.emf.xtext;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.impl.BasicEObjectImpl;

import org.eclipse.core.runtime.jobs.Job;

// import org.eclipse.xtext.builder.impl.BuildScheduler;

public aspect ExtendBuilder {
	
//	pointcut runXtextBuilder() :
//		execution ( IStatus BuildScheduler.BuildJob.run(IProgressMonitor) ) 
//		&& args(monitor) 
//		&& target(job);
//  Eclipse-SupplementBundle: org.eclipse.xtext.builder
	
	pointcut runXtextBuilder(Job job) :
		execution ( IStatus Job+.run(IProgressMonitor) ) 
//		&& args(monitor) 
		&& target(job);

	
	before(Job job) : runXtextBuilder(job) {		
		if ( job.getClass().getPackage().getName().contains("xtext") ) {
			XtextEMOP.notify_beforeJob(job);
		}
	}
	
		
}
