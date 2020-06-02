/*
* 
*/
package WebDevProjectMM.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.structure.DiagramStructure;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class WebDevProjectMMVisualIDRegistry {

	/**
	* @generated
	*/
	private static final String DEBUG_KEY = "Project.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	* @generated
	*/
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (WebDevProjectMM.diagram.edit.parts.WebSiteEditPart.MODEL_ID.equals(view.getType())) {
				return WebDevProjectMM.diagram.edit.parts.WebSiteEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return WebDevProjectMM.diagram.part.WebDevProjectMMVisualIDRegistry.getVisualID(view.getType());
	}

	/**
	* @generated
	*/
	public static String getModelID(View view) {
		View diagram = view.getDiagram();
		while (view != diagram) {
			EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
			if (annotation != null) {
				return (String) annotation.getDetails().get("modelID"); //$NON-NLS-1$
			}
			view = (View) view.eContainer();
		}
		return diagram != null ? diagram.getType() : null;
	}

	/**
	* @generated
	*/
	public static int getVisualID(String type) {
		try {
			return Integer.parseInt(type);
		} catch (NumberFormatException e) {
			if (Boolean.TRUE.toString().equalsIgnoreCase(Platform.getDebugOption(DEBUG_KEY))) {
				WebDevProjectMM.diagram.part.WebDevProjectMMDiagramEditorPlugin.getInstance()
						.logError("Unable to parse view type as a visualID number: " + type);
			}
		}
		return -1;
	}

	/**
	* @generated
	*/
	public static String getType(int visualID) {
		return Integer.toString(visualID);
	}

	/**
	* @generated
	*/
	public static int getDiagramVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (WebDevProjectMM.WebDevProjectMMPackage.eINSTANCE.getWebSite().isSuperTypeOf(domainElement.eClass())
				&& isDiagram((WebDevProjectMM.WebSite) domainElement)) {
			return WebDevProjectMM.diagram.edit.parts.WebSiteEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	* @generated
	*/
	public static int getNodeVisualID(View containerView, EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		String containerModelID = WebDevProjectMM.diagram.part.WebDevProjectMMVisualIDRegistry
				.getModelID(containerView);
		if (!WebDevProjectMM.diagram.edit.parts.WebSiteEditPart.MODEL_ID.equals(containerModelID)
				&& !"WebDevProjectMM".equals(containerModelID)) { //$NON-NLS-1$
			return -1;
		}
		int containerVisualID;
		if (WebDevProjectMM.diagram.edit.parts.WebSiteEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = WebDevProjectMM.diagram.part.WebDevProjectMMVisualIDRegistry.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = WebDevProjectMM.diagram.edit.parts.WebSiteEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case WebDevProjectMM.diagram.edit.parts.WebSiteEditPart.VISUAL_ID:
			if (WebDevProjectMM.WebDevProjectMMPackage.eINSTANCE.getCreationCRUD()
					.isSuperTypeOf(domainElement.eClass())) {
				return WebDevProjectMM.diagram.edit.parts.CreationCRUDEditPart.VISUAL_ID;
			}
			if (WebDevProjectMM.WebDevProjectMMPackage.eINSTANCE.getDelitionCRUD()
					.isSuperTypeOf(domainElement.eClass())) {
				return WebDevProjectMM.diagram.edit.parts.DelitionCRUDEditPart.VISUAL_ID;
			}
			if (WebDevProjectMM.WebDevProjectMMPackage.eINSTANCE.getAllCRUD().isSuperTypeOf(domainElement.eClass())) {
				return WebDevProjectMM.diagram.edit.parts.AllCRUDEditPart.VISUAL_ID;
			}
			if (WebDevProjectMM.WebDevProjectMMPackage.eINSTANCE.getIndexCRUD().isSuperTypeOf(domainElement.eClass())) {
				return WebDevProjectMM.diagram.edit.parts.IndexCRUDEditPart.VISUAL_ID;
			}
			if (WebDevProjectMM.WebDevProjectMMPackage.eINSTANCE.getDetailCRUD()
					.isSuperTypeOf(domainElement.eClass())) {
				return WebDevProjectMM.diagram.edit.parts.DetailCRUDEditPart.VISUAL_ID;
			}
			if (WebDevProjectMM.WebDevProjectMMPackage.eINSTANCE.getRegularContentPage()
					.isSuperTypeOf(domainElement.eClass())) {
				return WebDevProjectMM.diagram.edit.parts.RegularContentPageEditPart.VISUAL_ID;
			}
			if (WebDevProjectMM.WebDevProjectMMPackage.eINSTANCE.getForm().isSuperTypeOf(domainElement.eClass())) {
				return WebDevProjectMM.diagram.edit.parts.FormEditPart.VISUAL_ID;
			}
			if (WebDevProjectMM.WebDevProjectMMPackage.eINSTANCE.getRole().isSuperTypeOf(domainElement.eClass())) {
				return WebDevProjectMM.diagram.edit.parts.RoleEditPart.VISUAL_ID;
			}
			break;
		case WebDevProjectMM.diagram.edit.parts.CreationCRUDCreationCRUDSocialnetworkcontentCompartmentEditPart.VISUAL_ID:
			if (WebDevProjectMM.WebDevProjectMMPackage.eINSTANCE.getSocialNetworkContent()
					.isSuperTypeOf(domainElement.eClass())) {
				return WebDevProjectMM.diagram.edit.parts.SocialNetworkContentEditPart.VISUAL_ID;
			}
			break;
		case WebDevProjectMM.diagram.edit.parts.CreationCRUDCreationCRUDElementsCompartmentEditPart.VISUAL_ID:
			if (WebDevProjectMM.WebDevProjectMMPackage.eINSTANCE.getText().isSuperTypeOf(domainElement.eClass())) {
				return WebDevProjectMM.diagram.edit.parts.TextEditPart.VISUAL_ID;
			}
			if (WebDevProjectMM.WebDevProjectMMPackage.eINSTANCE.getMediaContent()
					.isSuperTypeOf(domainElement.eClass())) {
				return WebDevProjectMM.diagram.edit.parts.MediaContentEditPart.VISUAL_ID;
			}
			break;
		case WebDevProjectMM.diagram.edit.parts.DelitionCRUDDelitionCRUDSocialnetworkcontentCompartmentEditPart.VISUAL_ID:
			if (WebDevProjectMM.WebDevProjectMMPackage.eINSTANCE.getSocialNetworkContent()
					.isSuperTypeOf(domainElement.eClass())) {
				return WebDevProjectMM.diagram.edit.parts.SocialNetworkContentEditPart.VISUAL_ID;
			}
			break;
		case WebDevProjectMM.diagram.edit.parts.DelitionCRUDDelitionCRUDElementsCompartmentEditPart.VISUAL_ID:
			if (WebDevProjectMM.WebDevProjectMMPackage.eINSTANCE.getText().isSuperTypeOf(domainElement.eClass())) {
				return WebDevProjectMM.diagram.edit.parts.TextEditPart.VISUAL_ID;
			}
			if (WebDevProjectMM.WebDevProjectMMPackage.eINSTANCE.getMediaContent()
					.isSuperTypeOf(domainElement.eClass())) {
				return WebDevProjectMM.diagram.edit.parts.MediaContentEditPart.VISUAL_ID;
			}
			break;
		case WebDevProjectMM.diagram.edit.parts.AllCRUDAllCRUDSocialnetworkcontentCompartmentEditPart.VISUAL_ID:
			if (WebDevProjectMM.WebDevProjectMMPackage.eINSTANCE.getSocialNetworkContent()
					.isSuperTypeOf(domainElement.eClass())) {
				return WebDevProjectMM.diagram.edit.parts.SocialNetworkContentEditPart.VISUAL_ID;
			}
			break;
		case WebDevProjectMM.diagram.edit.parts.AllCRUDAllCRUDElementsCompartmentEditPart.VISUAL_ID:
			if (WebDevProjectMM.WebDevProjectMMPackage.eINSTANCE.getText().isSuperTypeOf(domainElement.eClass())) {
				return WebDevProjectMM.diagram.edit.parts.TextEditPart.VISUAL_ID;
			}
			if (WebDevProjectMM.WebDevProjectMMPackage.eINSTANCE.getMediaContent()
					.isSuperTypeOf(domainElement.eClass())) {
				return WebDevProjectMM.diagram.edit.parts.MediaContentEditPart.VISUAL_ID;
			}
			break;
		case WebDevProjectMM.diagram.edit.parts.IndexCRUDIndexCRUDSocialnetworkcontentCompartmentEditPart.VISUAL_ID:
			if (WebDevProjectMM.WebDevProjectMMPackage.eINSTANCE.getSocialNetworkContent()
					.isSuperTypeOf(domainElement.eClass())) {
				return WebDevProjectMM.diagram.edit.parts.SocialNetworkContentEditPart.VISUAL_ID;
			}
			break;
		case WebDevProjectMM.diagram.edit.parts.IndexCRUDIndexCRUDElementsCompartmentEditPart.VISUAL_ID:
			if (WebDevProjectMM.WebDevProjectMMPackage.eINSTANCE.getText().isSuperTypeOf(domainElement.eClass())) {
				return WebDevProjectMM.diagram.edit.parts.TextEditPart.VISUAL_ID;
			}
			if (WebDevProjectMM.WebDevProjectMMPackage.eINSTANCE.getMediaContent()
					.isSuperTypeOf(domainElement.eClass())) {
				return WebDevProjectMM.diagram.edit.parts.MediaContentEditPart.VISUAL_ID;
			}
			break;
		case WebDevProjectMM.diagram.edit.parts.DetailCRUDDetailCRUDSocialnetworkcontentCompartmentEditPart.VISUAL_ID:
			if (WebDevProjectMM.WebDevProjectMMPackage.eINSTANCE.getSocialNetworkContent()
					.isSuperTypeOf(domainElement.eClass())) {
				return WebDevProjectMM.diagram.edit.parts.SocialNetworkContentEditPart.VISUAL_ID;
			}
			break;
		case WebDevProjectMM.diagram.edit.parts.DetailCRUDDetailCRUDElementsCompartmentEditPart.VISUAL_ID:
			if (WebDevProjectMM.WebDevProjectMMPackage.eINSTANCE.getText().isSuperTypeOf(domainElement.eClass())) {
				return WebDevProjectMM.diagram.edit.parts.TextEditPart.VISUAL_ID;
			}
			if (WebDevProjectMM.WebDevProjectMMPackage.eINSTANCE.getMediaContent()
					.isSuperTypeOf(domainElement.eClass())) {
				return WebDevProjectMM.diagram.edit.parts.MediaContentEditPart.VISUAL_ID;
			}
			break;
		case WebDevProjectMM.diagram.edit.parts.RegularContentPageRegularContentPageSocialnetworkcontentCompartmentEditPart.VISUAL_ID:
			if (WebDevProjectMM.WebDevProjectMMPackage.eINSTANCE.getSocialNetworkContent()
					.isSuperTypeOf(domainElement.eClass())) {
				return WebDevProjectMM.diagram.edit.parts.SocialNetworkContentEditPart.VISUAL_ID;
			}
			break;
		case WebDevProjectMM.diagram.edit.parts.RegularContentPageRegularContentPageElementsCompartmentEditPart.VISUAL_ID:
			if (WebDevProjectMM.WebDevProjectMMPackage.eINSTANCE.getText().isSuperTypeOf(domainElement.eClass())) {
				return WebDevProjectMM.diagram.edit.parts.TextEditPart.VISUAL_ID;
			}
			if (WebDevProjectMM.WebDevProjectMMPackage.eINSTANCE.getMediaContent()
					.isSuperTypeOf(domainElement.eClass())) {
				return WebDevProjectMM.diagram.edit.parts.MediaContentEditPart.VISUAL_ID;
			}
			break;
		case WebDevProjectMM.diagram.edit.parts.FormFormSocialnetworkcontentCompartmentEditPart.VISUAL_ID:
			if (WebDevProjectMM.WebDevProjectMMPackage.eINSTANCE.getSocialNetworkContent()
					.isSuperTypeOf(domainElement.eClass())) {
				return WebDevProjectMM.diagram.edit.parts.SocialNetworkContentEditPart.VISUAL_ID;
			}
			break;
		case WebDevProjectMM.diagram.edit.parts.FormFormElementsCompartmentEditPart.VISUAL_ID:
			if (WebDevProjectMM.WebDevProjectMMPackage.eINSTANCE.getText().isSuperTypeOf(domainElement.eClass())) {
				return WebDevProjectMM.diagram.edit.parts.TextEditPart.VISUAL_ID;
			}
			if (WebDevProjectMM.WebDevProjectMMPackage.eINSTANCE.getMediaContent()
					.isSuperTypeOf(domainElement.eClass())) {
				return WebDevProjectMM.diagram.edit.parts.MediaContentEditPart.VISUAL_ID;
			}
			break;
		case WebDevProjectMM.diagram.edit.parts.FormFormQuestionsCompartmentEditPart.VISUAL_ID:
			if (WebDevProjectMM.WebDevProjectMMPackage.eINSTANCE.getStoredQuestion()
					.isSuperTypeOf(domainElement.eClass())) {
				return WebDevProjectMM.diagram.edit.parts.StoredQuestionEditPart.VISUAL_ID;
			}
			if (WebDevProjectMM.WebDevProjectMMPackage.eINSTANCE.getQuestionDefinition()
					.isSuperTypeOf(domainElement.eClass())) {
				return WebDevProjectMM.diagram.edit.parts.QuestionDefinitionEditPart.VISUAL_ID;
			}
			break;
		case WebDevProjectMM.diagram.edit.parts.QuestionDefinitionQuestionDefinitionPossibleAsnwerCompartmentEditPart.VISUAL_ID:
			if (WebDevProjectMM.WebDevProjectMMPackage.eINSTANCE.getPossibleAsnwer()
					.isSuperTypeOf(domainElement.eClass())) {
				return WebDevProjectMM.diagram.edit.parts.PossibleAsnwerEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	* @generated
	*/
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = WebDevProjectMM.diagram.part.WebDevProjectMMVisualIDRegistry
				.getModelID(containerView);
		if (!WebDevProjectMM.diagram.edit.parts.WebSiteEditPart.MODEL_ID.equals(containerModelID)
				&& !"WebDevProjectMM".equals(containerModelID)) { //$NON-NLS-1$
			return false;
		}
		int containerVisualID;
		if (WebDevProjectMM.diagram.edit.parts.WebSiteEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = WebDevProjectMM.diagram.part.WebDevProjectMMVisualIDRegistry.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = WebDevProjectMM.diagram.edit.parts.WebSiteEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case WebDevProjectMM.diagram.edit.parts.WebSiteEditPart.VISUAL_ID:
			if (WebDevProjectMM.diagram.edit.parts.CreationCRUDEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WebDevProjectMM.diagram.edit.parts.DelitionCRUDEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WebDevProjectMM.diagram.edit.parts.AllCRUDEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WebDevProjectMM.diagram.edit.parts.IndexCRUDEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WebDevProjectMM.diagram.edit.parts.DetailCRUDEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WebDevProjectMM.diagram.edit.parts.RegularContentPageEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WebDevProjectMM.diagram.edit.parts.FormEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WebDevProjectMM.diagram.edit.parts.RoleEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case WebDevProjectMM.diagram.edit.parts.CreationCRUDEditPart.VISUAL_ID:
			if (WebDevProjectMM.diagram.edit.parts.CreationCRUDNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WebDevProjectMM.diagram.edit.parts.CreationCRUDCreationCRUDSocialnetworkcontentCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WebDevProjectMM.diagram.edit.parts.CreationCRUDCreationCRUDElementsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case WebDevProjectMM.diagram.edit.parts.DelitionCRUDEditPart.VISUAL_ID:
			if (WebDevProjectMM.diagram.edit.parts.DelitionCRUDNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WebDevProjectMM.diagram.edit.parts.DelitionCRUDDelitionCRUDSocialnetworkcontentCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WebDevProjectMM.diagram.edit.parts.DelitionCRUDDelitionCRUDElementsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case WebDevProjectMM.diagram.edit.parts.AllCRUDEditPart.VISUAL_ID:
			if (WebDevProjectMM.diagram.edit.parts.AllCRUDNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WebDevProjectMM.diagram.edit.parts.AllCRUDAllCRUDSocialnetworkcontentCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WebDevProjectMM.diagram.edit.parts.AllCRUDAllCRUDElementsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case WebDevProjectMM.diagram.edit.parts.IndexCRUDEditPart.VISUAL_ID:
			if (WebDevProjectMM.diagram.edit.parts.IndexCRUDNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WebDevProjectMM.diagram.edit.parts.IndexCRUDIndexCRUDSocialnetworkcontentCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WebDevProjectMM.diagram.edit.parts.IndexCRUDIndexCRUDElementsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case WebDevProjectMM.diagram.edit.parts.DetailCRUDEditPart.VISUAL_ID:
			if (WebDevProjectMM.diagram.edit.parts.DetailCRUDNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WebDevProjectMM.diagram.edit.parts.DetailCRUDDetailCRUDSocialnetworkcontentCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WebDevProjectMM.diagram.edit.parts.DetailCRUDDetailCRUDElementsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case WebDevProjectMM.diagram.edit.parts.RegularContentPageEditPart.VISUAL_ID:
			if (WebDevProjectMM.diagram.edit.parts.RegularContentPageNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WebDevProjectMM.diagram.edit.parts.RegularContentPageRegularContentPageSocialnetworkcontentCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WebDevProjectMM.diagram.edit.parts.RegularContentPageRegularContentPageElementsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case WebDevProjectMM.diagram.edit.parts.FormEditPart.VISUAL_ID:
			if (WebDevProjectMM.diagram.edit.parts.FormNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WebDevProjectMM.diagram.edit.parts.FormFormSocialnetworkcontentCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WebDevProjectMM.diagram.edit.parts.FormFormElementsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WebDevProjectMM.diagram.edit.parts.FormFormQuestionsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case WebDevProjectMM.diagram.edit.parts.RoleEditPart.VISUAL_ID:
			if (WebDevProjectMM.diagram.edit.parts.RoleNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case WebDevProjectMM.diagram.edit.parts.TextEditPart.VISUAL_ID:
			if (WebDevProjectMM.diagram.edit.parts.TextTextEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case WebDevProjectMM.diagram.edit.parts.MediaContentEditPart.VISUAL_ID:
			if (WebDevProjectMM.diagram.edit.parts.MediaContentLinkEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case WebDevProjectMM.diagram.edit.parts.SocialNetworkContentEditPart.VISUAL_ID:
			if (WebDevProjectMM.diagram.edit.parts.SocialNetworkContentParametersEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case WebDevProjectMM.diagram.edit.parts.StoredQuestionEditPart.VISUAL_ID:
			if (WebDevProjectMM.diagram.edit.parts.StoredQuestionDescQuestionDefinitionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case WebDevProjectMM.diagram.edit.parts.QuestionDefinitionEditPart.VISUAL_ID:
			if (WebDevProjectMM.diagram.edit.parts.QuestionDefinitionDescriptionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WebDevProjectMM.diagram.edit.parts.QuestionDefinitionQuestionDefinitionPossibleAsnwerCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case WebDevProjectMM.diagram.edit.parts.PossibleAsnwerEditPart.VISUAL_ID:
			if (WebDevProjectMM.diagram.edit.parts.PossibleAsnwerAnswerTextEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case WebDevProjectMM.diagram.edit.parts.CreationCRUDCreationCRUDSocialnetworkcontentCompartmentEditPart.VISUAL_ID:
			if (WebDevProjectMM.diagram.edit.parts.SocialNetworkContentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case WebDevProjectMM.diagram.edit.parts.CreationCRUDCreationCRUDElementsCompartmentEditPart.VISUAL_ID:
			if (WebDevProjectMM.diagram.edit.parts.TextEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WebDevProjectMM.diagram.edit.parts.MediaContentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case WebDevProjectMM.diagram.edit.parts.DelitionCRUDDelitionCRUDSocialnetworkcontentCompartmentEditPart.VISUAL_ID:
			if (WebDevProjectMM.diagram.edit.parts.SocialNetworkContentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case WebDevProjectMM.diagram.edit.parts.DelitionCRUDDelitionCRUDElementsCompartmentEditPart.VISUAL_ID:
			if (WebDevProjectMM.diagram.edit.parts.TextEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WebDevProjectMM.diagram.edit.parts.MediaContentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case WebDevProjectMM.diagram.edit.parts.AllCRUDAllCRUDSocialnetworkcontentCompartmentEditPart.VISUAL_ID:
			if (WebDevProjectMM.diagram.edit.parts.SocialNetworkContentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case WebDevProjectMM.diagram.edit.parts.AllCRUDAllCRUDElementsCompartmentEditPart.VISUAL_ID:
			if (WebDevProjectMM.diagram.edit.parts.TextEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WebDevProjectMM.diagram.edit.parts.MediaContentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case WebDevProjectMM.diagram.edit.parts.IndexCRUDIndexCRUDSocialnetworkcontentCompartmentEditPart.VISUAL_ID:
			if (WebDevProjectMM.diagram.edit.parts.SocialNetworkContentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case WebDevProjectMM.diagram.edit.parts.IndexCRUDIndexCRUDElementsCompartmentEditPart.VISUAL_ID:
			if (WebDevProjectMM.diagram.edit.parts.TextEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WebDevProjectMM.diagram.edit.parts.MediaContentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case WebDevProjectMM.diagram.edit.parts.DetailCRUDDetailCRUDSocialnetworkcontentCompartmentEditPart.VISUAL_ID:
			if (WebDevProjectMM.diagram.edit.parts.SocialNetworkContentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case WebDevProjectMM.diagram.edit.parts.DetailCRUDDetailCRUDElementsCompartmentEditPart.VISUAL_ID:
			if (WebDevProjectMM.diagram.edit.parts.TextEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WebDevProjectMM.diagram.edit.parts.MediaContentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case WebDevProjectMM.diagram.edit.parts.RegularContentPageRegularContentPageSocialnetworkcontentCompartmentEditPart.VISUAL_ID:
			if (WebDevProjectMM.diagram.edit.parts.SocialNetworkContentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case WebDevProjectMM.diagram.edit.parts.RegularContentPageRegularContentPageElementsCompartmentEditPart.VISUAL_ID:
			if (WebDevProjectMM.diagram.edit.parts.TextEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WebDevProjectMM.diagram.edit.parts.MediaContentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case WebDevProjectMM.diagram.edit.parts.FormFormSocialnetworkcontentCompartmentEditPart.VISUAL_ID:
			if (WebDevProjectMM.diagram.edit.parts.SocialNetworkContentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case WebDevProjectMM.diagram.edit.parts.FormFormElementsCompartmentEditPart.VISUAL_ID:
			if (WebDevProjectMM.diagram.edit.parts.TextEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WebDevProjectMM.diagram.edit.parts.MediaContentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case WebDevProjectMM.diagram.edit.parts.FormFormQuestionsCompartmentEditPart.VISUAL_ID:
			if (WebDevProjectMM.diagram.edit.parts.StoredQuestionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WebDevProjectMM.diagram.edit.parts.QuestionDefinitionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case WebDevProjectMM.diagram.edit.parts.QuestionDefinitionQuestionDefinitionPossibleAsnwerCompartmentEditPart.VISUAL_ID:
			if (WebDevProjectMM.diagram.edit.parts.PossibleAsnwerEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case WebDevProjectMM.diagram.edit.parts.RoleWebpageEditPart.VISUAL_ID:
			if (WebDevProjectMM.diagram.edit.parts.WrappingLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case WebDevProjectMM.diagram.edit.parts.EntityRefersToEditPart.VISUAL_ID:
			if (WebDevProjectMM.diagram.edit.parts.WrappingLabel2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		}
		return false;
	}

	/**
	* @generated
	*/
	public static int getLinkWithClassVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (WebDevProjectMM.WebDevProjectMMPackage.eINSTANCE.getPageLink().isSuperTypeOf(domainElement.eClass())) {
			return WebDevProjectMM.diagram.edit.parts.PageLinkEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	* User can change implementation of this method to handle some specific
	* situations not covered by default logic.
	* 
	* @generated
	*/
	private static boolean isDiagram(WebDevProjectMM.WebSite element) {
		return true;
	}

	/**
	* @generated
	*/
	public static boolean checkNodeVisualID(View containerView, EObject domainElement, int candidate) {
		if (candidate == -1) {
			//unrecognized id is always bad
			return false;
		}
		int basic = getNodeVisualID(containerView, domainElement);
		return basic == candidate;
	}

	/**
	* @generated
	*/
	public static boolean isCompartmentVisualID(int visualID) {
		switch (visualID) {
		case WebDevProjectMM.diagram.edit.parts.CreationCRUDCreationCRUDSocialnetworkcontentCompartmentEditPart.VISUAL_ID:
		case WebDevProjectMM.diagram.edit.parts.CreationCRUDCreationCRUDElementsCompartmentEditPart.VISUAL_ID:
		case WebDevProjectMM.diagram.edit.parts.DelitionCRUDDelitionCRUDSocialnetworkcontentCompartmentEditPart.VISUAL_ID:
		case WebDevProjectMM.diagram.edit.parts.DelitionCRUDDelitionCRUDElementsCompartmentEditPart.VISUAL_ID:
		case WebDevProjectMM.diagram.edit.parts.AllCRUDAllCRUDSocialnetworkcontentCompartmentEditPart.VISUAL_ID:
		case WebDevProjectMM.diagram.edit.parts.AllCRUDAllCRUDElementsCompartmentEditPart.VISUAL_ID:
		case WebDevProjectMM.diagram.edit.parts.IndexCRUDIndexCRUDSocialnetworkcontentCompartmentEditPart.VISUAL_ID:
		case WebDevProjectMM.diagram.edit.parts.IndexCRUDIndexCRUDElementsCompartmentEditPart.VISUAL_ID:
		case WebDevProjectMM.diagram.edit.parts.DetailCRUDDetailCRUDSocialnetworkcontentCompartmentEditPart.VISUAL_ID:
		case WebDevProjectMM.diagram.edit.parts.DetailCRUDDetailCRUDElementsCompartmentEditPart.VISUAL_ID:
		case WebDevProjectMM.diagram.edit.parts.RegularContentPageRegularContentPageSocialnetworkcontentCompartmentEditPart.VISUAL_ID:
		case WebDevProjectMM.diagram.edit.parts.RegularContentPageRegularContentPageElementsCompartmentEditPart.VISUAL_ID:
		case WebDevProjectMM.diagram.edit.parts.FormFormSocialnetworkcontentCompartmentEditPart.VISUAL_ID:
		case WebDevProjectMM.diagram.edit.parts.FormFormElementsCompartmentEditPart.VISUAL_ID:
		case WebDevProjectMM.diagram.edit.parts.FormFormQuestionsCompartmentEditPart.VISUAL_ID:
		case WebDevProjectMM.diagram.edit.parts.QuestionDefinitionQuestionDefinitionPossibleAsnwerCompartmentEditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	* @generated
	*/
	public static boolean isSemanticLeafVisualID(int visualID) {
		switch (visualID) {
		case WebDevProjectMM.diagram.edit.parts.WebSiteEditPart.VISUAL_ID:
			return false;
		case WebDevProjectMM.diagram.edit.parts.RoleEditPart.VISUAL_ID:
		case WebDevProjectMM.diagram.edit.parts.TextEditPart.VISUAL_ID:
		case WebDevProjectMM.diagram.edit.parts.MediaContentEditPart.VISUAL_ID:
		case WebDevProjectMM.diagram.edit.parts.SocialNetworkContentEditPart.VISUAL_ID:
		case WebDevProjectMM.diagram.edit.parts.StoredQuestionEditPart.VISUAL_ID:
		case WebDevProjectMM.diagram.edit.parts.PossibleAsnwerEditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	* @generated
	*/
	public static final DiagramStructure TYPED_INSTANCE = new DiagramStructure() {
		/**
		* @generated
		*/
		@Override

		public int getVisualID(View view) {
			return WebDevProjectMM.diagram.part.WebDevProjectMMVisualIDRegistry.getVisualID(view);
		}

		/**
		* @generated
		*/
		@Override

		public String getModelID(View view) {
			return WebDevProjectMM.diagram.part.WebDevProjectMMVisualIDRegistry.getModelID(view);
		}

		/**
		* @generated
		*/
		@Override

		public int getNodeVisualID(View containerView, EObject domainElement) {
			return WebDevProjectMM.diagram.part.WebDevProjectMMVisualIDRegistry.getNodeVisualID(containerView,
					domainElement);
		}

		/**
		* @generated
		*/
		@Override

		public boolean checkNodeVisualID(View containerView, EObject domainElement, int candidate) {
			return WebDevProjectMM.diagram.part.WebDevProjectMMVisualIDRegistry.checkNodeVisualID(containerView,
					domainElement, candidate);
		}

		/**
		* @generated
		*/
		@Override

		public boolean isCompartmentVisualID(int visualID) {
			return WebDevProjectMM.diagram.part.WebDevProjectMMVisualIDRegistry.isCompartmentVisualID(visualID);
		}

		/**
		* @generated
		*/
		@Override

		public boolean isSemanticLeafVisualID(int visualID) {
			return WebDevProjectMM.diagram.part.WebDevProjectMMVisualIDRegistry.isSemanticLeafVisualID(visualID);
		}
	};

}
