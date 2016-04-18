package mop.emf.annotations;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.HashMap;
import java.util.function.Consumer;

import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.codegen.ecore.genmodel.GenPackage;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateExceptionHandler;

public class Generator {

	private Consumer<Configuration> extraConfigurator;

	public void gen(URI genModelURI, URI xmiURI, String outputDir) throws Exception {
		Configuration cfg = this.configureFreeMarker("templates");
		
		/* I have a dependency with JDT due to the automatic generation of the wrapper */
		/* I would like to remove it in the future */
		cfg.setObjectWrapper(new MyAppObjectWrapper(cfg.getIncompatibleImprovements()));
		
		Template converter = cfg.getTemplate("EAnnotation2AnnConverter.ftlh");
		
		GenModel gen = this.getGenModel(genModelURI);
		GenPackage pkg = gen.getGenPackages().get(0);
		
		AnnotationSpec spec = this.getAnnotationModel(xmiURI);
		
		HashMap<String, Object> root = new HashMap<String, Object>();
		root.put("genModel", gen);
		root.put("pkg", pkg);
		root.put("anns", new AnnSpecWrapper(spec, pkg));
		// gen.getEcoreGenPackage().getPackageClassName()

				
		String pkgDir = outputDir + File.separator + pkg.getQualifiedPackageName().replaceAll("\\.", File.separator);
		new File(pkgDir).mkdirs();

		String cname = pkgDir + File.separator + pkg.getEcorePackage().getName() + "Util.java";

		Writer out = new OutputStreamWriter(new FileOutputStream(cname));
		converter.process(root, out);
	}

	public GenModel getGenModel(URI uri) {
		ResourceSet rs = new ResourceSetImpl();
		return (GenModel) rs.getResource(uri, true).getContents().get(0);			
	}

	public AnnotationSpec getAnnotationModel(URI uri) {
		ResourceSet rs = new ResourceSetImpl();
		return (AnnotationSpec) rs.getResource(uri, true).getContents().get(0);					
	}
	
	public void setExtraConfigurator(Consumer<Configuration> cfg) {
		this.extraConfigurator = cfg;
	}
	
	public Configuration configureFreeMarker(String templates) throws IOException {
		// Create your Configuration instance, and specify if up to what FreeMarker
		// version (here 2.3.24) do you want to apply the fixes that are not 100%
		// backward-compatible. See the Configuration JavaDoc for details.
		Configuration cfg = new Configuration(Configuration.VERSION_2_3_24);

		extraConfigurator.accept(cfg);
		
		// Set the preferred charset template files are stored in. UTF-8 is
		// a good choice in most applications:
		cfg.setDefaultEncoding("UTF-8");

		// Sets how errors will appear.
		// During web page *development* TemplateExceptionHandler.HTML_DEBUG_HANDLER is better.
		cfg.setTemplateExceptionHandler(TemplateExceptionHandler.RETHROW_HANDLER);

		// Don't log exceptions inside FreeMarker that it will thrown at you anyway:
		cfg.setLogTemplateExceptions(false);		
	
		return cfg;
	}

}
