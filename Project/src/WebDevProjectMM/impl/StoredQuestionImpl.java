/**
 */
package WebDevProjectMM.impl;

import WebDevProjectMM.QuestionDefinition;
import WebDevProjectMM.StoredQuestion;
import WebDevProjectMM.WebDevProjectMMPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Stored Question</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link WebDevProjectMM.impl.StoredQuestionImpl#getDescQuestionDefinition <em>Desc Question Definition</em>}</li>
 *   <li>{@link WebDevProjectMM.impl.StoredQuestionImpl#getDefinitionOfQuestion <em>Definition Of Question</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StoredQuestionImpl extends QuestionImpl implements StoredQuestion {
	/**
	 * The cached setting delegate for the '{@link #getDescQuestionDefinition() <em>Desc Question Definition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescQuestionDefinition()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate DESC_QUESTION_DEFINITION__ESETTING_DELEGATE = ((EStructuralFeature.Internal)WebDevProjectMMPackage.Literals.STORED_QUESTION__DESC_QUESTION_DEFINITION).getSettingDelegate();

	/**
	 * The cached value of the '{@link #getDefinitionOfQuestion() <em>Definition Of Question</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefinitionOfQuestion()
	 * @generated
	 * @ordered
	 */
	protected QuestionDefinition definitionOfQuestion;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StoredQuestionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WebDevProjectMMPackage.Literals.STORED_QUESTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescQuestionDefinition() {
		return (String)DESC_QUESTION_DEFINITION__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescQuestionDefinition(String newDescQuestionDefinition) {
		DESC_QUESTION_DEFINITION__ESETTING_DELEGATE.dynamicSet(this, null, 0, newDescQuestionDefinition);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuestionDefinition getDefinitionOfQuestion() {
		if (definitionOfQuestion != null && definitionOfQuestion.eIsProxy()) {
			InternalEObject oldDefinitionOfQuestion = (InternalEObject)definitionOfQuestion;
			definitionOfQuestion = (QuestionDefinition)eResolveProxy(oldDefinitionOfQuestion);
			if (definitionOfQuestion != oldDefinitionOfQuestion) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WebDevProjectMMPackage.STORED_QUESTION__DEFINITION_OF_QUESTION, oldDefinitionOfQuestion, definitionOfQuestion));
			}
		}
		return definitionOfQuestion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuestionDefinition basicGetDefinitionOfQuestion() {
		return definitionOfQuestion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefinitionOfQuestion(QuestionDefinition newDefinitionOfQuestion) {
		QuestionDefinition oldDefinitionOfQuestion = definitionOfQuestion;
		definitionOfQuestion = newDefinitionOfQuestion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebDevProjectMMPackage.STORED_QUESTION__DEFINITION_OF_QUESTION, oldDefinitionOfQuestion, definitionOfQuestion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WebDevProjectMMPackage.STORED_QUESTION__DESC_QUESTION_DEFINITION:
				return getDescQuestionDefinition();
			case WebDevProjectMMPackage.STORED_QUESTION__DEFINITION_OF_QUESTION:
				if (resolve) return getDefinitionOfQuestion();
				return basicGetDefinitionOfQuestion();
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
			case WebDevProjectMMPackage.STORED_QUESTION__DESC_QUESTION_DEFINITION:
				setDescQuestionDefinition((String)newValue);
				return;
			case WebDevProjectMMPackage.STORED_QUESTION__DEFINITION_OF_QUESTION:
				setDefinitionOfQuestion((QuestionDefinition)newValue);
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
			case WebDevProjectMMPackage.STORED_QUESTION__DESC_QUESTION_DEFINITION:
				DESC_QUESTION_DEFINITION__ESETTING_DELEGATE.dynamicUnset(this, null, 0);
				return;
			case WebDevProjectMMPackage.STORED_QUESTION__DEFINITION_OF_QUESTION:
				setDefinitionOfQuestion((QuestionDefinition)null);
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
			case WebDevProjectMMPackage.STORED_QUESTION__DESC_QUESTION_DEFINITION:
				return DESC_QUESTION_DEFINITION__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case WebDevProjectMMPackage.STORED_QUESTION__DEFINITION_OF_QUESTION:
				return definitionOfQuestion != null;
		}
		return super.eIsSet(featureID);
	}

} //StoredQuestionImpl
