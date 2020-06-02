/**
 */
package WebDevProjectMM.impl;

import WebDevProjectMM.PageLink;
import WebDevProjectMM.Role;
import WebDevProjectMM.WebDevProjectMMPackage;
import WebDevProjectMM.WebPage;
import WebDevProjectMM.WebSite;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Web Site</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link WebDevProjectMM.impl.WebSiteImpl#getRoles <em>Roles</em>}</li>
 *   <li>{@link WebDevProjectMM.impl.WebSiteImpl#getWebPages <em>Web Pages</em>}</li>
 *   <li>{@link WebDevProjectMM.impl.WebSiteImpl#getName <em>Name</em>}</li>
 *   <li>{@link WebDevProjectMM.impl.WebSiteImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link WebDevProjectMM.impl.WebSiteImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link WebDevProjectMM.impl.WebSiteImpl#getURL <em>URL</em>}</li>
 *   <li>{@link WebDevProjectMM.impl.WebSiteImpl#getLink <em>Link</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WebSiteImpl extends EObjectImpl implements WebSite {
	/**
	 * The cached value of the '{@link #getRoles() <em>Roles</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoles()
	 * @generated
	 * @ordered
	 */
	protected EList<Role> roles;

	/**
	 * The cached value of the '{@link #getWebPages() <em>Web Pages</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWebPages()
	 * @generated
	 * @ordered
	 */
	protected EList<WebPage> webPages;

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
	 * The default value of the '{@link #getURL() <em>URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getURL()
	 * @generated
	 * @ordered
	 */
	protected static final String URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getURL() <em>URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getURL()
	 * @generated
	 * @ordered
	 */
	protected String url = URL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLink() <em>Link</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLink()
	 * @generated
	 * @ordered
	 */
	protected EList<PageLink> link;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WebSiteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WebDevProjectMMPackage.Literals.WEB_SITE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Role> getRoles() {
		if (roles == null) {
			roles = new EObjectContainmentEList<Role>(Role.class, this, WebDevProjectMMPackage.WEB_SITE__ROLES);
		}
		return roles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<WebPage> getWebPages() {
		if (webPages == null) {
			webPages = new EObjectContainmentEList<WebPage>(WebPage.class, this, WebDevProjectMMPackage.WEB_SITE__WEB_PAGES);
		}
		return webPages;
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
			eNotify(new ENotificationImpl(this, Notification.SET, WebDevProjectMMPackage.WEB_SITE__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WebDevProjectMMPackage.WEB_SITE__TITLE, oldTitle, title));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WebDevProjectMMPackage.WEB_SITE__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getURL() {
		return url;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setURL(String newURL) {
		String oldURL = url;
		url = newURL;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebDevProjectMMPackage.WEB_SITE__URL, oldURL, url));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PageLink> getLink() {
		if (link == null) {
			link = new EObjectContainmentEList<PageLink>(PageLink.class, this, WebDevProjectMMPackage.WEB_SITE__LINK);
		}
		return link;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WebDevProjectMMPackage.WEB_SITE__ROLES:
				return ((InternalEList<?>)getRoles()).basicRemove(otherEnd, msgs);
			case WebDevProjectMMPackage.WEB_SITE__WEB_PAGES:
				return ((InternalEList<?>)getWebPages()).basicRemove(otherEnd, msgs);
			case WebDevProjectMMPackage.WEB_SITE__LINK:
				return ((InternalEList<?>)getLink()).basicRemove(otherEnd, msgs);
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
			case WebDevProjectMMPackage.WEB_SITE__ROLES:
				return getRoles();
			case WebDevProjectMMPackage.WEB_SITE__WEB_PAGES:
				return getWebPages();
			case WebDevProjectMMPackage.WEB_SITE__NAME:
				return getName();
			case WebDevProjectMMPackage.WEB_SITE__TITLE:
				return getTitle();
			case WebDevProjectMMPackage.WEB_SITE__DESCRIPTION:
				return getDescription();
			case WebDevProjectMMPackage.WEB_SITE__URL:
				return getURL();
			case WebDevProjectMMPackage.WEB_SITE__LINK:
				return getLink();
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
			case WebDevProjectMMPackage.WEB_SITE__ROLES:
				getRoles().clear();
				getRoles().addAll((Collection<? extends Role>)newValue);
				return;
			case WebDevProjectMMPackage.WEB_SITE__WEB_PAGES:
				getWebPages().clear();
				getWebPages().addAll((Collection<? extends WebPage>)newValue);
				return;
			case WebDevProjectMMPackage.WEB_SITE__NAME:
				setName((String)newValue);
				return;
			case WebDevProjectMMPackage.WEB_SITE__TITLE:
				setTitle((String)newValue);
				return;
			case WebDevProjectMMPackage.WEB_SITE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case WebDevProjectMMPackage.WEB_SITE__URL:
				setURL((String)newValue);
				return;
			case WebDevProjectMMPackage.WEB_SITE__LINK:
				getLink().clear();
				getLink().addAll((Collection<? extends PageLink>)newValue);
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
			case WebDevProjectMMPackage.WEB_SITE__ROLES:
				getRoles().clear();
				return;
			case WebDevProjectMMPackage.WEB_SITE__WEB_PAGES:
				getWebPages().clear();
				return;
			case WebDevProjectMMPackage.WEB_SITE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case WebDevProjectMMPackage.WEB_SITE__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case WebDevProjectMMPackage.WEB_SITE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case WebDevProjectMMPackage.WEB_SITE__URL:
				setURL(URL_EDEFAULT);
				return;
			case WebDevProjectMMPackage.WEB_SITE__LINK:
				getLink().clear();
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
			case WebDevProjectMMPackage.WEB_SITE__ROLES:
				return roles != null && !roles.isEmpty();
			case WebDevProjectMMPackage.WEB_SITE__WEB_PAGES:
				return webPages != null && !webPages.isEmpty();
			case WebDevProjectMMPackage.WEB_SITE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case WebDevProjectMMPackage.WEB_SITE__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
			case WebDevProjectMMPackage.WEB_SITE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case WebDevProjectMMPackage.WEB_SITE__URL:
				return URL_EDEFAULT == null ? url != null : !URL_EDEFAULT.equals(url);
			case WebDevProjectMMPackage.WEB_SITE__LINK:
				return link != null && !link.isEmpty();
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
		result.append(", URL: ");
		result.append(url);
		result.append(')');
		return result.toString();
	}

} //WebSiteImpl
