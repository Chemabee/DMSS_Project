/**
 */
package WebDevProjectMM;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see WebDevProjectMM.WebDevProjectMMPackage
 * @generated
 */
public interface WebDevProjectMMFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	WebDevProjectMMFactory eINSTANCE = WebDevProjectMM.impl.WebDevProjectMMFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Role</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Role</em>'.
	 * @generated
	 */
	Role createRole();

	/**
	 * Returns a new object of class '<em>Web Site</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Web Site</em>'.
	 * @generated
	 */
	WebSite createWebSite();

	/**
	 * Returns a new object of class '<em>Social Network Content</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Social Network Content</em>'.
	 * @generated
	 */
	SocialNetworkContent createSocialNetworkContent();

	/**
	 * Returns a new object of class '<em>Regular Content Page</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Regular Content Page</em>'.
	 * @generated
	 */
	RegularContentPage createRegularContentPage();

	/**
	 * Returns a new object of class '<em>Form</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Form</em>'.
	 * @generated
	 */
	Form createForm();

	/**
	 * Returns a new object of class '<em>Stored Question</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Stored Question</em>'.
	 * @generated
	 */
	StoredQuestion createStoredQuestion();

	/**
	 * Returns a new object of class '<em>Questions Repo</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Questions Repo</em>'.
	 * @generated
	 */
	QuestionsRepo createQuestionsRepo();

	/**
	 * Returns a new object of class '<em>Question Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Question Definition</em>'.
	 * @generated
	 */
	QuestionDefinition createQuestionDefinition();

	/**
	 * Returns a new object of class '<em>Possible Asnwer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Possible Asnwer</em>'.
	 * @generated
	 */
	PossibleAsnwer createPossibleAsnwer();

	/**
	 * Returns a new object of class '<em>Text</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Text</em>'.
	 * @generated
	 */
	Text createText();

	/**
	 * Returns a new object of class '<em>Database</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Database</em>'.
	 * @generated
	 */
	Database createDatabase();

	/**
	 * Returns a new object of class '<em>Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Entity</em>'.
	 * @generated
	 */
	Entity createEntity();

	/**
	 * Returns a new object of class '<em>Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attribute</em>'.
	 * @generated
	 */
	Attribute createAttribute();

	/**
	 * Returns a new object of class '<em>Page Link</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Page Link</em>'.
	 * @generated
	 */
	PageLink createPageLink();

	/**
	 * Returns a new object of class '<em>Media Content</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Media Content</em>'.
	 * @generated
	 */
	MediaContent createMediaContent();

	/**
	 * Returns a new object of class '<em>Creation CRUD</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Creation CRUD</em>'.
	 * @generated
	 */
	CreationCRUD createCreationCRUD();

	/**
	 * Returns a new object of class '<em>Delition CRUD</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Delition CRUD</em>'.
	 * @generated
	 */
	DelitionCRUD createDelitionCRUD();

	/**
	 * Returns a new object of class '<em>All CRUD</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>All CRUD</em>'.
	 * @generated
	 */
	AllCRUD createAllCRUD();

	/**
	 * Returns a new object of class '<em>Index CRUD</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Index CRUD</em>'.
	 * @generated
	 */
	IndexCRUD createIndexCRUD();

	/**
	 * Returns a new object of class '<em>Detail CRUD</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Detail CRUD</em>'.
	 * @generated
	 */
	DetailCRUD createDetailCRUD();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	WebDevProjectMMPackage getWebDevProjectMMPackage();

} //WebDevProjectMMFactory
