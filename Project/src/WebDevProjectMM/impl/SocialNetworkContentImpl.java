/**
 */
package WebDevProjectMM.impl;

import WebDevProjectMM.SocialNetworkContent;
import WebDevProjectMM.SocialNetwork_Type;
import WebDevProjectMM.WebDevProjectMMPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Social Network Content</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link WebDevProjectMM.impl.SocialNetworkContentImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link WebDevProjectMM.impl.SocialNetworkContentImpl#getSocialNetworkType <em>Social Network Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SocialNetworkContentImpl extends EObjectImpl implements SocialNetworkContent {
	/**
	 * The default value of the '{@link #getParameters() <em>Parameters</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected static final String PARAMETERS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected String parameters = PARAMETERS_EDEFAULT;

	/**
	 * The default value of the '{@link #getSocialNetworkType() <em>Social Network Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSocialNetworkType()
	 * @generated
	 * @ordered
	 */
	protected static final SocialNetwork_Type SOCIAL_NETWORK_TYPE_EDEFAULT = SocialNetwork_Type.TWITTER;

	/**
	 * The cached value of the '{@link #getSocialNetworkType() <em>Social Network Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSocialNetworkType()
	 * @generated
	 * @ordered
	 */
	protected SocialNetwork_Type socialNetworkType = SOCIAL_NETWORK_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SocialNetworkContentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WebDevProjectMMPackage.Literals.SOCIAL_NETWORK_CONTENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getParameters() {
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameters(String newParameters) {
		String oldParameters = parameters;
		parameters = newParameters;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebDevProjectMMPackage.SOCIAL_NETWORK_CONTENT__PARAMETERS, oldParameters, parameters));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SocialNetwork_Type getSocialNetworkType() {
		return socialNetworkType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSocialNetworkType(SocialNetwork_Type newSocialNetworkType) {
		SocialNetwork_Type oldSocialNetworkType = socialNetworkType;
		socialNetworkType = newSocialNetworkType == null ? SOCIAL_NETWORK_TYPE_EDEFAULT : newSocialNetworkType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebDevProjectMMPackage.SOCIAL_NETWORK_CONTENT__SOCIAL_NETWORK_TYPE, oldSocialNetworkType, socialNetworkType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WebDevProjectMMPackage.SOCIAL_NETWORK_CONTENT__PARAMETERS:
				return getParameters();
			case WebDevProjectMMPackage.SOCIAL_NETWORK_CONTENT__SOCIAL_NETWORK_TYPE:
				return getSocialNetworkType();
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
			case WebDevProjectMMPackage.SOCIAL_NETWORK_CONTENT__PARAMETERS:
				setParameters((String)newValue);
				return;
			case WebDevProjectMMPackage.SOCIAL_NETWORK_CONTENT__SOCIAL_NETWORK_TYPE:
				setSocialNetworkType((SocialNetwork_Type)newValue);
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
			case WebDevProjectMMPackage.SOCIAL_NETWORK_CONTENT__PARAMETERS:
				setParameters(PARAMETERS_EDEFAULT);
				return;
			case WebDevProjectMMPackage.SOCIAL_NETWORK_CONTENT__SOCIAL_NETWORK_TYPE:
				setSocialNetworkType(SOCIAL_NETWORK_TYPE_EDEFAULT);
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
			case WebDevProjectMMPackage.SOCIAL_NETWORK_CONTENT__PARAMETERS:
				return PARAMETERS_EDEFAULT == null ? parameters != null : !PARAMETERS_EDEFAULT.equals(parameters);
			case WebDevProjectMMPackage.SOCIAL_NETWORK_CONTENT__SOCIAL_NETWORK_TYPE:
				return socialNetworkType != SOCIAL_NETWORK_TYPE_EDEFAULT;
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
		result.append(" (parameters: ");
		result.append(parameters);
		result.append(", socialNetworkType: ");
		result.append(socialNetworkType);
		result.append(')');
		return result.toString();
	}

} //SocialNetworkContentImpl
