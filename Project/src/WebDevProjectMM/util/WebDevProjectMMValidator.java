/**
 */
package WebDevProjectMM.util;

import WebDevProjectMM.*;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see WebDevProjectMM.WebDevProjectMMPackage
 * @generated
 */
public class WebDevProjectMMValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final WebDevProjectMMValidator INSTANCE = new WebDevProjectMMValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "WebDevProjectMM";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WebDevProjectMMValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return WebDevProjectMMPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case WebDevProjectMMPackage.ROLE:
				return validateRole((Role)value, diagnostics, context);
			case WebDevProjectMMPackage.WEB_SITE:
				return validateWebSite((WebSite)value, diagnostics, context);
			case WebDevProjectMMPackage.WEB_PAGE:
				return validateWebPage((WebPage)value, diagnostics, context);
			case WebDevProjectMMPackage.SOCIAL_NETWORK_CONTENT:
				return validateSocialNetworkContent((SocialNetworkContent)value, diagnostics, context);
			case WebDevProjectMMPackage.REGULAR_CONTENT_PAGE:
				return validateRegularContentPage((RegularContentPage)value, diagnostics, context);
			case WebDevProjectMMPackage.FORM:
				return validateForm((Form)value, diagnostics, context);
			case WebDevProjectMMPackage.QUESTION:
				return validateQuestion((Question)value, diagnostics, context);
			case WebDevProjectMMPackage.STORED_QUESTION:
				return validateStoredQuestion((StoredQuestion)value, diagnostics, context);
			case WebDevProjectMMPackage.QUESTIONS_REPO:
				return validateQuestionsRepo((QuestionsRepo)value, diagnostics, context);
			case WebDevProjectMMPackage.QUESTION_DEFINITION:
				return validateQuestionDefinition((QuestionDefinition)value, diagnostics, context);
			case WebDevProjectMMPackage.POSSIBLE_ASNWER:
				return validatePossibleAsnwer((PossibleAsnwer)value, diagnostics, context);
			case WebDevProjectMMPackage.ELEMENTS:
				return validateElements((Elements)value, diagnostics, context);
			case WebDevProjectMMPackage.TEXT:
				return validateText((Text)value, diagnostics, context);
			case WebDevProjectMMPackage.DATABASE:
				return validateDatabase((Database)value, diagnostics, context);
			case WebDevProjectMMPackage.ENTITY:
				return validateEntity((Entity)value, diagnostics, context);
			case WebDevProjectMMPackage.ATTRIBUTE:
				return validateAttribute((Attribute)value, diagnostics, context);
			case WebDevProjectMMPackage.PAGE_LINK:
				return validatePageLink((PageLink)value, diagnostics, context);
			case WebDevProjectMMPackage.MEDIA_CONTENT:
				return validateMediaContent((MediaContent)value, diagnostics, context);
			case WebDevProjectMMPackage.CRUD_PAGE:
				return validateCRUDPage((CRUDPage)value, diagnostics, context);
			case WebDevProjectMMPackage.CREATION_CRUD:
				return validateCreationCRUD((CreationCRUD)value, diagnostics, context);
			case WebDevProjectMMPackage.DELITION_CRUD:
				return validateDelitionCRUD((DelitionCRUD)value, diagnostics, context);
			case WebDevProjectMMPackage.ALL_CRUD:
				return validateAllCRUD((AllCRUD)value, diagnostics, context);
			case WebDevProjectMMPackage.INDEX_CRUD:
				return validateIndexCRUD((IndexCRUD)value, diagnostics, context);
			case WebDevProjectMMPackage.DETAIL_CRUD:
				return validateDetailCRUD((DetailCRUD)value, diagnostics, context);
			case WebDevProjectMMPackage.QUESTION_TYPE:
				return validateQuestionType((QuestionType)value, diagnostics, context);
			case WebDevProjectMMPackage.ATTRIBUTE_PRIMITIVE_DATA_TYPE:
				return validateAttributePrimitiveData_Type((AttributePrimitiveData_Type)value, diagnostics, context);
			case WebDevProjectMMPackage.SOCIAL_NETWORK_TYPE:
				return validateSocialNetwork_Type((SocialNetwork_Type)value, diagnostics, context);
			case WebDevProjectMMPackage.FORM_TYPE:
				return validateForm_Type((Form_Type)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRole(Role role, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(role, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWebSite(WebSite webSite, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(webSite, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(webSite, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(webSite, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(webSite, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(webSite, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(webSite, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(webSite, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(webSite, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(webSite, diagnostics, context);
		if (result || diagnostics != null) result &= validateWebSite_R6MustIncludeAtLeastOneQuestionnaire(webSite, diagnostics, context);
		if (result || diagnostics != null) result &= validateWebSite_R6MustIncludeAtLeastOneSurvey(webSite, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the R6MustIncludeAtLeastOneQuestionnaire constraint of '<em>Web Site</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String WEB_SITE__R6_MUST_INCLUDE_AT_LEAST_ONE_QUESTIONNAIRE__EEXPRESSION = "\n" +
		"\t\t\tlet allForms : Collection(Form) = self.webPages->selectByKind(Form),\n" +
		"\t\t\t\texistsAnyQuestionnaires : Boolean = allForms->exists(f : Form | f.formType = Form_Type::QUESTIONNAIRE)\n" +
		"\t\t\tin\n" +
		"\t\t\t\texistsAnyQuestionnaires";

	/**
	 * Validates the R6MustIncludeAtLeastOneQuestionnaire constraint of '<em>Web Site</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWebSite_R6MustIncludeAtLeastOneQuestionnaire(WebSite webSite, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(WebDevProjectMMPackage.Literals.WEB_SITE,
				 webSite,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "R6MustIncludeAtLeastOneQuestionnaire",
				 WEB_SITE__R6_MUST_INCLUDE_AT_LEAST_ONE_QUESTIONNAIRE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the R6MustIncludeAtLeastOneSurvey constraint of '<em>Web Site</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String WEB_SITE__R6_MUST_INCLUDE_AT_LEAST_ONE_SURVEY__EEXPRESSION = "\n" +
		"\t\t\tlet allForms : Collection(Form) = self.webPages->selectByKind(Form),\n" +
		"\t\t\t\texistsAnySurvey : Boolean = allForms->exists(f : Form | f.formType = Form_Type::SURVEY)\n" +
		"\t\t\tin\n" +
		"\t\t\t\texistsAnySurvey";

	/**
	 * Validates the R6MustIncludeAtLeastOneSurvey constraint of '<em>Web Site</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWebSite_R6MustIncludeAtLeastOneSurvey(WebSite webSite, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(WebDevProjectMMPackage.Literals.WEB_SITE,
				 webSite,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "R6MustIncludeAtLeastOneSurvey",
				 WEB_SITE__R6_MUST_INCLUDE_AT_LEAST_ONE_SURVEY__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWebPage(WebPage webPage, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(webPage, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(webPage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(webPage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(webPage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(webPage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(webPage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(webPage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(webPage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(webPage, diagnostics, context);
		if (result || diagnostics != null) result &= validateWebPage_R2isolatedWebPage(webPage, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the R2isolatedWebPage constraint of '<em>Web Page</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String WEB_PAGE__R2ISOLATED_WEB_PAGE__EEXPRESSION = "self.role->size() > 0 or self.incoming->size() > 0";

	/**
	 * Validates the R2isolatedWebPage constraint of '<em>Web Page</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWebPage_R2isolatedWebPage(WebPage webPage, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(WebDevProjectMMPackage.Literals.WEB_PAGE,
				 webPage,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "R2isolatedWebPage",
				 WEB_PAGE__R2ISOLATED_WEB_PAGE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSocialNetworkContent(SocialNetworkContent socialNetworkContent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(socialNetworkContent, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRegularContentPage(RegularContentPage regularContentPage, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(regularContentPage, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(regularContentPage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(regularContentPage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(regularContentPage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(regularContentPage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(regularContentPage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(regularContentPage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(regularContentPage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(regularContentPage, diagnostics, context);
		if (result || diagnostics != null) result &= validateWebPage_R2isolatedWebPage(regularContentPage, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateForm(Form form, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(form, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(form, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(form, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(form, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(form, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(form, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(form, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(form, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(form, diagnostics, context);
		if (result || diagnostics != null) result &= validateWebPage_R2isolatedWebPage(form, diagnostics, context);
		if (result || diagnostics != null) result &= validateForm_R7AllQustionsInQuestionnaireHasCorrectAnswer(form, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the R7AllQustionsInQuestionnaireHasCorrectAnswer constraint of '<em>Form</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String FORM__R7_ALL_QUSTIONS_IN_QUESTIONNAIRE_HAS_CORRECT_ANSWER__EEXPRESSION = "\n" +
		"\t\t\t\t\tlet isQuestionnaire : Boolean = self.formType = Form_Type::QUESTIONNAIRE,\n" +
		"\t\t\t\t\t\tallQuestionDefinitions : Collection(QuestionDefinition) = self.questions->selectByKind(QuestionDefinition),\n" +
		"\t\t\t\t\t\tallQuestionDefinitionsHaveAnAnswer : Boolean = allQuestionDefinitions->forAll(q : QuestionDefinition | q.correctAnswer->size() > 0),\n" +
		"\t\t\t\t\t\tallStoredQuestions : Collection(StoredQuestion) = self.questions->selectByKind(StoredQuestion),\n" +
		"\t\t\t\t\t\tallStoredQuestionsHaveAnAnswer : Boolean = allStoredQuestions->forAll(q : StoredQuestion |  q.definitionOfQuestion.oclAsType(QuestionDefinition).correctAnswer->size() > 0)\n" +
		"\t\t\t\t\tin\n" +
		"\t\t\t\t\t\tisQuestionnaire implies\n" +
		"\t\t\t\t\t\t(\n" +
		"\t\t\t\t\t\t\t(allQuestionDefinitions->size() > 0 implies allQuestionDefinitionsHaveAnAnswer)\n" +
		"\t\t\t\t\t\t\tand\n" +
		"\t\t\t\t\t\t\t(allStoredQuestions->size() > 0 implies allStoredQuestionsHaveAnAnswer)\n" +
		"\t\t\t\t\t\t)";

	/**
	 * Validates the R7AllQustionsInQuestionnaireHasCorrectAnswer constraint of '<em>Form</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateForm_R7AllQustionsInQuestionnaireHasCorrectAnswer(Form form, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(WebDevProjectMMPackage.Literals.FORM,
				 form,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "R7AllQustionsInQuestionnaireHasCorrectAnswer",
				 FORM__R7_ALL_QUSTIONS_IN_QUESTIONNAIRE_HAS_CORRECT_ANSWER__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestion(Question question, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(question, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStoredQuestion(StoredQuestion storedQuestion, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(storedQuestion, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionsRepo(QuestionsRepo questionsRepo, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(questionsRepo, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionDefinition(QuestionDefinition questionDefinition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(questionDefinition, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(questionDefinition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(questionDefinition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(questionDefinition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(questionDefinition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(questionDefinition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(questionDefinition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(questionDefinition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(questionDefinition, diagnostics, context);
		if (result || diagnostics != null) result &= validateQuestionDefinition_onlyItsOwnAnswers(questionDefinition, diagnostics, context);
		if (result || diagnostics != null) result &= validateQuestionDefinition_trueFalseAndShortQuestionHaveOnlyOneCorrectAnswer(questionDefinition, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the onlyItsOwnAnswers constraint of '<em>Question Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String QUESTION_DEFINITION__ONLY_ITS_OWN_ANSWERS__EEXPRESSION = "self.correctAnswer->size() > 0 implies self.possibleAsnwer->includesAll(self.correctAnswer)";

	/**
	 * Validates the onlyItsOwnAnswers constraint of '<em>Question Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionDefinition_onlyItsOwnAnswers(QuestionDefinition questionDefinition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(WebDevProjectMMPackage.Literals.QUESTION_DEFINITION,
				 questionDefinition,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "onlyItsOwnAnswers",
				 QUESTION_DEFINITION__ONLY_ITS_OWN_ANSWERS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the trueFalseAndShortQuestionHaveOnlyOneCorrectAnswer constraint of '<em>Question Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String QUESTION_DEFINITION__TRUE_FALSE_AND_SHORT_QUESTION_HAVE_ONLY_ONE_CORRECT_ANSWER__EEXPRESSION = "(self.type = QuestionType::TRUE_FALSE or self.type = QuestionType::SHORT_QUESTION) implies self.correctAnswer->size() < 2";

	/**
	 * Validates the trueFalseAndShortQuestionHaveOnlyOneCorrectAnswer constraint of '<em>Question Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionDefinition_trueFalseAndShortQuestionHaveOnlyOneCorrectAnswer(QuestionDefinition questionDefinition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(WebDevProjectMMPackage.Literals.QUESTION_DEFINITION,
				 questionDefinition,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "trueFalseAndShortQuestionHaveOnlyOneCorrectAnswer",
				 QUESTION_DEFINITION__TRUE_FALSE_AND_SHORT_QUESTION_HAVE_ONLY_ONE_CORRECT_ANSWER__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePossibleAsnwer(PossibleAsnwer possibleAsnwer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(possibleAsnwer, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateElements(Elements elements, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(elements, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateText(Text text, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(text, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDatabase(Database database, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(database, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEntity(Entity entity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(entity, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(entity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(entity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(entity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(entity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(entity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(entity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(entity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(entity, diagnostics, context);
		if (result || diagnostics != null) result &= validateEntity_primaryKeyMustBeOwnAttribute(entity, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the primaryKeyMustBeOwnAttribute constraint of '<em>Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ENTITY__PRIMARY_KEY_MUST_BE_OWN_ATTRIBUTE__EEXPRESSION = "self.attributes->includes(self.primary_key)";

	/**
	 * Validates the primaryKeyMustBeOwnAttribute constraint of '<em>Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEntity_primaryKeyMustBeOwnAttribute(Entity entity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(WebDevProjectMMPackage.Literals.ENTITY,
				 entity,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "primaryKeyMustBeOwnAttribute",
				 ENTITY__PRIMARY_KEY_MUST_BE_OWN_ATTRIBUTE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttribute(Attribute attribute, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(attribute, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePageLink(PageLink pageLink, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(pageLink, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(pageLink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(pageLink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(pageLink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(pageLink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(pageLink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(pageLink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(pageLink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(pageLink, diagnostics, context);
		if (result || diagnostics != null) result &= validatePageLink_linkCanNotBeToItself(pageLink, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the linkCanNotBeToItself constraint of '<em>Page Link</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PAGE_LINK__LINK_CAN_NOT_BE_TO_ITSELF__EEXPRESSION = "self.source <> self.target";

	/**
	 * Validates the linkCanNotBeToItself constraint of '<em>Page Link</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePageLink_linkCanNotBeToItself(PageLink pageLink, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(WebDevProjectMMPackage.Literals.PAGE_LINK,
				 pageLink,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "linkCanNotBeToItself",
				 PAGE_LINK__LINK_CAN_NOT_BE_TO_ITSELF__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMediaContent(MediaContent mediaContent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(mediaContent, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCRUDPage(CRUDPage crudPage, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(crudPage, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(crudPage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(crudPage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(crudPage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(crudPage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(crudPage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(crudPage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(crudPage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(crudPage, diagnostics, context);
		if (result || diagnostics != null) result &= validateWebPage_R2isolatedWebPage(crudPage, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCreationCRUD(CreationCRUD creationCRUD, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(creationCRUD, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(creationCRUD, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(creationCRUD, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(creationCRUD, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(creationCRUD, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(creationCRUD, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(creationCRUD, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(creationCRUD, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(creationCRUD, diagnostics, context);
		if (result || diagnostics != null) result &= validateWebPage_R2isolatedWebPage(creationCRUD, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDelitionCRUD(DelitionCRUD delitionCRUD, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(delitionCRUD, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(delitionCRUD, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(delitionCRUD, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(delitionCRUD, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(delitionCRUD, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(delitionCRUD, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(delitionCRUD, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(delitionCRUD, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(delitionCRUD, diagnostics, context);
		if (result || diagnostics != null) result &= validateWebPage_R2isolatedWebPage(delitionCRUD, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllCRUD(AllCRUD allCRUD, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(allCRUD, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(allCRUD, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(allCRUD, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(allCRUD, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(allCRUD, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(allCRUD, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(allCRUD, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(allCRUD, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(allCRUD, diagnostics, context);
		if (result || diagnostics != null) result &= validateWebPage_R2isolatedWebPage(allCRUD, diagnostics, context);
		if (result || diagnostics != null) result &= validateAllCRUD_R3ALLCRUDImpliesNoOtherCRUD(allCRUD, diagnostics, context);
		if (result || diagnostics != null) result &= validateAllCRUD_onlyOneCRUDOfEachTypeMax(allCRUD, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the R3ALLCRUDImpliesNoOtherCRUD constraint of '<em>All CRUD</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ALL_CRUD__R3ALLCRUD_IMPLIES_NO_OTHER_CRUD__EEXPRESSION = "\n" +
		"\t\t\t\t\tlet allCRUDPages : Collection(CRUDPage) = self.oclContainer().oclAsType(WebSite).webPages->selectByKind(CRUDPage),\n" +
		"\t\t\t\t\t\tentityCRUDPages : Collection(CRUDPage) = allCRUDPages->select(p : CRUDPage | p.entity = self.entity),\n" +
		"\t\t\t\t\t\tnotALLCRUDTypePages : Collection(CRUDPage) = entityCRUDPages->select(p : CRUDPage | not p.oclIsKindOf(AllCRUD))\n" +
		"\t\t\t\t\tin\n" +
		"\t\t\t\t\t\tnotALLCRUDTypePages->size() = 0";

	/**
	 * Validates the R3ALLCRUDImpliesNoOtherCRUD constraint of '<em>All CRUD</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllCRUD_R3ALLCRUDImpliesNoOtherCRUD(AllCRUD allCRUD, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(WebDevProjectMMPackage.Literals.ALL_CRUD,
				 allCRUD,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "R3ALLCRUDImpliesNoOtherCRUD",
				 ALL_CRUD__R3ALLCRUD_IMPLIES_NO_OTHER_CRUD__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the onlyOneCRUDOfEachTypeMax constraint of '<em>All CRUD</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ALL_CRUD__ONLY_ONE_CRUD_OF_EACH_TYPE_MAX__EEXPRESSION = "\n" +
		"\t\t\t\t\tlet allCRUDPages : Collection(CRUDPage) = self.oclContainer().oclAsType(WebSite).webPages->selectByKind(CRUDPage),\n" +
		"\t\t\t\t\t\tentityCRUDPages : Collection(CRUDPage) = allCRUDPages->select(p : CRUDPage | p.entity = self.entity),\n" +
		"\t\t\t\t\t\tAllCRUDTypePages : Collection(CRUDPage) = entityCRUDPages->selectByKind(AllCRUD),\n" +
		"\t\t\t\t\t\tIndexCRUDTypePages : Collection(CRUDPage) = entityCRUDPages->selectByKind(IndexCRUD),\n" +
		"\t\t\t\t\t\tDetailCRUDTypePages : Collection(CRUDPage) = entityCRUDPages->selectByKind(DetailCRUD),\n" +
		"\t\t\t\t\t\tCreationCRUDTypePages : Collection(CRUDPage) = entityCRUDPages->selectByKind(CreationCRUD),\n" +
		"\t\t\t\t\t\tDelitionCRUDTypePages : Collection(CRUDPage) = entityCRUDPages->selectByKind(DelitionCRUD)\n" +
		"\t\t\t\t\tin\n" +
		"\t\t\t\t\t\tAllCRUDTypePages->size() < 2 and\n" +
		"\t\t\t\t\t\tDetailCRUDTypePages->size() < 2 and\n" +
		"\t\t\t\t\t\tIndexCRUDTypePages->size() < 2 and\n" +
		"\t\t\t\t\t\tCreationCRUDTypePages->size() < 2 and\n" +
		"\t\t\t\t\t\tDelitionCRUDTypePages->size() < 2\n" +
		"\t\t\t\t\t";

	/**
	 * Validates the onlyOneCRUDOfEachTypeMax constraint of '<em>All CRUD</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllCRUD_onlyOneCRUDOfEachTypeMax(AllCRUD allCRUD, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(WebDevProjectMMPackage.Literals.ALL_CRUD,
				 allCRUD,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "onlyOneCRUDOfEachTypeMax",
				 ALL_CRUD__ONLY_ONE_CRUD_OF_EACH_TYPE_MAX__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIndexCRUD(IndexCRUD indexCRUD, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(indexCRUD, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(indexCRUD, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(indexCRUD, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(indexCRUD, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(indexCRUD, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(indexCRUD, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(indexCRUD, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(indexCRUD, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(indexCRUD, diagnostics, context);
		if (result || diagnostics != null) result &= validateWebPage_R2isolatedWebPage(indexCRUD, diagnostics, context);
		if (result || diagnostics != null) result &= validateIndexCRUD_R4IndexImpliesDetail(indexCRUD, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the R4IndexImpliesDetail constraint of '<em>Index CRUD</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String INDEX_CRUD__R4_INDEX_IMPLIES_DETAIL__EEXPRESSION = "\n" +
		"\t\t\t\t\tlet allDetailPages : Collection(CRUDPage) = self.oclContainer().oclAsType(WebSite).webPages->selectByKind(DetailCRUD)\n" +
		"\t\t\t\t\tin\n" +
		"\t\t\t\t\t\tallDetailPages->exists(p : CRUDPage | p.entity = self.entity)";

	/**
	 * Validates the R4IndexImpliesDetail constraint of '<em>Index CRUD</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIndexCRUD_R4IndexImpliesDetail(IndexCRUD indexCRUD, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(WebDevProjectMMPackage.Literals.INDEX_CRUD,
				 indexCRUD,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "R4IndexImpliesDetail",
				 INDEX_CRUD__R4_INDEX_IMPLIES_DETAIL__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDetailCRUD(DetailCRUD detailCRUD, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(detailCRUD, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(detailCRUD, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(detailCRUD, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(detailCRUD, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(detailCRUD, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(detailCRUD, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(detailCRUD, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(detailCRUD, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(detailCRUD, diagnostics, context);
		if (result || diagnostics != null) result &= validateWebPage_R2isolatedWebPage(detailCRUD, diagnostics, context);
		if (result || diagnostics != null) result &= validateDetailCRUD_R4DetailImpliesIndex(detailCRUD, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the R4DetailImpliesIndex constraint of '<em>Detail CRUD</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DETAIL_CRUD__R4_DETAIL_IMPLIES_INDEX__EEXPRESSION = "\n" +
		"\t\t\t\t\tlet allIndexPages : Collection(CRUDPage) = self.oclContainer().oclAsType(WebSite).webPages->selectByKind(IndexCRUD)\n" +
		"\t\t\t\t\tin\n" +
		"\t\t\t\t\t\tallIndexPages->exists(p : CRUDPage | p.entity = self.entity)";

	/**
	 * Validates the R4DetailImpliesIndex constraint of '<em>Detail CRUD</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDetailCRUD_R4DetailImpliesIndex(DetailCRUD detailCRUD, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(WebDevProjectMMPackage.Literals.DETAIL_CRUD,
				 detailCRUD,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "R4DetailImpliesIndex",
				 DETAIL_CRUD__R4_DETAIL_IMPLIES_INDEX__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionType(QuestionType questionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttributePrimitiveData_Type(AttributePrimitiveData_Type attributePrimitiveData_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSocialNetwork_Type(SocialNetwork_Type socialNetwork_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateForm_Type(Form_Type form_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //WebDevProjectMMValidator
