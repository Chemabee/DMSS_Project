/**
 */
package WebDevProjectMM;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Questions Repo</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link WebDevProjectMM.QuestionsRepo#getQuestionDefinitions <em>Question Definitions</em>}</li>
 * </ul>
 *
 * @see WebDevProjectMM.WebDevProjectMMPackage#getQuestionsRepo()
 * @model
 * @generated
 */
public interface QuestionsRepo extends EObject {
	/**
	 * Returns the value of the '<em><b>Question Definitions</b></em>' containment reference list.
	 * The list contents are of type {@link WebDevProjectMM.QuestionDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Question Definitions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Question Definitions</em>' containment reference list.
	 * @see WebDevProjectMM.WebDevProjectMMPackage#getQuestionsRepo_QuestionDefinitions()
	 * @model containment="true"
	 *        annotation="gmf.compartment layout='list'"
	 * @generated
	 */
	EList<QuestionDefinition> getQuestionDefinitions();

} // QuestionsRepo
