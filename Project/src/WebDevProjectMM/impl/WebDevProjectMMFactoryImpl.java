/**
 */
package WebDevProjectMM.impl;

import WebDevProjectMM.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class WebDevProjectMMFactoryImpl extends EFactoryImpl implements WebDevProjectMMFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static WebDevProjectMMFactory init() {
		try {
			WebDevProjectMMFactory theWebDevProjectMMFactory = (WebDevProjectMMFactory)EPackage.Registry.INSTANCE.getEFactory(WebDevProjectMMPackage.eNS_URI);
			if (theWebDevProjectMMFactory != null) {
				return theWebDevProjectMMFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new WebDevProjectMMFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WebDevProjectMMFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case WebDevProjectMMPackage.ROLE: return createRole();
			case WebDevProjectMMPackage.WEB_SITE: return createWebSite();
			case WebDevProjectMMPackage.SOCIAL_NETWORK_CONTENT: return createSocialNetworkContent();
			case WebDevProjectMMPackage.REGULAR_CONTENT_PAGE: return createRegularContentPage();
			case WebDevProjectMMPackage.FORM: return createForm();
			case WebDevProjectMMPackage.STORED_QUESTION: return createStoredQuestion();
			case WebDevProjectMMPackage.QUESTIONS_REPO: return createQuestionsRepo();
			case WebDevProjectMMPackage.QUESTION_DEFINITION: return createQuestionDefinition();
			case WebDevProjectMMPackage.POSSIBLE_ASNWER: return createPossibleAsnwer();
			case WebDevProjectMMPackage.TEXT: return createText();
			case WebDevProjectMMPackage.DATABASE: return createDatabase();
			case WebDevProjectMMPackage.ENTITY: return createEntity();
			case WebDevProjectMMPackage.ATTRIBUTE: return createAttribute();
			case WebDevProjectMMPackage.PAGE_LINK: return createPageLink();
			case WebDevProjectMMPackage.MEDIA_CONTENT: return createMediaContent();
			case WebDevProjectMMPackage.CREATION_CRUD: return createCreationCRUD();
			case WebDevProjectMMPackage.DELITION_CRUD: return createDelitionCRUD();
			case WebDevProjectMMPackage.ALL_CRUD: return createAllCRUD();
			case WebDevProjectMMPackage.INDEX_CRUD: return createIndexCRUD();
			case WebDevProjectMMPackage.DETAIL_CRUD: return createDetailCRUD();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case WebDevProjectMMPackage.QUESTION_TYPE:
				return createQuestionTypeFromString(eDataType, initialValue);
			case WebDevProjectMMPackage.ATTRIBUTE_PRIMITIVE_DATA_TYPE:
				return createAttributePrimitiveData_TypeFromString(eDataType, initialValue);
			case WebDevProjectMMPackage.SOCIAL_NETWORK_TYPE:
				return createSocialNetwork_TypeFromString(eDataType, initialValue);
			case WebDevProjectMMPackage.FORM_TYPE:
				return createForm_TypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case WebDevProjectMMPackage.QUESTION_TYPE:
				return convertQuestionTypeToString(eDataType, instanceValue);
			case WebDevProjectMMPackage.ATTRIBUTE_PRIMITIVE_DATA_TYPE:
				return convertAttributePrimitiveData_TypeToString(eDataType, instanceValue);
			case WebDevProjectMMPackage.SOCIAL_NETWORK_TYPE:
				return convertSocialNetwork_TypeToString(eDataType, instanceValue);
			case WebDevProjectMMPackage.FORM_TYPE:
				return convertForm_TypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role createRole() {
		RoleImpl role = new RoleImpl();
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WebSite createWebSite() {
		WebSiteImpl webSite = new WebSiteImpl();
		return webSite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SocialNetworkContent createSocialNetworkContent() {
		SocialNetworkContentImpl socialNetworkContent = new SocialNetworkContentImpl();
		return socialNetworkContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegularContentPage createRegularContentPage() {
		RegularContentPageImpl regularContentPage = new RegularContentPageImpl();
		return regularContentPage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Form createForm() {
		FormImpl form = new FormImpl();
		return form;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StoredQuestion createStoredQuestion() {
		StoredQuestionImpl storedQuestion = new StoredQuestionImpl();
		return storedQuestion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuestionsRepo createQuestionsRepo() {
		QuestionsRepoImpl questionsRepo = new QuestionsRepoImpl();
		return questionsRepo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuestionDefinition createQuestionDefinition() {
		QuestionDefinitionImpl questionDefinition = new QuestionDefinitionImpl();
		return questionDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PossibleAsnwer createPossibleAsnwer() {
		PossibleAsnwerImpl possibleAsnwer = new PossibleAsnwerImpl();
		return possibleAsnwer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Text createText() {
		TextImpl text = new TextImpl();
		return text;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Database createDatabase() {
		DatabaseImpl database = new DatabaseImpl();
		return database;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity createEntity() {
		EntityImpl entity = new EntityImpl();
		return entity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute createAttribute() {
		AttributeImpl attribute = new AttributeImpl();
		return attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PageLink createPageLink() {
		PageLinkImpl pageLink = new PageLinkImpl();
		return pageLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MediaContent createMediaContent() {
		MediaContentImpl mediaContent = new MediaContentImpl();
		return mediaContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CreationCRUD createCreationCRUD() {
		CreationCRUDImpl creationCRUD = new CreationCRUDImpl();
		return creationCRUD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DelitionCRUD createDelitionCRUD() {
		DelitionCRUDImpl delitionCRUD = new DelitionCRUDImpl();
		return delitionCRUD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllCRUD createAllCRUD() {
		AllCRUDImpl allCRUD = new AllCRUDImpl();
		return allCRUD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IndexCRUD createIndexCRUD() {
		IndexCRUDImpl indexCRUD = new IndexCRUDImpl();
		return indexCRUD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DetailCRUD createDetailCRUD() {
		DetailCRUDImpl detailCRUD = new DetailCRUDImpl();
		return detailCRUD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuestionType createQuestionTypeFromString(EDataType eDataType, String initialValue) {
		QuestionType result = QuestionType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertQuestionTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributePrimitiveData_Type createAttributePrimitiveData_TypeFromString(EDataType eDataType, String initialValue) {
		AttributePrimitiveData_Type result = AttributePrimitiveData_Type.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAttributePrimitiveData_TypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SocialNetwork_Type createSocialNetwork_TypeFromString(EDataType eDataType, String initialValue) {
		SocialNetwork_Type result = SocialNetwork_Type.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSocialNetwork_TypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Form_Type createForm_TypeFromString(EDataType eDataType, String initialValue) {
		Form_Type result = Form_Type.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertForm_TypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WebDevProjectMMPackage getWebDevProjectMMPackage() {
		return (WebDevProjectMMPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static WebDevProjectMMPackage getPackage() {
		return WebDevProjectMMPackage.eINSTANCE;
	}

} //WebDevProjectMMFactoryImpl
