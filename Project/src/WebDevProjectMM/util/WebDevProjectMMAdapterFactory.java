/**
 */
package WebDevProjectMM.util;

import WebDevProjectMM.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see WebDevProjectMM.WebDevProjectMMPackage
 * @generated
 */
public class WebDevProjectMMAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static WebDevProjectMMPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WebDevProjectMMAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = WebDevProjectMMPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WebDevProjectMMSwitch<Adapter> modelSwitch =
		new WebDevProjectMMSwitch<Adapter>() {
			@Override
			public Adapter caseRole(Role object) {
				return createRoleAdapter();
			}
			@Override
			public Adapter caseWebSite(WebSite object) {
				return createWebSiteAdapter();
			}
			@Override
			public Adapter caseWebPage(WebPage object) {
				return createWebPageAdapter();
			}
			@Override
			public Adapter caseSocialNetworkContent(SocialNetworkContent object) {
				return createSocialNetworkContentAdapter();
			}
			@Override
			public Adapter caseRegularContentPage(RegularContentPage object) {
				return createRegularContentPageAdapter();
			}
			@Override
			public Adapter caseForm(Form object) {
				return createFormAdapter();
			}
			@Override
			public Adapter caseQuestion(Question object) {
				return createQuestionAdapter();
			}
			@Override
			public Adapter caseStoredQuestion(StoredQuestion object) {
				return createStoredQuestionAdapter();
			}
			@Override
			public Adapter caseQuestionsRepo(QuestionsRepo object) {
				return createQuestionsRepoAdapter();
			}
			@Override
			public Adapter caseQuestionDefinition(QuestionDefinition object) {
				return createQuestionDefinitionAdapter();
			}
			@Override
			public Adapter casePossibleAsnwer(PossibleAsnwer object) {
				return createPossibleAsnwerAdapter();
			}
			@Override
			public Adapter caseElements(Elements object) {
				return createElementsAdapter();
			}
			@Override
			public Adapter caseText(Text object) {
				return createTextAdapter();
			}
			@Override
			public Adapter caseDatabase(Database object) {
				return createDatabaseAdapter();
			}
			@Override
			public Adapter caseEntity(Entity object) {
				return createEntityAdapter();
			}
			@Override
			public Adapter caseAttribute(Attribute object) {
				return createAttributeAdapter();
			}
			@Override
			public Adapter casePageLink(PageLink object) {
				return createPageLinkAdapter();
			}
			@Override
			public Adapter caseMediaContent(MediaContent object) {
				return createMediaContentAdapter();
			}
			@Override
			public Adapter caseCRUDPage(CRUDPage object) {
				return createCRUDPageAdapter();
			}
			@Override
			public Adapter caseCreationCRUD(CreationCRUD object) {
				return createCreationCRUDAdapter();
			}
			@Override
			public Adapter caseDelitionCRUD(DelitionCRUD object) {
				return createDelitionCRUDAdapter();
			}
			@Override
			public Adapter caseAllCRUD(AllCRUD object) {
				return createAllCRUDAdapter();
			}
			@Override
			public Adapter caseIndexCRUD(IndexCRUD object) {
				return createIndexCRUDAdapter();
			}
			@Override
			public Adapter caseDetailCRUD(DetailCRUD object) {
				return createDetailCRUDAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link WebDevProjectMM.Role <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see WebDevProjectMM.Role
	 * @generated
	 */
	public Adapter createRoleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link WebDevProjectMM.WebSite <em>Web Site</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see WebDevProjectMM.WebSite
	 * @generated
	 */
	public Adapter createWebSiteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link WebDevProjectMM.WebPage <em>Web Page</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see WebDevProjectMM.WebPage
	 * @generated
	 */
	public Adapter createWebPageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link WebDevProjectMM.SocialNetworkContent <em>Social Network Content</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see WebDevProjectMM.SocialNetworkContent
	 * @generated
	 */
	public Adapter createSocialNetworkContentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link WebDevProjectMM.RegularContentPage <em>Regular Content Page</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see WebDevProjectMM.RegularContentPage
	 * @generated
	 */
	public Adapter createRegularContentPageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link WebDevProjectMM.Form <em>Form</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see WebDevProjectMM.Form
	 * @generated
	 */
	public Adapter createFormAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link WebDevProjectMM.Question <em>Question</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see WebDevProjectMM.Question
	 * @generated
	 */
	public Adapter createQuestionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link WebDevProjectMM.StoredQuestion <em>Stored Question</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see WebDevProjectMM.StoredQuestion
	 * @generated
	 */
	public Adapter createStoredQuestionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link WebDevProjectMM.QuestionsRepo <em>Questions Repo</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see WebDevProjectMM.QuestionsRepo
	 * @generated
	 */
	public Adapter createQuestionsRepoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link WebDevProjectMM.QuestionDefinition <em>Question Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see WebDevProjectMM.QuestionDefinition
	 * @generated
	 */
	public Adapter createQuestionDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link WebDevProjectMM.PossibleAsnwer <em>Possible Asnwer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see WebDevProjectMM.PossibleAsnwer
	 * @generated
	 */
	public Adapter createPossibleAsnwerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link WebDevProjectMM.Elements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see WebDevProjectMM.Elements
	 * @generated
	 */
	public Adapter createElementsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link WebDevProjectMM.Text <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see WebDevProjectMM.Text
	 * @generated
	 */
	public Adapter createTextAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link WebDevProjectMM.Database <em>Database</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see WebDevProjectMM.Database
	 * @generated
	 */
	public Adapter createDatabaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link WebDevProjectMM.Entity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see WebDevProjectMM.Entity
	 * @generated
	 */
	public Adapter createEntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link WebDevProjectMM.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see WebDevProjectMM.Attribute
	 * @generated
	 */
	public Adapter createAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link WebDevProjectMM.PageLink <em>Page Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see WebDevProjectMM.PageLink
	 * @generated
	 */
	public Adapter createPageLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link WebDevProjectMM.MediaContent <em>Media Content</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see WebDevProjectMM.MediaContent
	 * @generated
	 */
	public Adapter createMediaContentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link WebDevProjectMM.CRUDPage <em>CRUD Page</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see WebDevProjectMM.CRUDPage
	 * @generated
	 */
	public Adapter createCRUDPageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link WebDevProjectMM.CreationCRUD <em>Creation CRUD</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see WebDevProjectMM.CreationCRUD
	 * @generated
	 */
	public Adapter createCreationCRUDAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link WebDevProjectMM.DelitionCRUD <em>Delition CRUD</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see WebDevProjectMM.DelitionCRUD
	 * @generated
	 */
	public Adapter createDelitionCRUDAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link WebDevProjectMM.AllCRUD <em>All CRUD</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see WebDevProjectMM.AllCRUD
	 * @generated
	 */
	public Adapter createAllCRUDAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link WebDevProjectMM.IndexCRUD <em>Index CRUD</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see WebDevProjectMM.IndexCRUD
	 * @generated
	 */
	public Adapter createIndexCRUDAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link WebDevProjectMM.DetailCRUD <em>Detail CRUD</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see WebDevProjectMM.DetailCRUD
	 * @generated
	 */
	public Adapter createDetailCRUDAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //WebDevProjectMMAdapterFactory
