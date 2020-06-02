/**
 */
package WebDevProjectMM;

import java.math.BigInteger;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Form</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link WebDevProjectMM.Form#getQuestions <em>Questions</em>}</li>
 *   <li>{@link WebDevProjectMM.Form#getFormType <em>Form Type</em>}</li>
 *   <li>{@link WebDevProjectMM.Form#getNumTFQuestions <em>Num TF Questions</em>}</li>
 *   <li>{@link WebDevProjectMM.Form#getNumMCQuestions <em>Num MC Questions</em>}</li>
 * </ul>
 *
 * @see WebDevProjectMM.WebDevProjectMMPackage#getForm()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='R7AllQustionsInQuestionnaireHasCorrectAnswer'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot R7AllQustionsInQuestionnaireHasCorrectAnswer='\n\t\t\t\t\tlet isQuestionnaire : Boolean = self.formType = Form_Type::QUESTIONNAIRE,\n\t\t\t\t\t\tallQuestionDefinitions : Collection(QuestionDefinition) = self.questions->selectByKind(QuestionDefinition),\n\t\t\t\t\t\tallQuestionDefinitionsHaveAnAnswer : Boolean = allQuestionDefinitions->forAll(q : QuestionDefinition | q.correctAnswer->size() > 0),\n\t\t\t\t\t\tallStoredQuestions : Collection(StoredQuestion) = self.questions->selectByKind(StoredQuestion),\n\t\t\t\t\t\tallStoredQuestionsHaveAnAnswer : Boolean = allStoredQuestions->forAll(q : StoredQuestion |  q.definitionOfQuestion.oclAsType(QuestionDefinition).correctAnswer->size() > 0)\n\t\t\t\t\tin\n\t\t\t\t\t\tisQuestionnaire implies\n\t\t\t\t\t\t(\n\t\t\t\t\t\t\t(allQuestionDefinitions->size() > 0 implies allQuestionDefinitionsHaveAnAnswer)\n\t\t\t\t\t\t\tand\n\t\t\t\t\t\t\t(allStoredQuestions->size() > 0 implies allStoredQuestionsHaveAnAnswer)\n\t\t\t\t\t\t)'"
 *        annotation="gmf.node label='name' color='212,224,155'"
 * @generated
 */
public interface Form extends WebPage {
	/**
	 * Returns the value of the '<em><b>Questions</b></em>' containment reference list.
	 * The list contents are of type {@link WebDevProjectMM.Question}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Questions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Questions</em>' containment reference list.
	 * @see WebDevProjectMM.WebDevProjectMMPackage#getForm_Questions()
	 * @model containment="true" required="true"
	 *        annotation="gmf.compartment layout='list'"
	 * @generated
	 */
	EList<Question> getQuestions();

	/**
	 * Returns the value of the '<em><b>Form Type</b></em>' attribute.
	 * The literals are from the enumeration {@link WebDevProjectMM.Form_Type}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Form Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Form Type</em>' attribute.
	 * @see WebDevProjectMM.Form_Type
	 * @see #setFormType(Form_Type)
	 * @see WebDevProjectMM.WebDevProjectMMPackage#getForm_FormType()
	 * @model required="true"
	 * @generated
	 */
	Form_Type getFormType();

	/**
	 * Sets the value of the '{@link WebDevProjectMM.Form#getFormType <em>Form Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Form Type</em>' attribute.
	 * @see WebDevProjectMM.Form_Type
	 * @see #getFormType()
	 * @generated
	 */
	void setFormType(Form_Type value);

	/**
	 * Returns the value of the '<em><b>Num TF Questions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Num TF Questions</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Num TF Questions</em>' attribute.
	 * @see #setNumTFQuestions(BigInteger)
	 * @see WebDevProjectMM.WebDevProjectMMPackage#getForm_NumTFQuestions()
	 * @model required="true" transient="true" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot derivation='self.questions->select(q:Question|(q.oclIsKindOf(QuestionDefinition) and q.oclAsType(QuestionDefinition).type = QuestionType::TRUE_FALSE) or (q.oclIsKindOf(StoredQuestion) and q.oclAsType(StoredQuestion).definitionOfQuestion.type = QuestionType::TRUE_FALSE) )->size()'"
	 * @generated
	 */
	BigInteger getNumTFQuestions();

	/**
	 * Sets the value of the '{@link WebDevProjectMM.Form#getNumTFQuestions <em>Num TF Questions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Num TF Questions</em>' attribute.
	 * @see #getNumTFQuestions()
	 * @generated
	 */
	void setNumTFQuestions(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Num MC Questions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Num MC Questions</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Num MC Questions</em>' attribute.
	 * @see #setNumMCQuestions(BigInteger)
	 * @see WebDevProjectMM.WebDevProjectMMPackage#getForm_NumMCQuestions()
	 * @model required="true" transient="true" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot derivation='self.questions->select(q:Question|(q.oclIsKindOf(QuestionDefinition) and q.oclAsType(QuestionDefinition).type = QuestionType::MULTIPLE_CHOICE) or (q.oclIsKindOf(StoredQuestion) and q.oclAsType(StoredQuestion).definitionOfQuestion.type = QuestionType::MULTIPLE_CHOICE) )->size()'"
	 * @generated
	 */
	BigInteger getNumMCQuestions();

	/**
	 * Sets the value of the '{@link WebDevProjectMM.Form#getNumMCQuestions <em>Num MC Questions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Num MC Questions</em>' attribute.
	 * @see #getNumMCQuestions()
	 * @generated
	 */
	void setNumMCQuestions(BigInteger value);

} // Form
