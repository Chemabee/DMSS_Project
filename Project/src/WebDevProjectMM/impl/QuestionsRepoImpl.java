/**
 */
package WebDevProjectMM.impl;

import WebDevProjectMM.QuestionDefinition;
import WebDevProjectMM.QuestionsRepo;
import WebDevProjectMM.WebDevProjectMMPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Questions Repo</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link WebDevProjectMM.impl.QuestionsRepoImpl#getQuestionDefinitions <em>Question Definitions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QuestionsRepoImpl extends EObjectImpl implements QuestionsRepo {
	/**
	 * The cached value of the '{@link #getQuestionDefinitions() <em>Question Definitions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuestionDefinitions()
	 * @generated
	 * @ordered
	 */
	protected EList<QuestionDefinition> questionDefinitions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QuestionsRepoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WebDevProjectMMPackage.Literals.QUESTIONS_REPO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<QuestionDefinition> getQuestionDefinitions() {
		if (questionDefinitions == null) {
			questionDefinitions = new EObjectContainmentEList<QuestionDefinition>(QuestionDefinition.class, this, WebDevProjectMMPackage.QUESTIONS_REPO__QUESTION_DEFINITIONS);
		}
		return questionDefinitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WebDevProjectMMPackage.QUESTIONS_REPO__QUESTION_DEFINITIONS:
				return ((InternalEList<?>)getQuestionDefinitions()).basicRemove(otherEnd, msgs);
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
			case WebDevProjectMMPackage.QUESTIONS_REPO__QUESTION_DEFINITIONS:
				return getQuestionDefinitions();
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
			case WebDevProjectMMPackage.QUESTIONS_REPO__QUESTION_DEFINITIONS:
				getQuestionDefinitions().clear();
				getQuestionDefinitions().addAll((Collection<? extends QuestionDefinition>)newValue);
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
			case WebDevProjectMMPackage.QUESTIONS_REPO__QUESTION_DEFINITIONS:
				getQuestionDefinitions().clear();
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
			case WebDevProjectMMPackage.QUESTIONS_REPO__QUESTION_DEFINITIONS:
				return questionDefinitions != null && !questionDefinitions.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //QuestionsRepoImpl
