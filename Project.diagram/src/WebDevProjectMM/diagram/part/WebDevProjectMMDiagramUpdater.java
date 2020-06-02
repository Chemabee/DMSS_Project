/*
* 
*/
package WebDevProjectMM.diagram.part;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;

/**
 * @generated
 */
public class WebDevProjectMMDiagramUpdater {

	/**
	* @generated
	*/
	public static boolean isShortcutOrphaned(View view) {
		return !view.isSetElement() || view.getElement() == null || view.getElement().eIsProxy();
	}

	/**
	* @generated
	*/
	public static List<WebDevProjectMM.diagram.part.WebDevProjectMMNodeDescriptor> getSemanticChildren(View view) {
		switch (WebDevProjectMM.diagram.part.WebDevProjectMMVisualIDRegistry.getVisualID(view)) {
		case WebDevProjectMM.diagram.edit.parts.WebSiteEditPart.VISUAL_ID:
			return getWebSite_1000SemanticChildren(view);
		case WebDevProjectMM.diagram.edit.parts.CreationCRUDCreationCRUDSocialnetworkcontentCompartmentEditPart.VISUAL_ID:
			return getCreationCRUDCreationCRUDSocialnetworkcontentCompartment_7001SemanticChildren(view);
		case WebDevProjectMM.diagram.edit.parts.CreationCRUDCreationCRUDElementsCompartmentEditPart.VISUAL_ID:
			return getCreationCRUDCreationCRUDElementsCompartment_7002SemanticChildren(view);
		case WebDevProjectMM.diagram.edit.parts.DelitionCRUDDelitionCRUDSocialnetworkcontentCompartmentEditPart.VISUAL_ID:
			return getDelitionCRUDDelitionCRUDSocialnetworkcontentCompartment_7003SemanticChildren(view);
		case WebDevProjectMM.diagram.edit.parts.DelitionCRUDDelitionCRUDElementsCompartmentEditPart.VISUAL_ID:
			return getDelitionCRUDDelitionCRUDElementsCompartment_7004SemanticChildren(view);
		case WebDevProjectMM.diagram.edit.parts.AllCRUDAllCRUDSocialnetworkcontentCompartmentEditPart.VISUAL_ID:
			return getAllCRUDAllCRUDSocialnetworkcontentCompartment_7005SemanticChildren(view);
		case WebDevProjectMM.diagram.edit.parts.AllCRUDAllCRUDElementsCompartmentEditPart.VISUAL_ID:
			return getAllCRUDAllCRUDElementsCompartment_7006SemanticChildren(view);
		case WebDevProjectMM.diagram.edit.parts.IndexCRUDIndexCRUDSocialnetworkcontentCompartmentEditPart.VISUAL_ID:
			return getIndexCRUDIndexCRUDSocialnetworkcontentCompartment_7007SemanticChildren(view);
		case WebDevProjectMM.diagram.edit.parts.IndexCRUDIndexCRUDElementsCompartmentEditPart.VISUAL_ID:
			return getIndexCRUDIndexCRUDElementsCompartment_7008SemanticChildren(view);
		case WebDevProjectMM.diagram.edit.parts.DetailCRUDDetailCRUDSocialnetworkcontentCompartmentEditPart.VISUAL_ID:
			return getDetailCRUDDetailCRUDSocialnetworkcontentCompartment_7009SemanticChildren(view);
		case WebDevProjectMM.diagram.edit.parts.DetailCRUDDetailCRUDElementsCompartmentEditPart.VISUAL_ID:
			return getDetailCRUDDetailCRUDElementsCompartment_7010SemanticChildren(view);
		case WebDevProjectMM.diagram.edit.parts.RegularContentPageRegularContentPageSocialnetworkcontentCompartmentEditPart.VISUAL_ID:
			return getRegularContentPageRegularContentPageSocialnetworkcontentCompartment_7011SemanticChildren(view);
		case WebDevProjectMM.diagram.edit.parts.RegularContentPageRegularContentPageElementsCompartmentEditPart.VISUAL_ID:
			return getRegularContentPageRegularContentPageElementsCompartment_7012SemanticChildren(view);
		case WebDevProjectMM.diagram.edit.parts.FormFormSocialnetworkcontentCompartmentEditPart.VISUAL_ID:
			return getFormFormSocialnetworkcontentCompartment_7013SemanticChildren(view);
		case WebDevProjectMM.diagram.edit.parts.FormFormElementsCompartmentEditPart.VISUAL_ID:
			return getFormFormElementsCompartment_7014SemanticChildren(view);
		case WebDevProjectMM.diagram.edit.parts.FormFormQuestionsCompartmentEditPart.VISUAL_ID:
			return getFormFormQuestionsCompartment_7015SemanticChildren(view);
		case WebDevProjectMM.diagram.edit.parts.QuestionDefinitionQuestionDefinitionPossibleAsnwerCompartmentEditPart.VISUAL_ID:
			return getQuestionDefinitionQuestionDefinitionPossibleAsnwerCompartment_7016SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebDevProjectMM.diagram.part.WebDevProjectMMNodeDescriptor> getWebSite_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		WebDevProjectMM.WebSite modelElement = (WebDevProjectMM.WebSite) view.getElement();
		LinkedList<WebDevProjectMM.diagram.part.WebDevProjectMMNodeDescriptor> result = new LinkedList<WebDevProjectMM.diagram.part.WebDevProjectMMNodeDescriptor>();
		for (Iterator<?> it = modelElement.getWebPages().iterator(); it.hasNext();) {
			WebDevProjectMM.WebPage childElement = (WebDevProjectMM.WebPage) it.next();
			int visualID = WebDevProjectMM.diagram.part.WebDevProjectMMVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == WebDevProjectMM.diagram.edit.parts.CreationCRUDEditPart.VISUAL_ID) {
				result.add(new WebDevProjectMM.diagram.part.WebDevProjectMMNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == WebDevProjectMM.diagram.edit.parts.DelitionCRUDEditPart.VISUAL_ID) {
				result.add(new WebDevProjectMM.diagram.part.WebDevProjectMMNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == WebDevProjectMM.diagram.edit.parts.AllCRUDEditPart.VISUAL_ID) {
				result.add(new WebDevProjectMM.diagram.part.WebDevProjectMMNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == WebDevProjectMM.diagram.edit.parts.IndexCRUDEditPart.VISUAL_ID) {
				result.add(new WebDevProjectMM.diagram.part.WebDevProjectMMNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == WebDevProjectMM.diagram.edit.parts.DetailCRUDEditPart.VISUAL_ID) {
				result.add(new WebDevProjectMM.diagram.part.WebDevProjectMMNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == WebDevProjectMM.diagram.edit.parts.RegularContentPageEditPart.VISUAL_ID) {
				result.add(new WebDevProjectMM.diagram.part.WebDevProjectMMNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == WebDevProjectMM.diagram.edit.parts.FormEditPart.VISUAL_ID) {
				result.add(new WebDevProjectMM.diagram.part.WebDevProjectMMNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getRoles().iterator(); it.hasNext();) {
			WebDevProjectMM.Role childElement = (WebDevProjectMM.Role) it.next();
			int visualID = WebDevProjectMM.diagram.part.WebDevProjectMMVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == WebDevProjectMM.diagram.edit.parts.RoleEditPart.VISUAL_ID) {
				result.add(new WebDevProjectMM.diagram.part.WebDevProjectMMNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<WebDevProjectMM.diagram.part.WebDevProjectMMNodeDescriptor> getCreationCRUDCreationCRUDSocialnetworkcontentCompartment_7001SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		WebDevProjectMM.CreationCRUD modelElement = (WebDevProjectMM.CreationCRUD) containerView.getElement();
		LinkedList<WebDevProjectMM.diagram.part.WebDevProjectMMNodeDescriptor> result = new LinkedList<WebDevProjectMM.diagram.part.WebDevProjectMMNodeDescriptor>();
		for (Iterator<?> it = modelElement.getSocialnetworkcontent().iterator(); it.hasNext();) {
			WebDevProjectMM.SocialNetworkContent childElement = (WebDevProjectMM.SocialNetworkContent) it.next();
			int visualID = WebDevProjectMM.diagram.part.WebDevProjectMMVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == WebDevProjectMM.diagram.edit.parts.SocialNetworkContentEditPart.VISUAL_ID) {
				result.add(new WebDevProjectMM.diagram.part.WebDevProjectMMNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<WebDevProjectMM.diagram.part.WebDevProjectMMNodeDescriptor> getCreationCRUDCreationCRUDElementsCompartment_7002SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		WebDevProjectMM.CreationCRUD modelElement = (WebDevProjectMM.CreationCRUD) containerView.getElement();
		LinkedList<WebDevProjectMM.diagram.part.WebDevProjectMMNodeDescriptor> result = new LinkedList<WebDevProjectMM.diagram.part.WebDevProjectMMNodeDescriptor>();
		for (Iterator<?> it = modelElement.getElements().iterator(); it.hasNext();) {
			WebDevProjectMM.Elements childElement = (WebDevProjectMM.Elements) it.next();
			int visualID = WebDevProjectMM.diagram.part.WebDevProjectMMVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == WebDevProjectMM.diagram.edit.parts.TextEditPart.VISUAL_ID) {
				result.add(new WebDevProjectMM.diagram.part.WebDevProjectMMNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == WebDevProjectMM.diagram.edit.parts.MediaContentEditPart.VISUAL_ID) {
				result.add(new WebDevProjectMM.diagram.part.WebDevProjectMMNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<WebDevProjectMM.diagram.part.WebDevProjectMMNodeDescriptor> getDelitionCRUDDelitionCRUDSocialnetworkcontentCompartment_7003SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		WebDevProjectMM.DelitionCRUD modelElement = (WebDevProjectMM.DelitionCRUD) containerView.getElement();
		LinkedList<WebDevProjectMM.diagram.part.WebDevProjectMMNodeDescriptor> result = new LinkedList<WebDevProjectMM.diagram.part.WebDevProjectMMNodeDescriptor>();
		for (Iterator<?> it = modelElement.getSocialnetworkcontent().iterator(); it.hasNext();) {
			WebDevProjectMM.SocialNetworkContent childElement = (WebDevProjectMM.SocialNetworkContent) it.next();
			int visualID = WebDevProjectMM.diagram.part.WebDevProjectMMVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == WebDevProjectMM.diagram.edit.parts.SocialNetworkContentEditPart.VISUAL_ID) {
				result.add(new WebDevProjectMM.diagram.part.WebDevProjectMMNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<WebDevProjectMM.diagram.part.WebDevProjectMMNodeDescriptor> getDelitionCRUDDelitionCRUDElementsCompartment_7004SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		WebDevProjectMM.DelitionCRUD modelElement = (WebDevProjectMM.DelitionCRUD) containerView.getElement();
		LinkedList<WebDevProjectMM.diagram.part.WebDevProjectMMNodeDescriptor> result = new LinkedList<WebDevProjectMM.diagram.part.WebDevProjectMMNodeDescriptor>();
		for (Iterator<?> it = modelElement.getElements().iterator(); it.hasNext();) {
			WebDevProjectMM.Elements childElement = (WebDevProjectMM.Elements) it.next();
			int visualID = WebDevProjectMM.diagram.part.WebDevProjectMMVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == WebDevProjectMM.diagram.edit.parts.TextEditPart.VISUAL_ID) {
				result.add(new WebDevProjectMM.diagram.part.WebDevProjectMMNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == WebDevProjectMM.diagram.edit.parts.MediaContentEditPart.VISUAL_ID) {
				result.add(new WebDevProjectMM.diagram.part.WebDevProjectMMNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<WebDevProjectMM.diagram.part.WebDevProjectMMNodeDescriptor> getAllCRUDAllCRUDSocialnetworkcontentCompartment_7005SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		WebDevProjectMM.AllCRUD modelElement = (WebDevProjectMM.AllCRUD) containerView.getElement();
		LinkedList<WebDevProjectMM.diagram.part.WebDevProjectMMNodeDescriptor> result = new LinkedList<WebDevProjectMM.diagram.part.WebDevProjectMMNodeDescriptor>();
		for (Iterator<?> it = modelElement.getSocialnetworkcontent().iterator(); it.hasNext();) {
			WebDevProjectMM.SocialNetworkContent childElement = (WebDevProjectMM.SocialNetworkContent) it.next();
			int visualID = WebDevProjectMM.diagram.part.WebDevProjectMMVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == WebDevProjectMM.diagram.edit.parts.SocialNetworkContentEditPart.VISUAL_ID) {
				result.add(new WebDevProjectMM.diagram.part.WebDevProjectMMNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<WebDevProjectMM.diagram.part.WebDevProjectMMNodeDescriptor> getAllCRUDAllCRUDElementsCompartment_7006SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		WebDevProjectMM.AllCRUD modelElement = (WebDevProjectMM.AllCRUD) containerView.getElement();
		LinkedList<WebDevProjectMM.diagram.part.WebDevProjectMMNodeDescriptor> result = new LinkedList<WebDevProjectMM.diagram.part.WebDevProjectMMNodeDescriptor>();
		for (Iterator<?> it = modelElement.getElements().iterator(); it.hasNext();) {
			WebDevProjectMM.Elements childElement = (WebDevProjectMM.Elements) it.next();
			int visualID = WebDevProjectMM.diagram.part.WebDevProjectMMVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == WebDevProjectMM.diagram.edit.parts.TextEditPart.VISUAL_ID) {
				result.add(new WebDevProjectMM.diagram.part.WebDevProjectMMNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == WebDevProjectMM.diagram.edit.parts.MediaContentEditPart.VISUAL_ID) {
				result.add(new WebDevProjectMM.diagram.part.WebDevProjectMMNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<WebDevProjectMM.diagram.part.WebDevProjectMMNodeDescriptor> getIndexCRUDIndexCRUDSocialnetworkcontentCompartment_7007SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		WebDevProjectMM.IndexCRUD modelElement = (WebDevProjectMM.IndexCRUD) containerView.getElement();
		LinkedList<WebDevProjectMM.diagram.part.WebDevProjectMMNodeDescriptor> result = new LinkedList<WebDevProjectMM.diagram.part.WebDevProjectMMNodeDescriptor>();
		for (Iterator<?> it = modelElement.getSocialnetworkcontent().iterator(); it.hasNext();) {
			WebDevProjectMM.SocialNetworkContent childElement = (WebDevProjectMM.SocialNetworkContent) it.next();
			int visualID = WebDevProjectMM.diagram.part.WebDevProjectMMVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == WebDevProjectMM.diagram.edit.parts.SocialNetworkContentEditPart.VISUAL_ID) {
				result.add(new WebDevProjectMM.diagram.part.WebDevProjectMMNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<WebDevProjectMM.diagram.part.WebDevProjectMMNodeDescriptor> getIndexCRUDIndexCRUDElementsCompartment_7008SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		WebDevProjectMM.IndexCRUD modelElement = (WebDevProjectMM.IndexCRUD) containerView.getElement();
		LinkedList<WebDevProjectMM.diagram.part.WebDevProjectMMNodeDescriptor> result = new LinkedList<WebDevProjectMM.diagram.part.WebDevProjectMMNodeDescriptor>();
		for (Iterator<?> it = modelElement.getElements().iterator(); it.hasNext();) {
			WebDevProjectMM.Elements childElement = (WebDevProjectMM.Elements) it.next();
			int visualID = WebDevProjectMM.diagram.part.WebDevProjectMMVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == WebDevProjectMM.diagram.edit.parts.TextEditPart.VISUAL_ID) {
				result.add(new WebDevProjectMM.diagram.part.WebDevProjectMMNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == WebDevProjectMM.diagram.edit.parts.MediaContentEditPart.VISUAL_ID) {
				result.add(new WebDevProjectMM.diagram.part.WebDevProjectMMNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<WebDevProjectMM.diagram.part.WebDevProjectMMNodeDescriptor> getDetailCRUDDetailCRUDSocialnetworkcontentCompartment_7009SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		WebDevProjectMM.DetailCRUD modelElement = (WebDevProjectMM.DetailCRUD) containerView.getElement();
		LinkedList<WebDevProjectMM.diagram.part.WebDevProjectMMNodeDescriptor> result = new LinkedList<WebDevProjectMM.diagram.part.WebDevProjectMMNodeDescriptor>();
		for (Iterator<?> it = modelElement.getSocialnetworkcontent().iterator(); it.hasNext();) {
			WebDevProjectMM.SocialNetworkContent childElement = (WebDevProjectMM.SocialNetworkContent) it.next();
			int visualID = WebDevProjectMM.diagram.part.WebDevProjectMMVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == WebDevProjectMM.diagram.edit.parts.SocialNetworkContentEditPart.VISUAL_ID) {
				result.add(new WebDevProjectMM.diagram.part.WebDevProjectMMNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<WebDevProjectMM.diagram.part.WebDevProjectMMNodeDescriptor> getDetailCRUDDetailCRUDElementsCompartment_7010SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		WebDevProjectMM.DetailCRUD modelElement = (WebDevProjectMM.DetailCRUD) containerView.getElement();
		LinkedList<WebDevProjectMM.diagram.part.WebDevProjectMMNodeDescriptor> result = new LinkedList<WebDevProjectMM.diagram.part.WebDevProjectMMNodeDescriptor>();
		for (Iterator<?> it = modelElement.getElements().iterator(); it.hasNext();) {
			WebDevProjectMM.Elements childElement = (WebDevProjectMM.Elements) it.next();
			int visualID = WebDevProjectMM.diagram.part.WebDevProjectMMVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == WebDevProjectMM.diagram.edit.parts.TextEditPart.VISUAL_ID) {
				result.add(new WebDevProjectMM.diagram.part.WebDevProjectMMNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == WebDevProjectMM.diagram.edit.parts.MediaContentEditPart.VISUAL_ID) {
				result.add(new WebDevProjectMM.diagram.part.WebDevProjectMMNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<WebDevProjectMM.diagram.part.WebDevProjectMMNodeDescriptor> getRegularContentPageRegularContentPageSocialnetworkcontentCompartment_7011SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		WebDevProjectMM.RegularContentPage modelElement = (WebDevProjectMM.RegularContentPage) containerView
				.getElement();
		LinkedList<WebDevProjectMM.diagram.part.WebDevProjectMMNodeDescriptor> result = new LinkedList<WebDevProjectMM.diagram.part.WebDevProjectMMNodeDescriptor>();
		for (Iterator<?> it = modelElement.getSocialnetworkcontent().iterator(); it.hasNext();) {
			WebDevProjectMM.SocialNetworkContent childElement = (WebDevProjectMM.SocialNetworkContent) it.next();
			int visualID = WebDevProjectMM.diagram.part.WebDevProjectMMVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == WebDevProjectMM.diagram.edit.parts.SocialNetworkContentEditPart.VISUAL_ID) {
				result.add(new WebDevProjectMM.diagram.part.WebDevProjectMMNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<WebDevProjectMM.diagram.part.WebDevProjectMMNodeDescriptor> getRegularContentPageRegularContentPageElementsCompartment_7012SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		WebDevProjectMM.RegularContentPage modelElement = (WebDevProjectMM.RegularContentPage) containerView
				.getElement();
		LinkedList<WebDevProjectMM.diagram.part.WebDevProjectMMNodeDescriptor> result = new LinkedList<WebDevProjectMM.diagram.part.WebDevProjectMMNodeDescriptor>();
		for (Iterator<?> it = modelElement.getElements().iterator(); it.hasNext();) {
			WebDevProjectMM.Elements childElement = (WebDevProjectMM.Elements) it.next();
			int visualID = WebDevProjectMM.diagram.part.WebDevProjectMMVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == WebDevProjectMM.diagram.edit.parts.TextEditPart.VISUAL_ID) {
				result.add(new WebDevProjectMM.diagram.part.WebDevProjectMMNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == WebDevProjectMM.diagram.edit.parts.MediaContentEditPart.VISUAL_ID) {
				result.add(new WebDevProjectMM.diagram.part.WebDevProjectMMNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<WebDevProjectMM.diagram.part.WebDevProjectMMNodeDescriptor> getFormFormSocialnetworkcontentCompartment_7013SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		WebDevProjectMM.Form modelElement = (WebDevProjectMM.Form) containerView.getElement();
		LinkedList<WebDevProjectMM.diagram.part.WebDevProjectMMNodeDescriptor> result = new LinkedList<WebDevProjectMM.diagram.part.WebDevProjectMMNodeDescriptor>();
		for (Iterator<?> it = modelElement.getSocialnetworkcontent().iterator(); it.hasNext();) {
			WebDevProjectMM.SocialNetworkContent childElement = (WebDevProjectMM.SocialNetworkContent) it.next();
			int visualID = WebDevProjectMM.diagram.part.WebDevProjectMMVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == WebDevProjectMM.diagram.edit.parts.SocialNetworkContentEditPart.VISUAL_ID) {
				result.add(new WebDevProjectMM.diagram.part.WebDevProjectMMNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<WebDevProjectMM.diagram.part.WebDevProjectMMNodeDescriptor> getFormFormElementsCompartment_7014SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		WebDevProjectMM.Form modelElement = (WebDevProjectMM.Form) containerView.getElement();
		LinkedList<WebDevProjectMM.diagram.part.WebDevProjectMMNodeDescriptor> result = new LinkedList<WebDevProjectMM.diagram.part.WebDevProjectMMNodeDescriptor>();
		for (Iterator<?> it = modelElement.getElements().iterator(); it.hasNext();) {
			WebDevProjectMM.Elements childElement = (WebDevProjectMM.Elements) it.next();
			int visualID = WebDevProjectMM.diagram.part.WebDevProjectMMVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == WebDevProjectMM.diagram.edit.parts.TextEditPart.VISUAL_ID) {
				result.add(new WebDevProjectMM.diagram.part.WebDevProjectMMNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == WebDevProjectMM.diagram.edit.parts.MediaContentEditPart.VISUAL_ID) {
				result.add(new WebDevProjectMM.diagram.part.WebDevProjectMMNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<WebDevProjectMM.diagram.part.WebDevProjectMMNodeDescriptor> getFormFormQuestionsCompartment_7015SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		WebDevProjectMM.Form modelElement = (WebDevProjectMM.Form) containerView.getElement();
		LinkedList<WebDevProjectMM.diagram.part.WebDevProjectMMNodeDescriptor> result = new LinkedList<WebDevProjectMM.diagram.part.WebDevProjectMMNodeDescriptor>();
		for (Iterator<?> it = modelElement.getQuestions().iterator(); it.hasNext();) {
			WebDevProjectMM.Question childElement = (WebDevProjectMM.Question) it.next();
			int visualID = WebDevProjectMM.diagram.part.WebDevProjectMMVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == WebDevProjectMM.diagram.edit.parts.StoredQuestionEditPart.VISUAL_ID) {
				result.add(new WebDevProjectMM.diagram.part.WebDevProjectMMNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == WebDevProjectMM.diagram.edit.parts.QuestionDefinitionEditPart.VISUAL_ID) {
				result.add(new WebDevProjectMM.diagram.part.WebDevProjectMMNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<WebDevProjectMM.diagram.part.WebDevProjectMMNodeDescriptor> getQuestionDefinitionQuestionDefinitionPossibleAsnwerCompartment_7016SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		WebDevProjectMM.QuestionDefinition modelElement = (WebDevProjectMM.QuestionDefinition) containerView
				.getElement();
		LinkedList<WebDevProjectMM.diagram.part.WebDevProjectMMNodeDescriptor> result = new LinkedList<WebDevProjectMM.diagram.part.WebDevProjectMMNodeDescriptor>();
		for (Iterator<?> it = modelElement.getPossibleAsnwer().iterator(); it.hasNext();) {
			WebDevProjectMM.PossibleAsnwer childElement = (WebDevProjectMM.PossibleAsnwer) it.next();
			int visualID = WebDevProjectMM.diagram.part.WebDevProjectMMVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == WebDevProjectMM.diagram.edit.parts.PossibleAsnwerEditPart.VISUAL_ID) {
				result.add(new WebDevProjectMM.diagram.part.WebDevProjectMMNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<WebDevProjectMM.diagram.part.WebDevProjectMMLinkDescriptor> getContainedLinks(View view) {
		switch (WebDevProjectMM.diagram.part.WebDevProjectMMVisualIDRegistry.getVisualID(view)) {
		case WebDevProjectMM.diagram.edit.parts.WebSiteEditPart.VISUAL_ID:
			return getWebSite_1000ContainedLinks(view);
		case WebDevProjectMM.diagram.edit.parts.CreationCRUDEditPart.VISUAL_ID:
			return getCreationCRUD_2001ContainedLinks(view);
		case WebDevProjectMM.diagram.edit.parts.DelitionCRUDEditPart.VISUAL_ID:
			return getDelitionCRUD_2002ContainedLinks(view);
		case WebDevProjectMM.diagram.edit.parts.AllCRUDEditPart.VISUAL_ID:
			return getAllCRUD_2003ContainedLinks(view);
		case WebDevProjectMM.diagram.edit.parts.IndexCRUDEditPart.VISUAL_ID:
			return getIndexCRUD_2004ContainedLinks(view);
		case WebDevProjectMM.diagram.edit.parts.DetailCRUDEditPart.VISUAL_ID:
			return getDetailCRUD_2005ContainedLinks(view);
		case WebDevProjectMM.diagram.edit.parts.RegularContentPageEditPart.VISUAL_ID:
			return getRegularContentPage_2006ContainedLinks(view);
		case WebDevProjectMM.diagram.edit.parts.FormEditPart.VISUAL_ID:
			return getForm_2007ContainedLinks(view);
		case WebDevProjectMM.diagram.edit.parts.RoleEditPart.VISUAL_ID:
			return getRole_2008ContainedLinks(view);
		case WebDevProjectMM.diagram.edit.parts.TextEditPart.VISUAL_ID:
			return getText_3001ContainedLinks(view);
		case WebDevProjectMM.diagram.edit.parts.MediaContentEditPart.VISUAL_ID:
			return getMediaContent_3002ContainedLinks(view);
		case WebDevProjectMM.diagram.edit.parts.SocialNetworkContentEditPart.VISUAL_ID:
			return getSocialNetworkContent_3003ContainedLinks(view);
		case WebDevProjectMM.diagram.edit.parts.StoredQuestionEditPart.VISUAL_ID:
			return getStoredQuestion_3004ContainedLinks(view);
		case WebDevProjectMM.diagram.edit.parts.QuestionDefinitionEditPart.VISUAL_ID:
			return getQuestionDefinition_3005ContainedLinks(view);
		case WebDevProjectMM.diagram.edit.parts.PossibleAsnwerEditPart.VISUAL_ID:
			return getPossibleAsnwer_3006ContainedLinks(view);
		case WebDevProjectMM.diagram.edit.parts.PageLinkEditPart.VISUAL_ID:
			return getPageLink_4001ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebDevProjectMM.diagram.part.WebDevProjectMMLinkDescriptor> getIncomingLinks(View view) {
		switch (WebDevProjectMM.diagram.part.WebDevProjectMMVisualIDRegistry.getVisualID(view)) {
		case WebDevProjectMM.diagram.edit.parts.CreationCRUDEditPart.VISUAL_ID:
			return getCreationCRUD_2001IncomingLinks(view);
		case WebDevProjectMM.diagram.edit.parts.DelitionCRUDEditPart.VISUAL_ID:
			return getDelitionCRUD_2002IncomingLinks(view);
		case WebDevProjectMM.diagram.edit.parts.AllCRUDEditPart.VISUAL_ID:
			return getAllCRUD_2003IncomingLinks(view);
		case WebDevProjectMM.diagram.edit.parts.IndexCRUDEditPart.VISUAL_ID:
			return getIndexCRUD_2004IncomingLinks(view);
		case WebDevProjectMM.diagram.edit.parts.DetailCRUDEditPart.VISUAL_ID:
			return getDetailCRUD_2005IncomingLinks(view);
		case WebDevProjectMM.diagram.edit.parts.RegularContentPageEditPart.VISUAL_ID:
			return getRegularContentPage_2006IncomingLinks(view);
		case WebDevProjectMM.diagram.edit.parts.FormEditPart.VISUAL_ID:
			return getForm_2007IncomingLinks(view);
		case WebDevProjectMM.diagram.edit.parts.RoleEditPart.VISUAL_ID:
			return getRole_2008IncomingLinks(view);
		case WebDevProjectMM.diagram.edit.parts.TextEditPart.VISUAL_ID:
			return getText_3001IncomingLinks(view);
		case WebDevProjectMM.diagram.edit.parts.MediaContentEditPart.VISUAL_ID:
			return getMediaContent_3002IncomingLinks(view);
		case WebDevProjectMM.diagram.edit.parts.SocialNetworkContentEditPart.VISUAL_ID:
			return getSocialNetworkContent_3003IncomingLinks(view);
		case WebDevProjectMM.diagram.edit.parts.StoredQuestionEditPart.VISUAL_ID:
			return getStoredQuestion_3004IncomingLinks(view);
		case WebDevProjectMM.diagram.edit.parts.QuestionDefinitionEditPart.VISUAL_ID:
			return getQuestionDefinition_3005IncomingLinks(view);
		case WebDevProjectMM.diagram.edit.parts.PossibleAsnwerEditPart.VISUAL_ID:
			return getPossibleAsnwer_3006IncomingLinks(view);
		case WebDevProjectMM.diagram.edit.parts.PageLinkEditPart.VISUAL_ID:
			return getPageLink_4001IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebDevProjectMM.diagram.part.WebDevProjectMMLinkDescriptor> getOutgoingLinks(View view) {
		switch (WebDevProjectMM.diagram.part.WebDevProjectMMVisualIDRegistry.getVisualID(view)) {
		case WebDevProjectMM.diagram.edit.parts.CreationCRUDEditPart.VISUAL_ID:
			return getCreationCRUD_2001OutgoingLinks(view);
		case WebDevProjectMM.diagram.edit.parts.DelitionCRUDEditPart.VISUAL_ID:
			return getDelitionCRUD_2002OutgoingLinks(view);
		case WebDevProjectMM.diagram.edit.parts.AllCRUDEditPart.VISUAL_ID:
			return getAllCRUD_2003OutgoingLinks(view);
		case WebDevProjectMM.diagram.edit.parts.IndexCRUDEditPart.VISUAL_ID:
			return getIndexCRUD_2004OutgoingLinks(view);
		case WebDevProjectMM.diagram.edit.parts.DetailCRUDEditPart.VISUAL_ID:
			return getDetailCRUD_2005OutgoingLinks(view);
		case WebDevProjectMM.diagram.edit.parts.RegularContentPageEditPart.VISUAL_ID:
			return getRegularContentPage_2006OutgoingLinks(view);
		case WebDevProjectMM.diagram.edit.parts.FormEditPart.VISUAL_ID:
			return getForm_2007OutgoingLinks(view);
		case WebDevProjectMM.diagram.edit.parts.RoleEditPart.VISUAL_ID:
			return getRole_2008OutgoingLinks(view);
		case WebDevProjectMM.diagram.edit.parts.TextEditPart.VISUAL_ID:
			return getText_3001OutgoingLinks(view);
		case WebDevProjectMM.diagram.edit.parts.MediaContentEditPart.VISUAL_ID:
			return getMediaContent_3002OutgoingLinks(view);
		case WebDevProjectMM.diagram.edit.parts.SocialNetworkContentEditPart.VISUAL_ID:
			return getSocialNetworkContent_3003OutgoingLinks(view);
		case WebDevProjectMM.diagram.edit.parts.StoredQuestionEditPart.VISUAL_ID:
			return getStoredQuestion_3004OutgoingLinks(view);
		case WebDevProjectMM.diagram.edit.parts.QuestionDefinitionEditPart.VISUAL_ID:
			return getQuestionDefinition_3005OutgoingLinks(view);
		case WebDevProjectMM.diagram.edit.parts.PossibleAsnwerEditPart.VISUAL_ID:
			return getPossibleAsnwer_3006OutgoingLinks(view);
		case WebDevProjectMM.diagram.edit.parts.PageLinkEditPart.VISUAL_ID:
			return getPageLink_4001OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebDevProjectMM.diagram.part.WebDevProjectMMLinkDescriptor> getWebSite_1000ContainedLinks(
			View view) {
		WebDevProjectMM.WebSite modelElement = (WebDevProjectMM.WebSite) view.getElement();
		LinkedList<WebDevProjectMM.diagram.part.WebDevProjectMMLinkDescriptor> result = new LinkedList<WebDevProjectMM.diagram.part.WebDevProjectMMLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_PageLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<WebDevProjectMM.diagram.part.WebDevProjectMMLinkDescriptor> getCreationCRUD_2001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebDevProjectMM.diagram.part.WebDevProjectMMLinkDescriptor> getDelitionCRUD_2002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebDevProjectMM.diagram.part.WebDevProjectMMLinkDescriptor> getAllCRUD_2003ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebDevProjectMM.diagram.part.WebDevProjectMMLinkDescriptor> getIndexCRUD_2004ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebDevProjectMM.diagram.part.WebDevProjectMMLinkDescriptor> getDetailCRUD_2005ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebDevProjectMM.diagram.part.WebDevProjectMMLinkDescriptor> getRegularContentPage_2006ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebDevProjectMM.diagram.part.WebDevProjectMMLinkDescriptor> getForm_2007ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebDevProjectMM.diagram.part.WebDevProjectMMLinkDescriptor> getRole_2008ContainedLinks(
			View view) {
		WebDevProjectMM.Role modelElement = (WebDevProjectMM.Role) view.getElement();
		LinkedList<WebDevProjectMM.diagram.part.WebDevProjectMMLinkDescriptor> result = new LinkedList<WebDevProjectMM.diagram.part.WebDevProjectMMLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Role_Webpage_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<WebDevProjectMM.diagram.part.WebDevProjectMMLinkDescriptor> getText_3001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebDevProjectMM.diagram.part.WebDevProjectMMLinkDescriptor> getMediaContent_3002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebDevProjectMM.diagram.part.WebDevProjectMMLinkDescriptor> getSocialNetworkContent_3003ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebDevProjectMM.diagram.part.WebDevProjectMMLinkDescriptor> getStoredQuestion_3004ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebDevProjectMM.diagram.part.WebDevProjectMMLinkDescriptor> getQuestionDefinition_3005ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebDevProjectMM.diagram.part.WebDevProjectMMLinkDescriptor> getPossibleAsnwer_3006ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebDevProjectMM.diagram.part.WebDevProjectMMLinkDescriptor> getPageLink_4001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebDevProjectMM.diagram.part.WebDevProjectMMLinkDescriptor> getCreationCRUD_2001IncomingLinks(
			View view) {
		WebDevProjectMM.CreationCRUD modelElement = (WebDevProjectMM.CreationCRUD) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<WebDevProjectMM.diagram.part.WebDevProjectMMLinkDescriptor> result = new LinkedList<WebDevProjectMM.diagram.part.WebDevProjectMMLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_PageLink_4001(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Role_Webpage_4002(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<WebDevProjectMM.diagram.part.WebDevProjectMMLinkDescriptor> getDelitionCRUD_2002IncomingLinks(
			View view) {
		WebDevProjectMM.DelitionCRUD modelElement = (WebDevProjectMM.DelitionCRUD) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<WebDevProjectMM.diagram.part.WebDevProjectMMLinkDescriptor> result = new LinkedList<WebDevProjectMM.diagram.part.WebDevProjectMMLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_PageLink_4001(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Role_Webpage_4002(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<WebDevProjectMM.diagram.part.WebDevProjectMMLinkDescriptor> getAllCRUD_2003IncomingLinks(
			View view) {
		WebDevProjectMM.AllCRUD modelElement = (WebDevProjectMM.AllCRUD) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<WebDevProjectMM.diagram.part.WebDevProjectMMLinkDescriptor> result = new LinkedList<WebDevProjectMM.diagram.part.WebDevProjectMMLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_PageLink_4001(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Role_Webpage_4002(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<WebDevProjectMM.diagram.part.WebDevProjectMMLinkDescriptor> getIndexCRUD_2004IncomingLinks(
			View view) {
		WebDevProjectMM.IndexCRUD modelElement = (WebDevProjectMM.IndexCRUD) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<WebDevProjectMM.diagram.part.WebDevProjectMMLinkDescriptor> result = new LinkedList<WebDevProjectMM.diagram.part.WebDevProjectMMLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_PageLink_4001(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Role_Webpage_4002(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<WebDevProjectMM.diagram.part.WebDevProjectMMLinkDescriptor> getDetailCRUD_2005IncomingLinks(
			View view) {
		WebDevProjectMM.DetailCRUD modelElement = (WebDevProjectMM.DetailCRUD) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<WebDevProjectMM.diagram.part.WebDevProjectMMLinkDescriptor> result = new LinkedList<WebDevProjectMM.diagram.part.WebDevProjectMMLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_PageLink_4001(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Role_Webpage_4002(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<WebDevProjectMM.diagram.part.WebDevProjectMMLinkDescriptor> getRegularContentPage_2006IncomingLinks(
			View view) {
		WebDevProjectMM.RegularContentPage modelElement = (WebDevProjectMM.RegularContentPage) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<WebDevProjectMM.diagram.part.WebDevProjectMMLinkDescriptor> result = new LinkedList<WebDevProjectMM.diagram.part.WebDevProjectMMLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_PageLink_4001(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Role_Webpage_4002(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<WebDevProjectMM.diagram.part.WebDevProjectMMLinkDescriptor> getForm_2007IncomingLinks(
			View view) {
		WebDevProjectMM.Form modelElement = (WebDevProjectMM.Form) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<WebDevProjectMM.diagram.part.WebDevProjectMMLinkDescriptor> result = new LinkedList<WebDevProjectMM.diagram.part.WebDevProjectMMLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_PageLink_4001(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Role_Webpage_4002(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<WebDevProjectMM.diagram.part.WebDevProjectMMLinkDescriptor> getRole_2008IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebDevProjectMM.diagram.part.WebDevProjectMMLinkDescriptor> getText_3001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebDevProjectMM.diagram.part.WebDevProjectMMLinkDescriptor> getMediaContent_3002IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebDevProjectMM.diagram.part.WebDevProjectMMLinkDescriptor> getSocialNetworkContent_3003IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebDevProjectMM.diagram.part.WebDevProjectMMLinkDescriptor> getStoredQuestion_3004IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebDevProjectMM.diagram.part.WebDevProjectMMLinkDescriptor> getQuestionDefinition_3005IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebDevProjectMM.diagram.part.WebDevProjectMMLinkDescriptor> getPossibleAsnwer_3006IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebDevProjectMM.diagram.part.WebDevProjectMMLinkDescriptor> getPageLink_4001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebDevProjectMM.diagram.part.WebDevProjectMMLinkDescriptor> getCreationCRUD_2001OutgoingLinks(
			View view) {
		WebDevProjectMM.CreationCRUD modelElement = (WebDevProjectMM.CreationCRUD) view.getElement();
		LinkedList<WebDevProjectMM.diagram.part.WebDevProjectMMLinkDescriptor> result = new LinkedList<WebDevProjectMM.diagram.part.WebDevProjectMMLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_PageLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<WebDevProjectMM.diagram.part.WebDevProjectMMLinkDescriptor> getDelitionCRUD_2002OutgoingLinks(
			View view) {
		WebDevProjectMM.DelitionCRUD modelElement = (WebDevProjectMM.DelitionCRUD) view.getElement();
		LinkedList<WebDevProjectMM.diagram.part.WebDevProjectMMLinkDescriptor> result = new LinkedList<WebDevProjectMM.diagram.part.WebDevProjectMMLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_PageLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<WebDevProjectMM.diagram.part.WebDevProjectMMLinkDescriptor> getAllCRUD_2003OutgoingLinks(
			View view) {
		WebDevProjectMM.AllCRUD modelElement = (WebDevProjectMM.AllCRUD) view.getElement();
		LinkedList<WebDevProjectMM.diagram.part.WebDevProjectMMLinkDescriptor> result = new LinkedList<WebDevProjectMM.diagram.part.WebDevProjectMMLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_PageLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<WebDevProjectMM.diagram.part.WebDevProjectMMLinkDescriptor> getIndexCRUD_2004OutgoingLinks(
			View view) {
		WebDevProjectMM.IndexCRUD modelElement = (WebDevProjectMM.IndexCRUD) view.getElement();
		LinkedList<WebDevProjectMM.diagram.part.WebDevProjectMMLinkDescriptor> result = new LinkedList<WebDevProjectMM.diagram.part.WebDevProjectMMLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_PageLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<WebDevProjectMM.diagram.part.WebDevProjectMMLinkDescriptor> getDetailCRUD_2005OutgoingLinks(
			View view) {
		WebDevProjectMM.DetailCRUD modelElement = (WebDevProjectMM.DetailCRUD) view.getElement();
		LinkedList<WebDevProjectMM.diagram.part.WebDevProjectMMLinkDescriptor> result = new LinkedList<WebDevProjectMM.diagram.part.WebDevProjectMMLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_PageLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<WebDevProjectMM.diagram.part.WebDevProjectMMLinkDescriptor> getRegularContentPage_2006OutgoingLinks(
			View view) {
		WebDevProjectMM.RegularContentPage modelElement = (WebDevProjectMM.RegularContentPage) view.getElement();
		LinkedList<WebDevProjectMM.diagram.part.WebDevProjectMMLinkDescriptor> result = new LinkedList<WebDevProjectMM.diagram.part.WebDevProjectMMLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_PageLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<WebDevProjectMM.diagram.part.WebDevProjectMMLinkDescriptor> getForm_2007OutgoingLinks(
			View view) {
		WebDevProjectMM.Form modelElement = (WebDevProjectMM.Form) view.getElement();
		LinkedList<WebDevProjectMM.diagram.part.WebDevProjectMMLinkDescriptor> result = new LinkedList<WebDevProjectMM.diagram.part.WebDevProjectMMLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_PageLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<WebDevProjectMM.diagram.part.WebDevProjectMMLinkDescriptor> getRole_2008OutgoingLinks(
			View view) {
		WebDevProjectMM.Role modelElement = (WebDevProjectMM.Role) view.getElement();
		LinkedList<WebDevProjectMM.diagram.part.WebDevProjectMMLinkDescriptor> result = new LinkedList<WebDevProjectMM.diagram.part.WebDevProjectMMLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Role_Webpage_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<WebDevProjectMM.diagram.part.WebDevProjectMMLinkDescriptor> getText_3001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebDevProjectMM.diagram.part.WebDevProjectMMLinkDescriptor> getMediaContent_3002OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebDevProjectMM.diagram.part.WebDevProjectMMLinkDescriptor> getSocialNetworkContent_3003OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebDevProjectMM.diagram.part.WebDevProjectMMLinkDescriptor> getStoredQuestion_3004OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebDevProjectMM.diagram.part.WebDevProjectMMLinkDescriptor> getQuestionDefinition_3005OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebDevProjectMM.diagram.part.WebDevProjectMMLinkDescriptor> getPossibleAsnwer_3006OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebDevProjectMM.diagram.part.WebDevProjectMMLinkDescriptor> getPageLink_4001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	private static Collection<WebDevProjectMM.diagram.part.WebDevProjectMMLinkDescriptor> getContainedTypeModelFacetLinks_PageLink_4001(
			WebDevProjectMM.WebSite container) {
		LinkedList<WebDevProjectMM.diagram.part.WebDevProjectMMLinkDescriptor> result = new LinkedList<WebDevProjectMM.diagram.part.WebDevProjectMMLinkDescriptor>();
		for (Iterator<?> links = container.getLink().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof WebDevProjectMM.PageLink) {
				continue;
			}
			WebDevProjectMM.PageLink link = (WebDevProjectMM.PageLink) linkObject;
			if (WebDevProjectMM.diagram.edit.parts.PageLinkEditPart.VISUAL_ID != WebDevProjectMM.diagram.part.WebDevProjectMMVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			WebDevProjectMM.WebPage dst = link.getTarget();
			WebDevProjectMM.WebPage src = link.getSource();
			result.add(new WebDevProjectMM.diagram.part.WebDevProjectMMLinkDescriptor(src, dst, link,
					WebDevProjectMM.diagram.providers.WebDevProjectMMElementTypes.PageLink_4001,
					WebDevProjectMM.diagram.edit.parts.PageLinkEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<WebDevProjectMM.diagram.part.WebDevProjectMMLinkDescriptor> getIncomingTypeModelFacetLinks_PageLink_4001(
			WebDevProjectMM.WebPage target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<WebDevProjectMM.diagram.part.WebDevProjectMMLinkDescriptor> result = new LinkedList<WebDevProjectMM.diagram.part.WebDevProjectMMLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != WebDevProjectMM.WebDevProjectMMPackage.eINSTANCE.getPageLink_Target()
					|| false == setting.getEObject() instanceof WebDevProjectMM.PageLink) {
				continue;
			}
			WebDevProjectMM.PageLink link = (WebDevProjectMM.PageLink) setting.getEObject();
			if (WebDevProjectMM.diagram.edit.parts.PageLinkEditPart.VISUAL_ID != WebDevProjectMM.diagram.part.WebDevProjectMMVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			WebDevProjectMM.WebPage src = link.getSource();
			result.add(new WebDevProjectMM.diagram.part.WebDevProjectMMLinkDescriptor(src, target, link,
					WebDevProjectMM.diagram.providers.WebDevProjectMMElementTypes.PageLink_4001,
					WebDevProjectMM.diagram.edit.parts.PageLinkEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<WebDevProjectMM.diagram.part.WebDevProjectMMLinkDescriptor> getIncomingFeatureModelFacetLinks_Role_Webpage_4002(
			WebDevProjectMM.WebPage target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<WebDevProjectMM.diagram.part.WebDevProjectMMLinkDescriptor> result = new LinkedList<WebDevProjectMM.diagram.part.WebDevProjectMMLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == WebDevProjectMM.WebDevProjectMMPackage.eINSTANCE.getRole_Webpage()) {
				result.add(new WebDevProjectMM.diagram.part.WebDevProjectMMLinkDescriptor(setting.getEObject(), target,
						WebDevProjectMM.diagram.providers.WebDevProjectMMElementTypes.RoleWebpage_4002,
						WebDevProjectMM.diagram.edit.parts.RoleWebpageEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<WebDevProjectMM.diagram.part.WebDevProjectMMLinkDescriptor> getOutgoingTypeModelFacetLinks_PageLink_4001(
			WebDevProjectMM.WebPage source) {
		WebDevProjectMM.WebSite container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element.eContainer()) {
			if (element instanceof WebDevProjectMM.WebSite) {
				container = (WebDevProjectMM.WebSite) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<WebDevProjectMM.diagram.part.WebDevProjectMMLinkDescriptor> result = new LinkedList<WebDevProjectMM.diagram.part.WebDevProjectMMLinkDescriptor>();
		for (Iterator<?> links = container.getLink().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof WebDevProjectMM.PageLink) {
				continue;
			}
			WebDevProjectMM.PageLink link = (WebDevProjectMM.PageLink) linkObject;
			if (WebDevProjectMM.diagram.edit.parts.PageLinkEditPart.VISUAL_ID != WebDevProjectMM.diagram.part.WebDevProjectMMVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			WebDevProjectMM.WebPage dst = link.getTarget();
			WebDevProjectMM.WebPage src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new WebDevProjectMM.diagram.part.WebDevProjectMMLinkDescriptor(src, dst, link,
					WebDevProjectMM.diagram.providers.WebDevProjectMMElementTypes.PageLink_4001,
					WebDevProjectMM.diagram.edit.parts.PageLinkEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<WebDevProjectMM.diagram.part.WebDevProjectMMLinkDescriptor> getOutgoingFeatureModelFacetLinks_Role_Webpage_4002(
			WebDevProjectMM.Role source) {
		LinkedList<WebDevProjectMM.diagram.part.WebDevProjectMMLinkDescriptor> result = new LinkedList<WebDevProjectMM.diagram.part.WebDevProjectMMLinkDescriptor>();
		for (Iterator<?> destinations = source.getWebpage().iterator(); destinations.hasNext();) {
			WebDevProjectMM.WebPage destination = (WebDevProjectMM.WebPage) destinations.next();
			result.add(new WebDevProjectMM.diagram.part.WebDevProjectMMLinkDescriptor(source, destination,
					WebDevProjectMM.diagram.providers.WebDevProjectMMElementTypes.RoleWebpage_4002,
					WebDevProjectMM.diagram.edit.parts.RoleWebpageEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	public static final DiagramUpdater TYPED_INSTANCE = new DiagramUpdater() {
		/**
		* @generated
		*/
		@Override

		public List<WebDevProjectMM.diagram.part.WebDevProjectMMNodeDescriptor> getSemanticChildren(View view) {
			return WebDevProjectMMDiagramUpdater.getSemanticChildren(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<WebDevProjectMM.diagram.part.WebDevProjectMMLinkDescriptor> getContainedLinks(View view) {
			return WebDevProjectMMDiagramUpdater.getContainedLinks(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<WebDevProjectMM.diagram.part.WebDevProjectMMLinkDescriptor> getIncomingLinks(View view) {
			return WebDevProjectMMDiagramUpdater.getIncomingLinks(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<WebDevProjectMM.diagram.part.WebDevProjectMMLinkDescriptor> getOutgoingLinks(View view) {
			return WebDevProjectMMDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
