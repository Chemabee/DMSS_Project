/**
 */
package WebDevProjectMM;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Social Network Content</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link WebDevProjectMM.SocialNetworkContent#getParameters <em>Parameters</em>}</li>
 *   <li>{@link WebDevProjectMM.SocialNetworkContent#getSocialNetworkType <em>Social Network Type</em>}</li>
 * </ul>
 *
 * @see WebDevProjectMM.WebDevProjectMMPackage#getSocialNetworkContent()
 * @model annotation="gmf.node label='parameters' color='203,223,189'"
 * @generated
 */
public interface SocialNetworkContent extends EObject {
	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameters</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' attribute.
	 * @see #setParameters(String)
	 * @see WebDevProjectMM.WebDevProjectMMPackage#getSocialNetworkContent_Parameters()
	 * @model required="true"
	 * @generated
	 */
	String getParameters();

	/**
	 * Sets the value of the '{@link WebDevProjectMM.SocialNetworkContent#getParameters <em>Parameters</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameters</em>' attribute.
	 * @see #getParameters()
	 * @generated
	 */
	void setParameters(String value);

	/**
	 * Returns the value of the '<em><b>Social Network Type</b></em>' attribute.
	 * The literals are from the enumeration {@link WebDevProjectMM.SocialNetwork_Type}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Social Network Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Social Network Type</em>' attribute.
	 * @see WebDevProjectMM.SocialNetwork_Type
	 * @see #setSocialNetworkType(SocialNetwork_Type)
	 * @see WebDevProjectMM.WebDevProjectMMPackage#getSocialNetworkContent_SocialNetworkType()
	 * @model required="true"
	 * @generated
	 */
	SocialNetwork_Type getSocialNetworkType();

	/**
	 * Sets the value of the '{@link WebDevProjectMM.SocialNetworkContent#getSocialNetworkType <em>Social Network Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Social Network Type</em>' attribute.
	 * @see WebDevProjectMM.SocialNetwork_Type
	 * @see #getSocialNetworkType()
	 * @generated
	 */
	void setSocialNetworkType(SocialNetwork_Type value);

} // SocialNetworkContent
