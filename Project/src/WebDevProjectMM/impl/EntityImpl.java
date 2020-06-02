/**
 */
package WebDevProjectMM.impl;

import WebDevProjectMM.Attribute;
import WebDevProjectMM.Entity;
import WebDevProjectMM.WebDevProjectMMPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link WebDevProjectMM.impl.EntityImpl#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link WebDevProjectMM.impl.EntityImpl#getRefersTo <em>Refers To</em>}</li>
 *   <li>{@link WebDevProjectMM.impl.EntityImpl#getId <em>Id</em>}</li>
 *   <li>{@link WebDevProjectMM.impl.EntityImpl#getPrimary_key <em>Primary key</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EntityImpl extends EObjectImpl implements Entity {
	/**
	 * The cached value of the '{@link #getAttributes() <em>Attributes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList<Attribute> attributes;

	/**
	 * The cached value of the '{@link #getRefersTo() <em>Refers To</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefersTo()
	 * @generated
	 * @ordered
	 */
	protected EList<Entity> refersTo;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPrimary_key() <em>Primary key</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimary_key()
	 * @generated
	 * @ordered
	 */
	protected Attribute primary_key;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EntityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WebDevProjectMMPackage.Literals.ENTITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Attribute> getAttributes() {
		if (attributes == null) {
			attributes = new EObjectContainmentEList<Attribute>(Attribute.class, this, WebDevProjectMMPackage.ENTITY__ATTRIBUTES);
		}
		return attributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Entity> getRefersTo() {
		if (refersTo == null) {
			refersTo = new EObjectResolvingEList<Entity>(Entity.class, this, WebDevProjectMMPackage.ENTITY__REFERS_TO);
		}
		return refersTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebDevProjectMMPackage.ENTITY__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute getPrimary_key() {
		if (primary_key != null && primary_key.eIsProxy()) {
			InternalEObject oldPrimary_key = (InternalEObject)primary_key;
			primary_key = (Attribute)eResolveProxy(oldPrimary_key);
			if (primary_key != oldPrimary_key) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WebDevProjectMMPackage.ENTITY__PRIMARY_KEY, oldPrimary_key, primary_key));
			}
		}
		return primary_key;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute basicGetPrimary_key() {
		return primary_key;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrimary_key(Attribute newPrimary_key) {
		Attribute oldPrimary_key = primary_key;
		primary_key = newPrimary_key;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebDevProjectMMPackage.ENTITY__PRIMARY_KEY, oldPrimary_key, primary_key));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WebDevProjectMMPackage.ENTITY__ATTRIBUTES:
				return ((InternalEList<?>)getAttributes()).basicRemove(otherEnd, msgs);
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
			case WebDevProjectMMPackage.ENTITY__ATTRIBUTES:
				return getAttributes();
			case WebDevProjectMMPackage.ENTITY__REFERS_TO:
				return getRefersTo();
			case WebDevProjectMMPackage.ENTITY__ID:
				return getId();
			case WebDevProjectMMPackage.ENTITY__PRIMARY_KEY:
				if (resolve) return getPrimary_key();
				return basicGetPrimary_key();
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
			case WebDevProjectMMPackage.ENTITY__ATTRIBUTES:
				getAttributes().clear();
				getAttributes().addAll((Collection<? extends Attribute>)newValue);
				return;
			case WebDevProjectMMPackage.ENTITY__REFERS_TO:
				getRefersTo().clear();
				getRefersTo().addAll((Collection<? extends Entity>)newValue);
				return;
			case WebDevProjectMMPackage.ENTITY__ID:
				setId((String)newValue);
				return;
			case WebDevProjectMMPackage.ENTITY__PRIMARY_KEY:
				setPrimary_key((Attribute)newValue);
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
			case WebDevProjectMMPackage.ENTITY__ATTRIBUTES:
				getAttributes().clear();
				return;
			case WebDevProjectMMPackage.ENTITY__REFERS_TO:
				getRefersTo().clear();
				return;
			case WebDevProjectMMPackage.ENTITY__ID:
				setId(ID_EDEFAULT);
				return;
			case WebDevProjectMMPackage.ENTITY__PRIMARY_KEY:
				setPrimary_key((Attribute)null);
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
			case WebDevProjectMMPackage.ENTITY__ATTRIBUTES:
				return attributes != null && !attributes.isEmpty();
			case WebDevProjectMMPackage.ENTITY__REFERS_TO:
				return refersTo != null && !refersTo.isEmpty();
			case WebDevProjectMMPackage.ENTITY__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case WebDevProjectMMPackage.ENTITY__PRIMARY_KEY:
				return primary_key != null;
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
		result.append(" (id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //EntityImpl
