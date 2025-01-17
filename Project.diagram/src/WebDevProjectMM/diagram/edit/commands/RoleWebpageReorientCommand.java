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
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientReferenceRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

/**
 * @generated
 */
public class RoleWebpageReorientCommand extends EditElementCommand {

	/**
	* @generated
	*/
	private final int reorientDirection;

	/**
	* @generated
	*/
	private final EObject referenceOwner;

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
	public RoleWebpageReorientCommand(ReorientReferenceRelationshipRequest request) {
		super(request.getLabel(), null, request);
		reorientDirection = request.getDirection();
		referenceOwner = request.getReferenceOwner();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	* @generated
	*/
	public boolean canExecute() {
		if (false == referenceOwner instanceof WebDevProjectMM.Role) {
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
		if (!(oldEnd instanceof WebDevProjectMM.WebPage && newEnd instanceof WebDevProjectMM.Role)) {
			return false;
		}
		return WebDevProjectMM.diagram.edit.policies.WebDevProjectMMBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistRoleWebpage_4002(getNewSource(), getOldTarget());
	}

	/**
	* @generated
	*/
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof WebDevProjectMM.WebPage && newEnd instanceof WebDevProjectMM.WebPage)) {
			return false;
		}
		return WebDevProjectMM.diagram.edit.policies.WebDevProjectMMBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistRoleWebpage_4002(getOldSource(), getNewTarget());
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
		getOldSource().getWebpage().remove(getOldTarget());
		getNewSource().getWebpage().add(getOldTarget());
		return CommandResult.newOKCommandResult(referenceOwner);
	}

	/**
	* @generated
	*/
	protected CommandResult reorientTarget() throws ExecutionException {
		getOldSource().getWebpage().remove(getOldTarget());
		getOldSource().getWebpage().add(getNewTarget());
		return CommandResult.newOKCommandResult(referenceOwner);
	}

	/**
	* @generated
	*/
	protected WebDevProjectMM.Role getOldSource() {
		return (WebDevProjectMM.Role) referenceOwner;
	}

	/**
	* @generated
	*/
	protected WebDevProjectMM.Role getNewSource() {
		return (WebDevProjectMM.Role) newEnd;
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
