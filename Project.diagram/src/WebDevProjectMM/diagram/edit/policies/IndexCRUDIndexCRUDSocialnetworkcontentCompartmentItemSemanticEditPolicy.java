/*
* 
*/
package WebDevProjectMM.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class IndexCRUDIndexCRUDSocialnetworkcontentCompartmentItemSemanticEditPolicy
		extends WebDevProjectMM.diagram.edit.policies.WebDevProjectMMBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public IndexCRUDIndexCRUDSocialnetworkcontentCompartmentItemSemanticEditPolicy() {
		super(WebDevProjectMM.diagram.providers.WebDevProjectMMElementTypes.IndexCRUD_2004);
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
