/**
 */
package WebDevProjectMM;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see WebDevProjectMM.WebDevProjectMMFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/OCL/Import ecore='http://www.eclipse.org/emf/2002/Ecore'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot'"
 * @generated
 */
public interface WebDevProjectMMPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "WebDevProjectMM";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "https://www.WebDevProjectMM.com";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "WebDevProjectMM";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	WebDevProjectMMPackage eINSTANCE = WebDevProjectMM.impl.WebDevProjectMMPackageImpl.init();

	/**
	 * The meta object id for the '{@link WebDevProjectMM.impl.RoleImpl <em>Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WebDevProjectMM.impl.RoleImpl
	 * @see WebDevProjectMM.impl.WebDevProjectMMPackageImpl#getRole()
	 * @generated
	 */
	int ROLE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Num Accesible Pages</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__NUM_ACCESIBLE_PAGES = 1;

	/**
	 * The feature id for the '<em><b>Webpage</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__WEBPAGE = 2;

	/**
	 * The number of structural features of the '<em>Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link WebDevProjectMM.impl.WebSiteImpl <em>Web Site</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WebDevProjectMM.impl.WebSiteImpl
	 * @see WebDevProjectMM.impl.WebDevProjectMMPackageImpl#getWebSite()
	 * @generated
	 */
	int WEB_SITE = 1;

	/**
	 * The feature id for the '<em><b>Roles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SITE__ROLES = 0;

	/**
	 * The feature id for the '<em><b>Web Pages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SITE__WEB_PAGES = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SITE__NAME = 2;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SITE__TITLE = 3;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SITE__DESCRIPTION = 4;

	/**
	 * The feature id for the '<em><b>URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SITE__URL = 5;

	/**
	 * The feature id for the '<em><b>Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SITE__LINK = 6;

	/**
	 * The number of structural features of the '<em>Web Site</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SITE_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link WebDevProjectMM.impl.WebPageImpl <em>Web Page</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WebDevProjectMM.impl.WebPageImpl
	 * @see WebDevProjectMM.impl.WebDevProjectMMPackageImpl#getWebPage()
	 * @generated
	 */
	int WEB_PAGE = 2;

	/**
	 * The feature id for the '<em><b>Socialnetworkcontent</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_PAGE__SOCIALNETWORKCONTENT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_PAGE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_PAGE__TITLE = 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_PAGE__DESCRIPTION = 3;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_PAGE__ELEMENTS = 4;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_PAGE__OUTGOING = 5;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_PAGE__INCOMING = 6;

	/**
	 * The feature id for the '<em><b>Role</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_PAGE__ROLE = 7;

	/**
	 * The feature id for the '<em><b>External Link</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_PAGE__EXTERNAL_LINK = 8;

	/**
	 * The number of structural features of the '<em>Web Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_PAGE_FEATURE_COUNT = 9;

	/**
	 * The meta object id for the '{@link WebDevProjectMM.impl.SocialNetworkContentImpl <em>Social Network Content</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WebDevProjectMM.impl.SocialNetworkContentImpl
	 * @see WebDevProjectMM.impl.WebDevProjectMMPackageImpl#getSocialNetworkContent()
	 * @generated
	 */
	int SOCIAL_NETWORK_CONTENT = 3;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCIAL_NETWORK_CONTENT__PARAMETERS = 0;

	/**
	 * The feature id for the '<em><b>Social Network Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCIAL_NETWORK_CONTENT__SOCIAL_NETWORK_TYPE = 1;

	/**
	 * The number of structural features of the '<em>Social Network Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCIAL_NETWORK_CONTENT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link WebDevProjectMM.impl.RegularContentPageImpl <em>Regular Content Page</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WebDevProjectMM.impl.RegularContentPageImpl
	 * @see WebDevProjectMM.impl.WebDevProjectMMPackageImpl#getRegularContentPage()
	 * @generated
	 */
	int REGULAR_CONTENT_PAGE = 4;

	/**
	 * The feature id for the '<em><b>Socialnetworkcontent</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_CONTENT_PAGE__SOCIALNETWORKCONTENT = WEB_PAGE__SOCIALNETWORKCONTENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_CONTENT_PAGE__NAME = WEB_PAGE__NAME;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_CONTENT_PAGE__TITLE = WEB_PAGE__TITLE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_CONTENT_PAGE__DESCRIPTION = WEB_PAGE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_CONTENT_PAGE__ELEMENTS = WEB_PAGE__ELEMENTS;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_CONTENT_PAGE__OUTGOING = WEB_PAGE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_CONTENT_PAGE__INCOMING = WEB_PAGE__INCOMING;

	/**
	 * The feature id for the '<em><b>Role</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_CONTENT_PAGE__ROLE = WEB_PAGE__ROLE;

	/**
	 * The feature id for the '<em><b>External Link</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_CONTENT_PAGE__EXTERNAL_LINK = WEB_PAGE__EXTERNAL_LINK;

	/**
	 * The number of structural features of the '<em>Regular Content Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_CONTENT_PAGE_FEATURE_COUNT = WEB_PAGE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link WebDevProjectMM.impl.FormImpl <em>Form</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WebDevProjectMM.impl.FormImpl
	 * @see WebDevProjectMM.impl.WebDevProjectMMPackageImpl#getForm()
	 * @generated
	 */
	int FORM = 5;

	/**
	 * The feature id for the '<em><b>Socialnetworkcontent</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM__SOCIALNETWORKCONTENT = WEB_PAGE__SOCIALNETWORKCONTENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM__NAME = WEB_PAGE__NAME;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM__TITLE = WEB_PAGE__TITLE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM__DESCRIPTION = WEB_PAGE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM__ELEMENTS = WEB_PAGE__ELEMENTS;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM__OUTGOING = WEB_PAGE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM__INCOMING = WEB_PAGE__INCOMING;

	/**
	 * The feature id for the '<em><b>Role</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM__ROLE = WEB_PAGE__ROLE;

	/**
	 * The feature id for the '<em><b>External Link</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM__EXTERNAL_LINK = WEB_PAGE__EXTERNAL_LINK;

	/**
	 * The feature id for the '<em><b>Questions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM__QUESTIONS = WEB_PAGE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Form Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM__FORM_TYPE = WEB_PAGE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Num TF Questions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM__NUM_TF_QUESTIONS = WEB_PAGE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Num MC Questions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM__NUM_MC_QUESTIONS = WEB_PAGE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Form</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_FEATURE_COUNT = WEB_PAGE_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link WebDevProjectMM.impl.QuestionImpl <em>Question</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WebDevProjectMM.impl.QuestionImpl
	 * @see WebDevProjectMM.impl.WebDevProjectMMPackageImpl#getQuestion()
	 * @generated
	 */
	int QUESTION = 6;

	/**
	 * The number of structural features of the '<em>Question</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link WebDevProjectMM.impl.StoredQuestionImpl <em>Stored Question</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WebDevProjectMM.impl.StoredQuestionImpl
	 * @see WebDevProjectMM.impl.WebDevProjectMMPackageImpl#getStoredQuestion()
	 * @generated
	 */
	int STORED_QUESTION = 7;

	/**
	 * The feature id for the '<em><b>Desc Question Definition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORED_QUESTION__DESC_QUESTION_DEFINITION = QUESTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Definition Of Question</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORED_QUESTION__DEFINITION_OF_QUESTION = QUESTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Stored Question</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORED_QUESTION_FEATURE_COUNT = QUESTION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link WebDevProjectMM.impl.QuestionsRepoImpl <em>Questions Repo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WebDevProjectMM.impl.QuestionsRepoImpl
	 * @see WebDevProjectMM.impl.WebDevProjectMMPackageImpl#getQuestionsRepo()
	 * @generated
	 */
	int QUESTIONS_REPO = 8;

	/**
	 * The feature id for the '<em><b>Question Definitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTIONS_REPO__QUESTION_DEFINITIONS = 0;

	/**
	 * The number of structural features of the '<em>Questions Repo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTIONS_REPO_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link WebDevProjectMM.impl.QuestionDefinitionImpl <em>Question Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WebDevProjectMM.impl.QuestionDefinitionImpl
	 * @see WebDevProjectMM.impl.WebDevProjectMMPackageImpl#getQuestionDefinition()
	 * @generated
	 */
	int QUESTION_DEFINITION = 9;

	/**
	 * The feature id for the '<em><b>Possible Asnwer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION_DEFINITION__POSSIBLE_ASNWER = QUESTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION_DEFINITION__DESCRIPTION = QUESTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION_DEFINITION__TYPE = QUESTION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Correct Answer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION_DEFINITION__CORRECT_ANSWER = QUESTION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Question Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION_DEFINITION_FEATURE_COUNT = QUESTION_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link WebDevProjectMM.impl.PossibleAsnwerImpl <em>Possible Asnwer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WebDevProjectMM.impl.PossibleAsnwerImpl
	 * @see WebDevProjectMM.impl.WebDevProjectMMPackageImpl#getPossibleAsnwer()
	 * @generated
	 */
	int POSSIBLE_ASNWER = 10;

	/**
	 * The feature id for the '<em><b>Answer Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSSIBLE_ASNWER__ANSWER_TEXT = 0;

	/**
	 * The number of structural features of the '<em>Possible Asnwer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSSIBLE_ASNWER_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link WebDevProjectMM.impl.ElementsImpl <em>Elements</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WebDevProjectMM.impl.ElementsImpl
	 * @see WebDevProjectMM.impl.WebDevProjectMMPackageImpl#getElements()
	 * @generated
	 */
	int ELEMENTS = 11;

	/**
	 * The number of structural features of the '<em>Elements</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTS_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link WebDevProjectMM.impl.TextImpl <em>Text</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WebDevProjectMM.impl.TextImpl
	 * @see WebDevProjectMM.impl.WebDevProjectMMPackageImpl#getText()
	 * @generated
	 */
	int TEXT = 12;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__TEXT = ELEMENTS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FEATURE_COUNT = ELEMENTS_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link WebDevProjectMM.impl.DatabaseImpl <em>Database</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WebDevProjectMM.impl.DatabaseImpl
	 * @see WebDevProjectMM.impl.WebDevProjectMMPackageImpl#getDatabase()
	 * @generated
	 */
	int DATABASE = 13;

	/**
	 * The feature id for the '<em><b>Entities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE__ENTITIES = 0;

	/**
	 * The number of structural features of the '<em>Database</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link WebDevProjectMM.impl.EntityImpl <em>Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WebDevProjectMM.impl.EntityImpl
	 * @see WebDevProjectMM.impl.WebDevProjectMMPackageImpl#getEntity()
	 * @generated
	 */
	int ENTITY = 14;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__ATTRIBUTES = 0;

	/**
	 * The feature id for the '<em><b>Refers To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__REFERS_TO = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__ID = 2;

	/**
	 * The feature id for the '<em><b>Primary key</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__PRIMARY_KEY = 3;

	/**
	 * The number of structural features of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link WebDevProjectMM.impl.AttributeImpl <em>Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WebDevProjectMM.impl.AttributeImpl
	 * @see WebDevProjectMM.impl.WebDevProjectMMPackageImpl#getAttribute()
	 * @generated
	 */
	int ATTRIBUTE = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Attribute Primitive Data Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__ATTRIBUTE_PRIMITIVE_DATA_TYPE = 1;

	/**
	 * The number of structural features of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link WebDevProjectMM.impl.PageLinkImpl <em>Page Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WebDevProjectMM.impl.PageLinkImpl
	 * @see WebDevProjectMM.impl.WebDevProjectMMPackageImpl#getPageLink()
	 * @generated
	 */
	int PAGE_LINK = 16;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_LINK__SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_LINK__TARGET = 1;

	/**
	 * The number of structural features of the '<em>Page Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_LINK_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link WebDevProjectMM.impl.MediaContentImpl <em>Media Content</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WebDevProjectMM.impl.MediaContentImpl
	 * @see WebDevProjectMM.impl.WebDevProjectMMPackageImpl#getMediaContent()
	 * @generated
	 */
	int MEDIA_CONTENT = 17;

	/**
	 * The feature id for the '<em><b>Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIA_CONTENT__LINK = ELEMENTS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Media Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIA_CONTENT_FEATURE_COUNT = ELEMENTS_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link WebDevProjectMM.impl.CRUDPageImpl <em>CRUD Page</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WebDevProjectMM.impl.CRUDPageImpl
	 * @see WebDevProjectMM.impl.WebDevProjectMMPackageImpl#getCRUDPage()
	 * @generated
	 */
	int CRUD_PAGE = 18;

	/**
	 * The feature id for the '<em><b>Socialnetworkcontent</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRUD_PAGE__SOCIALNETWORKCONTENT = WEB_PAGE__SOCIALNETWORKCONTENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRUD_PAGE__NAME = WEB_PAGE__NAME;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRUD_PAGE__TITLE = WEB_PAGE__TITLE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRUD_PAGE__DESCRIPTION = WEB_PAGE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRUD_PAGE__ELEMENTS = WEB_PAGE__ELEMENTS;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRUD_PAGE__OUTGOING = WEB_PAGE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRUD_PAGE__INCOMING = WEB_PAGE__INCOMING;

	/**
	 * The feature id for the '<em><b>Role</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRUD_PAGE__ROLE = WEB_PAGE__ROLE;

	/**
	 * The feature id for the '<em><b>External Link</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRUD_PAGE__EXTERNAL_LINK = WEB_PAGE__EXTERNAL_LINK;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRUD_PAGE__ENTITY = WEB_PAGE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>CRUD Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRUD_PAGE_FEATURE_COUNT = WEB_PAGE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link WebDevProjectMM.impl.CreationCRUDImpl <em>Creation CRUD</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WebDevProjectMM.impl.CreationCRUDImpl
	 * @see WebDevProjectMM.impl.WebDevProjectMMPackageImpl#getCreationCRUD()
	 * @generated
	 */
	int CREATION_CRUD = 19;

	/**
	 * The feature id for the '<em><b>Socialnetworkcontent</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATION_CRUD__SOCIALNETWORKCONTENT = CRUD_PAGE__SOCIALNETWORKCONTENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATION_CRUD__NAME = CRUD_PAGE__NAME;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATION_CRUD__TITLE = CRUD_PAGE__TITLE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATION_CRUD__DESCRIPTION = CRUD_PAGE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATION_CRUD__ELEMENTS = CRUD_PAGE__ELEMENTS;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATION_CRUD__OUTGOING = CRUD_PAGE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATION_CRUD__INCOMING = CRUD_PAGE__INCOMING;

	/**
	 * The feature id for the '<em><b>Role</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATION_CRUD__ROLE = CRUD_PAGE__ROLE;

	/**
	 * The feature id for the '<em><b>External Link</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATION_CRUD__EXTERNAL_LINK = CRUD_PAGE__EXTERNAL_LINK;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATION_CRUD__ENTITY = CRUD_PAGE__ENTITY;

	/**
	 * The number of structural features of the '<em>Creation CRUD</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATION_CRUD_FEATURE_COUNT = CRUD_PAGE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link WebDevProjectMM.impl.DelitionCRUDImpl <em>Delition CRUD</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WebDevProjectMM.impl.DelitionCRUDImpl
	 * @see WebDevProjectMM.impl.WebDevProjectMMPackageImpl#getDelitionCRUD()
	 * @generated
	 */
	int DELITION_CRUD = 20;

	/**
	 * The feature id for the '<em><b>Socialnetworkcontent</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELITION_CRUD__SOCIALNETWORKCONTENT = CRUD_PAGE__SOCIALNETWORKCONTENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELITION_CRUD__NAME = CRUD_PAGE__NAME;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELITION_CRUD__TITLE = CRUD_PAGE__TITLE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELITION_CRUD__DESCRIPTION = CRUD_PAGE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELITION_CRUD__ELEMENTS = CRUD_PAGE__ELEMENTS;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELITION_CRUD__OUTGOING = CRUD_PAGE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELITION_CRUD__INCOMING = CRUD_PAGE__INCOMING;

	/**
	 * The feature id for the '<em><b>Role</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELITION_CRUD__ROLE = CRUD_PAGE__ROLE;

	/**
	 * The feature id for the '<em><b>External Link</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELITION_CRUD__EXTERNAL_LINK = CRUD_PAGE__EXTERNAL_LINK;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELITION_CRUD__ENTITY = CRUD_PAGE__ENTITY;

	/**
	 * The number of structural features of the '<em>Delition CRUD</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELITION_CRUD_FEATURE_COUNT = CRUD_PAGE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link WebDevProjectMM.impl.AllCRUDImpl <em>All CRUD</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WebDevProjectMM.impl.AllCRUDImpl
	 * @see WebDevProjectMM.impl.WebDevProjectMMPackageImpl#getAllCRUD()
	 * @generated
	 */
	int ALL_CRUD = 21;

	/**
	 * The feature id for the '<em><b>Socialnetworkcontent</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_CRUD__SOCIALNETWORKCONTENT = CRUD_PAGE__SOCIALNETWORKCONTENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_CRUD__NAME = CRUD_PAGE__NAME;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_CRUD__TITLE = CRUD_PAGE__TITLE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_CRUD__DESCRIPTION = CRUD_PAGE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_CRUD__ELEMENTS = CRUD_PAGE__ELEMENTS;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_CRUD__OUTGOING = CRUD_PAGE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_CRUD__INCOMING = CRUD_PAGE__INCOMING;

	/**
	 * The feature id for the '<em><b>Role</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_CRUD__ROLE = CRUD_PAGE__ROLE;

	/**
	 * The feature id for the '<em><b>External Link</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_CRUD__EXTERNAL_LINK = CRUD_PAGE__EXTERNAL_LINK;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_CRUD__ENTITY = CRUD_PAGE__ENTITY;

	/**
	 * The number of structural features of the '<em>All CRUD</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_CRUD_FEATURE_COUNT = CRUD_PAGE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link WebDevProjectMM.impl.IndexCRUDImpl <em>Index CRUD</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WebDevProjectMM.impl.IndexCRUDImpl
	 * @see WebDevProjectMM.impl.WebDevProjectMMPackageImpl#getIndexCRUD()
	 * @generated
	 */
	int INDEX_CRUD = 22;

	/**
	 * The feature id for the '<em><b>Socialnetworkcontent</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_CRUD__SOCIALNETWORKCONTENT = CRUD_PAGE__SOCIALNETWORKCONTENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_CRUD__NAME = CRUD_PAGE__NAME;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_CRUD__TITLE = CRUD_PAGE__TITLE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_CRUD__DESCRIPTION = CRUD_PAGE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_CRUD__ELEMENTS = CRUD_PAGE__ELEMENTS;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_CRUD__OUTGOING = CRUD_PAGE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_CRUD__INCOMING = CRUD_PAGE__INCOMING;

	/**
	 * The feature id for the '<em><b>Role</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_CRUD__ROLE = CRUD_PAGE__ROLE;

	/**
	 * The feature id for the '<em><b>External Link</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_CRUD__EXTERNAL_LINK = CRUD_PAGE__EXTERNAL_LINK;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_CRUD__ENTITY = CRUD_PAGE__ENTITY;

	/**
	 * The number of structural features of the '<em>Index CRUD</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_CRUD_FEATURE_COUNT = CRUD_PAGE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link WebDevProjectMM.impl.DetailCRUDImpl <em>Detail CRUD</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WebDevProjectMM.impl.DetailCRUDImpl
	 * @see WebDevProjectMM.impl.WebDevProjectMMPackageImpl#getDetailCRUD()
	 * @generated
	 */
	int DETAIL_CRUD = 23;

	/**
	 * The feature id for the '<em><b>Socialnetworkcontent</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAIL_CRUD__SOCIALNETWORKCONTENT = CRUD_PAGE__SOCIALNETWORKCONTENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAIL_CRUD__NAME = CRUD_PAGE__NAME;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAIL_CRUD__TITLE = CRUD_PAGE__TITLE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAIL_CRUD__DESCRIPTION = CRUD_PAGE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAIL_CRUD__ELEMENTS = CRUD_PAGE__ELEMENTS;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAIL_CRUD__OUTGOING = CRUD_PAGE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAIL_CRUD__INCOMING = CRUD_PAGE__INCOMING;

	/**
	 * The feature id for the '<em><b>Role</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAIL_CRUD__ROLE = CRUD_PAGE__ROLE;

	/**
	 * The feature id for the '<em><b>External Link</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAIL_CRUD__EXTERNAL_LINK = CRUD_PAGE__EXTERNAL_LINK;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAIL_CRUD__ENTITY = CRUD_PAGE__ENTITY;

	/**
	 * The number of structural features of the '<em>Detail CRUD</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAIL_CRUD_FEATURE_COUNT = CRUD_PAGE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link WebDevProjectMM.QuestionType <em>Question Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WebDevProjectMM.QuestionType
	 * @see WebDevProjectMM.impl.WebDevProjectMMPackageImpl#getQuestionType()
	 * @generated
	 */
	int QUESTION_TYPE = 24;

	/**
	 * The meta object id for the '{@link WebDevProjectMM.AttributePrimitiveData_Type <em>Attribute Primitive Data Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WebDevProjectMM.AttributePrimitiveData_Type
	 * @see WebDevProjectMM.impl.WebDevProjectMMPackageImpl#getAttributePrimitiveData_Type()
	 * @generated
	 */
	int ATTRIBUTE_PRIMITIVE_DATA_TYPE = 25;

	/**
	 * The meta object id for the '{@link WebDevProjectMM.SocialNetwork_Type <em>Social Network Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WebDevProjectMM.SocialNetwork_Type
	 * @see WebDevProjectMM.impl.WebDevProjectMMPackageImpl#getSocialNetwork_Type()
	 * @generated
	 */
	int SOCIAL_NETWORK_TYPE = 26;

	/**
	 * The meta object id for the '{@link WebDevProjectMM.Form_Type <em>Form Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WebDevProjectMM.Form_Type
	 * @see WebDevProjectMM.impl.WebDevProjectMMPackageImpl#getForm_Type()
	 * @generated
	 */
	int FORM_TYPE = 27;


	/**
	 * Returns the meta object for class '{@link WebDevProjectMM.Role <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role</em>'.
	 * @see WebDevProjectMM.Role
	 * @generated
	 */
	EClass getRole();

	/**
	 * Returns the meta object for the attribute '{@link WebDevProjectMM.Role#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see WebDevProjectMM.Role#getName()
	 * @see #getRole()
	 * @generated
	 */
	EAttribute getRole_Name();

	/**
	 * Returns the meta object for the attribute '{@link WebDevProjectMM.Role#getNumAccesiblePages <em>Num Accesible Pages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Num Accesible Pages</em>'.
	 * @see WebDevProjectMM.Role#getNumAccesiblePages()
	 * @see #getRole()
	 * @generated
	 */
	EAttribute getRole_NumAccesiblePages();

	/**
	 * Returns the meta object for the reference list '{@link WebDevProjectMM.Role#getWebpage <em>Webpage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Webpage</em>'.
	 * @see WebDevProjectMM.Role#getWebpage()
	 * @see #getRole()
	 * @generated
	 */
	EReference getRole_Webpage();

	/**
	 * Returns the meta object for class '{@link WebDevProjectMM.WebSite <em>Web Site</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Web Site</em>'.
	 * @see WebDevProjectMM.WebSite
	 * @generated
	 */
	EClass getWebSite();

	/**
	 * Returns the meta object for the containment reference list '{@link WebDevProjectMM.WebSite#getRoles <em>Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Roles</em>'.
	 * @see WebDevProjectMM.WebSite#getRoles()
	 * @see #getWebSite()
	 * @generated
	 */
	EReference getWebSite_Roles();

	/**
	 * Returns the meta object for the containment reference list '{@link WebDevProjectMM.WebSite#getWebPages <em>Web Pages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Web Pages</em>'.
	 * @see WebDevProjectMM.WebSite#getWebPages()
	 * @see #getWebSite()
	 * @generated
	 */
	EReference getWebSite_WebPages();

	/**
	 * Returns the meta object for the attribute '{@link WebDevProjectMM.WebSite#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see WebDevProjectMM.WebSite#getName()
	 * @see #getWebSite()
	 * @generated
	 */
	EAttribute getWebSite_Name();

	/**
	 * Returns the meta object for the attribute '{@link WebDevProjectMM.WebSite#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see WebDevProjectMM.WebSite#getTitle()
	 * @see #getWebSite()
	 * @generated
	 */
	EAttribute getWebSite_Title();

	/**
	 * Returns the meta object for the attribute '{@link WebDevProjectMM.WebSite#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see WebDevProjectMM.WebSite#getDescription()
	 * @see #getWebSite()
	 * @generated
	 */
	EAttribute getWebSite_Description();

	/**
	 * Returns the meta object for the attribute '{@link WebDevProjectMM.WebSite#getURL <em>URL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>URL</em>'.
	 * @see WebDevProjectMM.WebSite#getURL()
	 * @see #getWebSite()
	 * @generated
	 */
	EAttribute getWebSite_URL();

	/**
	 * Returns the meta object for the containment reference list '{@link WebDevProjectMM.WebSite#getLink <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Link</em>'.
	 * @see WebDevProjectMM.WebSite#getLink()
	 * @see #getWebSite()
	 * @generated
	 */
	EReference getWebSite_Link();

	/**
	 * Returns the meta object for class '{@link WebDevProjectMM.WebPage <em>Web Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Web Page</em>'.
	 * @see WebDevProjectMM.WebPage
	 * @generated
	 */
	EClass getWebPage();

	/**
	 * Returns the meta object for the containment reference list '{@link WebDevProjectMM.WebPage#getSocialnetworkcontent <em>Socialnetworkcontent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Socialnetworkcontent</em>'.
	 * @see WebDevProjectMM.WebPage#getSocialnetworkcontent()
	 * @see #getWebPage()
	 * @generated
	 */
	EReference getWebPage_Socialnetworkcontent();

	/**
	 * Returns the meta object for the attribute '{@link WebDevProjectMM.WebPage#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see WebDevProjectMM.WebPage#getName()
	 * @see #getWebPage()
	 * @generated
	 */
	EAttribute getWebPage_Name();

	/**
	 * Returns the meta object for the attribute '{@link WebDevProjectMM.WebPage#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see WebDevProjectMM.WebPage#getTitle()
	 * @see #getWebPage()
	 * @generated
	 */
	EAttribute getWebPage_Title();

	/**
	 * Returns the meta object for the attribute '{@link WebDevProjectMM.WebPage#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see WebDevProjectMM.WebPage#getDescription()
	 * @see #getWebPage()
	 * @generated
	 */
	EAttribute getWebPage_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link WebDevProjectMM.WebPage#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see WebDevProjectMM.WebPage#getElements()
	 * @see #getWebPage()
	 * @generated
	 */
	EReference getWebPage_Elements();

	/**
	 * Returns the meta object for the reference list '{@link WebDevProjectMM.WebPage#getOutgoing <em>Outgoing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Outgoing</em>'.
	 * @see WebDevProjectMM.WebPage#getOutgoing()
	 * @see #getWebPage()
	 * @generated
	 */
	EReference getWebPage_Outgoing();

	/**
	 * Returns the meta object for the reference list '{@link WebDevProjectMM.WebPage#getIncoming <em>Incoming</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Incoming</em>'.
	 * @see WebDevProjectMM.WebPage#getIncoming()
	 * @see #getWebPage()
	 * @generated
	 */
	EReference getWebPage_Incoming();

	/**
	 * Returns the meta object for the reference list '{@link WebDevProjectMM.WebPage#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Role</em>'.
	 * @see WebDevProjectMM.WebPage#getRole()
	 * @see #getWebPage()
	 * @generated
	 */
	EReference getWebPage_Role();

	/**
	 * Returns the meta object for the attribute list '{@link WebDevProjectMM.WebPage#getExternalLink <em>External Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>External Link</em>'.
	 * @see WebDevProjectMM.WebPage#getExternalLink()
	 * @see #getWebPage()
	 * @generated
	 */
	EAttribute getWebPage_ExternalLink();

	/**
	 * Returns the meta object for class '{@link WebDevProjectMM.SocialNetworkContent <em>Social Network Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Social Network Content</em>'.
	 * @see WebDevProjectMM.SocialNetworkContent
	 * @generated
	 */
	EClass getSocialNetworkContent();

	/**
	 * Returns the meta object for the attribute '{@link WebDevProjectMM.SocialNetworkContent#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parameters</em>'.
	 * @see WebDevProjectMM.SocialNetworkContent#getParameters()
	 * @see #getSocialNetworkContent()
	 * @generated
	 */
	EAttribute getSocialNetworkContent_Parameters();

	/**
	 * Returns the meta object for the attribute '{@link WebDevProjectMM.SocialNetworkContent#getSocialNetworkType <em>Social Network Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Social Network Type</em>'.
	 * @see WebDevProjectMM.SocialNetworkContent#getSocialNetworkType()
	 * @see #getSocialNetworkContent()
	 * @generated
	 */
	EAttribute getSocialNetworkContent_SocialNetworkType();

	/**
	 * Returns the meta object for class '{@link WebDevProjectMM.RegularContentPage <em>Regular Content Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Regular Content Page</em>'.
	 * @see WebDevProjectMM.RegularContentPage
	 * @generated
	 */
	EClass getRegularContentPage();

	/**
	 * Returns the meta object for class '{@link WebDevProjectMM.Form <em>Form</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Form</em>'.
	 * @see WebDevProjectMM.Form
	 * @generated
	 */
	EClass getForm();

	/**
	 * Returns the meta object for the containment reference list '{@link WebDevProjectMM.Form#getQuestions <em>Questions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Questions</em>'.
	 * @see WebDevProjectMM.Form#getQuestions()
	 * @see #getForm()
	 * @generated
	 */
	EReference getForm_Questions();

	/**
	 * Returns the meta object for the attribute '{@link WebDevProjectMM.Form#getFormType <em>Form Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Form Type</em>'.
	 * @see WebDevProjectMM.Form#getFormType()
	 * @see #getForm()
	 * @generated
	 */
	EAttribute getForm_FormType();

	/**
	 * Returns the meta object for the attribute '{@link WebDevProjectMM.Form#getNumTFQuestions <em>Num TF Questions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Num TF Questions</em>'.
	 * @see WebDevProjectMM.Form#getNumTFQuestions()
	 * @see #getForm()
	 * @generated
	 */
	EAttribute getForm_NumTFQuestions();

	/**
	 * Returns the meta object for the attribute '{@link WebDevProjectMM.Form#getNumMCQuestions <em>Num MC Questions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Num MC Questions</em>'.
	 * @see WebDevProjectMM.Form#getNumMCQuestions()
	 * @see #getForm()
	 * @generated
	 */
	EAttribute getForm_NumMCQuestions();

	/**
	 * Returns the meta object for class '{@link WebDevProjectMM.Question <em>Question</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Question</em>'.
	 * @see WebDevProjectMM.Question
	 * @generated
	 */
	EClass getQuestion();

	/**
	 * Returns the meta object for class '{@link WebDevProjectMM.StoredQuestion <em>Stored Question</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stored Question</em>'.
	 * @see WebDevProjectMM.StoredQuestion
	 * @generated
	 */
	EClass getStoredQuestion();

	/**
	 * Returns the meta object for the attribute '{@link WebDevProjectMM.StoredQuestion#getDescQuestionDefinition <em>Desc Question Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Desc Question Definition</em>'.
	 * @see WebDevProjectMM.StoredQuestion#getDescQuestionDefinition()
	 * @see #getStoredQuestion()
	 * @generated
	 */
	EAttribute getStoredQuestion_DescQuestionDefinition();

	/**
	 * Returns the meta object for the reference '{@link WebDevProjectMM.StoredQuestion#getDefinitionOfQuestion <em>Definition Of Question</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Definition Of Question</em>'.
	 * @see WebDevProjectMM.StoredQuestion#getDefinitionOfQuestion()
	 * @see #getStoredQuestion()
	 * @generated
	 */
	EReference getStoredQuestion_DefinitionOfQuestion();

	/**
	 * Returns the meta object for class '{@link WebDevProjectMM.QuestionsRepo <em>Questions Repo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Questions Repo</em>'.
	 * @see WebDevProjectMM.QuestionsRepo
	 * @generated
	 */
	EClass getQuestionsRepo();

	/**
	 * Returns the meta object for the containment reference list '{@link WebDevProjectMM.QuestionsRepo#getQuestionDefinitions <em>Question Definitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Question Definitions</em>'.
	 * @see WebDevProjectMM.QuestionsRepo#getQuestionDefinitions()
	 * @see #getQuestionsRepo()
	 * @generated
	 */
	EReference getQuestionsRepo_QuestionDefinitions();

	/**
	 * Returns the meta object for class '{@link WebDevProjectMM.QuestionDefinition <em>Question Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Question Definition</em>'.
	 * @see WebDevProjectMM.QuestionDefinition
	 * @generated
	 */
	EClass getQuestionDefinition();

	/**
	 * Returns the meta object for the containment reference list '{@link WebDevProjectMM.QuestionDefinition#getPossibleAsnwer <em>Possible Asnwer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Possible Asnwer</em>'.
	 * @see WebDevProjectMM.QuestionDefinition#getPossibleAsnwer()
	 * @see #getQuestionDefinition()
	 * @generated
	 */
	EReference getQuestionDefinition_PossibleAsnwer();

	/**
	 * Returns the meta object for the attribute '{@link WebDevProjectMM.QuestionDefinition#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see WebDevProjectMM.QuestionDefinition#getDescription()
	 * @see #getQuestionDefinition()
	 * @generated
	 */
	EAttribute getQuestionDefinition_Description();

	/**
	 * Returns the meta object for the attribute '{@link WebDevProjectMM.QuestionDefinition#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see WebDevProjectMM.QuestionDefinition#getType()
	 * @see #getQuestionDefinition()
	 * @generated
	 */
	EAttribute getQuestionDefinition_Type();

	/**
	 * Returns the meta object for the reference list '{@link WebDevProjectMM.QuestionDefinition#getCorrectAnswer <em>Correct Answer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Correct Answer</em>'.
	 * @see WebDevProjectMM.QuestionDefinition#getCorrectAnswer()
	 * @see #getQuestionDefinition()
	 * @generated
	 */
	EReference getQuestionDefinition_CorrectAnswer();

	/**
	 * Returns the meta object for class '{@link WebDevProjectMM.PossibleAsnwer <em>Possible Asnwer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Possible Asnwer</em>'.
	 * @see WebDevProjectMM.PossibleAsnwer
	 * @generated
	 */
	EClass getPossibleAsnwer();

	/**
	 * Returns the meta object for the attribute '{@link WebDevProjectMM.PossibleAsnwer#getAnswerText <em>Answer Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Answer Text</em>'.
	 * @see WebDevProjectMM.PossibleAsnwer#getAnswerText()
	 * @see #getPossibleAsnwer()
	 * @generated
	 */
	EAttribute getPossibleAsnwer_AnswerText();

	/**
	 * Returns the meta object for class '{@link WebDevProjectMM.Elements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Elements</em>'.
	 * @see WebDevProjectMM.Elements
	 * @generated
	 */
	EClass getElements();

	/**
	 * Returns the meta object for class '{@link WebDevProjectMM.Text <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text</em>'.
	 * @see WebDevProjectMM.Text
	 * @generated
	 */
	EClass getText();

	/**
	 * Returns the meta object for the attribute '{@link WebDevProjectMM.Text#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see WebDevProjectMM.Text#getText()
	 * @see #getText()
	 * @generated
	 */
	EAttribute getText_Text();

	/**
	 * Returns the meta object for class '{@link WebDevProjectMM.Database <em>Database</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Database</em>'.
	 * @see WebDevProjectMM.Database
	 * @generated
	 */
	EClass getDatabase();

	/**
	 * Returns the meta object for the containment reference list '{@link WebDevProjectMM.Database#getEntities <em>Entities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entities</em>'.
	 * @see WebDevProjectMM.Database#getEntities()
	 * @see #getDatabase()
	 * @generated
	 */
	EReference getDatabase_Entities();

	/**
	 * Returns the meta object for class '{@link WebDevProjectMM.Entity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity</em>'.
	 * @see WebDevProjectMM.Entity
	 * @generated
	 */
	EClass getEntity();

	/**
	 * Returns the meta object for the containment reference list '{@link WebDevProjectMM.Entity#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attributes</em>'.
	 * @see WebDevProjectMM.Entity#getAttributes()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_Attributes();

	/**
	 * Returns the meta object for the reference '{@link WebDevProjectMM.Entity#getRefersTo <em>Refers To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Refers To</em>'.
	 * @see WebDevProjectMM.Entity#getRefersTo()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_RefersTo();

	/**
	 * Returns the meta object for the attribute '{@link WebDevProjectMM.Entity#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see WebDevProjectMM.Entity#getId()
	 * @see #getEntity()
	 * @generated
	 */
	EAttribute getEntity_Id();

	/**
	 * Returns the meta object for the reference '{@link WebDevProjectMM.Entity#getPrimary_key <em>Primary key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Primary key</em>'.
	 * @see WebDevProjectMM.Entity#getPrimary_key()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_Primary_key();

	/**
	 * Returns the meta object for class '{@link WebDevProjectMM.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute</em>'.
	 * @see WebDevProjectMM.Attribute
	 * @generated
	 */
	EClass getAttribute();

	/**
	 * Returns the meta object for the attribute '{@link WebDevProjectMM.Attribute#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see WebDevProjectMM.Attribute#getName()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Name();

	/**
	 * Returns the meta object for the attribute '{@link WebDevProjectMM.Attribute#getAttributePrimitiveData_Type <em>Attribute Primitive Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attribute Primitive Data Type</em>'.
	 * @see WebDevProjectMM.Attribute#getAttributePrimitiveData_Type()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_AttributePrimitiveData_Type();

	/**
	 * Returns the meta object for class '{@link WebDevProjectMM.PageLink <em>Page Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Page Link</em>'.
	 * @see WebDevProjectMM.PageLink
	 * @generated
	 */
	EClass getPageLink();

	/**
	 * Returns the meta object for the reference '{@link WebDevProjectMM.PageLink#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see WebDevProjectMM.PageLink#getSource()
	 * @see #getPageLink()
	 * @generated
	 */
	EReference getPageLink_Source();

	/**
	 * Returns the meta object for the reference '{@link WebDevProjectMM.PageLink#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see WebDevProjectMM.PageLink#getTarget()
	 * @see #getPageLink()
	 * @generated
	 */
	EReference getPageLink_Target();

	/**
	 * Returns the meta object for class '{@link WebDevProjectMM.MediaContent <em>Media Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Media Content</em>'.
	 * @see WebDevProjectMM.MediaContent
	 * @generated
	 */
	EClass getMediaContent();

	/**
	 * Returns the meta object for the attribute '{@link WebDevProjectMM.MediaContent#getLink <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Link</em>'.
	 * @see WebDevProjectMM.MediaContent#getLink()
	 * @see #getMediaContent()
	 * @generated
	 */
	EAttribute getMediaContent_Link();

	/**
	 * Returns the meta object for class '{@link WebDevProjectMM.CRUDPage <em>CRUD Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CRUD Page</em>'.
	 * @see WebDevProjectMM.CRUDPage
	 * @generated
	 */
	EClass getCRUDPage();

	/**
	 * Returns the meta object for the reference '{@link WebDevProjectMM.CRUDPage#getEntity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Entity</em>'.
	 * @see WebDevProjectMM.CRUDPage#getEntity()
	 * @see #getCRUDPage()
	 * @generated
	 */
	EReference getCRUDPage_Entity();

	/**
	 * Returns the meta object for class '{@link WebDevProjectMM.CreationCRUD <em>Creation CRUD</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Creation CRUD</em>'.
	 * @see WebDevProjectMM.CreationCRUD
	 * @generated
	 */
	EClass getCreationCRUD();

	/**
	 * Returns the meta object for class '{@link WebDevProjectMM.DelitionCRUD <em>Delition CRUD</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Delition CRUD</em>'.
	 * @see WebDevProjectMM.DelitionCRUD
	 * @generated
	 */
	EClass getDelitionCRUD();

	/**
	 * Returns the meta object for class '{@link WebDevProjectMM.AllCRUD <em>All CRUD</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>All CRUD</em>'.
	 * @see WebDevProjectMM.AllCRUD
	 * @generated
	 */
	EClass getAllCRUD();

	/**
	 * Returns the meta object for class '{@link WebDevProjectMM.IndexCRUD <em>Index CRUD</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Index CRUD</em>'.
	 * @see WebDevProjectMM.IndexCRUD
	 * @generated
	 */
	EClass getIndexCRUD();

	/**
	 * Returns the meta object for class '{@link WebDevProjectMM.DetailCRUD <em>Detail CRUD</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Detail CRUD</em>'.
	 * @see WebDevProjectMM.DetailCRUD
	 * @generated
	 */
	EClass getDetailCRUD();

	/**
	 * Returns the meta object for enum '{@link WebDevProjectMM.QuestionType <em>Question Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Question Type</em>'.
	 * @see WebDevProjectMM.QuestionType
	 * @generated
	 */
	EEnum getQuestionType();

	/**
	 * Returns the meta object for enum '{@link WebDevProjectMM.AttributePrimitiveData_Type <em>Attribute Primitive Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Attribute Primitive Data Type</em>'.
	 * @see WebDevProjectMM.AttributePrimitiveData_Type
	 * @generated
	 */
	EEnum getAttributePrimitiveData_Type();

	/**
	 * Returns the meta object for enum '{@link WebDevProjectMM.SocialNetwork_Type <em>Social Network Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Social Network Type</em>'.
	 * @see WebDevProjectMM.SocialNetwork_Type
	 * @generated
	 */
	EEnum getSocialNetwork_Type();

	/**
	 * Returns the meta object for enum '{@link WebDevProjectMM.Form_Type <em>Form Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Form Type</em>'.
	 * @see WebDevProjectMM.Form_Type
	 * @generated
	 */
	EEnum getForm_Type();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	WebDevProjectMMFactory getWebDevProjectMMFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link WebDevProjectMM.impl.RoleImpl <em>Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see WebDevProjectMM.impl.RoleImpl
		 * @see WebDevProjectMM.impl.WebDevProjectMMPackageImpl#getRole()
		 * @generated
		 */
		EClass ROLE = eINSTANCE.getRole();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROLE__NAME = eINSTANCE.getRole_Name();

		/**
		 * The meta object literal for the '<em><b>Num Accesible Pages</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROLE__NUM_ACCESIBLE_PAGES = eINSTANCE.getRole_NumAccesiblePages();

		/**
		 * The meta object literal for the '<em><b>Webpage</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE__WEBPAGE = eINSTANCE.getRole_Webpage();

		/**
		 * The meta object literal for the '{@link WebDevProjectMM.impl.WebSiteImpl <em>Web Site</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see WebDevProjectMM.impl.WebSiteImpl
		 * @see WebDevProjectMM.impl.WebDevProjectMMPackageImpl#getWebSite()
		 * @generated
		 */
		EClass WEB_SITE = eINSTANCE.getWebSite();

		/**
		 * The meta object literal for the '<em><b>Roles</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEB_SITE__ROLES = eINSTANCE.getWebSite_Roles();

		/**
		 * The meta object literal for the '<em><b>Web Pages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEB_SITE__WEB_PAGES = eINSTANCE.getWebSite_WebPages();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_SITE__NAME = eINSTANCE.getWebSite_Name();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_SITE__TITLE = eINSTANCE.getWebSite_Title();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_SITE__DESCRIPTION = eINSTANCE.getWebSite_Description();

		/**
		 * The meta object literal for the '<em><b>URL</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_SITE__URL = eINSTANCE.getWebSite_URL();

		/**
		 * The meta object literal for the '<em><b>Link</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEB_SITE__LINK = eINSTANCE.getWebSite_Link();

		/**
		 * The meta object literal for the '{@link WebDevProjectMM.impl.WebPageImpl <em>Web Page</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see WebDevProjectMM.impl.WebPageImpl
		 * @see WebDevProjectMM.impl.WebDevProjectMMPackageImpl#getWebPage()
		 * @generated
		 */
		EClass WEB_PAGE = eINSTANCE.getWebPage();

		/**
		 * The meta object literal for the '<em><b>Socialnetworkcontent</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEB_PAGE__SOCIALNETWORKCONTENT = eINSTANCE.getWebPage_Socialnetworkcontent();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_PAGE__NAME = eINSTANCE.getWebPage_Name();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_PAGE__TITLE = eINSTANCE.getWebPage_Title();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_PAGE__DESCRIPTION = eINSTANCE.getWebPage_Description();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEB_PAGE__ELEMENTS = eINSTANCE.getWebPage_Elements();

		/**
		 * The meta object literal for the '<em><b>Outgoing</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEB_PAGE__OUTGOING = eINSTANCE.getWebPage_Outgoing();

		/**
		 * The meta object literal for the '<em><b>Incoming</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEB_PAGE__INCOMING = eINSTANCE.getWebPage_Incoming();

		/**
		 * The meta object literal for the '<em><b>Role</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEB_PAGE__ROLE = eINSTANCE.getWebPage_Role();

		/**
		 * The meta object literal for the '<em><b>External Link</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_PAGE__EXTERNAL_LINK = eINSTANCE.getWebPage_ExternalLink();

		/**
		 * The meta object literal for the '{@link WebDevProjectMM.impl.SocialNetworkContentImpl <em>Social Network Content</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see WebDevProjectMM.impl.SocialNetworkContentImpl
		 * @see WebDevProjectMM.impl.WebDevProjectMMPackageImpl#getSocialNetworkContent()
		 * @generated
		 */
		EClass SOCIAL_NETWORK_CONTENT = eINSTANCE.getSocialNetworkContent();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOCIAL_NETWORK_CONTENT__PARAMETERS = eINSTANCE.getSocialNetworkContent_Parameters();

		/**
		 * The meta object literal for the '<em><b>Social Network Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOCIAL_NETWORK_CONTENT__SOCIAL_NETWORK_TYPE = eINSTANCE.getSocialNetworkContent_SocialNetworkType();

		/**
		 * The meta object literal for the '{@link WebDevProjectMM.impl.RegularContentPageImpl <em>Regular Content Page</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see WebDevProjectMM.impl.RegularContentPageImpl
		 * @see WebDevProjectMM.impl.WebDevProjectMMPackageImpl#getRegularContentPage()
		 * @generated
		 */
		EClass REGULAR_CONTENT_PAGE = eINSTANCE.getRegularContentPage();

		/**
		 * The meta object literal for the '{@link WebDevProjectMM.impl.FormImpl <em>Form</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see WebDevProjectMM.impl.FormImpl
		 * @see WebDevProjectMM.impl.WebDevProjectMMPackageImpl#getForm()
		 * @generated
		 */
		EClass FORM = eINSTANCE.getForm();

		/**
		 * The meta object literal for the '<em><b>Questions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORM__QUESTIONS = eINSTANCE.getForm_Questions();

		/**
		 * The meta object literal for the '<em><b>Form Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORM__FORM_TYPE = eINSTANCE.getForm_FormType();

		/**
		 * The meta object literal for the '<em><b>Num TF Questions</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORM__NUM_TF_QUESTIONS = eINSTANCE.getForm_NumTFQuestions();

		/**
		 * The meta object literal for the '<em><b>Num MC Questions</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORM__NUM_MC_QUESTIONS = eINSTANCE.getForm_NumMCQuestions();

		/**
		 * The meta object literal for the '{@link WebDevProjectMM.impl.QuestionImpl <em>Question</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see WebDevProjectMM.impl.QuestionImpl
		 * @see WebDevProjectMM.impl.WebDevProjectMMPackageImpl#getQuestion()
		 * @generated
		 */
		EClass QUESTION = eINSTANCE.getQuestion();

		/**
		 * The meta object literal for the '{@link WebDevProjectMM.impl.StoredQuestionImpl <em>Stored Question</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see WebDevProjectMM.impl.StoredQuestionImpl
		 * @see WebDevProjectMM.impl.WebDevProjectMMPackageImpl#getStoredQuestion()
		 * @generated
		 */
		EClass STORED_QUESTION = eINSTANCE.getStoredQuestion();

		/**
		 * The meta object literal for the '<em><b>Desc Question Definition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STORED_QUESTION__DESC_QUESTION_DEFINITION = eINSTANCE.getStoredQuestion_DescQuestionDefinition();

		/**
		 * The meta object literal for the '<em><b>Definition Of Question</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STORED_QUESTION__DEFINITION_OF_QUESTION = eINSTANCE.getStoredQuestion_DefinitionOfQuestion();

		/**
		 * The meta object literal for the '{@link WebDevProjectMM.impl.QuestionsRepoImpl <em>Questions Repo</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see WebDevProjectMM.impl.QuestionsRepoImpl
		 * @see WebDevProjectMM.impl.WebDevProjectMMPackageImpl#getQuestionsRepo()
		 * @generated
		 */
		EClass QUESTIONS_REPO = eINSTANCE.getQuestionsRepo();

		/**
		 * The meta object literal for the '<em><b>Question Definitions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUESTIONS_REPO__QUESTION_DEFINITIONS = eINSTANCE.getQuestionsRepo_QuestionDefinitions();

		/**
		 * The meta object literal for the '{@link WebDevProjectMM.impl.QuestionDefinitionImpl <em>Question Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see WebDevProjectMM.impl.QuestionDefinitionImpl
		 * @see WebDevProjectMM.impl.WebDevProjectMMPackageImpl#getQuestionDefinition()
		 * @generated
		 */
		EClass QUESTION_DEFINITION = eINSTANCE.getQuestionDefinition();

		/**
		 * The meta object literal for the '<em><b>Possible Asnwer</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUESTION_DEFINITION__POSSIBLE_ASNWER = eINSTANCE.getQuestionDefinition_PossibleAsnwer();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUESTION_DEFINITION__DESCRIPTION = eINSTANCE.getQuestionDefinition_Description();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUESTION_DEFINITION__TYPE = eINSTANCE.getQuestionDefinition_Type();

		/**
		 * The meta object literal for the '<em><b>Correct Answer</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUESTION_DEFINITION__CORRECT_ANSWER = eINSTANCE.getQuestionDefinition_CorrectAnswer();

		/**
		 * The meta object literal for the '{@link WebDevProjectMM.impl.PossibleAsnwerImpl <em>Possible Asnwer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see WebDevProjectMM.impl.PossibleAsnwerImpl
		 * @see WebDevProjectMM.impl.WebDevProjectMMPackageImpl#getPossibleAsnwer()
		 * @generated
		 */
		EClass POSSIBLE_ASNWER = eINSTANCE.getPossibleAsnwer();

		/**
		 * The meta object literal for the '<em><b>Answer Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POSSIBLE_ASNWER__ANSWER_TEXT = eINSTANCE.getPossibleAsnwer_AnswerText();

		/**
		 * The meta object literal for the '{@link WebDevProjectMM.impl.ElementsImpl <em>Elements</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see WebDevProjectMM.impl.ElementsImpl
		 * @see WebDevProjectMM.impl.WebDevProjectMMPackageImpl#getElements()
		 * @generated
		 */
		EClass ELEMENTS = eINSTANCE.getElements();

		/**
		 * The meta object literal for the '{@link WebDevProjectMM.impl.TextImpl <em>Text</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see WebDevProjectMM.impl.TextImpl
		 * @see WebDevProjectMM.impl.WebDevProjectMMPackageImpl#getText()
		 * @generated
		 */
		EClass TEXT = eINSTANCE.getText();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT__TEXT = eINSTANCE.getText_Text();

		/**
		 * The meta object literal for the '{@link WebDevProjectMM.impl.DatabaseImpl <em>Database</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see WebDevProjectMM.impl.DatabaseImpl
		 * @see WebDevProjectMM.impl.WebDevProjectMMPackageImpl#getDatabase()
		 * @generated
		 */
		EClass DATABASE = eINSTANCE.getDatabase();

		/**
		 * The meta object literal for the '<em><b>Entities</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATABASE__ENTITIES = eINSTANCE.getDatabase_Entities();

		/**
		 * The meta object literal for the '{@link WebDevProjectMM.impl.EntityImpl <em>Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see WebDevProjectMM.impl.EntityImpl
		 * @see WebDevProjectMM.impl.WebDevProjectMMPackageImpl#getEntity()
		 * @generated
		 */
		EClass ENTITY = eINSTANCE.getEntity();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY__ATTRIBUTES = eINSTANCE.getEntity_Attributes();

		/**
		 * The meta object literal for the '<em><b>Refers To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY__REFERS_TO = eINSTANCE.getEntity_RefersTo();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY__ID = eINSTANCE.getEntity_Id();

		/**
		 * The meta object literal for the '<em><b>Primary key</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY__PRIMARY_KEY = eINSTANCE.getEntity_Primary_key();

		/**
		 * The meta object literal for the '{@link WebDevProjectMM.impl.AttributeImpl <em>Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see WebDevProjectMM.impl.AttributeImpl
		 * @see WebDevProjectMM.impl.WebDevProjectMMPackageImpl#getAttribute()
		 * @generated
		 */
		EClass ATTRIBUTE = eINSTANCE.getAttribute();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__NAME = eINSTANCE.getAttribute_Name();

		/**
		 * The meta object literal for the '<em><b>Attribute Primitive Data Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__ATTRIBUTE_PRIMITIVE_DATA_TYPE = eINSTANCE.getAttribute_AttributePrimitiveData_Type();

		/**
		 * The meta object literal for the '{@link WebDevProjectMM.impl.PageLinkImpl <em>Page Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see WebDevProjectMM.impl.PageLinkImpl
		 * @see WebDevProjectMM.impl.WebDevProjectMMPackageImpl#getPageLink()
		 * @generated
		 */
		EClass PAGE_LINK = eINSTANCE.getPageLink();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAGE_LINK__SOURCE = eINSTANCE.getPageLink_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAGE_LINK__TARGET = eINSTANCE.getPageLink_Target();

		/**
		 * The meta object literal for the '{@link WebDevProjectMM.impl.MediaContentImpl <em>Media Content</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see WebDevProjectMM.impl.MediaContentImpl
		 * @see WebDevProjectMM.impl.WebDevProjectMMPackageImpl#getMediaContent()
		 * @generated
		 */
		EClass MEDIA_CONTENT = eINSTANCE.getMediaContent();

		/**
		 * The meta object literal for the '<em><b>Link</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEDIA_CONTENT__LINK = eINSTANCE.getMediaContent_Link();

		/**
		 * The meta object literal for the '{@link WebDevProjectMM.impl.CRUDPageImpl <em>CRUD Page</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see WebDevProjectMM.impl.CRUDPageImpl
		 * @see WebDevProjectMM.impl.WebDevProjectMMPackageImpl#getCRUDPage()
		 * @generated
		 */
		EClass CRUD_PAGE = eINSTANCE.getCRUDPage();

		/**
		 * The meta object literal for the '<em><b>Entity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CRUD_PAGE__ENTITY = eINSTANCE.getCRUDPage_Entity();

		/**
		 * The meta object literal for the '{@link WebDevProjectMM.impl.CreationCRUDImpl <em>Creation CRUD</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see WebDevProjectMM.impl.CreationCRUDImpl
		 * @see WebDevProjectMM.impl.WebDevProjectMMPackageImpl#getCreationCRUD()
		 * @generated
		 */
		EClass CREATION_CRUD = eINSTANCE.getCreationCRUD();

		/**
		 * The meta object literal for the '{@link WebDevProjectMM.impl.DelitionCRUDImpl <em>Delition CRUD</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see WebDevProjectMM.impl.DelitionCRUDImpl
		 * @see WebDevProjectMM.impl.WebDevProjectMMPackageImpl#getDelitionCRUD()
		 * @generated
		 */
		EClass DELITION_CRUD = eINSTANCE.getDelitionCRUD();

		/**
		 * The meta object literal for the '{@link WebDevProjectMM.impl.AllCRUDImpl <em>All CRUD</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see WebDevProjectMM.impl.AllCRUDImpl
		 * @see WebDevProjectMM.impl.WebDevProjectMMPackageImpl#getAllCRUD()
		 * @generated
		 */
		EClass ALL_CRUD = eINSTANCE.getAllCRUD();

		/**
		 * The meta object literal for the '{@link WebDevProjectMM.impl.IndexCRUDImpl <em>Index CRUD</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see WebDevProjectMM.impl.IndexCRUDImpl
		 * @see WebDevProjectMM.impl.WebDevProjectMMPackageImpl#getIndexCRUD()
		 * @generated
		 */
		EClass INDEX_CRUD = eINSTANCE.getIndexCRUD();

		/**
		 * The meta object literal for the '{@link WebDevProjectMM.impl.DetailCRUDImpl <em>Detail CRUD</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see WebDevProjectMM.impl.DetailCRUDImpl
		 * @see WebDevProjectMM.impl.WebDevProjectMMPackageImpl#getDetailCRUD()
		 * @generated
		 */
		EClass DETAIL_CRUD = eINSTANCE.getDetailCRUD();

		/**
		 * The meta object literal for the '{@link WebDevProjectMM.QuestionType <em>Question Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see WebDevProjectMM.QuestionType
		 * @see WebDevProjectMM.impl.WebDevProjectMMPackageImpl#getQuestionType()
		 * @generated
		 */
		EEnum QUESTION_TYPE = eINSTANCE.getQuestionType();

		/**
		 * The meta object literal for the '{@link WebDevProjectMM.AttributePrimitiveData_Type <em>Attribute Primitive Data Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see WebDevProjectMM.AttributePrimitiveData_Type
		 * @see WebDevProjectMM.impl.WebDevProjectMMPackageImpl#getAttributePrimitiveData_Type()
		 * @generated
		 */
		EEnum ATTRIBUTE_PRIMITIVE_DATA_TYPE = eINSTANCE.getAttributePrimitiveData_Type();

		/**
		 * The meta object literal for the '{@link WebDevProjectMM.SocialNetwork_Type <em>Social Network Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see WebDevProjectMM.SocialNetwork_Type
		 * @see WebDevProjectMM.impl.WebDevProjectMMPackageImpl#getSocialNetwork_Type()
		 * @generated
		 */
		EEnum SOCIAL_NETWORK_TYPE = eINSTANCE.getSocialNetwork_Type();

		/**
		 * The meta object literal for the '{@link WebDevProjectMM.Form_Type <em>Form Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see WebDevProjectMM.Form_Type
		 * @see WebDevProjectMM.impl.WebDevProjectMMPackageImpl#getForm_Type()
		 * @generated
		 */
		EEnum FORM_TYPE = eINSTANCE.getForm_Type();

	}

} //WebDevProjectMMPackage
