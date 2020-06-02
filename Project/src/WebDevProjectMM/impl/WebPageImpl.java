/**
 */
package WebDevProjectMM.impl;

import WebDevProjectMM.Elements;
import WebDevProjectMM.PageLink;
import WebDevProjectMM.Role;
import WebDevProjectMM.SocialNetworkContent;
import WebDevProjectMM.WebDevProjectMMPackage;
import WebDevProjectMM.WebPage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Web Page</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link WebDevProjectMM.impl.WebPageImpl#getSocialnetworkcontent <em>Socialnetworkcontent</em>}</li>
 *   <li>{@link WebDevProjectMM.impl.WebPageImpl#getName <em>Name</em>}</li>
 *   <li>{@link WebDevProjectMM.impl.WebPageImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link WebDevProjectMM.impl.WebPageImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link WebDevProjectMM.impl.WebPageImpl#getElements <em>Elements</em>}</li>
 *   <li>{@link WebDevProjectMM.impl.WebPageImpl#getOutgoing <em>Outgoing</em>}</li>
 *   <li>{@link WebDevProjectMM.impl.WebPageImpl#getIncoming <em>Incoming</em>}</li>
 *   <li>{@link WebDevProjectMM.impl.WebPageImpl#getRole <em>Role</em>}</li>
 *   <li>{@link WebDevProjectMM.impl.WebPageImpl#getExternalLink <em>External Link</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class WebPageImpl extends EObjectImpl implements WebPage {
	/**
	 * The cached value of the '{@link #getSocialnetworkcontent() <em>Socialnetworkcontent</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSocialnetworkcontent()
	 * @generated
	 * @ordered
	 */
	protected EList<SocialNetworkContent> socialnetworkcontent;

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
	 * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected String title = TITLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getElements() <em>Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElements()
	 * @generated
	 * @ordered
	 */
	protected EList<Elements> elements;

	/**
	 * The cached value of the '{@link #getOutgoing() <em>Outgoing</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutgoing()
	 * @generated
	 * @ordered
	 */
	protected EList<PageLink> outgoing;

	/**
	 * The cached value of the '{@link #getIncoming() <em>Incoming</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncoming()
	 * @generated
	 * @ordered
	 */
	protected EList<PageLink> incoming;

	/**
	 * The cached value of the '{@link #getRole() <em>Role</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole()
	 * @generated
	 * @ordered
	 */
	protected EList<Role> role;

	/**
	 * The cached value of the '{@link #getExternalLink() <em>External Link</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternalLink()
	 * @generated
	 * @ordered
	 */
	protected EList<String> externalLink;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WebPageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WebDevProjectMMPackage.Literals.WEB_PAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SocialNetworkContent> getSocialnetworkcontent() {
		if (socialnetworkcontent == null) {
			socialnetworkcontent = new EObjectContainmentEList<SocialNetworkContent>(SocialNetworkContent.class, this, WebDevProjectMMPackage.WEB_PAGE__SOCIALNETWORKCONTENT);
		}
		return socialnetworkcontent;
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
			eNotify(new ENotificationImpl(this, Notification.SET, WebDevProjectMMPackage.WEB_PAGE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitle(String newTitle) {
		String oldTitle = title;
		title = newTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebDevProjectMMPackage.WEB_PAGE__TITLE, oldTitle, title));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebDevProjectMMPackage.WEB_PAGE__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Elements> getElements() {
		if (elements == null) {
			elements = new EObjectContainmentEList<Elements>(Elements.class, this, WebDevProjectMMPackage.WEB_PAGE__ELEMENTS);
		}
		return elements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PageLink> getOutgoing() {
		if (outgoing == null) {
			outgoing = new EObjectWithInverseResolvingEList<PageLink>(PageLink.class, this, WebDevProjectMMPackage.WEB_PAGE__OUTGOING, WebDevProjectMMPackage.PAGE_LINK__SOURCE);
		}
		return outgoing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PageLink> getIncoming() {
		if (incoming == null) {
			incoming = new EObjectWithInverseResolvingEList<PageLink>(PageLink.class, this, WebDevProjectMMPackage.WEB_PAGE__INCOMING, WebDevProjectMMPackage.PAGE_LINK__TARGET);
		}
		return incoming;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Role> getRole() {
		if (role == null) {
			role = new EObjectWithInverseResolvingEList.ManyInverse<Role>(Role.class, this, WebDevProjectMMPackage.WEB_PAGE__ROLE, WebDevProjectMMPackage.ROLE__WEBPAGE);
		}
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getExternalLink() {
		if (externalLink == null) {
			externalLink = new EDataTypeEList<String>(String.class, this, WebDevProjectMMPackage.WEB_PAGE__EXTERNAL_LINK);
		}
		return externalLink;
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
			case WebDevProjectMMPackage.WEB_PAGE__OUTGOING:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOutgoing()).basicAdd(otherEnd, msgs);
			case WebDevProjectMMPackage.WEB_PAGE__INCOMING:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIncoming()).basicAdd(otherEnd, msgs);
			case WebDevProjectMMPackage.WEB_PAGE__ROLE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRole()).basicAdd(otherEnd, msgs);
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
			case WebDevProjectMMPackage.WEB_PAGE__SOCIALNETWORKCONTENT:
				return ((InternalEList<?>)getSocialnetworkcontent()).basicRemove(otherEnd, msgs);
			case WebDevProjectMMPackage.WEB_PAGE__ELEMENTS:
				return ((InternalEList<?>)getElements()).basicRemove(otherEnd, msgs);
			case WebDevProjectMMPackage.WEB_PAGE__OUTGOING:
				return ((InternalEList<?>)getOutgoing()).basicRemove(otherEnd, msgs);
			case WebDevProjectMMPackage.WEB_PAGE__INCOMING:
				return ((InternalEList<?>)getIncoming()).basicRemove(otherEnd, msgs);
			case WebDevProjectMMPackage.WEB_PAGE__ROLE:
				return ((InternalEList<?>)getRole()).basicRemove(otherEnd, msgs);
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
			case WebDevProjectMMPackage.WEB_PAGE__SOCIALNETWORKCONTENT:
				return getSocialnetworkcontent();
			case WebDevProjectMMPackage.WEB_PAGE__NAME:
				return getName();
			case WebDevProjectMMPackage.WEB_PAGE__TITLE:
				return getTitle();
			case WebDevProjectMMPackage.WEB_PAGE__DESCRIPTION:
				return getDescription();
			case WebDevProjectMMPackage.WEB_PAGE__ELEMENTS:
				return getElements();
			case WebDevProjectMMPackage.WEB_PAGE__OUTGOING:
				return getOutgoing();
			case WebDevProjectMMPackage.WEB_PAGE__INCOMING:
				return getIncoming();
			case WebDevProjectMMPackage.WEB_PAGE__ROLE:
				return getRole();
			case WebDevProjectMMPackage.WEB_PAGE__EXTERNAL_LINK:
				return getExternalLink();
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
			case WebDevProjectMMPackage.WEB_PAGE__SOCIALNETWORKCONTENT:
				getSocialnetworkcontent().clear();
				getSocialnetworkcontent().addAll((Collection<? extends SocialNetworkContent>)newValue);
				return;
			case WebDevProjectMMPackage.WEB_PAGE__NAME:
				setName((String)newValue);
				return;
			case WebDevProjectMMPackage.WEB_PAGE__TITLE:
				setTitle((String)newValue);
				return;
			case WebDevProjectMMPackage.WEB_PAGE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case WebDevProjectMMPackage.WEB_PAGE__ELEMENTS:
				getElements().clear();
				getElements().addAll((Collection<? extends Elements>)newValue);
				return;
			case WebDevProjectMMPackage.WEB_PAGE__OUTGOING:
				getOutgoing().clear();
				getOutgoing().addAll((Collection<? extends PageLink>)newValue);
				return;
			case WebDevProjectMMPackage.WEB_PAGE__INCOMING:
				getIncoming().clear();
				getIncoming().addAll((Collection<? extends PageLink>)newValue);
				return;
			case WebDevProjectMMPackage.WEB_PAGE__ROLE:
				getRole().clear();
				getRole().addAll((Collection<? extends Role>)newValue);
				return;
			case WebDevProjectMMPackage.WEB_PAGE__EXTERNAL_LINK:
				getExternalLink().clear();
				getExternalLink().addAll((Collection<? extends String>)newValue);
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
			case WebDevProjectMMPackage.WEB_PAGE__SOCIALNETWORKCONTENT:
				getSocialnetworkcontent().clear();
				return;
			case WebDevProjectMMPackage.WEB_PAGE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case WebDevProjectMMPackage.WEB_PAGE__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case WebDevProjectMMPackage.WEB_PAGE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case WebDevProjectMMPackage.WEB_PAGE__ELEMENTS:
				getElements().clear();
				return;
			case WebDevProjectMMPackage.WEB_PAGE__OUTGOING:
				getOutgoing().clear();
				return;
			case WebDevProjectMMPackage.WEB_PAGE__INCOMING:
				getIncoming().clear();
				return;
			case WebDevProjectMMPackage.WEB_PAGE__ROLE:
				getRole().clear();
				return;
			case WebDevProjectMMPackage.WEB_PAGE__EXTERNAL_LINK:
				getExternalLink().clear();
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
			case WebDevProjectMMPackage.WEB_PAGE__SOCIALNETWORKCONTENT:
				return socialnetworkcontent != null && !socialnetworkcontent.isEmpty();
			case WebDevProjectMMPackage.WEB_PAGE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case WebDevProjectMMPackage.WEB_PAGE__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
			case WebDevProjectMMPackage.WEB_PAGE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case WebDevProjectMMPackage.WEB_PAGE__ELEMENTS:
				return elements != null && !elements.isEmpty();
			case WebDevProjectMMPackage.WEB_PAGE__OUTGOING:
				return outgoing != null && !outgoing.isEmpty();
			case WebDevProjectMMPackage.WEB_PAGE__INCOMING:
				return incoming != null && !incoming.isEmpty();
			case WebDevProjectMMPackage.WEB_PAGE__ROLE:
				return role != null && !role.isEmpty();
			case WebDevProjectMMPackage.WEB_PAGE__EXTERNAL_LINK:
				return externalLink != null && !externalLink.isEmpty();
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
		result.append(", title: ");
		result.append(title);
		result.append(", description: ");
		result.append(description);
		result.append(", externalLink: ");
		result.append(externalLink);
		result.append(')');
		return result.toString();
	}

} //WebPageImpl
