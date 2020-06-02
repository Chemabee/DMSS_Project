/**
 */
package WebDevProjectMM.impl;

import WebDevProjectMM.Role;
import WebDevProjectMM.WebDevProjectMMPackage;
import WebDevProjectMM.WebPage;

import java.math.BigInteger;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Role</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link WebDevProjectMM.impl.RoleImpl#getName <em>Name</em>}</li>
 *   <li>{@link WebDevProjectMM.impl.RoleImpl#getNumAccesiblePages <em>Num Accesible Pages</em>}</li>
 *   <li>{@link WebDevProjectMM.impl.RoleImpl#getWebpage <em>Webpage</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RoleImpl extends EObjectImpl implements Role {
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
	 * The cached setting delegate for the '{@link #getNumAccesiblePages() <em>Num Accesible Pages</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumAccesiblePages()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate NUM_ACCESIBLE_PAGES__ESETTING_DELEGATE = ((EStructuralFeature.Internal)WebDevProjectMMPackage.Literals.ROLE__NUM_ACCESIBLE_PAGES).getSettingDelegate();

	/**
	 * The cached value of the '{@link #getWebpage() <em>Webpage</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWebpage()
	 * @generated
	 * @ordered
	 */
	protected EList<WebPage> webpage;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WebDevProjectMMPackage.Literals.ROLE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, WebDevProjectMMPackage.ROLE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getNumAccesiblePages() {
		return (BigInteger)NUM_ACCESIBLE_PAGES__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumAccesiblePages(BigInteger newNumAccesiblePages) {
		NUM_ACCESIBLE_PAGES__ESETTING_DELEGATE.dynamicSet(this, null, 0, newNumAccesiblePages);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<WebPage> getWebpage() {
		if (webpage == null) {
			webpage = new EObjectWithInverseResolvingEList.ManyInverse<WebPage>(WebPage.class, this, WebDevProjectMMPackage.ROLE__WEBPAGE, WebDevProjectMMPackage.WEB_PAGE__ROLE);
		}
		return webpage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WebDevProjectMMPackage.ROLE__WEBPAGE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getWebpage()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WebDevProjectMMPackage.ROLE__WEBPAGE:
				return ((InternalEList<?>)getWebpage()).basicRemove(otherEnd, msgs);
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
			case WebDevProjectMMPackage.ROLE__NAME:
				return getName();
			case WebDevProjectMMPackage.ROLE__NUM_ACCESIBLE_PAGES:
				return getNumAccesiblePages();
			case WebDevProjectMMPackage.ROLE__WEBPAGE:
				return getWebpage();
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
			case WebDevProjectMMPackage.ROLE__NAME:
				setName((String)newValue);
				return;
			case WebDevProjectMMPackage.ROLE__NUM_ACCESIBLE_PAGES:
				setNumAccesiblePages((BigInteger)newValue);
				return;
			case WebDevProjectMMPackage.ROLE__WEBPAGE:
				getWebpage().clear();
				getWebpage().addAll((Collection<? extends WebPage>)newValue);
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
			case WebDevProjectMMPackage.ROLE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case WebDevProjectMMPackage.ROLE__NUM_ACCESIBLE_PAGES:
				NUM_ACCESIBLE_PAGES__ESETTING_DELEGATE.dynamicUnset(this, null, 0);
				return;
			case WebDevProjectMMPackage.ROLE__WEBPAGE:
				getWebpage().clear();
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
			case WebDevProjectMMPackage.ROLE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case WebDevProjectMMPackage.ROLE__NUM_ACCESIBLE_PAGES:
				return NUM_ACCESIBLE_PAGES__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case WebDevProjectMMPackage.ROLE__WEBPAGE:
				return webpage != null && !webpage.isEmpty();
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
		result.append(')');
		return result.toString();
	}

} //RoleImpl
