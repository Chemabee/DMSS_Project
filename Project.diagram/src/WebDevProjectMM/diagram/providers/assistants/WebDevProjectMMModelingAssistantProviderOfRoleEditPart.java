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
public class WebDevProjectMMModelingAssistantProviderOfRoleEditPart
		extends WebDevProjectMM.diagram.providers.WebDevProjectMMModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource((WebDevProjectMM.diagram.edit.parts.RoleEditPart) sourceEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSource(WebDevProjectMM.diagram.edit.parts.RoleEditPart source) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(WebDevProjectMM.diagram.providers.WebDevProjectMMElementTypes.RoleWebpage_4002);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSourceAndTarget(IAdaptable source, IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSourceAndTarget((WebDevProjectMM.diagram.edit.parts.RoleEditPart) sourceEditPart,
				targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSourceAndTarget(WebDevProjectMM.diagram.edit.parts.RoleEditPart source,
			IGraphicalEditPart targetEditPart) {
		List<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof WebDevProjectMM.diagram.edit.parts.CreationCRUDEditPart) {
			types.add(WebDevProjectMM.diagram.providers.WebDevProjectMMElementTypes.RoleWebpage_4002);
		}
		if (targetEditPart instanceof WebDevProjectMM.diagram.edit.parts.DelitionCRUDEditPart) {
			types.add(WebDevProjectMM.diagram.providers.WebDevProjectMMElementTypes.RoleWebpage_4002);
		}
		if (targetEditPart instanceof WebDevProjectMM.diagram.edit.parts.AllCRUDEditPart) {
			types.add(WebDevProjectMM.diagram.providers.WebDevProjectMMElementTypes.RoleWebpage_4002);
		}
		if (targetEditPart instanceof WebDevProjectMM.diagram.edit.parts.IndexCRUDEditPart) {
			types.add(WebDevProjectMM.diagram.providers.WebDevProjectMMElementTypes.RoleWebpage_4002);
		}
		if (targetEditPart instanceof WebDevProjectMM.diagram.edit.parts.DetailCRUDEditPart) {
			types.add(WebDevProjectMM.diagram.providers.WebDevProjectMMElementTypes.RoleWebpage_4002);
		}
		if (targetEditPart instanceof WebDevProjectMM.diagram.edit.parts.RegularContentPageEditPart) {
			types.add(WebDevProjectMM.diagram.providers.WebDevProjectMMElementTypes.RoleWebpage_4002);
		}
		if (targetEditPart instanceof WebDevProjectMM.diagram.edit.parts.FormEditPart) {
			types.add(WebDevProjectMM.diagram.providers.WebDevProjectMMElementTypes.RoleWebpage_4002);
		}
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForTarget(IAdaptable source, IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForTarget((WebDevProjectMM.diagram.edit.parts.RoleEditPart) sourceEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForTarget(WebDevProjectMM.diagram.edit.parts.RoleEditPart source,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == WebDevProjectMM.diagram.providers.WebDevProjectMMElementTypes.RoleWebpage_4002) {
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

}
