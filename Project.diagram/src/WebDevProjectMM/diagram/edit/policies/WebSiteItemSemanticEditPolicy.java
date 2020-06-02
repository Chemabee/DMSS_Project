/*
* 
*/
package WebDevProjectMM.diagram.edit.policies;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.commands.core.commands.DuplicateEObjectsCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;

/**
 * @generated
 */
public class WebSiteItemSemanticEditPolicy
		extends WebDevProjectMM.diagram.edit.policies.WebDevProjectMMBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public WebSiteItemSemanticEditPolicy() {
		super(WebDevProjectMM.diagram.providers.WebDevProjectMMElementTypes.WebSite_1000);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (WebDevProjectMM.diagram.providers.WebDevProjectMMElementTypes.CreationCRUD_2001 == req.getElementType()) {
			return getGEFWrapper(new WebDevProjectMM.diagram.edit.commands.CreationCRUDCreateCommand(req));
		}
		if (WebDevProjectMM.diagram.providers.WebDevProjectMMElementTypes.DelitionCRUD_2002 == req.getElementType()) {
			return getGEFWrapper(new WebDevProjectMM.diagram.edit.commands.DelitionCRUDCreateCommand(req));
		}
		if (WebDevProjectMM.diagram.providers.WebDevProjectMMElementTypes.AllCRUD_2003 == req.getElementType()) {
			return getGEFWrapper(new WebDevProjectMM.diagram.edit.commands.AllCRUDCreateCommand(req));
		}
		if (WebDevProjectMM.diagram.providers.WebDevProjectMMElementTypes.IndexCRUD_2004 == req.getElementType()) {
			return getGEFWrapper(new WebDevProjectMM.diagram.edit.commands.IndexCRUDCreateCommand(req));
		}
		if (WebDevProjectMM.diagram.providers.WebDevProjectMMElementTypes.DetailCRUD_2005 == req.getElementType()) {
			return getGEFWrapper(new WebDevProjectMM.diagram.edit.commands.DetailCRUDCreateCommand(req));
		}
		if (WebDevProjectMM.diagram.providers.WebDevProjectMMElementTypes.RegularContentPage_2006 == req
				.getElementType()) {
			return getGEFWrapper(new WebDevProjectMM.diagram.edit.commands.RegularContentPageCreateCommand(req));
		}
		if (WebDevProjectMM.diagram.providers.WebDevProjectMMElementTypes.Form_2007 == req.getElementType()) {
			return getGEFWrapper(new WebDevProjectMM.diagram.edit.commands.FormCreateCommand(req));
		}
		if (WebDevProjectMM.diagram.providers.WebDevProjectMMElementTypes.Role_2008 == req.getElementType()) {
			return getGEFWrapper(new WebDevProjectMM.diagram.edit.commands.RoleCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

	/**
	* @generated
	*/
	protected Command getDuplicateCommand(DuplicateElementsRequest req) {
		TransactionalEditingDomain editingDomain = ((IGraphicalEditPart) getHost()).getEditingDomain();
		return getGEFWrapper(new DuplicateAnythingCommand(editingDomain, req));
	}

	/**
	* @generated
	*/
	private static class DuplicateAnythingCommand extends DuplicateEObjectsCommand {

		/**
		* @generated
		*/
		public DuplicateAnythingCommand(TransactionalEditingDomain editingDomain, DuplicateElementsRequest req) {
			super(editingDomain, req.getLabel(), req.getElementsToBeDuplicated(), req.getAllDuplicatedElementsMap());
		}

	}

}
