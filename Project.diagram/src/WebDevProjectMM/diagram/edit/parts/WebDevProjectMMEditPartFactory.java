/*
 * 
 */
package WebDevProjectMM.diagram.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;

/**
 * @generated
 */
public class WebDevProjectMMEditPartFactory implements EditPartFactory {

	/**
	* @generated
	*/
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (WebDevProjectMM.diagram.part.WebDevProjectMMVisualIDRegistry.getVisualID(view)) {

			case WebDevProjectMM.diagram.edit.parts.WebSiteEditPart.VISUAL_ID:
				return new WebDevProjectMM.diagram.edit.parts.WebSiteEditPart(view);

			case WebDevProjectMM.diagram.edit.parts.CreationCRUDEditPart.VISUAL_ID:
				return new WebDevProjectMM.diagram.edit.parts.CreationCRUDEditPart(view);

			case WebDevProjectMM.diagram.edit.parts.CreationCRUDNameEditPart.VISUAL_ID:
				return new WebDevProjectMM.diagram.edit.parts.CreationCRUDNameEditPart(view);

			case WebDevProjectMM.diagram.edit.parts.DelitionCRUDEditPart.VISUAL_ID:
				return new WebDevProjectMM.diagram.edit.parts.DelitionCRUDEditPart(view);

			case WebDevProjectMM.diagram.edit.parts.DelitionCRUDNameEditPart.VISUAL_ID:
				return new WebDevProjectMM.diagram.edit.parts.DelitionCRUDNameEditPart(view);

			case WebDevProjectMM.diagram.edit.parts.AllCRUDEditPart.VISUAL_ID:
				return new WebDevProjectMM.diagram.edit.parts.AllCRUDEditPart(view);

			case WebDevProjectMM.diagram.edit.parts.AllCRUDNameEditPart.VISUAL_ID:
				return new WebDevProjectMM.diagram.edit.parts.AllCRUDNameEditPart(view);

			case WebDevProjectMM.diagram.edit.parts.IndexCRUDEditPart.VISUAL_ID:
				return new WebDevProjectMM.diagram.edit.parts.IndexCRUDEditPart(view);

			case WebDevProjectMM.diagram.edit.parts.IndexCRUDNameEditPart.VISUAL_ID:
				return new WebDevProjectMM.diagram.edit.parts.IndexCRUDNameEditPart(view);

			case WebDevProjectMM.diagram.edit.parts.DetailCRUDEditPart.VISUAL_ID:
				return new WebDevProjectMM.diagram.edit.parts.DetailCRUDEditPart(view);

			case WebDevProjectMM.diagram.edit.parts.DetailCRUDNameEditPart.VISUAL_ID:
				return new WebDevProjectMM.diagram.edit.parts.DetailCRUDNameEditPart(view);

			case WebDevProjectMM.diagram.edit.parts.RegularContentPageEditPart.VISUAL_ID:
				return new WebDevProjectMM.diagram.edit.parts.RegularContentPageEditPart(view);

			case WebDevProjectMM.diagram.edit.parts.RegularContentPageNameEditPart.VISUAL_ID:
				return new WebDevProjectMM.diagram.edit.parts.RegularContentPageNameEditPart(view);

			case WebDevProjectMM.diagram.edit.parts.FormEditPart.VISUAL_ID:
				return new WebDevProjectMM.diagram.edit.parts.FormEditPart(view);

			case WebDevProjectMM.diagram.edit.parts.FormNameEditPart.VISUAL_ID:
				return new WebDevProjectMM.diagram.edit.parts.FormNameEditPart(view);

			case WebDevProjectMM.diagram.edit.parts.RoleEditPart.VISUAL_ID:
				return new WebDevProjectMM.diagram.edit.parts.RoleEditPart(view);

			case WebDevProjectMM.diagram.edit.parts.RoleNameEditPart.VISUAL_ID:
				return new WebDevProjectMM.diagram.edit.parts.RoleNameEditPart(view);

			case WebDevProjectMM.diagram.edit.parts.TextEditPart.VISUAL_ID:
				return new WebDevProjectMM.diagram.edit.parts.TextEditPart(view);

			case WebDevProjectMM.diagram.edit.parts.TextTextEditPart.VISUAL_ID:
				return new WebDevProjectMM.diagram.edit.parts.TextTextEditPart(view);

			case WebDevProjectMM.diagram.edit.parts.MediaContentEditPart.VISUAL_ID:
				return new WebDevProjectMM.diagram.edit.parts.MediaContentEditPart(view);

			case WebDevProjectMM.diagram.edit.parts.MediaContentLinkEditPart.VISUAL_ID:
				return new WebDevProjectMM.diagram.edit.parts.MediaContentLinkEditPart(view);

			case WebDevProjectMM.diagram.edit.parts.SocialNetworkContentEditPart.VISUAL_ID:
				return new WebDevProjectMM.diagram.edit.parts.SocialNetworkContentEditPart(view);

			case WebDevProjectMM.diagram.edit.parts.SocialNetworkContentParametersEditPart.VISUAL_ID:
				return new WebDevProjectMM.diagram.edit.parts.SocialNetworkContentParametersEditPart(view);

			case WebDevProjectMM.diagram.edit.parts.StoredQuestionEditPart.VISUAL_ID:
				return new WebDevProjectMM.diagram.edit.parts.StoredQuestionEditPart(view);

			case WebDevProjectMM.diagram.edit.parts.StoredQuestionDescQuestionDefinitionEditPart.VISUAL_ID:
				return new WebDevProjectMM.diagram.edit.parts.StoredQuestionDescQuestionDefinitionEditPart(view);

			case WebDevProjectMM.diagram.edit.parts.QuestionDefinitionEditPart.VISUAL_ID:
				return new WebDevProjectMM.diagram.edit.parts.QuestionDefinitionEditPart(view);

			case WebDevProjectMM.diagram.edit.parts.QuestionDefinitionDescriptionEditPart.VISUAL_ID:
				return new WebDevProjectMM.diagram.edit.parts.QuestionDefinitionDescriptionEditPart(view);

			case WebDevProjectMM.diagram.edit.parts.PossibleAsnwerEditPart.VISUAL_ID:
				return new WebDevProjectMM.diagram.edit.parts.PossibleAsnwerEditPart(view);

			case WebDevProjectMM.diagram.edit.parts.PossibleAsnwerAnswerTextEditPart.VISUAL_ID:
				return new WebDevProjectMM.diagram.edit.parts.PossibleAsnwerAnswerTextEditPart(view);

			case WebDevProjectMM.diagram.edit.parts.CreationCRUDCreationCRUDSocialnetworkcontentCompartmentEditPart.VISUAL_ID:
				return new WebDevProjectMM.diagram.edit.parts.CreationCRUDCreationCRUDSocialnetworkcontentCompartmentEditPart(
						view);

			case WebDevProjectMM.diagram.edit.parts.CreationCRUDCreationCRUDElementsCompartmentEditPart.VISUAL_ID:
				return new WebDevProjectMM.diagram.edit.parts.CreationCRUDCreationCRUDElementsCompartmentEditPart(view);

			case WebDevProjectMM.diagram.edit.parts.DelitionCRUDDelitionCRUDSocialnetworkcontentCompartmentEditPart.VISUAL_ID:
				return new WebDevProjectMM.diagram.edit.parts.DelitionCRUDDelitionCRUDSocialnetworkcontentCompartmentEditPart(
						view);

			case WebDevProjectMM.diagram.edit.parts.DelitionCRUDDelitionCRUDElementsCompartmentEditPart.VISUAL_ID:
				return new WebDevProjectMM.diagram.edit.parts.DelitionCRUDDelitionCRUDElementsCompartmentEditPart(view);

			case WebDevProjectMM.diagram.edit.parts.AllCRUDAllCRUDSocialnetworkcontentCompartmentEditPart.VISUAL_ID:
				return new WebDevProjectMM.diagram.edit.parts.AllCRUDAllCRUDSocialnetworkcontentCompartmentEditPart(
						view);

			case WebDevProjectMM.diagram.edit.parts.AllCRUDAllCRUDElementsCompartmentEditPart.VISUAL_ID:
				return new WebDevProjectMM.diagram.edit.parts.AllCRUDAllCRUDElementsCompartmentEditPart(view);

			case WebDevProjectMM.diagram.edit.parts.IndexCRUDIndexCRUDSocialnetworkcontentCompartmentEditPart.VISUAL_ID:
				return new WebDevProjectMM.diagram.edit.parts.IndexCRUDIndexCRUDSocialnetworkcontentCompartmentEditPart(
						view);

			case WebDevProjectMM.diagram.edit.parts.IndexCRUDIndexCRUDElementsCompartmentEditPart.VISUAL_ID:
				return new WebDevProjectMM.diagram.edit.parts.IndexCRUDIndexCRUDElementsCompartmentEditPart(view);

			case WebDevProjectMM.diagram.edit.parts.DetailCRUDDetailCRUDSocialnetworkcontentCompartmentEditPart.VISUAL_ID:
				return new WebDevProjectMM.diagram.edit.parts.DetailCRUDDetailCRUDSocialnetworkcontentCompartmentEditPart(
						view);

			case WebDevProjectMM.diagram.edit.parts.DetailCRUDDetailCRUDElementsCompartmentEditPart.VISUAL_ID:
				return new WebDevProjectMM.diagram.edit.parts.DetailCRUDDetailCRUDElementsCompartmentEditPart(view);

			case WebDevProjectMM.diagram.edit.parts.RegularContentPageRegularContentPageSocialnetworkcontentCompartmentEditPart.VISUAL_ID:
				return new WebDevProjectMM.diagram.edit.parts.RegularContentPageRegularContentPageSocialnetworkcontentCompartmentEditPart(
						view);

			case WebDevProjectMM.diagram.edit.parts.RegularContentPageRegularContentPageElementsCompartmentEditPart.VISUAL_ID:
				return new WebDevProjectMM.diagram.edit.parts.RegularContentPageRegularContentPageElementsCompartmentEditPart(
						view);

			case WebDevProjectMM.diagram.edit.parts.FormFormSocialnetworkcontentCompartmentEditPart.VISUAL_ID:
				return new WebDevProjectMM.diagram.edit.parts.FormFormSocialnetworkcontentCompartmentEditPart(view);

			case WebDevProjectMM.diagram.edit.parts.FormFormElementsCompartmentEditPart.VISUAL_ID:
				return new WebDevProjectMM.diagram.edit.parts.FormFormElementsCompartmentEditPart(view);

			case WebDevProjectMM.diagram.edit.parts.FormFormQuestionsCompartmentEditPart.VISUAL_ID:
				return new WebDevProjectMM.diagram.edit.parts.FormFormQuestionsCompartmentEditPart(view);

			case WebDevProjectMM.diagram.edit.parts.QuestionDefinitionQuestionDefinitionPossibleAsnwerCompartmentEditPart.VISUAL_ID:
				return new WebDevProjectMM.diagram.edit.parts.QuestionDefinitionQuestionDefinitionPossibleAsnwerCompartmentEditPart(
						view);

			case WebDevProjectMM.diagram.edit.parts.PageLinkEditPart.VISUAL_ID:
				return new WebDevProjectMM.diagram.edit.parts.PageLinkEditPart(view);

			case WebDevProjectMM.diagram.edit.parts.RoleWebpageEditPart.VISUAL_ID:
				return new WebDevProjectMM.diagram.edit.parts.RoleWebpageEditPart(view);

			case WebDevProjectMM.diagram.edit.parts.WrappingLabelEditPart.VISUAL_ID:
				return new WebDevProjectMM.diagram.edit.parts.WrappingLabelEditPart(view);

			case WebDevProjectMM.diagram.edit.parts.EntityRefersToEditPart.VISUAL_ID:
				return new WebDevProjectMM.diagram.edit.parts.EntityRefersToEditPart(view);

			case WebDevProjectMM.diagram.edit.parts.WrappingLabel2EditPart.VISUAL_ID:
				return new WebDevProjectMM.diagram.edit.parts.WrappingLabel2EditPart(view);

			}
		}
		return createUnrecognizedEditPart(context, model);
	}

	/**
	* @generated
	*/
	private EditPart createUnrecognizedEditPart(EditPart context, Object model) {
		// Handle creation of unrecognized child node EditParts here
		return null;
	}

	/**
	* @generated
	*/
	public static CellEditorLocator getTextCellEditorLocator(ITextAwareEditPart source) {
		return CellEditorLocatorAccess.INSTANCE.getTextCellEditorLocator(source);
	}

}
