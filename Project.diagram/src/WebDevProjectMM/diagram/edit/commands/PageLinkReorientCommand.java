/*
 * 
 */
package WebDevProjectMM.diagram.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

/**
 * @generated
 */
public class PageLinkReorientCommand extends EditElementCommand {

	/**
	* @generated
	*/
	private final int reorientDirection;

	/**
	* @generated
	*/
	private final EObject oldEnd;

	/**
	* @generated
	*/
	private final EObject newEnd;

	/**
	* @generated
	*/
	public PageLinkReorientCommand(ReorientRelationshipRequest request) {
		super(request.getLabel(), request.getRelationship(), request);
		reorientDirection = request.getDirection();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	* @generated
	*/
	public boolean canExecute() {
		if (false == getElementToEdit() instanceof WebDevProjectMM.PageLink) {
			return false;
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return canReorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return canReorientTarget();
		}
		return false;
	}

	/**
	* @generated
	*/
	protected boolean canReorientSource() {
		if (!(oldEnd instanceof WebDevProjectMM.WebPage && newEnd instanceof WebDevProjectMM.WebPage)) {
			return false;
		}
		WebDevProjectMM.WebPage target = getLink().getTarget();
		if (!(getLink().eContainer() instanceof WebDevProjectMM.WebSite)) {
			return false;
		}
		WebDevProjectMM.WebSite container = (WebDevProjectMM.WebSite) getLink().eContainer();
		return WebDevProjectMM.diagram.edit.policies.WebDevProjectMMBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistPageLink_4001(container, getLink(), getNewSource(), target);
	}

	/**
	* @generated
	*/
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof WebDevProjectMM.WebPage && newEnd instanceof WebDevProjectMM.WebPage)) {
			return false;
		}
		WebDevProjectMM.WebPage source = getLink().getSource();
		if (!(getLink().eContainer() instanceof WebDevProjectMM.WebSite)) {
			return false;
		}
		WebDevProjectMM.WebSite container = (WebDevProjectMM.WebSite) getLink().eContainer();
		return WebDevProjectMM.diagram.edit.policies.WebDevProjectMMBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistPageLink_4001(container, getLink(), source, getNewTarget());
	}

	/**
	* @generated
	*/
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor, IAdaptable info) throws ExecutionException {
		if (!canExecute()) {
			throw new ExecutionException("Invalid arguments in reorient link command"); //$NON-NLS-1$
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return reorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return reorientTarget();
		}
		throw new IllegalStateException();
	}

	/**
	* @generated
	*/
	protected CommandResult reorientSource() throws ExecutionException {
		getLink().setSource(getNewSource());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	* @generated
	*/
	protected CommandResult reorientTarget() throws ExecutionException {
		getLink().setTarget(getNewTarget());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	* @generated
	*/
	protected WebDevProjectMM.PageLink getLink() {
		return (WebDevProjectMM.PageLink) getElementToEdit();
	}

	/**
	* @generated
	*/
	protected WebDevProjectMM.WebPage getOldSource() {
		return (WebDevProjectMM.WebPage) oldEnd;
	}

	/**
	* @generated
	*/
	protected WebDevProjectMM.WebPage getNewSource() {
		return (WebDevProjectMM.WebPage) newEnd;
	}

	/**
	* @generated
	*/
	protected WebDevProjectMM.WebPage getOldTarget() {
		return (WebDevProjectMM.WebPage) oldEnd;
	}

	/**
	* @generated
	*/
	protected WebDevProjectMM.WebPage getNewTarget() {
		return (WebDevProjectMM.WebPage) newEnd;
	}
}
