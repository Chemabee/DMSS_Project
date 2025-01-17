/*
 * 
 */
package WebDevProjectMM.diagram.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypeImages;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypes;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;

/**
 * @generated
 */
public class WebDevProjectMMElementTypes {

	/**
	* @generated
	*/
	private WebDevProjectMMElementTypes() {
	}

	/**
	* @generated
	*/
	private static Map<IElementType, ENamedElement> elements;

	/**
	* @generated
	*/
	private static DiagramElementTypeImages elementTypeImages = new DiagramElementTypeImages(
			WebDevProjectMM.diagram.part.WebDevProjectMMDiagramEditorPlugin.getInstance()
					.getItemProvidersAdapterFactory());

	/**
	* @generated
	*/
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	* @generated
	*/
	public static final IElementType WebSite_1000 = getElementType("Project.diagram.WebSite_1000"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType CreationCRUD_2001 = getElementType("Project.diagram.CreationCRUD_2001"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType DelitionCRUD_2002 = getElementType("Project.diagram.DelitionCRUD_2002"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType AllCRUD_2003 = getElementType("Project.diagram.AllCRUD_2003"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType IndexCRUD_2004 = getElementType("Project.diagram.IndexCRUD_2004"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType DetailCRUD_2005 = getElementType("Project.diagram.DetailCRUD_2005"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType RegularContentPage_2006 = getElementType(
			"Project.diagram.RegularContentPage_2006"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Form_2007 = getElementType("Project.diagram.Form_2007"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Role_2008 = getElementType("Project.diagram.Role_2008"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Text_3001 = getElementType("Project.diagram.Text_3001"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType MediaContent_3002 = getElementType("Project.diagram.MediaContent_3002"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType SocialNetworkContent_3003 = getElementType(
			"Project.diagram.SocialNetworkContent_3003"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType StoredQuestion_3004 = getElementType("Project.diagram.StoredQuestion_3004"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType QuestionDefinition_3005 = getElementType(
			"Project.diagram.QuestionDefinition_3005"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType PossibleAsnwer_3006 = getElementType("Project.diagram.PossibleAsnwer_3006"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType PageLink_4001 = getElementType("Project.diagram.PageLink_4001"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType RoleWebpage_4002 = getElementType("Project.diagram.RoleWebpage_4002"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static ImageDescriptor getImageDescriptor(ENamedElement element) {
		return elementTypeImages.getImageDescriptor(element);
	}

	/**
	* @generated
	*/
	public static Image getImage(ENamedElement element) {
		return elementTypeImages.getImage(element);
	}

	/**
	* @generated
	*/
	public static ImageDescriptor getImageDescriptor(IAdaptable hint) {
		return getImageDescriptor(getElement(hint));
	}

	/**
	* @generated
	*/
	public static Image getImage(IAdaptable hint) {
		return getImage(getElement(hint));
	}

	/**
	* Returns 'type' of the ecore object associated with the hint.
	* 
	* @generated
	*/
	public static ENamedElement getElement(IAdaptable hint) {
		Object type = hint.getAdapter(IElementType.class);
		if (elements == null) {
			elements = new IdentityHashMap<IElementType, ENamedElement>();

			elements.put(WebSite_1000, WebDevProjectMM.WebDevProjectMMPackage.eINSTANCE.getWebSite());

			elements.put(CreationCRUD_2001, WebDevProjectMM.WebDevProjectMMPackage.eINSTANCE.getCreationCRUD());

			elements.put(DelitionCRUD_2002, WebDevProjectMM.WebDevProjectMMPackage.eINSTANCE.getDelitionCRUD());

			elements.put(AllCRUD_2003, WebDevProjectMM.WebDevProjectMMPackage.eINSTANCE.getAllCRUD());

			elements.put(IndexCRUD_2004, WebDevProjectMM.WebDevProjectMMPackage.eINSTANCE.getIndexCRUD());

			elements.put(DetailCRUD_2005, WebDevProjectMM.WebDevProjectMMPackage.eINSTANCE.getDetailCRUD());

			elements.put(RegularContentPage_2006,
					WebDevProjectMM.WebDevProjectMMPackage.eINSTANCE.getRegularContentPage());

			elements.put(Form_2007, WebDevProjectMM.WebDevProjectMMPackage.eINSTANCE.getForm());

			elements.put(Role_2008, WebDevProjectMM.WebDevProjectMMPackage.eINSTANCE.getRole());

			elements.put(Text_3001, WebDevProjectMM.WebDevProjectMMPackage.eINSTANCE.getText());

			elements.put(MediaContent_3002, WebDevProjectMM.WebDevProjectMMPackage.eINSTANCE.getMediaContent());

			elements.put(SocialNetworkContent_3003,
					WebDevProjectMM.WebDevProjectMMPackage.eINSTANCE.getSocialNetworkContent());

			elements.put(StoredQuestion_3004, WebDevProjectMM.WebDevProjectMMPackage.eINSTANCE.getStoredQuestion());

			elements.put(QuestionDefinition_3005,
					WebDevProjectMM.WebDevProjectMMPackage.eINSTANCE.getQuestionDefinition());

			elements.put(PossibleAsnwer_3006, WebDevProjectMM.WebDevProjectMMPackage.eINSTANCE.getPossibleAsnwer());

			elements.put(PageLink_4001, WebDevProjectMM.WebDevProjectMMPackage.eINSTANCE.getPageLink());

			elements.put(RoleWebpage_4002, WebDevProjectMM.WebDevProjectMMPackage.eINSTANCE.getRole_Webpage());
		}
		return (ENamedElement) elements.get(type);
	}

	/**
	* @generated
	*/
	private static IElementType getElementType(String id) {
		return ElementTypeRegistry.getInstance().getType(id);
	}

	/**
	* @generated
	*/
	public static boolean isKnownElementType(IElementType elementType) {
		if (KNOWN_ELEMENT_TYPES == null) {
			KNOWN_ELEMENT_TYPES = new HashSet<IElementType>();
			KNOWN_ELEMENT_TYPES.add(WebSite_1000);
			KNOWN_ELEMENT_TYPES.add(CreationCRUD_2001);
			KNOWN_ELEMENT_TYPES.add(DelitionCRUD_2002);
			KNOWN_ELEMENT_TYPES.add(AllCRUD_2003);
			KNOWN_ELEMENT_TYPES.add(IndexCRUD_2004);
			KNOWN_ELEMENT_TYPES.add(DetailCRUD_2005);
			KNOWN_ELEMENT_TYPES.add(RegularContentPage_2006);
			KNOWN_ELEMENT_TYPES.add(Form_2007);
			KNOWN_ELEMENT_TYPES.add(Role_2008);
			KNOWN_ELEMENT_TYPES.add(Text_3001);
			KNOWN_ELEMENT_TYPES.add(MediaContent_3002);
			KNOWN_ELEMENT_TYPES.add(SocialNetworkContent_3003);
			KNOWN_ELEMENT_TYPES.add(StoredQuestion_3004);
			KNOWN_ELEMENT_TYPES.add(QuestionDefinition_3005);
			KNOWN_ELEMENT_TYPES.add(PossibleAsnwer_3006);
			KNOWN_ELEMENT_TYPES.add(PageLink_4001);
			KNOWN_ELEMENT_TYPES.add(RoleWebpage_4002);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	* @generated
	*/
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case WebDevProjectMM.diagram.edit.parts.WebSiteEditPart.VISUAL_ID:
			return WebSite_1000;
		case WebDevProjectMM.diagram.edit.parts.CreationCRUDEditPart.VISUAL_ID:
			return CreationCRUD_2001;
		case WebDevProjectMM.diagram.edit.parts.DelitionCRUDEditPart.VISUAL_ID:
			return DelitionCRUD_2002;
		case WebDevProjectMM.diagram.edit.parts.AllCRUDEditPart.VISUAL_ID:
			return AllCRUD_2003;
		case WebDevProjectMM.diagram.edit.parts.IndexCRUDEditPart.VISUAL_ID:
			return IndexCRUD_2004;
		case WebDevProjectMM.diagram.edit.parts.DetailCRUDEditPart.VISUAL_ID:
			return DetailCRUD_2005;
		case WebDevProjectMM.diagram.edit.parts.RegularContentPageEditPart.VISUAL_ID:
			return RegularContentPage_2006;
		case WebDevProjectMM.diagram.edit.parts.FormEditPart.VISUAL_ID:
			return Form_2007;
		case WebDevProjectMM.diagram.edit.parts.RoleEditPart.VISUAL_ID:
			return Role_2008;
		case WebDevProjectMM.diagram.edit.parts.TextEditPart.VISUAL_ID:
			return Text_3001;
		case WebDevProjectMM.diagram.edit.parts.MediaContentEditPart.VISUAL_ID:
			return MediaContent_3002;
		case WebDevProjectMM.diagram.edit.parts.SocialNetworkContentEditPart.VISUAL_ID:
			return SocialNetworkContent_3003;
		case WebDevProjectMM.diagram.edit.parts.StoredQuestionEditPart.VISUAL_ID:
			return StoredQuestion_3004;
		case WebDevProjectMM.diagram.edit.parts.QuestionDefinitionEditPart.VISUAL_ID:
			return QuestionDefinition_3005;
		case WebDevProjectMM.diagram.edit.parts.PossibleAsnwerEditPart.VISUAL_ID:
			return PossibleAsnwer_3006;
		case WebDevProjectMM.diagram.edit.parts.PageLinkEditPart.VISUAL_ID:
			return PageLink_4001;
		case WebDevProjectMM.diagram.edit.parts.RoleWebpageEditPart.VISUAL_ID:
			return RoleWebpage_4002;
		}
		return null;
	}

	/**
	* @generated
	*/
	public static final DiagramElementTypes TYPED_INSTANCE = new DiagramElementTypes(elementTypeImages) {

		/**
		* @generated
		*/
		@Override

		public boolean isKnownElementType(IElementType elementType) {
			return WebDevProjectMM.diagram.providers.WebDevProjectMMElementTypes.isKnownElementType(elementType);
		}

		/**
		* @generated
		*/
		@Override

		public IElementType getElementTypeForVisualId(int visualID) {
			return WebDevProjectMM.diagram.providers.WebDevProjectMMElementTypes.getElementType(visualID);
		}

		/**
		* @generated
		*/
		@Override

		public ENamedElement getDefiningNamedElement(IAdaptable elementTypeAdapter) {
			return WebDevProjectMM.diagram.providers.WebDevProjectMMElementTypes.getElement(elementTypeAdapter);
		}
	};

}
