/**
 */
package WebDevProjectMM;

import java.math.BigInteger;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Role</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link WebDevProjectMM.Role#getName <em>Name</em>}</li>
 *   <li>{@link WebDevProjectMM.Role#getNumAccesiblePages <em>Num Accesible Pages</em>}</li>
 *   <li>{@link WebDevProjectMM.Role#getWebpage <em>Webpage</em>}</li>
 * </ul>
 *
 * @see WebDevProjectMM.WebDevProjectMMPackage#getRole()
 * @model annotation="gmf.node figure='svg' label='name' svg.uri='platform:/plugin/Project/figures/user.svg' label.icon='false' label.placement='external'"
 * @generated
 */
public interface Role extends EObject {
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
	 * @see WebDevProjectMM.WebDevProjectMMPackage#getRole_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link WebDevProjectMM.Role#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Num Accesible Pages</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Num Accesible Pages</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Num Accesible Pages</em>' attribute.
	 * @see #setNumAccesiblePages(BigInteger)
	 * @see WebDevProjectMM.WebDevProjectMMPackage#getRole_NumAccesiblePages()
	 * @model required="true" transient="true" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot derivation='self.webpage->size()'"
	 * @generated
	 */
	BigInteger getNumAccesiblePages();

	/**
	 * Sets the value of the '{@link WebDevProjectMM.Role#getNumAccesiblePages <em>Num Accesible Pages</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Num Accesible Pages</em>' attribute.
	 * @see #getNumAccesiblePages()
	 * @generated
	 */
	void setNumAccesiblePages(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Webpage</b></em>' reference list.
	 * The list contents are of type {@link WebDevProjectMM.WebPage}.
	 * It is bidirectional and its opposite is '{@link WebDevProjectMM.WebPage#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Webpage</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Webpage</em>' reference list.
	 * @see WebDevProjectMM.WebDevProjectMMPackage#getRole_Webpage()
	 * @see WebDevProjectMM.WebPage#getRole
	 * @model opposite="role" required="true"
	 *        annotation="gmf.link target.decoration='arrow' color='178,178,178' style='dot'"
	 * @generated
	 */
	EList<WebPage> getWebpage();

} // Role
