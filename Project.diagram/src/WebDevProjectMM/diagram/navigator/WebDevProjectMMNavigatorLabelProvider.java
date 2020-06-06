/*
* 
*/
package WebDevProjectMM.diagram.navigator;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.common.ui.services.parser.CommonParserHint;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserOptions;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.ITreePathLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.ViewerLabel;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonLabelProvider;

/**
 * @generated
 */
public class WebDevProjectMMNavigatorLabelProvider extends LabelProvider
		implements ICommonLabelProvider, ITreePathLabelProvider {

	/**
	* @generated
	*/
	static {
		WebDevProjectMM.diagram.part.WebDevProjectMMDiagramEditorPlugin.getInstance().getImageRegistry()
				.put("Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		WebDevProjectMM.diagram.part.WebDevProjectMMDiagramEditorPlugin.getInstance().getImageRegistry()
				.put("Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof WebDevProjectMM.diagram.navigator.WebDevProjectMMNavigatorItem
				&& !isOwnView(((WebDevProjectMM.diagram.navigator.WebDevProjectMMNavigatorItem) element).getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	* @generated
	*/
	public Image getImage(Object element) {
		if (element instanceof WebDevProjectMM.diagram.navigator.WebDevProjectMMNavigatorGroup) {
			WebDevProjectMM.diagram.navigator.WebDevProjectMMNavigatorGroup group = (WebDevProjectMM.diagram.navigator.WebDevProjectMMNavigatorGroup) element;
			return WebDevProjectMM.diagram.part.WebDevProjectMMDiagramEditorPlugin.getInstance()
					.getBundledImage(group.getIcon());
		}

		if (element instanceof WebDevProjectMM.diagram.navigator.WebDevProjectMMNavigatorItem) {
			WebDevProjectMM.diagram.navigator.WebDevProjectMMNavigatorItem navigatorItem = (WebDevProjectMM.diagram.navigator.WebDevProjectMMNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return super.getImage(element);
			}
			return getImage(navigatorItem.getView());
		}

		// Due to plugin.xml content will be called only for "own" views
		if (element instanceof IAdaptable) {
			View view = (View) ((IAdaptable) element).getAdapter(View.class);
			if (view != null && isOwnView(view)) {
				return getImage(view);
			}
		}

		return super.getImage(element);
	}

	/**
	* @generated
	*/
	public Image getImage(View view) {
		switch (WebDevProjectMM.diagram.part.WebDevProjectMMVisualIDRegistry.getVisualID(view)) {
		case WebDevProjectMM.diagram.edit.parts.WebSiteEditPart.VISUAL_ID:
			return getImage("Navigator?Diagram?https://www.WebDevProjectMM.com?WebSite", //$NON-NLS-1$
					WebDevProjectMM.diagram.providers.WebDevProjectMMElementTypes.WebSite_1000);
		case WebDevProjectMM.diagram.edit.parts.CreationCRUDEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?https://www.WebDevProjectMM.com?CreationCRUD", //$NON-NLS-1$
					WebDevProjectMM.diagram.providers.WebDevProjectMMElementTypes.CreationCRUD_2001);
		case WebDevProjectMM.diagram.edit.parts.DelitionCRUDEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?https://www.WebDevProjectMM.com?DelitionCRUD", //$NON-NLS-1$
					WebDevProjectMM.diagram.providers.WebDevProjectMMElementTypes.DelitionCRUD_2002);
		case WebDevProjectMM.diagram.edit.parts.AllCRUDEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?https://www.WebDevProjectMM.com?AllCRUD", //$NON-NLS-1$
					WebDevProjectMM.diagram.providers.WebDevProjectMMElementTypes.AllCRUD_2003);
		case WebDevProjectMM.diagram.edit.parts.IndexCRUDEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?https://www.WebDevProjectMM.com?IndexCRUD", //$NON-NLS-1$
					WebDevProjectMM.diagram.providers.WebDevProjectMMElementTypes.IndexCRUD_2004);
		case WebDevProjectMM.diagram.edit.parts.DetailCRUDEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?https://www.WebDevProjectMM.com?DetailCRUD", //$NON-NLS-1$
					WebDevProjectMM.diagram.providers.WebDevProjectMMElementTypes.DetailCRUD_2005);
		case WebDevProjectMM.diagram.edit.parts.RegularContentPageEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?https://www.WebDevProjectMM.com?RegularContentPage", //$NON-NLS-1$
					WebDevProjectMM.diagram.providers.WebDevProjectMMElementTypes.RegularContentPage_2006);
		case WebDevProjectMM.diagram.edit.parts.FormEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?https://www.WebDevProjectMM.com?Form", //$NON-NLS-1$
					WebDevProjectMM.diagram.providers.WebDevProjectMMElementTypes.Form_2007);
		case WebDevProjectMM.diagram.edit.parts.RoleEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?https://www.WebDevProjectMM.com?Role", //$NON-NLS-1$
					WebDevProjectMM.diagram.providers.WebDevProjectMMElementTypes.Role_2008);
		case WebDevProjectMM.diagram.edit.parts.TextEditPart.VISUAL_ID:
			return getImage("Navigator?Node?https://www.WebDevProjectMM.com?Text", //$NON-NLS-1$
					WebDevProjectMM.diagram.providers.WebDevProjectMMElementTypes.Text_3001);
		case WebDevProjectMM.diagram.edit.parts.MediaContentEditPart.VISUAL_ID:
			return getImage("Navigator?Node?https://www.WebDevProjectMM.com?MediaContent", //$NON-NLS-1$
					WebDevProjectMM.diagram.providers.WebDevProjectMMElementTypes.MediaContent_3002);
		case WebDevProjectMM.diagram.edit.parts.SocialNetworkContentEditPart.VISUAL_ID:
			return getImage("Navigator?Node?https://www.WebDevProjectMM.com?SocialNetworkContent", //$NON-NLS-1$
					WebDevProjectMM.diagram.providers.WebDevProjectMMElementTypes.SocialNetworkContent_3003);
		case WebDevProjectMM.diagram.edit.parts.StoredQuestionEditPart.VISUAL_ID:
			return getImage("Navigator?Node?https://www.WebDevProjectMM.com?StoredQuestion", //$NON-NLS-1$
					WebDevProjectMM.diagram.providers.WebDevProjectMMElementTypes.StoredQuestion_3004);
		case WebDevProjectMM.diagram.edit.parts.QuestionDefinitionEditPart.VISUAL_ID:
			return getImage("Navigator?Node?https://www.WebDevProjectMM.com?QuestionDefinition", //$NON-NLS-1$
					WebDevProjectMM.diagram.providers.WebDevProjectMMElementTypes.QuestionDefinition_3005);
		case WebDevProjectMM.diagram.edit.parts.PossibleAsnwerEditPart.VISUAL_ID:
			return getImage("Navigator?Node?https://www.WebDevProjectMM.com?PossibleAsnwer", //$NON-NLS-1$
					WebDevProjectMM.diagram.providers.WebDevProjectMMElementTypes.PossibleAsnwer_3006);
		case WebDevProjectMM.diagram.edit.parts.PageLinkEditPart.VISUAL_ID:
			return getImage("Navigator?Link?https://www.WebDevProjectMM.com?PageLink", //$NON-NLS-1$
					WebDevProjectMM.diagram.providers.WebDevProjectMMElementTypes.PageLink_4001);
		case WebDevProjectMM.diagram.edit.parts.RoleWebpageEditPart.VISUAL_ID:
			return getImage("Navigator?Link?https://www.WebDevProjectMM.com?Role?webpage", //$NON-NLS-1$
					WebDevProjectMM.diagram.providers.WebDevProjectMMElementTypes.RoleWebpage_4002);
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = WebDevProjectMM.diagram.part.WebDevProjectMMDiagramEditorPlugin.getInstance()
				.getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null
				&& WebDevProjectMM.diagram.providers.WebDevProjectMMElementTypes.isKnownElementType(elementType)) {
			image = WebDevProjectMM.diagram.providers.WebDevProjectMMElementTypes.getImage(elementType);
			imageRegistry.put(key, image);
		}

		if (image == null) {
			image = imageRegistry.get("Navigator?ImageNotFound"); //$NON-NLS-1$
			imageRegistry.put(key, image);
		}
		return image;
	}

	/**
	* @generated
	*/
	public String getText(Object element) {
		if (element instanceof WebDevProjectMM.diagram.navigator.WebDevProjectMMNavigatorGroup) {
			WebDevProjectMM.diagram.navigator.WebDevProjectMMNavigatorGroup group = (WebDevProjectMM.diagram.navigator.WebDevProjectMMNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof WebDevProjectMM.diagram.navigator.WebDevProjectMMNavigatorItem) {
			WebDevProjectMM.diagram.navigator.WebDevProjectMMNavigatorItem navigatorItem = (WebDevProjectMM.diagram.navigator.WebDevProjectMMNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return null;
			}
			return getText(navigatorItem.getView());
		}

		// Due to plugin.xml content will be called only for "own" views
		if (element instanceof IAdaptable) {
			View view = (View) ((IAdaptable) element).getAdapter(View.class);
			if (view != null && isOwnView(view)) {
				return getText(view);
			}
		}

		return super.getText(element);
	}

	/**
	* @generated
	*/
	public String getText(View view) {
		if (view.getElement() != null && view.getElement().eIsProxy()) {
			return getUnresolvedDomainElementProxyText(view);
		}
		switch (WebDevProjectMM.diagram.part.WebDevProjectMMVisualIDRegistry.getVisualID(view)) {
		case WebDevProjectMM.diagram.edit.parts.WebSiteEditPart.VISUAL_ID:
			return getWebSite_1000Text(view);
		case WebDevProjectMM.diagram.edit.parts.CreationCRUDEditPart.VISUAL_ID:
			return getCreationCRUD_2001Text(view);
		case WebDevProjectMM.diagram.edit.parts.DelitionCRUDEditPart.VISUAL_ID:
			return getDelitionCRUD_2002Text(view);
		case WebDevProjectMM.diagram.edit.parts.AllCRUDEditPart.VISUAL_ID:
			return getAllCRUD_2003Text(view);
		case WebDevProjectMM.diagram.edit.parts.IndexCRUDEditPart.VISUAL_ID:
			return getIndexCRUD_2004Text(view);
		case WebDevProjectMM.diagram.edit.parts.DetailCRUDEditPart.VISUAL_ID:
			return getDetailCRUD_2005Text(view);
		case WebDevProjectMM.diagram.edit.parts.RegularContentPageEditPart.VISUAL_ID:
			return getRegularContentPage_2006Text(view);
		case WebDevProjectMM.diagram.edit.parts.FormEditPart.VISUAL_ID:
			return getForm_2007Text(view);
		case WebDevProjectMM.diagram.edit.parts.RoleEditPart.VISUAL_ID:
			return getRole_2008Text(view);
		case WebDevProjectMM.diagram.edit.parts.TextEditPart.VISUAL_ID:
			return getText_3001Text(view);
		case WebDevProjectMM.diagram.edit.parts.MediaContentEditPart.VISUAL_ID:
			return getMediaContent_3002Text(view);
		case WebDevProjectMM.diagram.edit.parts.SocialNetworkContentEditPart.VISUAL_ID:
			return getSocialNetworkContent_3003Text(view);
		case WebDevProjectMM.diagram.edit.parts.StoredQuestionEditPart.VISUAL_ID:
			return getStoredQuestion_3004Text(view);
		case WebDevProjectMM.diagram.edit.parts.QuestionDefinitionEditPart.VISUAL_ID:
			return getQuestionDefinition_3005Text(view);
		case WebDevProjectMM.diagram.edit.parts.PossibleAsnwerEditPart.VISUAL_ID:
			return getPossibleAsnwer_3006Text(view);
		case WebDevProjectMM.diagram.edit.parts.PageLinkEditPart.VISUAL_ID:
			return getPageLink_4001Text(view);
		case WebDevProjectMM.diagram.edit.parts.RoleWebpageEditPart.VISUAL_ID:
			return getRoleWebpage_4002Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	* @generated
	*/
	private String getWebSite_1000Text(View view) {
		WebDevProjectMM.WebSite domainModelElement = (WebDevProjectMM.WebSite) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			WebDevProjectMM.diagram.part.WebDevProjectMMDiagramEditorPlugin.getInstance()
					.logError("No domain element for view with visualID = " + 1000); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getCreationCRUD_2001Text(View view) {
		IParser parser = WebDevProjectMM.diagram.providers.WebDevProjectMMParserProvider.getParser(
				WebDevProjectMM.diagram.providers.WebDevProjectMMElementTypes.CreationCRUD_2001,
				view.getElement() != null ? view.getElement() : view,
				WebDevProjectMM.diagram.part.WebDevProjectMMVisualIDRegistry
						.getType(WebDevProjectMM.diagram.edit.parts.CreationCRUDNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebDevProjectMM.diagram.part.WebDevProjectMMDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5004); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getDelitionCRUD_2002Text(View view) {
		IParser parser = WebDevProjectMM.diagram.providers.WebDevProjectMMParserProvider.getParser(
				WebDevProjectMM.diagram.providers.WebDevProjectMMElementTypes.DelitionCRUD_2002,
				view.getElement() != null ? view.getElement() : view,
				WebDevProjectMM.diagram.part.WebDevProjectMMVisualIDRegistry
						.getType(WebDevProjectMM.diagram.edit.parts.DelitionCRUDNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebDevProjectMM.diagram.part.WebDevProjectMMDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5005); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getAllCRUD_2003Text(View view) {
		IParser parser = WebDevProjectMM.diagram.providers.WebDevProjectMMParserProvider.getParser(
				WebDevProjectMM.diagram.providers.WebDevProjectMMElementTypes.AllCRUD_2003,
				view.getElement() != null ? view.getElement() : view,
				WebDevProjectMM.diagram.part.WebDevProjectMMVisualIDRegistry
						.getType(WebDevProjectMM.diagram.edit.parts.AllCRUDNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebDevProjectMM.diagram.part.WebDevProjectMMDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5006); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getIndexCRUD_2004Text(View view) {
		IParser parser = WebDevProjectMM.diagram.providers.WebDevProjectMMParserProvider.getParser(
				WebDevProjectMM.diagram.providers.WebDevProjectMMElementTypes.IndexCRUD_2004,
				view.getElement() != null ? view.getElement() : view,
				WebDevProjectMM.diagram.part.WebDevProjectMMVisualIDRegistry
						.getType(WebDevProjectMM.diagram.edit.parts.IndexCRUDNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebDevProjectMM.diagram.part.WebDevProjectMMDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5007); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getDetailCRUD_2005Text(View view) {
		IParser parser = WebDevProjectMM.diagram.providers.WebDevProjectMMParserProvider.getParser(
				WebDevProjectMM.diagram.providers.WebDevProjectMMElementTypes.DetailCRUD_2005,
				view.getElement() != null ? view.getElement() : view,
				WebDevProjectMM.diagram.part.WebDevProjectMMVisualIDRegistry
						.getType(WebDevProjectMM.diagram.edit.parts.DetailCRUDNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebDevProjectMM.diagram.part.WebDevProjectMMDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5008); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getRegularContentPage_2006Text(View view) {
		IParser parser = WebDevProjectMM.diagram.providers.WebDevProjectMMParserProvider.getParser(
				WebDevProjectMM.diagram.providers.WebDevProjectMMElementTypes.RegularContentPage_2006,
				view.getElement() != null ? view.getElement() : view,
				WebDevProjectMM.diagram.part.WebDevProjectMMVisualIDRegistry
						.getType(WebDevProjectMM.diagram.edit.parts.RegularContentPageNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebDevProjectMM.diagram.part.WebDevProjectMMDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5009); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getForm_2007Text(View view) {
		IParser parser = WebDevProjectMM.diagram.providers.WebDevProjectMMParserProvider.getParser(
				WebDevProjectMM.diagram.providers.WebDevProjectMMElementTypes.Form_2007,
				view.getElement() != null ? view.getElement() : view,
				WebDevProjectMM.diagram.part.WebDevProjectMMVisualIDRegistry
						.getType(WebDevProjectMM.diagram.edit.parts.FormNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebDevProjectMM.diagram.part.WebDevProjectMMDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5013); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getRole_2008Text(View view) {
		IParser parser = WebDevProjectMM.diagram.providers.WebDevProjectMMParserProvider.getParser(
				WebDevProjectMM.diagram.providers.WebDevProjectMMElementTypes.Role_2008,
				view.getElement() != null ? view.getElement() : view,
				WebDevProjectMM.diagram.part.WebDevProjectMMVisualIDRegistry
						.getType(WebDevProjectMM.diagram.edit.parts.RoleNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebDevProjectMM.diagram.part.WebDevProjectMMDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5014); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getText_3001Text(View view) {
		IParser parser = WebDevProjectMM.diagram.providers.WebDevProjectMMParserProvider.getParser(
				WebDevProjectMM.diagram.providers.WebDevProjectMMElementTypes.Text_3001,
				view.getElement() != null ? view.getElement() : view,
				WebDevProjectMM.diagram.part.WebDevProjectMMVisualIDRegistry
						.getType(WebDevProjectMM.diagram.edit.parts.TextTextEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebDevProjectMM.diagram.part.WebDevProjectMMDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getMediaContent_3002Text(View view) {
		IParser parser = WebDevProjectMM.diagram.providers.WebDevProjectMMParserProvider.getParser(
				WebDevProjectMM.diagram.providers.WebDevProjectMMElementTypes.MediaContent_3002,
				view.getElement() != null ? view.getElement() : view,
				WebDevProjectMM.diagram.part.WebDevProjectMMVisualIDRegistry
						.getType(WebDevProjectMM.diagram.edit.parts.MediaContentLinkEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebDevProjectMM.diagram.part.WebDevProjectMMDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getSocialNetworkContent_3003Text(View view) {
		IParser parser = WebDevProjectMM.diagram.providers.WebDevProjectMMParserProvider.getParser(
				WebDevProjectMM.diagram.providers.WebDevProjectMMElementTypes.SocialNetworkContent_3003,
				view.getElement() != null ? view.getElement() : view,
				WebDevProjectMM.diagram.part.WebDevProjectMMVisualIDRegistry
						.getType(WebDevProjectMM.diagram.edit.parts.SocialNetworkContentParametersEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebDevProjectMM.diagram.part.WebDevProjectMMDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getStoredQuestion_3004Text(View view) {
		IParser parser = WebDevProjectMM.diagram.providers.WebDevProjectMMParserProvider.getParser(
				WebDevProjectMM.diagram.providers.WebDevProjectMMElementTypes.StoredQuestion_3004,
				view.getElement() != null ? view.getElement() : view,
				WebDevProjectMM.diagram.part.WebDevProjectMMVisualIDRegistry.getType(
						WebDevProjectMM.diagram.edit.parts.StoredQuestionDescQuestionDefinitionEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebDevProjectMM.diagram.part.WebDevProjectMMDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5010); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getQuestionDefinition_3005Text(View view) {
		IParser parser = WebDevProjectMM.diagram.providers.WebDevProjectMMParserProvider.getParser(
				WebDevProjectMM.diagram.providers.WebDevProjectMMElementTypes.QuestionDefinition_3005,
				view.getElement() != null ? view.getElement() : view,
				WebDevProjectMM.diagram.part.WebDevProjectMMVisualIDRegistry
						.getType(WebDevProjectMM.diagram.edit.parts.QuestionDefinitionDescriptionEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebDevProjectMM.diagram.part.WebDevProjectMMDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5012); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getPossibleAsnwer_3006Text(View view) {
		IParser parser = WebDevProjectMM.diagram.providers.WebDevProjectMMParserProvider.getParser(
				WebDevProjectMM.diagram.providers.WebDevProjectMMElementTypes.PossibleAsnwer_3006,
				view.getElement() != null ? view.getElement() : view,
				WebDevProjectMM.diagram.part.WebDevProjectMMVisualIDRegistry
						.getType(WebDevProjectMM.diagram.edit.parts.PossibleAsnwerAnswerTextEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebDevProjectMM.diagram.part.WebDevProjectMMDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5011); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getPageLink_4001Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getRoleWebpage_4002Text(View view) {
		IParser parser = WebDevProjectMM.diagram.providers.WebDevProjectMMParserProvider.getParser(
				WebDevProjectMM.diagram.providers.WebDevProjectMMElementTypes.RoleWebpage_4002,
				view.getElement() != null ? view.getElement() : view, CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebDevProjectMM.diagram.part.WebDevProjectMMDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 6001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getUnknownElementText(View view) {
		return "<UnknownElement Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	* @generated
	*/
	private String getUnresolvedDomainElementProxyText(View view) {
		return "<Unresolved domain element Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	* @generated
	*/
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	* @generated
	*/
	public void restoreState(IMemento aMemento) {
	}

	/**
	* @generated
	*/
	public void saveState(IMemento aMemento) {
	}

	/**
	* @generated
	*/
	public String getDescription(Object anElement) {
		return null;
	}

	/**
	* @generated
	*/
	private boolean isOwnView(View view) {
		return WebDevProjectMM.diagram.edit.parts.WebSiteEditPart.MODEL_ID
				.equals(WebDevProjectMM.diagram.part.WebDevProjectMMVisualIDRegistry.getModelID(view));
	}

}
