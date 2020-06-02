/*
* 
*/
package WebDevProjectMM.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;

/**
 * @generated
 */
public class EntityRefersToItemSemanticEditPolicy
		extends WebDevProjectMM.diagram.edit.policies.WebDevProjectMMBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public EntityRefersToItemSemanticEditPolicy() {
		super(WebDevProjectMM.diagram.providers.WebDevProjectMMElementTypes.EntityRefersTo_4003);
	}

	/**
	* @generated
	*/
	protected Command getDestroyReferenceCommand(DestroyReferenceRequest req) {
		return getGEFWrapper(new DestroyReferenceCommand(req));
	}

}
