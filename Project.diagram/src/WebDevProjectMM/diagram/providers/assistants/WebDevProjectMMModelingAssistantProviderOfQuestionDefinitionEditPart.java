/*
 * 
 */
package WebDevProjectMM.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

/**
 * @generated
 */
public class WebDevProjectMMModelingAssistantProviderOfQuestionDefinitionEditPart
		extends WebDevProjectMM.diagram.providers.WebDevProjectMMModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(WebDevProjectMM.diagram.providers.WebDevProjectMMElementTypes.PossibleAsnwer_3006);
		return types;
	}

}
