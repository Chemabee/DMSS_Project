/**
 */
package WebDevProjectMM;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Possible Asnwer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link WebDevProjectMM.PossibleAsnwer#getAnswerText <em>Answer Text</em>}</li>
 * </ul>
 *
 * @see WebDevProjectMM.WebDevProjectMMPackage#getPossibleAsnwer()
 * @model annotation="gmf.node label='answerText' label.icon='false'"
 * @generated
 */
public interface PossibleAsnwer extends EObject {
	/**
	 * Returns the value of the '<em><b>Answer Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Answer Text</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Answer Text</em>' attribute.
	 * @see #setAnswerText(String)
	 * @see WebDevProjectMM.WebDevProjectMMPackage#getPossibleAsnwer_AnswerText()
	 * @model required="true"
	 * @generated
	 */
	String getAnswerText();

	/**
	 * Sets the value of the '{@link WebDevProjectMM.PossibleAsnwer#getAnswerText <em>Answer Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Answer Text</em>' attribute.
	 * @see #getAnswerText()
	 * @generated
	 */
	void setAnswerText(String value);

} // PossibleAsnwer
