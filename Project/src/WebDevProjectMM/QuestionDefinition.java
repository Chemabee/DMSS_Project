/**
 */
package WebDevProjectMM;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Question Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link WebDevProjectMM.QuestionDefinition#getPossibleAsnwer <em>Possible Asnwer</em>}</li>
 *   <li>{@link WebDevProjectMM.QuestionDefinition#getDescription <em>Description</em>}</li>
 *   <li>{@link WebDevProjectMM.QuestionDefinition#getType <em>Type</em>}</li>
 *   <li>{@link WebDevProjectMM.QuestionDefinition#getCorrectAnswer <em>Correct Answer</em>}</li>
 * </ul>
 *
 * @see WebDevProjectMM.WebDevProjectMMPackage#getQuestionDefinition()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='onlyItsOwnAnswers trueFalseAndShortQuestionHaveOnlyOneCorrectAnswer'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot onlyItsOwnAnswers='self.correctAnswer->size() > 0 implies self.possibleAsnwer->includesAll(self.correctAnswer)' trueFalseAndShortQuestionHaveOnlyOneCorrectAnswer='(self.type = QuestionType::TRUE_FALSE or self.type = QuestionType::SHORT_QUESTION) implies self.correctAnswer->size() < 2'"
 *        annotation="gmf.node label='description' color='104,176,171'"
 * @generated
 */
public interface QuestionDefinition extends Question {
	/**
	 * Returns the value of the '<em><b>Possible Asnwer</b></em>' containment reference list.
	 * The list contents are of type {@link WebDevProjectMM.PossibleAsnwer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Possible Asnwer</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Possible Asnwer</em>' containment reference list.
	 * @see WebDevProjectMM.WebDevProjectMMPackage#getQuestionDefinition_PossibleAsnwer()
	 * @model containment="true"
	 *        annotation="gmf.compartment layout='list'"
	 * @generated
	 */
	EList<PossibleAsnwer> getPossibleAsnwer();

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see WebDevProjectMM.WebDevProjectMMPackage#getQuestionDefinition_Description()
	 * @model required="true"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link WebDevProjectMM.QuestionDefinition#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link WebDevProjectMM.QuestionType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see WebDevProjectMM.QuestionType
	 * @see #setType(QuestionType)
	 * @see WebDevProjectMM.WebDevProjectMMPackage#getQuestionDefinition_Type()
	 * @model required="true"
	 * @generated
	 */
	QuestionType getType();

	/**
	 * Sets the value of the '{@link WebDevProjectMM.QuestionDefinition#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see WebDevProjectMM.QuestionType
	 * @see #getType()
	 * @generated
	 */
	void setType(QuestionType value);

	/**
	 * Returns the value of the '<em><b>Correct Answer</b></em>' reference list.
	 * The list contents are of type {@link WebDevProjectMM.PossibleAsnwer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Correct Answer</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Correct Answer</em>' reference list.
	 * @see WebDevProjectMM.WebDevProjectMMPackage#getQuestionDefinition_CorrectAnswer()
	 * @model
	 * @generated
	 */
	EList<PossibleAsnwer> getCorrectAnswer();

} // QuestionDefinition
