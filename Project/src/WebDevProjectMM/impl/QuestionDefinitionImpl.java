/**
 */
package WebDevProjectMM.impl;

import WebDevProjectMM.PossibleAsnwer;
import WebDevProjectMM.QuestionDefinition;
import WebDevProjectMM.QuestionType;
import WebDevProjectMM.WebDevProjectMMPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Question Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link WebDevProjectMM.impl.QuestionDefinitionImpl#getPossibleAsnwer <em>Possible Asnwer</em>}</li>
 *   <li>{@link WebDevProjectMM.impl.QuestionDefinitionImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link WebDevProjectMM.impl.QuestionDefinitionImpl#getType <em>Type</em>}</li>
 *   <li>{@link WebDevProjectMM.impl.QuestionDefinitionImpl#getCorrectAnswer <em>Correct Answer</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QuestionDefinitionImpl extends QuestionImpl implements QuestionDefinition {
	/**
	 * The cached value of the '{@link #getPossibleAsnwer() <em>Possible Asnwer</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPossibleAsnwer()
	 * @generated
	 * @ordered
	 */
	protected EList<PossibleAsnwer> possibleAsnwer;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final QuestionType TYPE_EDEFAULT = QuestionType.MULTIPLE_CHOICE;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected QuestionType type = TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCorrectAnswer() <em>Correct Answer</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCorrectAnswer()
	 * @generated
	 * @ordered
	 */
	protected EList<PossibleAsnwer> correctAnswer;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QuestionDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WebDevProjectMMPackage.Literals.QUESTION_DEFINITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PossibleAsnwer> getPossibleAsnwer() {
		if (possibleAsnwer == null) {
			possibleAsnwer = new EObjectContainmentEList<PossibleAsnwer>(PossibleAsnwer.class, this, WebDevProjectMMPackage.QUESTION_DEFINITION__POSSIBLE_ASNWER);
		}
		return possibleAsnwer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebDevProjectMMPackage.QUESTION_DEFINITION__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuestionType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(QuestionType newType) {
		QuestionType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebDevProjectMMPackage.QUESTION_DEFINITION__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PossibleAsnwer> getCorrectAnswer() {
		if (correctAnswer == null) {
			correctAnswer = new EObjectResolvingEList<PossibleAsnwer>(PossibleAsnwer.class, this, WebDevProjectMMPackage.QUESTION_DEFINITION__CORRECT_ANSWER);
		}
		return correctAnswer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WebDevProjectMMPackage.QUESTION_DEFINITION__POSSIBLE_ASNWER:
				return ((InternalEList<?>)getPossibleAsnwer()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WebDevProjectMMPackage.QUESTION_DEFINITION__POSSIBLE_ASNWER:
				return getPossibleAsnwer();
			case WebDevProjectMMPackage.QUESTION_DEFINITION__DESCRIPTION:
				return getDescription();
			case WebDevProjectMMPackage.QUESTION_DEFINITION__TYPE:
				return getType();
			case WebDevProjectMMPackage.QUESTION_DEFINITION__CORRECT_ANSWER:
				return getCorrectAnswer();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case WebDevProjectMMPackage.QUESTION_DEFINITION__POSSIBLE_ASNWER:
				getPossibleAsnwer().clear();
				getPossibleAsnwer().addAll((Collection<? extends PossibleAsnwer>)newValue);
				return;
			case WebDevProjectMMPackage.QUESTION_DEFINITION__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case WebDevProjectMMPackage.QUESTION_DEFINITION__TYPE:
				setType((QuestionType)newValue);
				return;
			case WebDevProjectMMPackage.QUESTION_DEFINITION__CORRECT_ANSWER:
				getCorrectAnswer().clear();
				getCorrectAnswer().addAll((Collection<? extends PossibleAsnwer>)newValue);
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
			case WebDevProjectMMPackage.QUESTION_DEFINITION__POSSIBLE_ASNWER:
				getPossibleAsnwer().clear();
				return;
			case WebDevProjectMMPackage.QUESTION_DEFINITION__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case WebDevProjectMMPackage.QUESTION_DEFINITION__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case WebDevProjectMMPackage.QUESTION_DEFINITION__CORRECT_ANSWER:
				getCorrectAnswer().clear();
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
			case WebDevProjectMMPackage.QUESTION_DEFINITION__POSSIBLE_ASNWER:
				return possibleAsnwer != null && !possibleAsnwer.isEmpty();
			case WebDevProjectMMPackage.QUESTION_DEFINITION__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case WebDevProjectMMPackage.QUESTION_DEFINITION__TYPE:
				return type != TYPE_EDEFAULT;
			case WebDevProjectMMPackage.QUESTION_DEFINITION__CORRECT_ANSWER:
				return correctAnswer != null && !correctAnswer.isEmpty();
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
		result.append(" (description: ");
		result.append(description);
		result.append(", type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //QuestionDefinitionImpl
