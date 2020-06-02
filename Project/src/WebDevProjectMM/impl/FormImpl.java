/**
 */
package WebDevProjectMM.impl;

import WebDevProjectMM.Form;
import WebDevProjectMM.Form_Type;
import WebDevProjectMM.Question;
import WebDevProjectMM.WebDevProjectMMPackage;

import java.math.BigInteger;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Form</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link WebDevProjectMM.impl.FormImpl#getQuestions <em>Questions</em>}</li>
 *   <li>{@link WebDevProjectMM.impl.FormImpl#getFormType <em>Form Type</em>}</li>
 *   <li>{@link WebDevProjectMM.impl.FormImpl#getNumTFQuestions <em>Num TF Questions</em>}</li>
 *   <li>{@link WebDevProjectMM.impl.FormImpl#getNumMCQuestions <em>Num MC Questions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FormImpl extends WebPageImpl implements Form {
	/**
	 * The cached value of the '{@link #getQuestions() <em>Questions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuestions()
	 * @generated
	 * @ordered
	 */
	protected EList<Question> questions;

	/**
	 * The default value of the '{@link #getFormType() <em>Form Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormType()
	 * @generated
	 * @ordered
	 */
	protected static final Form_Type FORM_TYPE_EDEFAULT = Form_Type.SURVEY;

	/**
	 * The cached value of the '{@link #getFormType() <em>Form Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormType()
	 * @generated
	 * @ordered
	 */
	protected Form_Type formType = FORM_TYPE_EDEFAULT;

	/**
	 * The cached setting delegate for the '{@link #getNumTFQuestions() <em>Num TF Questions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumTFQuestions()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate NUM_TF_QUESTIONS__ESETTING_DELEGATE = ((EStructuralFeature.Internal)WebDevProjectMMPackage.Literals.FORM__NUM_TF_QUESTIONS).getSettingDelegate();

	/**
	 * The cached setting delegate for the '{@link #getNumMCQuestions() <em>Num MC Questions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumMCQuestions()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate NUM_MC_QUESTIONS__ESETTING_DELEGATE = ((EStructuralFeature.Internal)WebDevProjectMMPackage.Literals.FORM__NUM_MC_QUESTIONS).getSettingDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FormImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WebDevProjectMMPackage.Literals.FORM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Question> getQuestions() {
		if (questions == null) {
			questions = new EObjectContainmentEList<Question>(Question.class, this, WebDevProjectMMPackage.FORM__QUESTIONS);
		}
		return questions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Form_Type getFormType() {
		return formType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFormType(Form_Type newFormType) {
		Form_Type oldFormType = formType;
		formType = newFormType == null ? FORM_TYPE_EDEFAULT : newFormType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebDevProjectMMPackage.FORM__FORM_TYPE, oldFormType, formType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getNumTFQuestions() {
		return (BigInteger)NUM_TF_QUESTIONS__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumTFQuestions(BigInteger newNumTFQuestions) {
		NUM_TF_QUESTIONS__ESETTING_DELEGATE.dynamicSet(this, null, 0, newNumTFQuestions);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getNumMCQuestions() {
		return (BigInteger)NUM_MC_QUESTIONS__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumMCQuestions(BigInteger newNumMCQuestions) {
		NUM_MC_QUESTIONS__ESETTING_DELEGATE.dynamicSet(this, null, 0, newNumMCQuestions);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WebDevProjectMMPackage.FORM__QUESTIONS:
				return ((InternalEList<?>)getQuestions()).basicRemove(otherEnd, msgs);
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
			case WebDevProjectMMPackage.FORM__QUESTIONS:
				return getQuestions();
			case WebDevProjectMMPackage.FORM__FORM_TYPE:
				return getFormType();
			case WebDevProjectMMPackage.FORM__NUM_TF_QUESTIONS:
				return getNumTFQuestions();
			case WebDevProjectMMPackage.FORM__NUM_MC_QUESTIONS:
				return getNumMCQuestions();
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
			case WebDevProjectMMPackage.FORM__QUESTIONS:
				getQuestions().clear();
				getQuestions().addAll((Collection<? extends Question>)newValue);
				return;
			case WebDevProjectMMPackage.FORM__FORM_TYPE:
				setFormType((Form_Type)newValue);
				return;
			case WebDevProjectMMPackage.FORM__NUM_TF_QUESTIONS:
				setNumTFQuestions((BigInteger)newValue);
				return;
			case WebDevProjectMMPackage.FORM__NUM_MC_QUESTIONS:
				setNumMCQuestions((BigInteger)newValue);
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
			case WebDevProjectMMPackage.FORM__QUESTIONS:
				getQuestions().clear();
				return;
			case WebDevProjectMMPackage.FORM__FORM_TYPE:
				setFormType(FORM_TYPE_EDEFAULT);
				return;
			case WebDevProjectMMPackage.FORM__NUM_TF_QUESTIONS:
				NUM_TF_QUESTIONS__ESETTING_DELEGATE.dynamicUnset(this, null, 0);
				return;
			case WebDevProjectMMPackage.FORM__NUM_MC_QUESTIONS:
				NUM_MC_QUESTIONS__ESETTING_DELEGATE.dynamicUnset(this, null, 0);
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
			case WebDevProjectMMPackage.FORM__QUESTIONS:
				return questions != null && !questions.isEmpty();
			case WebDevProjectMMPackage.FORM__FORM_TYPE:
				return formType != FORM_TYPE_EDEFAULT;
			case WebDevProjectMMPackage.FORM__NUM_TF_QUESTIONS:
				return NUM_TF_QUESTIONS__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case WebDevProjectMMPackage.FORM__NUM_MC_QUESTIONS:
				return NUM_MC_QUESTIONS__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
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
		result.append(" (formType: ");
		result.append(formType);
		result.append(')');
		return result.toString();
	}

} //FormImpl
