/**
 */
package WebDevProjectMM;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link WebDevProjectMM.Entity#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link WebDevProjectMM.Entity#getRefersTo <em>Refers To</em>}</li>
 *   <li>{@link WebDevProjectMM.Entity#getId <em>Id</em>}</li>
 *   <li>{@link WebDevProjectMM.Entity#getPrimary_key <em>Primary key</em>}</li>
 * </ul>
 *
 * @see WebDevProjectMM.WebDevProjectMMPackage#getEntity()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='primaryKeyMustBeOwnAttribute canNotReferToItself'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot primaryKeyMustBeOwnAttribute='self.attributes->includes(self.primary_key)' canNotReferToItself='not self.refersTo->includes(self)'"
 * @generated
 */
public interface Entity extends EObject {
	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
	 * The list contents are of type {@link WebDevProjectMM.Attribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attributes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' containment reference list.
	 * @see WebDevProjectMM.WebDevProjectMMPackage#getEntity_Attributes()
	 * @model containment="true" required="true"
	 *        annotation="gmf.compartment layout='list'"
	 * @generated
	 */
	EList<Attribute> getAttributes();

	/**
	 * Returns the value of the '<em><b>Refers To</b></em>' reference list.
	 * The list contents are of type {@link WebDevProjectMM.Entity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Refers To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refers To</em>' reference list.
	 * @see WebDevProjectMM.WebDevProjectMMPackage#getEntity_RefersTo()
	 * @model
	 * @generated
	 */
	EList<Entity> getRefersTo();

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see WebDevProjectMM.WebDevProjectMMPackage#getEntity_Id()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link WebDevProjectMM.Entity#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Primary key</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Primary key</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Primary key</em>' reference.
	 * @see #setPrimary_key(Attribute)
	 * @see WebDevProjectMM.WebDevProjectMMPackage#getEntity_Primary_key()
	 * @model required="true"
	 * @generated
	 */
	Attribute getPrimary_key();

	/**
	 * Sets the value of the '{@link WebDevProjectMM.Entity#getPrimary_key <em>Primary key</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Primary key</em>' reference.
	 * @see #getPrimary_key()
	 * @generated
	 */
	void setPrimary_key(Attribute value);

} // Entity
