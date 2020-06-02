/**
 */
package WebDevProjectMM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Stored Question</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link WebDevProjectMM.StoredQuestion#getDescQuestionDefinition <em>Desc Question Definition</em>}</li>
 *   <li>{@link WebDevProjectMM.StoredQuestion#getDefinitionOfQuestion <em>Definition Of Question</em>}</li>
 * </ul>
 *
 * @see WebDevProjectMM.WebDevProjectMMPackage#getStoredQuestion()
 * @model annotation="gmf.node color='143,192,169' label='descQuestionDefinition'"
 * @generated
 */
public interface StoredQuestion extends Question {
	/**
	 * Returns the value of the '<em><b>Desc Question Definition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Desc Question Definition</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Desc Question Definition</em>' attribute.
	 * @see #setDescQuestionDefinition(String)
	 * @see WebDevProjectMM.WebDevProjectMMPackage#getStoredQuestion_DescQuestionDefinition()
	 * @model required="true" transient="true" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot derivation='if self.definitionOfQuestion->size() = 1 then self.definitionOfQuestion.description else \'\' endif'"
	 * @generated
	 */
	String getDescQuestionDefinition();

	/**
	 * Sets the value of the '{@link WebDevProjectMM.StoredQuestion#getDescQuestionDefinition <em>Desc Question Definition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Desc Question Definition</em>' attribute.
	 * @see #getDescQuestionDefinition()
	 * @generated
	 */
	void setDescQuestionDefinition(String value);

	/**
	 * Returns the value of the '<em><b>Definition Of Question</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Definition Of Question</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Definition Of Question</em>' reference.
	 * @see #setDefinitionOfQuestion(QuestionDefinition)
	 * @see WebDevProjectMM.WebDevProjectMMPackage#getStoredQuestion_DefinitionOfQuestion()
	 * @model required="true"
	 * @generated
	 */
	QuestionDefinition getDefinitionOfQuestion();

	/**
	 * Sets the value of the '{@link WebDevProjectMM.StoredQuestion#getDefinitionOfQuestion <em>Definition Of Question</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Definition Of Question</em>' reference.
	 * @see #getDefinitionOfQuestion()
	 * @generated
	 */
	void setDefinitionOfQuestion(QuestionDefinition value);

} // StoredQuestion
