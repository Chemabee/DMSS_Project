/*
* 
*/
package WebDevProjectMM.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class DelitionCRUDDelitionCRUDElementsCompartmentItemSemanticEditPolicy
		extends WebDevProjectMM.diagram.edit.policies.WebDevProjectMMBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public DelitionCRUDDelitionCRUDElementsCompartmentItemSemanticEditPolicy() {
		super(WebDevProjectMM.diagram.providers.WebDevProjectMMElementTypes.DelitionCRUD_2002);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (WebDevProjectMM.diagram.providers.WebDevProjectMMElementTypes.Text_3001 == req.getElementType()) {
			return getGEFWrapper(new WebDevProjectMM.diagram.edit.commands.TextCreateCommand(req));
		}
		if (WebDevProjectMM.diagram.providers.WebDevProjectMMElementTypes.MediaContent_3002 == req.getElementType()) {
			return getGEFWrapper(new WebDevProjectMM.diagram.edit.commands.MediaContentCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
