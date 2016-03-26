package mop.emf.ecore;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import mop.emf.core.api.EMOPGenerate;
import mop.emf.util.InternalUtil;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.codegen.ecore.generator.Generator;
import org.eclipse.emf.codegen.ecore.genmodel.presentation.GeneratorUIUtil.GeneratorOperation;

/**
 * There are several classes and packages of interest:
 * 
 * - org.eclipse.emf.codegen.ecore.genmodel.util
 *   + Adapters for generation... 
 * 
 * - org.eclipse.emf.codegen.ecore.genmodel.generator.
 *   + GenModelGeneratorAdapter doPreGenerate
 * 
 * - org.eclipse.emf.codegen.ecore.generator.Generator
 *   + public Diagnostic generate(Object object, Object projectType, String projectTypeName, Monitor monitor)
 *   
 *     The problem of this method is that it is called for every generation done with the same genModel
 *     (e.g., Model project, Edit project, etc.)
 *     
 * - org.eclipse.emf.codegen.ecore.genmodel.presentation;
 *   + GeneratorUIUtil, in the internal static class GeneratorOperation
 *     protected void execute(IProgressMonitor progressMonitor) throws CoreException, InvocationTargetException, InterruptedException
 *     
 *     This is the method than gathers the data and starts the generation.
 *     
 * 
 */
public aspect ExtendModelGenerator {
	
	public List<Object[]> GeneratorOperation.ext_GeneratorAndArgumentsList = null;
	
	void around(GeneratorOperation op, List<Object[]> generatorAndArgumentsList) : 
		execution(GeneratorOperation.new(Shell, List<Object[]>)) && this(op) && args(shell, generatorAndArgumentsList) {
		
		InternalUtil.setField(op, "ext_GeneratorAndArgumentsList", generatorAndArgumentsList);		
	}

	@SuppressWarnings("unchecked")
	after(GeneratorOperation op, Generator generator, Object object, Object projectType, String projectTypeName) :
		execution(void GeneratorOperation.addGeneratorAndArguments(Generator, Object, Object, String)) && this(op) && args(generator, object, projectType, projectTypeName) {
		// Copied from the original
      if (InternalUtil.getField(op, "ext_GeneratorAndArgumentsList") == null)
      {
        InternalUtil.setField(op, "ext_GeneratorAndArgumentsList", new ArrayList<Object[]>());
      }
      ((List<Object[]>) InternalUtil.getField(op, "ext_GeneratorAndArgumentsList")).add(new Object[]{generator, object, projectType, projectTypeName});		
	}
	

	void around(GeneratorOperation op, IProgressMonitor progressMonitor) : 
		execution(void execute(IProgressMonitor)) && this(op) && args(progressMonitor) {
	
		@SuppressWarnings("unchecked")
		List<Object[]> args = (List<Object[]>) InternalUtil.getField(op, "ext_GeneratorAndArgumentsList");
		
		EMOPGenerate.notify_beforeGenerate(args, progressMonitor);
		proceed(op, progressMonitor);
		EMOPGenerate.notify_afterGenerate(args, progressMonitor);
	}
	
//    public void addGeneratorAndArguments(Generator generator, Object object, Object projectType, String projectTypeName)
//    {
//      if (generatorAndArgumentsList == null)
//      {
//        generatorAndArgumentsList = new ArrayList<Object[]>();
//      }
//      generatorAndArgumentsList.add(new Object[]{generator, object, projectType, projectTypeName});
//    }
	
	
	
}
