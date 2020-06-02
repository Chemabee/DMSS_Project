/*
* 
*/
package WebDevProjectMM.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class DelitionCRUDDelitionCRUDSocialnetworkcontentCompartmentItemSemanticEditPolicy
		extends WebDevProjectMM.diagram.edit.policies.WebDevProjectMMBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public DelitionCRUDDelitionCRUDSocialnetworkcontentCompartmentItemSemanticEditPolicy() {
		super(WebDevProjectMM.diagram.providers.WebDevProjectMMElementTypes.DelitionCRUD_2002);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (WebDevProjectMM.diagram.providers.WebDevProjectMMElementTypes.SocialNetworkContent_3003 == req
				.getElementType()) {
			return getGEFWrapper(new WebDevProjectMM.diagram.edit.commands.SocialNetworkContentCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
