package mop.emf.annotations.ui;

import java.io.File;

import mop.emf.annotations.Generator;
import mop.emf.annotations.templates.Templates;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.util.URI;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.pde.core.plugin.IExtensionsModelFactory;
import org.eclipse.pde.core.plugin.IPluginExtension;
import org.eclipse.pde.core.plugin.IPluginExtensionPoint;
import org.eclipse.pde.core.plugin.IPluginModelBase;
import org.eclipse.pde.internal.core.PDECore;
import org.eclipse.pde.internal.core.plugin.PluginExtension;
import org.eclipse.pde.internal.core.plugin.PluginExtensionPoint;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;

public class GenerateAnnotationCode implements IObjectActionDelegate {

	private Shell shell;
	private ISelection selection;
	
	/**
	 * Constructor for Action1.
	 */
	public GenerateAnnotationCode() {
		super();
	}

	/**
	 * @see IObjectActionDelegate#setActivePart(IAction, IWorkbenchPart)
	 */
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		shell = targetPart.getSite().getShell();
	}

	/**
	 * @see IActionDelegate#run(IAction)
	 */
	public void run(IAction action) {
		IStructuredSelection s = (IStructuredSelection) selection;
		
		if ( s.getFirstElement() instanceof IFile ) {
			IFile f = (IFile) s.getFirstElement();
			IFile genModel;
			IFile xmiFile;
			
			if ( f.getFullPath().getFileExtension().equals("genmodel") ) {
				genModel = f;
				xmiFile  = f.getWorkspace().getRoot().getFile(f.getFullPath().removeFileExtension());				
			} else {
				xmiFile  = f;
				genModel = f.getWorkspace().getRoot().getFile(f.getFullPath().addFileExtension("genmodel"));
			}
			
			URI xmiURI = URI.createPlatformResourceURI(xmiFile.getFullPath().toPortableString(), true);
			URI genURI = URI.createPlatformResourceURI(genModel.getFullPath().toPortableString(), true);
			
			IProject project = genModel.getProject();
			IFolder folder = project.getFolder("src-gen");
			
			try {
				if ( ! folder.exists() ) {
					folder.create(true, true, null);
				}
				Generator g = new Generator();
				g.setExtraConfigurator(cfg -> {
					cfg.setClassForTemplateLoading(Templates.class, 
							"");
							//Templates.class.getPackage().getName().replaceAll("\\.",  File.separator));
				});
				g.gen(genURI, xmiURI, folder.getLocation().toOSString());
				folder.refreshLocal(IResource.DEPTH_INFINITE, null);
			} catch (Exception e) {
				e.printStackTrace();
				MessageDialog.openError(shell, "Error", e.getMessage());
			}

//			// Get the associated plug-in (assuming the project is a plug-in project)
//			IPluginModelBase model = PDECore.getDefault().getModelManager().findModel(project);
//			
////			IPluginModelBase emfUI = PDECore.getDefault().getModelManager().findModel("mop.emf.ui");
////			IPluginExtensionPoint installLibraryEP = null;
////			for (IPluginExtensionPoint ext : emfUI.getPluginBase().getExtensionPoints()) {
////				System.out.println(ext);
////				installLibraryEP = ext;
////			}
//			
//			
//			try {
//				IExtensionsModelFactory factory = model.getPluginBase().getModel().getFactory();
//				IPluginExtension ext = factory.createExtension();
//				ext.setPoint("mop.emf.ui.installLibrary");
//				
//				model.getPluginBase().add(ext);
//			} catch (CoreException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
		
		
		}
	
		
//
//		IPluginModelBase[] models = PDECore.getDefault().getModelManager().getWorkspaceModels();
//		for (IPluginModelBase iPluginModelBase : models) {
//			
//			System.out.println(iPluginModelBase.getPluginBase().getName());
//			System.out.println(iPluginModelBase.getPluginBase().getExtensions());
//			
//		}

		
	}

	/**
	 * @see IActionDelegate#selectionChanged(IAction, ISelection)
	 */
	public void selectionChanged(IAction action, ISelection selection) {
		this.selection = selection;
	}

}
