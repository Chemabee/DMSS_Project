/**
 */
package WebDevProjectMM.impl;

import WebDevProjectMM.Attribute;
import WebDevProjectMM.AttributePrimitiveData_Type;
import WebDevProjectMM.WebDevProjectMMPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link WebDevProjectMM.impl.AttributeImpl#getName <em>Name</em>}</li>
 *   <li>{@link WebDevProjectMM.impl.AttributeImpl#getAttributePrimitiveData_Type <em>Attribute Primitive Data Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AttributeImpl extends EObjectImpl implements Attribute {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getAttributePrimitiveData_Type() <em>Attribute Primitive Data Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributePrimitiveData_Type()
	 * @generated
	 * @ordered
	 */
	protected static final AttributePrimitiveData_Type ATTRIBUTE_PRIMITIVE_DATA_TYPE_EDEFAULT = AttributePrimitiveData_Type.REAL;

	/**
	 * The cached value of the '{@link #getAttributePrimitiveData_Type() <em>Attribute Primitive Data Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributePrimitiveData_Type()
	 * @generated
	 * @ordered
	 */
	protected AttributePrimitiveData_Type attributePrimitiveData_Type = ATTRIBUTE_PRIMITIVE_DATA_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttributeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WebDevProjectMMPackage.Literals.ATTRIBUTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebDevProjectMMPackage.ATTRIBUTE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributePrimitiveData_Type getAttributePrimitiveData_Type() {
		return attributePrimitiveData_Type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttributePrimitiveData_Type(AttributePrimitiveData_Type newAttributePrimitiveData_Type) {
		AttributePrimitiveData_Type oldAttributePrimitiveData_Type = attributePrimitiveData_Type;
		attributePrimitiveData_Type = newAttributePrimitiveData_Type == null ? ATTRIBUTE_PRIMITIVE_DATA_TYPE_EDEFAULT : newAttributePrimitiveData_Type;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebDevProjectMMPackage.ATTRIBUTE__ATTRIBUTE_PRIMITIVE_DATA_TYPE, oldAttributePrimitiveData_Type, attributePrimitiveData_Type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WebDevProjectMMPackage.ATTRIBUTE__NAME:
				return getName();
			case WebDevProjectMMPackage.ATTRIBUTE__ATTRIBUTE_PRIMITIVE_DATA_TYPE:
				return getAttributePrimitiveData_Type();
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
			case WebDevProjectMMPackage.ATTRIBUTE__NAME:
				setName((String)newValue);
				return;
			case WebDevProjectMMPackage.ATTRIBUTE__ATTRIBUTE_PRIMITIVE_DATA_TYPE:
				setAttributePrimitiveData_Type((AttributePrimitiveData_Type)newValue);
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
			case WebDevProjectMMPackage.ATTRIBUTE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case WebDevProjectMMPackage.ATTRIBUTE__ATTRIBUTE_PRIMITIVE_DATA_TYPE:
				setAttributePrimitiveData_Type(ATTRIBUTE_PRIMITIVE_DATA_TYPE_EDEFAULT);
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
			case WebDevProjectMMPackage.ATTRIBUTE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case WebDevProjectMMPackage.ATTRIBUTE__ATTRIBUTE_PRIMITIVE_DATA_TYPE:
				return attributePrimitiveData_Type != ATTRIBUTE_PRIMITIVE_DATA_TYPE_EDEFAULT;
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
		result.append(" (name: ");
		result.append(name);
		result.append(", attributePrimitiveData_Type: ");
		result.append(attributePrimitiveData_Type);
		result.append(')');
		return result.toString();
	}

} //AttributeImpl
