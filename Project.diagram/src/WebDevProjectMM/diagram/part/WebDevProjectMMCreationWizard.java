/*
 * 
 */
package WebDevProjectMM.diagram.part;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.actions.WorkspaceModifyOperation;

/**
 * @generated
 */
public class WebDevProjectMMCreationWizard extends Wizard implements INewWizard {

	/**
	* @generated
	*/
	private IWorkbench workbench;

	/**
	* @generated
	*/
	protected IStructuredSelection selection;

	/**
	* @generated
	*/
	protected WebDevProjectMM.diagram.part.WebDevProjectMMCreationWizardPage diagramModelFilePage;

	/**
	* @generated
	*/
	protected WebDevProjectMM.diagram.part.WebDevProjectMMCreationWizardPage domainModelFilePage;

	/**
	* @generated
	*/
	protected Resource diagram;

	/**
	* @generated
	*/
	private boolean openNewlyCreatedDiagramEditor = true;

	/**
	* @generated
	*/
	public IWorkbench getWorkbench() {
		return workbench;
	}

	/**
	* @generated
	*/
	public IStructuredSelection getSelection() {
		return selection;
	}

	/**
	* @generated
	*/
	public final Resource getDiagram() {
		return diagram;
	}

	/**
	* @generated
	*/
	public final boolean isOpenNewlyCreatedDiagramEditor() {
		return openNewlyCreatedDiagramEditor;
	}

	/**
	* @generated
	*/
	public void setOpenNewlyCreatedDiagramEditor(boolean openNewlyCreatedDiagramEditor) {
		this.openNewlyCreatedDiagramEditor = openNewlyCreatedDiagramEditor;
	}

	/**
	* @generated
	*/
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		this.workbench = workbench;
		this.selection = selection;
		setWindowTitle(WebDevProjectMM.diagram.part.Messages.WebDevProjectMMCreationWizardTitle);
		setDefaultPageImageDescriptor(WebDevProjectMM.diagram.part.WebDevProjectMMDiagramEditorPlugin
				.getBundledImageDescriptor("icons/wizban/NewWebDevProjectMMWizard.gif")); //$NON-NLS-1$
		setNeedsProgressMonitor(true);
	}

	/**
	* @generated
	*/
	public void addPages() {
		diagramModelFilePage = new WebDevProjectMM.diagram.part.WebDevProjectMMCreationWizardPage("DiagramModelFile", //$NON-NLS-1$
				getSelection(), "webdevprojectmm_diagram"); //$NON-NLS-1$
		diagramModelFilePage.setTitle(
				WebDevProjectMM.diagram.part.Messages.WebDevProjectMMCreationWizard_DiagramModelFilePageTitle);
		diagramModelFilePage.setDescription(
				WebDevProjectMM.diagram.part.Messages.WebDevProjectMMCreationWizard_DiagramModelFilePageDescription);
		addPage(diagramModelFilePage);

		domainModelFilePage = new WebDevProjectMM.diagram.part.WebDevProjectMMCreationWizardPage("DomainModelFile", //$NON-NLS-1$
				getSelection(), "webdevprojectmm") { //$NON-NLS-1$

			public void setVisible(boolean visible) {
				if (visible) {
					String fileName = diagramModelFilePage.getFileName();
					fileName = fileName.substring(0, fileName.length() - ".webdevprojectmm_diagram".length()); //$NON-NLS-1$
					setFileName(WebDevProjectMM.diagram.part.WebDevProjectMMDiagramEditorUtil
							.getUniqueFileName(getContainerFullPath(), fileName, "webdevprojectmm")); //$NON-NLS-1$
				}
				super.setVisible(visible);
			}
		};
		domainModelFilePage
				.setTitle(WebDevProjectMM.diagram.part.Messages.WebDevProjectMMCreationWizard_DomainModelFilePageTitle);
		domainModelFilePage.setDescription(
				WebDevProjectMM.diagram.part.Messages.WebDevProjectMMCreationWizard_DomainModelFilePageDescription);
		addPage(domainModelFilePage);
	}

	/**
	* @generated
	*/
	public boolean performFinish() {
		IRunnableWithProgress op = new WorkspaceModifyOperation(null) {

			protected void execute(IProgressMonitor monitor) throws CoreException, InterruptedException {
				diagram = WebDevProjectMM.diagram.part.WebDevProjectMMDiagramEditorUtil
						.createDiagram(diagramModelFilePage.getURI(), domainModelFilePage.getURI(), monitor);
				if (isOpenNewlyCreatedDiagramEditor() && diagram != null) {
					try {
						WebDevProjectMM.diagram.part.WebDevProjectMMDiagramEditorUtil.openDiagram(diagram);
					} catch (PartInitException e) {
						ErrorDialog.openError(getContainer().getShell(),
								WebDevProjectMM.diagram.part.Messages.WebDevProjectMMCreationWizardOpenEditorError,
								null, e.getStatus());
					}
				}
			}
		};
		try {
			getContainer().run(false, true, op);
		} catch (InterruptedException e) {
			return false;
		} catch (InvocationTargetException e) {
			if (e.getTargetException() instanceof CoreException) {
				ErrorDialog.openError(getContainer().getShell(),
						WebDevProjectMM.diagram.part.Messages.WebDevProjectMMCreationWizardCreationError, null,
						((CoreException) e.getTargetException()).getStatus());
			} else {
				WebDevProjectMM.diagram.part.WebDevProjectMMDiagramEditorPlugin.getInstance()
						.logError("Error creating diagram", e.getTargetException()); //$NON-NLS-1$
			}
			return false;
		}
		return diagram != null;
	}
}
