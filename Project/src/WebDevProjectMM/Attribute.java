/**
 */
package WebDevProjectMM;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link WebDevProjectMM.Attribute#getName <em>Name</em>}</li>
 *   <li>{@link WebDevProjectMM.Attribute#getAttributePrimitiveData_Type <em>Attribute Primitive Data Type</em>}</li>
 * </ul>
 *
 * @see WebDevProjectMM.WebDevProjectMMPackage#getAttribute()
 * @model
 * @generated
 */
public interface Attribute extends EObject {
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
	 * @see WebDevProjectMM.WebDevProjectMMPackage#getAttribute_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link WebDevProjectMM.Attribute#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Attribute Primitive Data Type</b></em>' attribute.
	 * The literals are from the enumeration {@link WebDevProjectMM.AttributePrimitiveData_Type}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute Primitive Data Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute Primitive Data Type</em>' attribute.
	 * @see WebDevProjectMM.AttributePrimitiveData_Type
	 * @see #setAttributePrimitiveData_Type(AttributePrimitiveData_Type)
	 * @see WebDevProjectMM.WebDevProjectMMPackage#getAttribute_AttributePrimitiveData_Type()
	 * @model required="true"
	 * @generated
	 */
	AttributePrimitiveData_Type getAttributePrimitiveData_Type();

	/**
	 * Sets the value of the '{@link WebDevProjectMM.Attribute#getAttributePrimitiveData_Type <em>Attribute Primitive Data Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute Primitive Data Type</em>' attribute.
	 * @see WebDevProjectMM.AttributePrimitiveData_Type
	 * @see #getAttributePrimitiveData_Type()
	 * @generated
	 */
	void setAttributePrimitiveData_Type(AttributePrimitiveData_Type value);

} // Attribute
