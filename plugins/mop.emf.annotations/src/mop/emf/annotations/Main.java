package mop.emf.annotations;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.nio.channels.IllegalSelectorException;
import java.util.HashMap;

import org.eclipse.emf.codegen.ecore.genmodel.GenClass;
import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.codegen.ecore.genmodel.GenModelFactory;
import org.eclipse.emf.codegen.ecore.genmodel.GenModelPackage;
import org.eclipse.emf.codegen.ecore.genmodel.GenPackage;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import freemarker.template.TemplateExceptionHandler;

/**
 * Command line program to generate support code for annotations.
 * 
 * @author jesus
 *
 */
public class Main {

	public static void main(String[] args) throws Exception {
		String xmiFile = args[0];
		String genModel = args[1];
		
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap( ).put("*", new XMIResourceFactoryImpl());
		EPackage.Registry.INSTANCE.put(GenModelPackage.eNS_URI, GenModelPackage.eINSTANCE);
		EPackage.Registry.INSTANCE.put(EcorePackage.eINSTANCE.getNsURI(), EcorePackage.eINSTANCE);
		EPackage.Registry.INSTANCE.put(AnnotationsPackage.eINSTANCE.getNsPrefix(), AnnotationsPackage.eINSTANCE);
		
		String outputDir = "/home/jesus/projects/emop/libraries/mop.emf.lib.autoinst/src";
		
		Generator g = new Generator();
		g.setExtraConfigurator(cfg -> {
			// Specify the source where the template files come from. Here I set a
			// plain directory for it, but non-file-system sources are possible too:
			try {
				cfg.setDirectoryForTemplateLoading(new File("templates"));
			} catch (Exception e) {
				e.printStackTrace();
			}			
		});
		g.gen(URI.createFileURI(genModel), URI.createFileURI(xmiFile), outputDir);
	}
	
	
}
