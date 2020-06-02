/**
 */
package WebDevProjectMM.util;

import WebDevProjectMM.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see WebDevProjectMM.WebDevProjectMMPackage
 * @generated
 */
public class WebDevProjectMMSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static WebDevProjectMMPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WebDevProjectMMSwitch() {
		if (modelPackage == null) {
			modelPackage = WebDevProjectMMPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case WebDevProjectMMPackage.ROLE: {
				Role role = (Role)theEObject;
				T result = caseRole(role);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebDevProjectMMPackage.WEB_SITE: {
				WebSite webSite = (WebSite)theEObject;
				T result = caseWebSite(webSite);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebDevProjectMMPackage.WEB_PAGE: {
				WebPage webPage = (WebPage)theEObject;
				T result = caseWebPage(webPage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebDevProjectMMPackage.SOCIAL_NETWORK_CONTENT: {
				SocialNetworkContent socialNetworkContent = (SocialNetworkContent)theEObject;
				T result = caseSocialNetworkContent(socialNetworkContent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebDevProjectMMPackage.REGULAR_CONTENT_PAGE: {
				RegularContentPage regularContentPage = (RegularContentPage)theEObject;
				T result = caseRegularContentPage(regularContentPage);
				if (result == null) result = caseWebPage(regularContentPage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebDevProjectMMPackage.FORM: {
				Form form = (Form)theEObject;
				T result = caseForm(form);
				if (result == null) result = caseWebPage(form);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebDevProjectMMPackage.QUESTION: {
				Question question = (Question)theEObject;
				T result = caseQuestion(question);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebDevProjectMMPackage.STORED_QUESTION: {
				StoredQuestion storedQuestion = (StoredQuestion)theEObject;
				T result = caseStoredQuestion(storedQuestion);
				if (result == null) result = caseQuestion(storedQuestion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebDevProjectMMPackage.QUESTIONS_REPO: {
				QuestionsRepo questionsRepo = (QuestionsRepo)theEObject;
				T result = caseQuestionsRepo(questionsRepo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebDevProjectMMPackage.QUESTION_DEFINITION: {
				QuestionDefinition questionDefinition = (QuestionDefinition)theEObject;
				T result = caseQuestionDefinition(questionDefinition);
				if (result == null) result = caseQuestion(questionDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebDevProjectMMPackage.POSSIBLE_ASNWER: {
				PossibleAsnwer possibleAsnwer = (PossibleAsnwer)theEObject;
				T result = casePossibleAsnwer(possibleAsnwer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebDevProjectMMPackage.ELEMENTS: {
				Elements elements = (Elements)theEObject;
				T result = caseElements(elements);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebDevProjectMMPackage.TEXT: {
				Text text = (Text)theEObject;
				T result = caseText(text);
				if (result == null) result = caseElements(text);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebDevProjectMMPackage.DATABASE: {
				Database database = (Database)theEObject;
				T result = caseDatabase(database);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebDevProjectMMPackage.ENTITY: {
				Entity entity = (Entity)theEObject;
				T result = caseEntity(entity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebDevProjectMMPackage.ATTRIBUTE: {
				Attribute attribute = (Attribute)theEObject;
				T result = caseAttribute(attribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebDevProjectMMPackage.PAGE_LINK: {
				PageLink pageLink = (PageLink)theEObject;
				T result = casePageLink(pageLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebDevProjectMMPackage.MEDIA_CONTENT: {
				MediaContent mediaContent = (MediaContent)theEObject;
				T result = caseMediaContent(mediaContent);
				if (result == null) result = caseElements(mediaContent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebDevProjectMMPackage.CRUD_PAGE: {
				CRUDPage crudPage = (CRUDPage)theEObject;
				T result = caseCRUDPage(crudPage);
				if (result == null) result = caseWebPage(crudPage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebDevProjectMMPackage.CREATION_CRUD: {
				CreationCRUD creationCRUD = (CreationCRUD)theEObject;
				T result = caseCreationCRUD(creationCRUD);
				if (result == null) result = caseCRUDPage(creationCRUD);
				if (result == null) result = caseWebPage(creationCRUD);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebDevProjectMMPackage.DELITION_CRUD: {
				DelitionCRUD delitionCRUD = (DelitionCRUD)theEObject;
				T result = caseDelitionCRUD(delitionCRUD);
				if (result == null) result = caseCRUDPage(delitionCRUD);
				if (result == null) result = caseWebPage(delitionCRUD);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebDevProjectMMPackage.ALL_CRUD: {
				AllCRUD allCRUD = (AllCRUD)theEObject;
				T result = caseAllCRUD(allCRUD);
				if (result == null) result = caseCRUDPage(allCRUD);
				if (result == null) result = caseWebPage(allCRUD);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebDevProjectMMPackage.INDEX_CRUD: {
				IndexCRUD indexCRUD = (IndexCRUD)theEObject;
				T result = caseIndexCRUD(indexCRUD);
				if (result == null) result = caseCRUDPage(indexCRUD);
				if (result == null) result = caseWebPage(indexCRUD);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebDevProjectMMPackage.DETAIL_CRUD: {
				DetailCRUD detailCRUD = (DetailCRUD)theEObject;
				T result = caseDetailCRUD(detailCRUD);
				if (result == null) result = caseCRUDPage(detailCRUD);
				if (result == null) result = caseWebPage(detailCRUD);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Role</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Role</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRole(Role object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Web Site</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Web Site</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWebSite(WebSite object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Web Page</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Web Page</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWebPage(WebPage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Social Network Content</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Social Network Content</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSocialNetworkContent(SocialNetworkContent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Regular Content Page</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Regular Content Page</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRegularContentPage(RegularContentPage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Form</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Form</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseForm(Form object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Question</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Question</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQuestion(Question object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Stored Question</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Stored Question</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStoredQuestion(StoredQuestion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Questions Repo</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Questions Repo</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQuestionsRepo(QuestionsRepo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Question Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Question Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQuestionDefinition(QuestionDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Possible Asnwer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Possible Asnwer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePossibleAsnwer(PossibleAsnwer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Elements</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Elements</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElements(Elements object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Text</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Text</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseText(Text object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Database</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Database</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDatabase(Database object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntity(Entity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttribute(Attribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Page Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Page Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePageLink(PageLink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Media Content</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Media Content</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMediaContent(MediaContent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CRUD Page</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CRUD Page</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCRUDPage(CRUDPage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Creation CRUD</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Creation CRUD</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCreationCRUD(CreationCRUD object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Delition CRUD</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Delition CRUD</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDelitionCRUD(DelitionCRUD object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>All CRUD</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>All CRUD</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAllCRUD(AllCRUD object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Index CRUD</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Index CRUD</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIndexCRUD(IndexCRUD object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Detail CRUD</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Detail CRUD</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDetailCRUD(DetailCRUD object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //WebDevProjectMMSwitch
