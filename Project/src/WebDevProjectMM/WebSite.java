/**
 */
package WebDevProjectMM;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Web Site</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link WebDevProjectMM.WebSite#getRoles <em>Roles</em>}</li>
 *   <li>{@link WebDevProjectMM.WebSite#getWebPages <em>Web Pages</em>}</li>
 *   <li>{@link WebDevProjectMM.WebSite#getName <em>Name</em>}</li>
 *   <li>{@link WebDevProjectMM.WebSite#getTitle <em>Title</em>}</li>
 *   <li>{@link WebDevProjectMM.WebSite#getDescription <em>Description</em>}</li>
 *   <li>{@link WebDevProjectMM.WebSite#getURL <em>URL</em>}</li>
 *   <li>{@link WebDevProjectMM.WebSite#getLink <em>Link</em>}</li>
 * </ul>
 *
 * @see WebDevProjectMM.WebDevProjectMMPackage#getWebSite()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='R6MustIncludeAtLeastOneQuestionnaire R6MustIncludeAtLeastOneSurvey'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot R6MustIncludeAtLeastOneQuestionnaire='\n\t\t\tlet allForms : Collection(Form) = self.webPages->selectByKind(Form),\n\t\t\t\texistsAnyQuestionnaires : Boolean = allForms->exists(f : Form | f.formType = Form_Type::QUESTIONNAIRE)\n\t\t\tin\n\t\t\t\texistsAnyQuestionnaires' R6MustIncludeAtLeastOneSurvey='\n\t\t\tlet allForms : Collection(Form) = self.webPages->selectByKind(Form),\n\t\t\t\texistsAnySurvey : Boolean = allForms->exists(f : Form | f.formType = Form_Type::SURVEY)\n\t\t\tin\n\t\t\t\texistsAnySurvey'"
 *        annotation="gmf.diagram label='name'"
 * @generated
 */
public interface WebSite extends EObject {
	/**
	 * Returns the value of the '<em><b>Roles</b></em>' containment reference list.
	 * The list contents are of type {@link WebDevProjectMM.Role}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Roles</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Roles</em>' containment reference list.
	 * @see WebDevProjectMM.WebDevProjectMMPackage#getWebSite_Roles()
	 * @model containment="true" required="true"
	 *        annotation="gmf.compartment layout='list'"
	 * @generated
	 */
	EList<Role> getRoles();

	/**
	 * Returns the value of the '<em><b>Web Pages</b></em>' containment reference list.
	 * The list contents are of type {@link WebDevProjectMM.WebPage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Web Pages</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Web Pages</em>' containment reference list.
	 * @see WebDevProjectMM.WebDevProjectMMPackage#getWebSite_WebPages()
	 * @model containment="true" required="true"
	 *        annotation="gmf.compartment layout='list'"
	 * @generated
	 */
	EList<WebPage> getWebPages();

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
	 * @see WebDevProjectMM.WebDevProjectMMPackage#getWebSite_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link WebDevProjectMM.WebSite#getName <em>Name</em>}' attribute.
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
	 * @see WebDevProjectMM.WebDevProjectMMPackage#getWebSite_Title()
	 * @model required="true"
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link WebDevProjectMM.WebSite#getTitle <em>Title</em>}' attribute.
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
	 * @see WebDevProjectMM.WebDevProjectMMPackage#getWebSite_Description()
	 * @model required="true"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link WebDevProjectMM.WebSite#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>URL</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>URL</em>' attribute.
	 * @see #setURL(String)
	 * @see WebDevProjectMM.WebDevProjectMMPackage#getWebSite_URL()
	 * @model required="true"
	 * @generated
	 */
	String getURL();

	/**
	 * Sets the value of the '{@link WebDevProjectMM.WebSite#getURL <em>URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>URL</em>' attribute.
	 * @see #getURL()
	 * @generated
	 */
	void setURL(String value);

	/**
	 * Returns the value of the '<em><b>Link</b></em>' containment reference list.
	 * The list contents are of type {@link WebDevProjectMM.PageLink}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Link</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link</em>' containment reference list.
	 * @see WebDevProjectMM.WebDevProjectMMPackage#getWebSite_Link()
	 * @model containment="true"
	 * @generated
	 */
	EList<PageLink> getLink();

} // WebSite
