/*
 * 
 */
package WebDevProjectMM.diagram.providers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.GetParserOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserProvider;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserService;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.parser.ParserHintAdapter;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class WebDevProjectMMParserProvider extends AbstractProvider implements IParserProvider {

	/**
	* @generated
	*/
	private IParser creationCRUDName_5004Parser;

	/**
	* @generated
	*/
	private IParser getCreationCRUDName_5004Parser() {
		if (creationCRUDName_5004Parser == null) {
			EAttribute[] features = new EAttribute[] {
					WebDevProjectMM.WebDevProjectMMPackage.eINSTANCE.getWebPage_Name() };
			WebDevProjectMM.diagram.parsers.MessageFormatParser parser = new WebDevProjectMM.diagram.parsers.MessageFormatParser(
					features);
			creationCRUDName_5004Parser = parser;
		}
		return creationCRUDName_5004Parser;
	}

	/**
	* @generated
	*/
	private IParser delitionCRUDName_5005Parser;

	/**
	* @generated
	*/
	private IParser getDelitionCRUDName_5005Parser() {
		if (delitionCRUDName_5005Parser == null) {
			EAttribute[] features = new EAttribute[] {
					WebDevProjectMM.WebDevProjectMMPackage.eINSTANCE.getWebPage_Name() };
			WebDevProjectMM.diagram.parsers.MessageFormatParser parser = new WebDevProjectMM.diagram.parsers.MessageFormatParser(
					features);
			delitionCRUDName_5005Parser = parser;
		}
		return delitionCRUDName_5005Parser;
	}

	/**
	* @generated
	*/
	private IParser allCRUDName_5006Parser;

	/**
	* @generated
	*/
	private IParser getAllCRUDName_5006Parser() {
		if (allCRUDName_5006Parser == null) {
			EAttribute[] features = new EAttribute[] {
					WebDevProjectMM.WebDevProjectMMPackage.eINSTANCE.getWebPage_Name() };
			WebDevProjectMM.diagram.parsers.MessageFormatParser parser = new WebDevProjectMM.diagram.parsers.MessageFormatParser(
					features);
			allCRUDName_5006Parser = parser;
		}
		return allCRUDName_5006Parser;
	}

	/**
	* @generated
	*/
	private IParser indexCRUDName_5007Parser;

	/**
	* @generated
	*/
	private IParser getIndexCRUDName_5007Parser() {
		if (indexCRUDName_5007Parser == null) {
			EAttribute[] features = new EAttribute[] {
					WebDevProjectMM.WebDevProjectMMPackage.eINSTANCE.getWebPage_Name() };
			WebDevProjectMM.diagram.parsers.MessageFormatParser parser = new WebDevProjectMM.diagram.parsers.MessageFormatParser(
					features);
			indexCRUDName_5007Parser = parser;
		}
		return indexCRUDName_5007Parser;
	}

	/**
	* @generated
	*/
	private IParser detailCRUDName_5008Parser;

	/**
	* @generated
	*/
	private IParser getDetailCRUDName_5008Parser() {
		if (detailCRUDName_5008Parser == null) {
			EAttribute[] features = new EAttribute[] {
					WebDevProjectMM.WebDevProjectMMPackage.eINSTANCE.getWebPage_Name() };
			WebDevProjectMM.diagram.parsers.MessageFormatParser parser = new WebDevProjectMM.diagram.parsers.MessageFormatParser(
					features);
			detailCRUDName_5008Parser = parser;
		}
		return detailCRUDName_5008Parser;
	}

	/**
	* @generated
	*/
	private IParser regularContentPageName_5009Parser;

	/**
	* @generated
	*/
	private IParser getRegularContentPageName_5009Parser() {
		if (regularContentPageName_5009Parser == null) {
			EAttribute[] features = new EAttribute[] {
					WebDevProjectMM.WebDevProjectMMPackage.eINSTANCE.getWebPage_Name() };
			WebDevProjectMM.diagram.parsers.MessageFormatParser parser = new WebDevProjectMM.diagram.parsers.MessageFormatParser(
					features);
			regularContentPageName_5009Parser = parser;
		}
		return regularContentPageName_5009Parser;
	}

	/**
	* @generated
	*/
	private IParser formName_5013Parser;

	/**
	* @generated
	*/
	private IParser getFormName_5013Parser() {
		if (formName_5013Parser == null) {
			EAttribute[] features = new EAttribute[] {
					WebDevProjectMM.WebDevProjectMMPackage.eINSTANCE.getWebPage_Name() };
			WebDevProjectMM.diagram.parsers.MessageFormatParser parser = new WebDevProjectMM.diagram.parsers.MessageFormatParser(
					features);
			formName_5013Parser = parser;
		}
		return formName_5013Parser;
	}

	/**
	* @generated
	*/
	private IParser roleName_5014Parser;

	/**
	* @generated
	*/
	private IParser getRoleName_5014Parser() {
		if (roleName_5014Parser == null) {
			EAttribute[] features = new EAttribute[] {
					WebDevProjectMM.WebDevProjectMMPackage.eINSTANCE.getRole_Name() };
			WebDevProjectMM.diagram.parsers.MessageFormatParser parser = new WebDevProjectMM.diagram.parsers.MessageFormatParser(
					features);
			roleName_5014Parser = parser;
		}
		return roleName_5014Parser;
	}

	/**
	* @generated
	*/
	private IParser textText_5001Parser;

	/**
	* @generated
	*/
	private IParser getTextText_5001Parser() {
		if (textText_5001Parser == null) {
			EAttribute[] features = new EAttribute[] {
					WebDevProjectMM.WebDevProjectMMPackage.eINSTANCE.getText_Text() };
			WebDevProjectMM.diagram.parsers.MessageFormatParser parser = new WebDevProjectMM.diagram.parsers.MessageFormatParser(
					features);
			textText_5001Parser = parser;
		}
		return textText_5001Parser;
	}

	/**
	* @generated
	*/
	private IParser mediaContentLink_5002Parser;

	/**
	* @generated
	*/
	private IParser getMediaContentLink_5002Parser() {
		if (mediaContentLink_5002Parser == null) {
			EAttribute[] features = new EAttribute[] {
					WebDevProjectMM.WebDevProjectMMPackage.eINSTANCE.getMediaContent_Link() };
			WebDevProjectMM.diagram.parsers.MessageFormatParser parser = new WebDevProjectMM.diagram.parsers.MessageFormatParser(
					features);
			mediaContentLink_5002Parser = parser;
		}
		return mediaContentLink_5002Parser;
	}

	/**
	* @generated
	*/
	private IParser socialNetworkContentParameters_5003Parser;

	/**
	* @generated
	*/
	private IParser getSocialNetworkContentParameters_5003Parser() {
		if (socialNetworkContentParameters_5003Parser == null) {
			EAttribute[] features = new EAttribute[] {
					WebDevProjectMM.WebDevProjectMMPackage.eINSTANCE.getSocialNetworkContent_Parameters() };
			WebDevProjectMM.diagram.parsers.MessageFormatParser parser = new WebDevProjectMM.diagram.parsers.MessageFormatParser(
					features);
			socialNetworkContentParameters_5003Parser = parser;
		}
		return socialNetworkContentParameters_5003Parser;
	}

	/**
	* @generated
	*/
	private IParser storedQuestionDescQuestionDefinition_5010Parser;

	/**
	* @generated
	*/
	private IParser getStoredQuestionDescQuestionDefinition_5010Parser() {
		if (storedQuestionDescQuestionDefinition_5010Parser == null) {
			EAttribute[] features = new EAttribute[] {
					WebDevProjectMM.WebDevProjectMMPackage.eINSTANCE.getStoredQuestion_DescQuestionDefinition() };
			WebDevProjectMM.diagram.parsers.MessageFormatParser parser = new WebDevProjectMM.diagram.parsers.MessageFormatParser(
					features);
			storedQuestionDescQuestionDefinition_5010Parser = parser;
		}
		return storedQuestionDescQuestionDefinition_5010Parser;
	}

	/**
	* @generated
	*/
	private IParser questionDefinitionDescription_5012Parser;

	/**
	* @generated
	*/
	private IParser getQuestionDefinitionDescription_5012Parser() {
		if (questionDefinitionDescription_5012Parser == null) {
			EAttribute[] features = new EAttribute[] {
					WebDevProjectMM.WebDevProjectMMPackage.eINSTANCE.getQuestionDefinition_Description() };
			WebDevProjectMM.diagram.parsers.MessageFormatParser parser = new WebDevProjectMM.diagram.parsers.MessageFormatParser(
					features);
			questionDefinitionDescription_5012Parser = parser;
		}
		return questionDefinitionDescription_5012Parser;
	}

	/**
	* @generated
	*/
	private IParser possibleAsnwerAnswerText_5011Parser;

	/**
	* @generated
	*/
	private IParser getPossibleAsnwerAnswerText_5011Parser() {
		if (possibleAsnwerAnswerText_5011Parser == null) {
			EAttribute[] features = new EAttribute[] {
					WebDevProjectMM.WebDevProjectMMPackage.eINSTANCE.getPossibleAsnwer_AnswerText() };
			WebDevProjectMM.diagram.parsers.MessageFormatParser parser = new WebDevProjectMM.diagram.parsers.MessageFormatParser(
					features);
			possibleAsnwerAnswerText_5011Parser = parser;
		}
		return possibleAsnwerAnswerText_5011Parser;
	}

	/**
	* @generated
	*/
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case WebDevProjectMM.diagram.edit.parts.CreationCRUDNameEditPart.VISUAL_ID:
			return getCreationCRUDName_5004Parser();
		case WebDevProjectMM.diagram.edit.parts.DelitionCRUDNameEditPart.VISUAL_ID:
			return getDelitionCRUDName_5005Parser();
		case WebDevProjectMM.diagram.edit.parts.AllCRUDNameEditPart.VISUAL_ID:
			return getAllCRUDName_5006Parser();
		case WebDevProjectMM.diagram.edit.parts.IndexCRUDNameEditPart.VISUAL_ID:
			return getIndexCRUDName_5007Parser();
		case WebDevProjectMM.diagram.edit.parts.DetailCRUDNameEditPart.VISUAL_ID:
			return getDetailCRUDName_5008Parser();
		case WebDevProjectMM.diagram.edit.parts.RegularContentPageNameEditPart.VISUAL_ID:
			return getRegularContentPageName_5009Parser();
		case WebDevProjectMM.diagram.edit.parts.FormNameEditPart.VISUAL_ID:
			return getFormName_5013Parser();
		case WebDevProjectMM.diagram.edit.parts.RoleNameEditPart.VISUAL_ID:
			return getRoleName_5014Parser();
		case WebDevProjectMM.diagram.edit.parts.TextTextEditPart.VISUAL_ID:
			return getTextText_5001Parser();
		case WebDevProjectMM.diagram.edit.parts.MediaContentLinkEditPart.VISUAL_ID:
			return getMediaContentLink_5002Parser();
		case WebDevProjectMM.diagram.edit.parts.SocialNetworkContentParametersEditPart.VISUAL_ID:
			return getSocialNetworkContentParameters_5003Parser();
		case WebDevProjectMM.diagram.edit.parts.StoredQuestionDescQuestionDefinitionEditPart.VISUAL_ID:
			return getStoredQuestionDescQuestionDefinition_5010Parser();
		case WebDevProjectMM.diagram.edit.parts.QuestionDefinitionDescriptionEditPart.VISUAL_ID:
			return getQuestionDefinitionDescription_5012Parser();
		case WebDevProjectMM.diagram.edit.parts.PossibleAsnwerAnswerTextEditPart.VISUAL_ID:
			return getPossibleAsnwerAnswerText_5011Parser();
		}
		return null;
	}

	/**
	* Utility method that consults ParserService
	* @generated
	*/
	public static IParser getParser(IElementType type, EObject object, String parserHint) {
		return ParserService.getInstance().getParser(new HintAdapter(type, object, parserHint));
	}

	/**
	* @generated
	*/
	public IParser getParser(IAdaptable hint) {
		String vid = (String) hint.getAdapter(String.class);
		if (vid != null) {
			return getParser(WebDevProjectMM.diagram.part.WebDevProjectMMVisualIDRegistry.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(WebDevProjectMM.diagram.part.WebDevProjectMMVisualIDRegistry.getVisualID(view));
		}
		return null;
	}

	/**
	* @generated
	*/
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (WebDevProjectMM.diagram.providers.WebDevProjectMMElementTypes.getElement(hint) == null) {
				return false;
			}
			return getParser(hint) != null;
		}
		return false;
	}

	/**
	* @generated
	*/
	private static class HintAdapter extends ParserHintAdapter {

		/**
		* @generated
		*/
		private final IElementType elementType;

		/**
		* @generated
		*/
		public HintAdapter(IElementType type, EObject object, String parserHint) {
			super(object, parserHint);
			assert type != null;
			elementType = type;
		}

		/**
		* @generated
		*/
		public Object getAdapter(Class adapter) {
			if (IElementType.class.equals(adapter)) {
				return elementType;
			}
			return super.getAdapter(adapter);
		}
	}

}
