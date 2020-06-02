/**
 */
package WebDevProjectMM.impl;

import WebDevProjectMM.PossibleAsnwer;
import WebDevProjectMM.WebDevProjectMMPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Possible Asnwer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link WebDevProjectMM.impl.PossibleAsnwerImpl#getAnswerText <em>Answer Text</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PossibleAsnwerImpl extends EObjectImpl implements PossibleAsnwer {
	/**
	 * The default value of the '{@link #getAnswerText() <em>Answer Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnswerText()
	 * @generated
	 * @ordered
	 */
	protected static final String ANSWER_TEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAnswerText() <em>Answer Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnswerText()
	 * @generated
	 * @ordered
	 */
	protected String answerText = ANSWER_TEXT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PossibleAsnwerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WebDevProjectMMPackage.Literals.POSSIBLE_ASNWER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAnswerText() {
		return answerText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnswerText(String newAnswerText) {
		String oldAnswerText = answerText;
		answerText = newAnswerText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebDevProjectMMPackage.POSSIBLE_ASNWER__ANSWER_TEXT, oldAnswerText, answerText));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WebDevProjectMMPackage.POSSIBLE_ASNWER__ANSWER_TEXT:
				return getAnswerText();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case WebDevProjectMMPackage.POSSIBLE_ASNWER__ANSWER_TEXT:
				setAnswerText((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case WebDevProjectMMPackage.POSSIBLE_ASNWER__ANSWER_TEXT:
				setAnswerText(ANSWER_TEXT_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case WebDevProjectMMPackage.POSSIBLE_ASNWER__ANSWER_TEXT:
				return ANSWER_TEXT_EDEFAULT == null ? answerText != null : !ANSWER_TEXT_EDEFAULT.equals(answerText);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (answerText: ");
		result.append(answerText);
		result.append(')');
		return result.toString();
	}

} //PossibleAsnwerImpl
