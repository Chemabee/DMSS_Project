/*
* 
*/
package WebDevProjectMM.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class QuestionDefinitionQuestionDefinitionPossibleAsnwerCompartmentItemSemanticEditPolicy
		extends WebDevProjectMM.diagram.edit.policies.WebDevProjectMMBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public QuestionDefinitionQuestionDefinitionPossibleAsnwerCompartmentItemSemanticEditPolicy() {
		super(WebDevProjectMM.diagram.providers.WebDevProjectMMElementTypes.QuestionDefinition_3005);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (WebDevProjectMM.diagram.providers.WebDevProjectMMElementTypes.PossibleAsnwer_3006 == req.getElementType()) {
			return getGEFWrapper(new WebDevProjectMM.diagram.edit.commands.PossibleAsnwerCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
