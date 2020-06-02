/**
 */
package WebDevProjectMM;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Web Page</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link WebDevProjectMM.WebPage#getSocialnetworkcontent <em>Socialnetworkcontent</em>}</li>
 *   <li>{@link WebDevProjectMM.WebPage#getName <em>Name</em>}</li>
 *   <li>{@link WebDevProjectMM.WebPage#getTitle <em>Title</em>}</li>
 *   <li>{@link WebDevProjectMM.WebPage#getDescription <em>Description</em>}</li>
 *   <li>{@link WebDevProjectMM.WebPage#getElements <em>Elements</em>}</li>
 *   <li>{@link WebDevProjectMM.WebPage#getOutgoing <em>Outgoing</em>}</li>
 *   <li>{@link WebDevProjectMM.WebPage#getIncoming <em>Incoming</em>}</li>
 *   <li>{@link WebDevProjectMM.WebPage#getRole <em>Role</em>}</li>
 *   <li>{@link WebDevProjectMM.WebPage#getExternalLink <em>External Link</em>}</li>
 * </ul>
 *
 * @see WebDevProjectMM.WebDevProjectMMPackage#getWebPage()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='R2isolatedWebPage'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot R2isolatedWebPage='self.role->size() > 0 or self.incoming->size() > 0'"
 *        annotation="gmf.node label='name'"
 * @generated
 */
public interface WebPage extends EObject {
	/**
	 * Returns the value of the '<em><b>Socialnetworkcontent</b></em>' containment reference list.
	 * The list contents are of type {@link WebDevProjectMM.SocialNetworkContent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Socialnetworkcontent</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Socialnetworkcontent</em>' containment reference list.
	 * @see WebDevProjectMM.WebDevProjectMMPackage#getWebPage_Socialnetworkcontent()
	 * @model containment="true"
	 *        annotation="gmf.compartment layout='list'"
	 * @generated
	 */
	EList<SocialNetworkContent> getSocialnetworkcontent();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see WebDevProjectMM.WebDevProjectMMPackage#getWebPage_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link WebDevProjectMM.WebPage#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Title</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see WebDevProjectMM.WebDevProjectMMPackage#getWebPage_Title()
	 * @model required="true"
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link WebDevProjectMM.WebPage#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see WebDevProjectMM.WebDevProjectMMPackage#getWebPage_Description()
	 * @model required="true"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link WebDevProjectMM.WebPage#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link WebDevProjectMM.Elements}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see WebDevProjectMM.WebDevProjectMMPackage#getWebPage_Elements()
	 * @model containment="true"
	 *        annotation="gmf.compartment layout='list'"
	 * @generated
	 */
	EList<Elements> getElements();

	/**
	 * Returns the value of the '<em><b>Outgoing</b></em>' reference list.
	 * The list contents are of type {@link WebDevProjectMM.PageLink}.
	 * It is bidirectional and its opposite is '{@link WebDevProjectMM.PageLink#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outgoing</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing</em>' reference list.
	 * @see WebDevProjectMM.WebDevProjectMMPackage#getWebPage_Outgoing()
	 * @see WebDevProjectMM.PageLink#getSource
	 * @model opposite="source"
	 * @generated
	 */
	EList<PageLink> getOutgoing();

	/**
	 * Returns the value of the '<em><b>Incoming</b></em>' reference list.
	 * The list contents are of type {@link WebDevProjectMM.PageLink}.
	 * It is bidirectional and its opposite is '{@link WebDevProjectMM.PageLink#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incoming</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming</em>' reference list.
	 * @see WebDevProjectMM.WebDevProjectMMPackage#getWebPage_Incoming()
	 * @see WebDevProjectMM.PageLink#getTarget
	 * @model opposite="target"
	 * @generated
	 */
	EList<PageLink> getIncoming();

	/**
	 * Returns the value of the '<em><b>Role</b></em>' reference list.
	 * The list contents are of type {@link WebDevProjectMM.Role}.
	 * It is bidirectional and its opposite is '{@link WebDevProjectMM.Role#getWebpage <em>Webpage</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role</em>' reference list.
	 * @see WebDevProjectMM.WebDevProjectMMPackage#getWebPage_Role()
	 * @see WebDevProjectMM.Role#getWebpage
	 * @model opposite="webpage"
	 * @generated
	 */
	EList<Role> getRole();

	/**
	 * Returns the value of the '<em><b>External Link</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>External Link</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>External Link</em>' attribute list.
	 * @see WebDevProjectMM.WebDevProjectMMPackage#getWebPage_ExternalLink()
	 * @model unique="false"
	 * @generated
	 */
	EList<String> getExternalLink();

} // WebPage
