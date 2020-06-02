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
public class WebDevProjectMMModelingAssistantProviderOfWebSiteEditPart
		extends WebDevProjectMM.diagram.providers.WebDevProjectMMModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(8);
		types.add(WebDevProjectMM.diagram.providers.WebDevProjectMMElementTypes.CreationCRUD_2001);
		types.add(WebDevProjectMM.diagram.providers.WebDevProjectMMElementTypes.DelitionCRUD_2002);
		types.add(WebDevProjectMM.diagram.providers.WebDevProjectMMElementTypes.AllCRUD_2003);
		types.add(WebDevProjectMM.diagram.providers.WebDevProjectMMElementTypes.IndexCRUD_2004);
		types.add(WebDevProjectMM.diagram.providers.WebDevProjectMMElementTypes.DetailCRUD_2005);
		types.add(WebDevProjectMM.diagram.providers.WebDevProjectMMElementTypes.RegularContentPage_2006);
		types.add(WebDevProjectMM.diagram.providers.WebDevProjectMMElementTypes.Form_2007);
		types.add(WebDevProjectMM.diagram.providers.WebDevProjectMMElementTypes.Role_2008);
		return types;
	}

}
