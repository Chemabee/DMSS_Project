/*
 * 
 */
package WebDevProjectMM.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

/**
 * @generated
 */
public class WebDevProjectMMModelingAssistantProviderOfDelitionCRUDEditPart
		extends WebDevProjectMM.diagram.providers.WebDevProjectMMModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(3);
		types.add(WebDevProjectMM.diagram.providers.WebDevProjectMMElementTypes.SocialNetworkContent_3003);
		types.add(WebDevProjectMM.diagram.providers.WebDevProjectMMElementTypes.Text_3001);
		types.add(WebDevProjectMM.diagram.providers.WebDevProjectMMElementTypes.MediaContent_3002);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource((WebDevProjectMM.diagram.edit.parts.DelitionCRUDEditPart) sourceEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSource(WebDevProjectMM.diagram.edit.parts.DelitionCRUDEditPart source) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(WebDevProjectMM.diagram.providers.WebDevProjectMMElementTypes.PageLink_4001);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSourceAndTarget(IAdaptable source, IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSourceAndTarget((WebDevProjectMM.diagram.edit.parts.DelitionCRUDEditPart) sourceEditPart,
				targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSourceAndTarget(
			WebDevProjectMM.diagram.edit.parts.DelitionCRUDEditPart source, IGraphicalEditPart targetEditPart) {
		List<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof WebDevProjectMM.diagram.edit.parts.CreationCRUDEditPart) {
			types.add(WebDevProjectMM.diagram.providers.WebDevProjectMMElementTypes.PageLink_4001);
		}
		if (targetEditPart instanceof WebDevProjectMM.diagram.edit.parts.DelitionCRUDEditPart) {
			types.add(WebDevProjectMM.diagram.providers.WebDevProjectMMElementTypes.PageLink_4001);
		}
		if (targetEditPart instanceof WebDevProjectMM.diagram.edit.parts.AllCRUDEditPart) {
			types.add(WebDevProjectMM.diagram.providers.WebDevProjectMMElementTypes.PageLink_4001);
		}
		if (targetEditPart instanceof WebDevProjectMM.diagram.edit.parts.IndexCRUDEditPart) {
			types.add(WebDevProjectMM.diagram.providers.WebDevProjectMMElementTypes.PageLink_4001);
		}
		if (targetEditPart instanceof WebDevProjectMM.diagram.edit.parts.DetailCRUDEditPart) {
			types.add(WebDevProjectMM.diagram.providers.WebDevProjectMMElementTypes.PageLink_4001);
		}
		if (targetEditPart instanceof WebDevProjectMM.diagram.edit.parts.RegularContentPageEditPart) {
			types.add(WebDevProjectMM.diagram.providers.WebDevProjectMMElementTypes.PageLink_4001);
		}
		if (targetEditPart instanceof WebDevProjectMM.diagram.edit.parts.FormEditPart) {
			types.add(WebDevProjectMM.diagram.providers.WebDevProjectMMElementTypes.PageLink_4001);
		}
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForTarget(IAdaptable source, IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForTarget((WebDevProjectMM.diagram.edit.parts.DelitionCRUDEditPart) sourceEditPart,
				relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForTarget(WebDevProjectMM.diagram.edit.parts.DelitionCRUDEditPart source,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == WebDevProjectMM.diagram.providers.WebDevProjectMMElementTypes.PageLink_4001) {
			types.add(WebDevProjectMM.diagram.providers.WebDevProjectMMElementTypes.CreationCRUD_2001);
			types.add(WebDevProjectMM.diagram.providers.WebDevProjectMMElementTypes.DelitionCRUD_2002);
			types.add(WebDevProjectMM.diagram.providers.WebDevProjectMMElementTypes.AllCRUD_2003);
			types.add(WebDevProjectMM.diagram.providers.WebDevProjectMMElementTypes.IndexCRUD_2004);
			types.add(WebDevProjectMM.diagram.providers.WebDevProjectMMElementTypes.DetailCRUD_2005);
			types.add(WebDevProjectMM.diagram.providers.WebDevProjectMMElementTypes.RegularContentPage_2006);
			types.add(WebDevProjectMM.diagram.providers.WebDevProjectMMElementTypes.Form_2007);
		}
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnTarget((WebDevProjectMM.diagram.edit.parts.DelitionCRUDEditPart) targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnTarget(WebDevProjectMM.diagram.edit.parts.DelitionCRUDEditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(2);
		types.add(WebDevProjectMM.diagram.providers.WebDevProjectMMElementTypes.PageLink_4001);
		types.add(WebDevProjectMM.diagram.providers.WebDevProjectMMElementTypes.RoleWebpage_4002);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForSource(IAdaptable target, IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForSource((WebDevProjectMM.diagram.edit.parts.DelitionCRUDEditPart) targetEditPart,
				relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForSource(WebDevProjectMM.diagram.edit.parts.DelitionCRUDEditPart target,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == WebDevProjectMM.diagram.providers.WebDevProjectMMElementTypes.PageLink_4001) {
			types.add(WebDevProjectMM.diagram.providers.WebDevProjectMMElementTypes.CreationCRUD_2001);
			types.add(WebDevProjectMM.diagram.providers.WebDevProjectMMElementTypes.DelitionCRUD_2002);
			types.add(WebDevProjectMM.diagram.providers.WebDevProjectMMElementTypes.AllCRUD_2003);
			types.add(WebDevProjectMM.diagram.providers.WebDevProjectMMElementTypes.IndexCRUD_2004);
			types.add(WebDevProjectMM.diagram.providers.WebDevProjectMMElementTypes.DetailCRUD_2005);
			types.add(WebDevProjectMM.diagram.providers.WebDevProjectMMElementTypes.RegularContentPage_2006);
			types.add(WebDevProjectMM.diagram.providers.WebDevProjectMMElementTypes.Form_2007);
		} else if (relationshipType == WebDevProjectMM.diagram.providers.WebDevProjectMMElementTypes.RoleWebpage_4002) {
			types.add(WebDevProjectMM.diagram.providers.WebDevProjectMMElementTypes.Role_2008);
		}
		return types;
	}

}
