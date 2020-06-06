/**
 */
package WebDevProjectMM.impl;

import WebDevProjectMM.AllCRUD;
import WebDevProjectMM.Attribute;
import WebDevProjectMM.AttributePrimitiveData_Type;
import WebDevProjectMM.CRUDPage;
import WebDevProjectMM.CreationCRUD;
import WebDevProjectMM.Database;
import WebDevProjectMM.DelitionCRUD;
import WebDevProjectMM.DetailCRUD;
import WebDevProjectMM.Elements;
import WebDevProjectMM.Entity;
import WebDevProjectMM.Form;
import WebDevProjectMM.Form_Type;
import WebDevProjectMM.IndexCRUD;
import WebDevProjectMM.MediaContent;
import WebDevProjectMM.PageLink;
import WebDevProjectMM.PossibleAsnwer;
import WebDevProjectMM.Question;
import WebDevProjectMM.QuestionDefinition;
import WebDevProjectMM.QuestionType;
import WebDevProjectMM.QuestionsRepo;
import WebDevProjectMM.RegularContentPage;
import WebDevProjectMM.Role;
import WebDevProjectMM.SocialNetworkContent;
import WebDevProjectMM.SocialNetwork_Type;
import WebDevProjectMM.StoredQuestion;
import WebDevProjectMM.Text;
import WebDevProjectMM.WebDevProjectMMFactory;
import WebDevProjectMM.WebDevProjectMMPackage;
import WebDevProjectMM.WebPage;
import WebDevProjectMM.WebSite;

import WebDevProjectMM.util.WebDevProjectMMValidator;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class WebDevProjectMMPackageImpl extends EPackageImpl implements WebDevProjectMMPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass webSiteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass webPageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass socialNetworkContentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass regularContentPageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass formEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass questionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass storedQuestionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass questionsRepoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass questionDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass possibleAsnwerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elementsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass textEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass databaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pageLinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mediaContentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass crudPageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass creationCRUDEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass delitionCRUDEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass allCRUDEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass indexCRUDEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass detailCRUDEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum questionTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum attributePrimitiveData_TypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum socialNetwork_TypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum form_TypeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see WebDevProjectMM.WebDevProjectMMPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private WebDevProjectMMPackageImpl() {
		super(eNS_URI, WebDevProjectMMFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link WebDevProjectMMPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static WebDevProjectMMPackage init() {
		if (isInited) return (WebDevProjectMMPackage)EPackage.Registry.INSTANCE.getEPackage(WebDevProjectMMPackage.eNS_URI);

		// Obtain or create and register package
		WebDevProjectMMPackageImpl theWebDevProjectMMPackage = (WebDevProjectMMPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof WebDevProjectMMPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new WebDevProjectMMPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theWebDevProjectMMPackage.createPackageContents();

		// Initialize created meta-data
		theWebDevProjectMMPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theWebDevProjectMMPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return WebDevProjectMMValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theWebDevProjectMMPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(WebDevProjectMMPackage.eNS_URI, theWebDevProjectMMPackage);
		return theWebDevProjectMMPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRole() {
		return roleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRole_Name() {
		return (EAttribute)roleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRole_NumAccesiblePages() {
		return (EAttribute)roleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRole_Webpage() {
		return (EReference)roleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWebSite() {
		return webSiteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWebSite_Roles() {
		return (EReference)webSiteEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWebSite_WebPages() {
		return (EReference)webSiteEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWebSite_Name() {
		return (EAttribute)webSiteEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWebSite_Title() {
		return (EAttribute)webSiteEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWebSite_Description() {
		return (EAttribute)webSiteEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWebSite_URL() {
		return (EAttribute)webSiteEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWebSite_Link() {
		return (EReference)webSiteEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWebPage() {
		return webPageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWebPage_Socialnetworkcontent() {
		return (EReference)webPageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWebPage_Name() {
		return (EAttribute)webPageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWebPage_Title() {
		return (EAttribute)webPageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWebPage_Description() {
		return (EAttribute)webPageEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWebPage_Elements() {
		return (EReference)webPageEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWebPage_Outgoing() {
		return (EReference)webPageEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWebPage_Incoming() {
		return (EReference)webPageEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWebPage_Role() {
		return (EReference)webPageEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWebPage_ExternalLink() {
		return (EAttribute)webPageEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSocialNetworkContent() {
		return socialNetworkContentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSocialNetworkContent_Parameters() {
		return (EAttribute)socialNetworkContentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSocialNetworkContent_SocialNetworkType() {
		return (EAttribute)socialNetworkContentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRegularContentPage() {
		return regularContentPageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getForm() {
		return formEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getForm_Questions() {
		return (EReference)formEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getForm_FormType() {
		return (EAttribute)formEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getForm_NumTFQuestions() {
		return (EAttribute)formEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getForm_NumMCQuestions() {
		return (EAttribute)formEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQuestion() {
		return questionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStoredQuestion() {
		return storedQuestionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStoredQuestion_DescQuestionDefinition() {
		return (EAttribute)storedQuestionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStoredQuestion_DefinitionOfQuestion() {
		return (EReference)storedQuestionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQuestionsRepo() {
		return questionsRepoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuestionsRepo_QuestionDefinitions() {
		return (EReference)questionsRepoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQuestionDefinition() {
		return questionDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuestionDefinition_PossibleAsnwer() {
		return (EReference)questionDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQuestionDefinition_Description() {
		return (EAttribute)questionDefinitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQuestionDefinition_Type() {
		return (EAttribute)questionDefinitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuestionDefinition_CorrectAnswer() {
		return (EReference)questionDefinitionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPossibleAsnwer() {
		return possibleAsnwerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPossibleAsnwer_AnswerText() {
		return (EAttribute)possibleAsnwerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElements() {
		return elementsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getText() {
		return textEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getText_Text() {
		return (EAttribute)textEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDatabase() {
		return databaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDatabase_Entities() {
		return (EReference)databaseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEntity() {
		return entityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntity_Attributes() {
		return (EReference)entityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntity_RefersTo() {
		return (EReference)entityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntity_Id() {
		return (EAttribute)entityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntity_Primary_key() {
		return (EReference)entityEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttribute() {
		return attributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttribute_Name() {
		return (EAttribute)attributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttribute_AttributePrimitiveData_Type() {
		return (EAttribute)attributeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPageLink() {
		return pageLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPageLink_Source() {
		return (EReference)pageLinkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPageLink_Target() {
		return (EReference)pageLinkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMediaContent() {
		return mediaContentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMediaContent_Link() {
		return (EAttribute)mediaContentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCRUDPage() {
		return crudPageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCRUDPage_Entity() {
		return (EReference)crudPageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCreationCRUD() {
		return creationCRUDEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDelitionCRUD() {
		return delitionCRUDEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAllCRUD() {
		return allCRUDEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIndexCRUD() {
		return indexCRUDEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDetailCRUD() {
		return detailCRUDEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getQuestionType() {
		return questionTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAttributePrimitiveData_Type() {
		return attributePrimitiveData_TypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSocialNetwork_Type() {
		return socialNetwork_TypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getForm_Type() {
		return form_TypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WebDevProjectMMFactory getWebDevProjectMMFactory() {
		return (WebDevProjectMMFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		roleEClass = createEClass(ROLE);
		createEAttribute(roleEClass, ROLE__NAME);
		createEAttribute(roleEClass, ROLE__NUM_ACCESIBLE_PAGES);
		createEReference(roleEClass, ROLE__WEBPAGE);

		webSiteEClass = createEClass(WEB_SITE);
		createEReference(webSiteEClass, WEB_SITE__ROLES);
		createEReference(webSiteEClass, WEB_SITE__WEB_PAGES);
		createEAttribute(webSiteEClass, WEB_SITE__NAME);
		createEAttribute(webSiteEClass, WEB_SITE__TITLE);
		createEAttribute(webSiteEClass, WEB_SITE__DESCRIPTION);
		createEAttribute(webSiteEClass, WEB_SITE__URL);
		createEReference(webSiteEClass, WEB_SITE__LINK);

		webPageEClass = createEClass(WEB_PAGE);
		createEReference(webPageEClass, WEB_PAGE__SOCIALNETWORKCONTENT);
		createEAttribute(webPageEClass, WEB_PAGE__NAME);
		createEAttribute(webPageEClass, WEB_PAGE__TITLE);
		createEAttribute(webPageEClass, WEB_PAGE__DESCRIPTION);
		createEReference(webPageEClass, WEB_PAGE__ELEMENTS);
		createEReference(webPageEClass, WEB_PAGE__OUTGOING);
		createEReference(webPageEClass, WEB_PAGE__INCOMING);
		createEReference(webPageEClass, WEB_PAGE__ROLE);
		createEAttribute(webPageEClass, WEB_PAGE__EXTERNAL_LINK);

		socialNetworkContentEClass = createEClass(SOCIAL_NETWORK_CONTENT);
		createEAttribute(socialNetworkContentEClass, SOCIAL_NETWORK_CONTENT__PARAMETERS);
		createEAttribute(socialNetworkContentEClass, SOCIAL_NETWORK_CONTENT__SOCIAL_NETWORK_TYPE);

		regularContentPageEClass = createEClass(REGULAR_CONTENT_PAGE);

		formEClass = createEClass(FORM);
		createEReference(formEClass, FORM__QUESTIONS);
		createEAttribute(formEClass, FORM__FORM_TYPE);
		createEAttribute(formEClass, FORM__NUM_TF_QUESTIONS);
		createEAttribute(formEClass, FORM__NUM_MC_QUESTIONS);

		questionEClass = createEClass(QUESTION);

		storedQuestionEClass = createEClass(STORED_QUESTION);
		createEAttribute(storedQuestionEClass, STORED_QUESTION__DESC_QUESTION_DEFINITION);
		createEReference(storedQuestionEClass, STORED_QUESTION__DEFINITION_OF_QUESTION);

		questionsRepoEClass = createEClass(QUESTIONS_REPO);
		createEReference(questionsRepoEClass, QUESTIONS_REPO__QUESTION_DEFINITIONS);

		questionDefinitionEClass = createEClass(QUESTION_DEFINITION);
		createEReference(questionDefinitionEClass, QUESTION_DEFINITION__POSSIBLE_ASNWER);
		createEAttribute(questionDefinitionEClass, QUESTION_DEFINITION__DESCRIPTION);
		createEAttribute(questionDefinitionEClass, QUESTION_DEFINITION__TYPE);
		createEReference(questionDefinitionEClass, QUESTION_DEFINITION__CORRECT_ANSWER);

		possibleAsnwerEClass = createEClass(POSSIBLE_ASNWER);
		createEAttribute(possibleAsnwerEClass, POSSIBLE_ASNWER__ANSWER_TEXT);

		elementsEClass = createEClass(ELEMENTS);

		textEClass = createEClass(TEXT);
		createEAttribute(textEClass, TEXT__TEXT);

		databaseEClass = createEClass(DATABASE);
		createEReference(databaseEClass, DATABASE__ENTITIES);

		entityEClass = createEClass(ENTITY);
		createEReference(entityEClass, ENTITY__ATTRIBUTES);
		createEReference(entityEClass, ENTITY__REFERS_TO);
		createEAttribute(entityEClass, ENTITY__ID);
		createEReference(entityEClass, ENTITY__PRIMARY_KEY);

		attributeEClass = createEClass(ATTRIBUTE);
		createEAttribute(attributeEClass, ATTRIBUTE__NAME);
		createEAttribute(attributeEClass, ATTRIBUTE__ATTRIBUTE_PRIMITIVE_DATA_TYPE);

		pageLinkEClass = createEClass(PAGE_LINK);
		createEReference(pageLinkEClass, PAGE_LINK__SOURCE);
		createEReference(pageLinkEClass, PAGE_LINK__TARGET);

		mediaContentEClass = createEClass(MEDIA_CONTENT);
		createEAttribute(mediaContentEClass, MEDIA_CONTENT__LINK);

		crudPageEClass = createEClass(CRUD_PAGE);
		createEReference(crudPageEClass, CRUD_PAGE__ENTITY);

		creationCRUDEClass = createEClass(CREATION_CRUD);

		delitionCRUDEClass = createEClass(DELITION_CRUD);

		allCRUDEClass = createEClass(ALL_CRUD);

		indexCRUDEClass = createEClass(INDEX_CRUD);

		detailCRUDEClass = createEClass(DETAIL_CRUD);

		// Create enums
		questionTypeEEnum = createEEnum(QUESTION_TYPE);
		attributePrimitiveData_TypeEEnum = createEEnum(ATTRIBUTE_PRIMITIVE_DATA_TYPE);
		socialNetwork_TypeEEnum = createEEnum(SOCIAL_NETWORK_TYPE);
		form_TypeEEnum = createEEnum(FORM_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		regularContentPageEClass.getESuperTypes().add(this.getWebPage());
		formEClass.getESuperTypes().add(this.getWebPage());
		storedQuestionEClass.getESuperTypes().add(this.getQuestion());
		questionDefinitionEClass.getESuperTypes().add(this.getQuestion());
		textEClass.getESuperTypes().add(this.getElements());
		mediaContentEClass.getESuperTypes().add(this.getElements());
		crudPageEClass.getESuperTypes().add(this.getWebPage());
		creationCRUDEClass.getESuperTypes().add(this.getCRUDPage());
		delitionCRUDEClass.getESuperTypes().add(this.getCRUDPage());
		allCRUDEClass.getESuperTypes().add(this.getCRUDPage());
		indexCRUDEClass.getESuperTypes().add(this.getCRUDPage());
		detailCRUDEClass.getESuperTypes().add(this.getCRUDPage());

		// Initialize classes and features; add operations and parameters
		initEClass(roleEClass, Role.class, "Role", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRole_Name(), ecorePackage.getEString(), "name", null, 1, 1, Role.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRole_NumAccesiblePages(), ecorePackage.getEBigInteger(), "numAccesiblePages", null, 1, 1, Role.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getRole_Webpage(), this.getWebPage(), this.getWebPage_Role(), "webpage", null, 1, -1, Role.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(webSiteEClass, WebSite.class, "WebSite", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWebSite_Roles(), this.getRole(), null, "roles", null, 1, -1, WebSite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWebSite_WebPages(), this.getWebPage(), null, "webPages", null, 1, -1, WebSite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWebSite_Name(), ecorePackage.getEString(), "name", null, 1, 1, WebSite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWebSite_Title(), ecorePackage.getEString(), "title", null, 1, 1, WebSite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWebSite_Description(), ecorePackage.getEString(), "description", null, 1, 1, WebSite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWebSite_URL(), ecorePackage.getEString(), "URL", null, 1, 1, WebSite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWebSite_Link(), this.getPageLink(), null, "link", null, 0, -1, WebSite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(webPageEClass, WebPage.class, "WebPage", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWebPage_Socialnetworkcontent(), this.getSocialNetworkContent(), null, "socialnetworkcontent", null, 0, -1, WebPage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWebPage_Name(), ecorePackage.getEString(), "name", null, 1, 1, WebPage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWebPage_Title(), ecorePackage.getEString(), "title", null, 1, 1, WebPage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWebPage_Description(), ecorePackage.getEString(), "description", null, 1, 1, WebPage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWebPage_Elements(), this.getElements(), null, "elements", null, 0, -1, WebPage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWebPage_Outgoing(), this.getPageLink(), this.getPageLink_Source(), "outgoing", null, 0, -1, WebPage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWebPage_Incoming(), this.getPageLink(), this.getPageLink_Target(), "incoming", null, 0, -1, WebPage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWebPage_Role(), this.getRole(), this.getRole_Webpage(), "role", null, 0, -1, WebPage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWebPage_ExternalLink(), ecorePackage.getEString(), "externalLink", null, 0, -1, WebPage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(socialNetworkContentEClass, SocialNetworkContent.class, "SocialNetworkContent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSocialNetworkContent_Parameters(), ecorePackage.getEString(), "parameters", null, 1, 1, SocialNetworkContent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSocialNetworkContent_SocialNetworkType(), this.getSocialNetwork_Type(), "socialNetworkType", null, 1, 1, SocialNetworkContent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(regularContentPageEClass, RegularContentPage.class, "RegularContentPage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(formEClass, Form.class, "Form", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getForm_Questions(), this.getQuestion(), null, "questions", null, 1, -1, Form.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getForm_FormType(), this.getForm_Type(), "formType", null, 1, 1, Form.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getForm_NumTFQuestions(), ecorePackage.getEBigInteger(), "numTFQuestions", null, 1, 1, Form.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getForm_NumMCQuestions(), ecorePackage.getEBigInteger(), "numMCQuestions", null, 1, 1, Form.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(questionEClass, Question.class, "Question", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(storedQuestionEClass, StoredQuestion.class, "StoredQuestion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStoredQuestion_DescQuestionDefinition(), ecorePackage.getEString(), "descQuestionDefinition", null, 1, 1, StoredQuestion.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getStoredQuestion_DefinitionOfQuestion(), this.getQuestionDefinition(), null, "definitionOfQuestion", null, 1, 1, StoredQuestion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(questionsRepoEClass, QuestionsRepo.class, "QuestionsRepo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getQuestionsRepo_QuestionDefinitions(), this.getQuestionDefinition(), null, "questionDefinitions", null, 0, -1, QuestionsRepo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(questionDefinitionEClass, QuestionDefinition.class, "QuestionDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getQuestionDefinition_PossibleAsnwer(), this.getPossibleAsnwer(), null, "possibleAsnwer", null, 0, -1, QuestionDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQuestionDefinition_Description(), ecorePackage.getEString(), "description", null, 1, 1, QuestionDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQuestionDefinition_Type(), this.getQuestionType(), "type", null, 1, 1, QuestionDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQuestionDefinition_CorrectAnswer(), this.getPossibleAsnwer(), null, "correctAnswer", null, 0, -1, QuestionDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(possibleAsnwerEClass, PossibleAsnwer.class, "PossibleAsnwer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPossibleAsnwer_AnswerText(), ecorePackage.getEString(), "answerText", null, 1, 1, PossibleAsnwer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(elementsEClass, Elements.class, "Elements", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(textEClass, Text.class, "Text", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getText_Text(), ecorePackage.getEString(), "text", null, 1, 1, Text.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(databaseEClass, Database.class, "Database", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDatabase_Entities(), this.getEntity(), null, "entities", null, 0, -1, Database.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(entityEClass, Entity.class, "Entity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEntity_Attributes(), this.getAttribute(), null, "attributes", null, 1, -1, Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntity_RefersTo(), this.getEntity(), null, "refersTo", null, 0, -1, Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEntity_Id(), ecorePackage.getEString(), "id", null, 1, 1, Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntity_Primary_key(), this.getAttribute(), null, "primary_key", null, 1, 1, Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attributeEClass, Attribute.class, "Attribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAttribute_Name(), ecorePackage.getEString(), "name", null, 1, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttribute_AttributePrimitiveData_Type(), this.getAttributePrimitiveData_Type(), "attributePrimitiveData_Type", null, 1, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pageLinkEClass, PageLink.class, "PageLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPageLink_Source(), this.getWebPage(), this.getWebPage_Outgoing(), "source", null, 1, 1, PageLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPageLink_Target(), this.getWebPage(), this.getWebPage_Incoming(), "target", null, 1, 1, PageLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mediaContentEClass, MediaContent.class, "MediaContent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMediaContent_Link(), ecorePackage.getEString(), "link", null, 1, 1, MediaContent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(crudPageEClass, CRUDPage.class, "CRUDPage", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCRUDPage_Entity(), this.getEntity(), null, "entity", null, 1, 1, CRUDPage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(creationCRUDEClass, CreationCRUD.class, "CreationCRUD", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(delitionCRUDEClass, DelitionCRUD.class, "DelitionCRUD", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(allCRUDEClass, AllCRUD.class, "AllCRUD", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(indexCRUDEClass, IndexCRUD.class, "IndexCRUD", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(detailCRUDEClass, DetailCRUD.class, "DetailCRUD", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(questionTypeEEnum, QuestionType.class, "QuestionType");
		addEEnumLiteral(questionTypeEEnum, QuestionType.MULTIPLE_CHOICE);
		addEEnumLiteral(questionTypeEEnum, QuestionType.TRUE_FALSE);
		addEEnumLiteral(questionTypeEEnum, QuestionType.SHORT_QUESTION);

		initEEnum(attributePrimitiveData_TypeEEnum, AttributePrimitiveData_Type.class, "AttributePrimitiveData_Type");
		addEEnumLiteral(attributePrimitiveData_TypeEEnum, AttributePrimitiveData_Type.REAL);
		addEEnumLiteral(attributePrimitiveData_TypeEEnum, AttributePrimitiveData_Type.INTEGER);
		addEEnumLiteral(attributePrimitiveData_TypeEEnum, AttributePrimitiveData_Type.BOOLEAN);
		addEEnumLiteral(attributePrimitiveData_TypeEEnum, AttributePrimitiveData_Type.STRING);

		initEEnum(socialNetwork_TypeEEnum, SocialNetwork_Type.class, "SocialNetwork_Type");
		addEEnumLiteral(socialNetwork_TypeEEnum, SocialNetwork_Type.TWITTER);
		addEEnumLiteral(socialNetwork_TypeEEnum, SocialNetwork_Type.RSS);

		initEEnum(form_TypeEEnum, Form_Type.class, "Form_Type");
		addEEnumLiteral(form_TypeEEnum, Form_Type.SURVEY);
		addEEnumLiteral(form_TypeEEnum, Form_Type.QUESTIONNAIRE);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/OCL/Import
		createImportAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// gmf
		createGmfAnnotations();
		// gmf.node
		createGmf_1Annotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot
		createPivotAnnotations();
		// gmf.link
		createGmf_2Annotations();
		// gmf.diagram
		createGmf_3Annotations();
		// gmf.compartment
		createGmf_4Annotations();
		// gmf.affixed
		createGmf_5Annotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/OCL/Import</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createImportAnnotations() {
		String source = "http://www.eclipse.org/OCL/Import";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "ecore", "http://www.eclipse.org/emf/2002/Ecore"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "invocationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
			 "settingDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
			 "validationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot"
		   });	
		addAnnotation
		  (webSiteEClass, 
		   source, 
		   new String[] {
			 "constraints", "R6MustIncludeAtLeastOneQuestionnaire R6MustIncludeAtLeastOneSurvey"
		   });	
		addAnnotation
		  (webPageEClass, 
		   source, 
		   new String[] {
			 "constraints", "R2isolatedWebPage"
		   });	
		addAnnotation
		  (formEClass, 
		   source, 
		   new String[] {
			 "constraints", "R7AllQustionsInQuestionnaireHasCorrectAnswer"
		   });	
		addAnnotation
		  (questionDefinitionEClass, 
		   source, 
		   new String[] {
			 "constraints", "onlyItsOwnAnswers trueFalseAndShortQuestionHaveOnlyOneCorrectAnswer"
		   });	
		addAnnotation
		  (entityEClass, 
		   source, 
		   new String[] {
			 "constraints", "primaryKeyMustBeOwnAttribute canNotReferToItself"
		   });	
		addAnnotation
		  (pageLinkEClass, 
		   source, 
		   new String[] {
			 "constraints", "linkCanNotBeToItself"
		   });	
		addAnnotation
		  (allCRUDEClass, 
		   source, 
		   new String[] {
			 "constraints", "R3ALLCRUDImpliesNoOtherCRUD onlyOneCRUDOfEachTypeMax"
		   });	
		addAnnotation
		  (indexCRUDEClass, 
		   source, 
		   new String[] {
			 "constraints", "R4IndexImpliesDetail"
		   });	
		addAnnotation
		  (detailCRUDEClass, 
		   source, 
		   new String[] {
			 "constraints", "R4DetailImpliesIndex"
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmfAnnotations() {
		String source = "gmf";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.node</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_1Annotations() {
		String source = "gmf.node";	
		addAnnotation
		  (roleEClass, 
		   source, 
		   new String[] {
			 "figure", "svg",
			 "label", "name",
			 "svg.uri", "platform:/plugin/Project/figures/user.svg",
			 "label.icon", "false",
			 "label.placement", "external"
		   });	
		addAnnotation
		  (webPageEClass, 
		   source, 
		   new String[] {
			 "label", "name"
		   });	
		addAnnotation
		  (socialNetworkContentEClass, 
		   source, 
		   new String[] {
			 "label", "parameters",
			 "color", "203,223,189"
		   });	
		addAnnotation
		  (regularContentPageEClass, 
		   source, 
		   new String[] {
			 "label", "name",
			 "color", "246,244,210",
			 "label.icon", "false"
		   });	
		addAnnotation
		  (formEClass, 
		   source, 
		   new String[] {
			 "label", "name",
			 "color", "212,224,155"
		   });	
		addAnnotation
		  (storedQuestionEClass, 
		   source, 
		   new String[] {
			 "color", "143,192,169",
			 "label", "descQuestionDefinition"
		   });	
		addAnnotation
		  (questionDefinitionEClass, 
		   source, 
		   new String[] {
			 "label", "description",
			 "color", "104,176,171"
		   });	
		addAnnotation
		  (possibleAsnwerEClass, 
		   source, 
		   new String[] {
			 "label", "answerText",
			 "label.icon", "false"
		   });	
		addAnnotation
		  (textEClass, 
		   source, 
		   new String[] {
			 "label", "text",
			 "color", "241,156,121"
		   });	
		addAnnotation
		  (mediaContentEClass, 
		   source, 
		   new String[] {
			 "label", "link",
			 "color", "164,74,63"
		   });	
		addAnnotation
		  (creationCRUDEClass, 
		   source, 
		   new String[] {
			 "label.text", "CreationCRUD",
			 "color", "203,115,92"
		   });	
		addAnnotation
		  (delitionCRUDEClass, 
		   source, 
		   new String[] {
			 "label.text", "DelitionCRUD",
			 "color", "203,115,92"
		   });	
		addAnnotation
		  (allCRUDEClass, 
		   source, 
		   new String[] {
			 "label.text", "AllCRUD",
			 "color", "203,115,92"
		   });	
		addAnnotation
		  (indexCRUDEClass, 
		   source, 
		   new String[] {
			 "label.text", "IndexCRUD",
			 "color", "203,115,92"
		   });	
		addAnnotation
		  (detailCRUDEClass, 
		   source, 
		   new String[] {
			 "label.text", "DetailCRUD",
			 "color", "203,115,92"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createPivotAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot";	
		addAnnotation
		  (getRole_NumAccesiblePages(), 
		   source, 
		   new String[] {
			 "derivation", "self.webpage->size()"
		   });	
		addAnnotation
		  (webSiteEClass, 
		   source, 
		   new String[] {
			 "R6MustIncludeAtLeastOneQuestionnaire", "\n\t\t\tlet allForms : Collection(Form) = self.webPages->selectByKind(Form),\n\t\t\t\texistsAnyQuestionnaires : Boolean = allForms->exists(f : Form | f.formType = Form_Type::QUESTIONNAIRE)\n\t\t\tin\n\t\t\t\texistsAnyQuestionnaires",
			 "R6MustIncludeAtLeastOneSurvey", "\n\t\t\tlet allForms : Collection(Form) = self.webPages->selectByKind(Form),\n\t\t\t\texistsAnySurvey : Boolean = allForms->exists(f : Form | f.formType = Form_Type::SURVEY)\n\t\t\tin\n\t\t\t\texistsAnySurvey"
		   });	
		addAnnotation
		  (webPageEClass, 
		   source, 
		   new String[] {
			 "R2isolatedWebPage", "self.role->size() > 0 or self.incoming->size() > 0"
		   });	
		addAnnotation
		  (formEClass, 
		   source, 
		   new String[] {
			 "R7AllQustionsInQuestionnaireHasCorrectAnswer", "\n\t\t\t\t\tlet isQuestionnaire : Boolean = self.formType = Form_Type::QUESTIONNAIRE,\n\t\t\t\t\t\tallQuestionDefinitions : Collection(QuestionDefinition) = self.questions->selectByKind(QuestionDefinition),\n\t\t\t\t\t\tallQuestionDefinitionsHaveAnAnswer : Boolean = allQuestionDefinitions->forAll(q : QuestionDefinition | q.correctAnswer->size() > 0),\n\t\t\t\t\t\tallStoredQuestions : Collection(StoredQuestion) = self.questions->selectByKind(StoredQuestion),\n\t\t\t\t\t\tallStoredQuestionsHaveAnAnswer : Boolean = allStoredQuestions->forAll(q : StoredQuestion |  q.definitionOfQuestion.oclAsType(QuestionDefinition).correctAnswer->size() > 0)\n\t\t\t\t\tin\n\t\t\t\t\t\tisQuestionnaire implies\n\t\t\t\t\t\t(\n\t\t\t\t\t\t\t(allQuestionDefinitions->size() > 0 implies allQuestionDefinitionsHaveAnAnswer)\n\t\t\t\t\t\t\tand\n\t\t\t\t\t\t\t(allStoredQuestions->size() > 0 implies allStoredQuestionsHaveAnAnswer)\n\t\t\t\t\t\t)"
		   });	
		addAnnotation
		  (getForm_NumTFQuestions(), 
		   source, 
		   new String[] {
			 "derivation", "self.questions->select(q:Question|(q.oclIsKindOf(QuestionDefinition) and q.oclAsType(QuestionDefinition).type = QuestionType::TRUE_FALSE) or (q.oclIsKindOf(StoredQuestion) and q.oclAsType(StoredQuestion).definitionOfQuestion.type = QuestionType::TRUE_FALSE) )->size()"
		   });	
		addAnnotation
		  (getForm_NumMCQuestions(), 
		   source, 
		   new String[] {
			 "derivation", "self.questions->select(q:Question|(q.oclIsKindOf(QuestionDefinition) and q.oclAsType(QuestionDefinition).type = QuestionType::MULTIPLE_CHOICE) or (q.oclIsKindOf(StoredQuestion) and q.oclAsType(StoredQuestion).definitionOfQuestion.type = QuestionType::MULTIPLE_CHOICE) )->size()"
		   });	
		addAnnotation
		  (getStoredQuestion_DescQuestionDefinition(), 
		   source, 
		   new String[] {
			 "derivation", "if self.definitionOfQuestion->size() = 1 then self.definitionOfQuestion.description else \'\' endif"
		   });	
		addAnnotation
		  (questionDefinitionEClass, 
		   source, 
		   new String[] {
			 "onlyItsOwnAnswers", "self.correctAnswer->size() > 0 implies self.possibleAsnwer->includesAll(self.correctAnswer)",
			 "trueFalseAndShortQuestionHaveOnlyOneCorrectAnswer", "(self.type = QuestionType::TRUE_FALSE or self.type = QuestionType::SHORT_QUESTION) implies self.correctAnswer->size() < 2"
		   });	
		addAnnotation
		  (entityEClass, 
		   source, 
		   new String[] {
			 "primaryKeyMustBeOwnAttribute", "self.attributes->includes(self.primary_key)",
			 "canNotReferToItself", "not self.refersTo->includes(self)"
		   });	
		addAnnotation
		  (pageLinkEClass, 
		   source, 
		   new String[] {
			 "linkCanNotBeToItself", "self.source <> self.target"
		   });	
		addAnnotation
		  (allCRUDEClass, 
		   source, 
		   new String[] {
			 "R3ALLCRUDImpliesNoOtherCRUD", "\n\t\t\t\t\tlet allCRUDPages : Collection(CRUDPage) = self.oclContainer().oclAsType(WebSite).webPages->selectByKind(CRUDPage),\n\t\t\t\t\t\tentityCRUDPages : Collection(CRUDPage) = allCRUDPages->select(p : CRUDPage | p.entity = self.entity),\n\t\t\t\t\t\tnotALLCRUDTypePages : Collection(CRUDPage) = entityCRUDPages->select(p : CRUDPage | not p.oclIsKindOf(AllCRUD))\n\t\t\t\t\tin\n\t\t\t\t\t\tnotALLCRUDTypePages->size() = 0",
			 "onlyOneCRUDOfEachTypeMax", "\n\t\t\t\t\tlet allCRUDPages : Collection(CRUDPage) = self.oclContainer().oclAsType(WebSite).webPages->selectByKind(CRUDPage),\n\t\t\t\t\t\tentityCRUDPages : Collection(CRUDPage) = allCRUDPages->select(p : CRUDPage | p.entity = self.entity),\n\t\t\t\t\t\tAllCRUDTypePages : Collection(CRUDPage) = entityCRUDPages->selectByKind(AllCRUD),\n\t\t\t\t\t\tIndexCRUDTypePages : Collection(CRUDPage) = entityCRUDPages->selectByKind(IndexCRUD),\n\t\t\t\t\t\tDetailCRUDTypePages : Collection(CRUDPage) = entityCRUDPages->selectByKind(DetailCRUD),\n\t\t\t\t\t\tCreationCRUDTypePages : Collection(CRUDPage) = entityCRUDPages->selectByKind(CreationCRUD),\n\t\t\t\t\t\tDelitionCRUDTypePages : Collection(CRUDPage) = entityCRUDPages->selectByKind(DelitionCRUD)\n\t\t\t\t\tin\n\t\t\t\t\t\tAllCRUDTypePages->size() < 2 and\n\t\t\t\t\t\tDetailCRUDTypePages->size() < 2 and\n\t\t\t\t\t\tIndexCRUDTypePages->size() < 2 and\n\t\t\t\t\t\tCreationCRUDTypePages->size() < 2 and\n\t\t\t\t\t\tDelitionCRUDTypePages->size() < 2\n\t\t\t\t\t"
		   });	
		addAnnotation
		  (indexCRUDEClass, 
		   source, 
		   new String[] {
			 "R4IndexImpliesDetail", "\n\t\t\t\t\tlet allDetailPages : Collection(CRUDPage) = self.oclContainer().oclAsType(WebSite).webPages->selectByKind(DetailCRUD)\n\t\t\t\t\tin\n\t\t\t\t\t\tallDetailPages->exists(p : CRUDPage | p.entity = self.entity)"
		   });	
		addAnnotation
		  (detailCRUDEClass, 
		   source, 
		   new String[] {
			 "R4DetailImpliesIndex", "\n\t\t\t\t\tlet allIndexPages : Collection(CRUDPage) = self.oclContainer().oclAsType(WebSite).webPages->selectByKind(IndexCRUD)\n\t\t\t\t\tin\n\t\t\t\t\t\tallIndexPages->exists(p : CRUDPage | p.entity = self.entity)"
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.link</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_2Annotations() {
		String source = "gmf.link";	
		addAnnotation
		  (getRole_Webpage(), 
		   source, 
		   new String[] {
			 "target.decoration", "arrow",
			 "color", "178,178,178",
			 "style", "dot"
		   });	
		addAnnotation
		  (pageLinkEClass, 
		   source, 
		   new String[] {
			 "source", "source",
			 "target", "target",
			 "target.decoration", "filledclosedarrow",
			 "color", "0,0,0"
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.diagram</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_3Annotations() {
		String source = "gmf.diagram";	
		addAnnotation
		  (webSiteEClass, 
		   source, 
		   new String[] {
			 "label", "name"
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.compartment</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_4Annotations() {
		String source = "gmf.compartment";	
		addAnnotation
		  (getWebSite_Roles(), 
		   source, 
		   new String[] {
			 "layout", "list"
		   });	
		addAnnotation
		  (getWebSite_WebPages(), 
		   source, 
		   new String[] {
			 "layout", "list"
		   });	
		addAnnotation
		  (getWebPage_Socialnetworkcontent(), 
		   source, 
		   new String[] {
			 "layout", "list"
		   });	
		addAnnotation
		  (getWebPage_Elements(), 
		   source, 
		   new String[] {
			 "layout", "list"
		   });	
		addAnnotation
		  (getForm_Questions(), 
		   source, 
		   new String[] {
			 "layout", "list"
		   });	
		addAnnotation
		  (getQuestionsRepo_QuestionDefinitions(), 
		   source, 
		   new String[] {
			 "layout", "list"
		   });	
		addAnnotation
		  (getQuestionDefinition_PossibleAsnwer(), 
		   source, 
		   new String[] {
			 "layout", "list"
		   });	
		addAnnotation
		  (getDatabase_Entities(), 
		   source, 
		   new String[] {
			 "layout", "list"
		   });	
		addAnnotation
		  (getEntity_Attributes(), 
		   source, 
		   new String[] {
			 "layout", "list"
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.affixed</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_5Annotations() {
		String source = "gmf.affixed";	
		addAnnotation
		  (getStoredQuestion_DefinitionOfQuestion(), 
		   source, 
		   new String[] {
		   });
	}

} //WebDevProjectMMPackageImpl
