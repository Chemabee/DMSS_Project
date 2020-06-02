/*
 * 
 */
package WebDevProjectMM.diagram.edit.parts;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.MarginBorder;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.RoundedRectangle;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gef.editpolicies.NonResizableEditPolicy;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gmf.runtime.diagram.core.edithelpers.CreateElementRequestAdapter;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewAndElementRequest;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.edit.policies.reparent.CreationEditPolicyWithCustomReparent;
import org.eclipse.swt.graphics.Color;

/**
 * @generated
 */
public class DetailCRUDEditPart extends ShapeNodeEditPart {

	/**
	* @generated
	*/
	public static final int VISUAL_ID = 2005;

	/**
	* @generated
	*/
	protected IFigure contentPane;

	/**
	* @generated
	*/
	protected IFigure primaryShape;

	/**
	* @generated
	*/
	public DetailCRUDEditPart(View view) {
		super(view);
	}

	/**
	* @generated
	*/
	protected void createDefaultEditPolicies() {
		installEditPolicy(EditPolicyRoles.CREATION_ROLE, new CreationEditPolicyWithCustomReparent(
				WebDevProjectMM.diagram.part.WebDevProjectMMVisualIDRegistry.TYPED_INSTANCE));
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new WebDevProjectMM.diagram.edit.policies.DetailCRUDItemSemanticEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
		installEditPolicy(EditPolicyRoles.OPEN_ROLE, new WebDevProjectMM.diagram.edit.policies.OpenDiagramEditPolicy()); // XXX need an SCR to runtime to have another abstract superclass that would let children add reasonable editpolicies
		// removeEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.CONNECTION_HANDLES_ROLE);
	}

	/**
	* @generated
	*/
	protected LayoutEditPolicy createLayoutEditPolicy() {
		org.eclipse.gmf.runtime.diagram.ui.editpolicies.LayoutEditPolicy lep = new org.eclipse.gmf.runtime.diagram.ui.editpolicies.LayoutEditPolicy() {

			protected EditPolicy createChildEditPolicy(EditPart child) {
				EditPolicy result = child.getEditPolicy(EditPolicy.PRIMARY_DRAG_ROLE);
				if (result == null) {
					result = new NonResizableEditPolicy();
				}
				return result;
			}

			protected Command getMoveChildrenCommand(Request request) {
				return null;
			}

			protected Command getCreateCommand(CreateRequest request) {
				return null;
			}
		};
		return lep;
	}

	/**
	* @generated
	*/
	protected IFigure createNodeShape() {
		return primaryShape = new DetailCRUDFigure();
	}

	/**
	* @generated
	*/
	public DetailCRUDFigure getPrimaryShape() {
		return (DetailCRUDFigure) primaryShape;
	}

	/**
	* @generated
	*/
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof WebDevProjectMM.diagram.edit.parts.DetailCRUDNameEditPart) {
			((WebDevProjectMM.diagram.edit.parts.DetailCRUDNameEditPart) childEditPart)
					.setLabel(getPrimaryShape().getFigureDetailCRUDLabelFigure());
			return true;
		}
		if (childEditPart instanceof WebDevProjectMM.diagram.edit.parts.DetailCRUDDetailCRUDSocialnetworkcontentCompartmentEditPart) {
			IFigure pane = getPrimaryShape().getDetailCRUDSocialnetworkcontentCompartmentFigure();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(
					((WebDevProjectMM.diagram.edit.parts.DetailCRUDDetailCRUDSocialnetworkcontentCompartmentEditPart) childEditPart)
							.getFigure());
			return true;
		}
		if (childEditPart instanceof WebDevProjectMM.diagram.edit.parts.DetailCRUDDetailCRUDElementsCompartmentEditPart) {
			IFigure pane = getPrimaryShape().getDetailCRUDElementsCompartmentFigure();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(
					((WebDevProjectMM.diagram.edit.parts.DetailCRUDDetailCRUDElementsCompartmentEditPart) childEditPart)
							.getFigure());
			return true;
		}
		return false;
	}

	/**
	* @generated
	*/
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof WebDevProjectMM.diagram.edit.parts.DetailCRUDNameEditPart) {
			return true;
		}
		if (childEditPart instanceof WebDevProjectMM.diagram.edit.parts.DetailCRUDDetailCRUDSocialnetworkcontentCompartmentEditPart) {
			IFigure pane = getPrimaryShape().getDetailCRUDSocialnetworkcontentCompartmentFigure();
			pane.remove(
					((WebDevProjectMM.diagram.edit.parts.DetailCRUDDetailCRUDSocialnetworkcontentCompartmentEditPart) childEditPart)
							.getFigure());
			return true;
		}
		if (childEditPart instanceof WebDevProjectMM.diagram.edit.parts.DetailCRUDDetailCRUDElementsCompartmentEditPart) {
			IFigure pane = getPrimaryShape().getDetailCRUDElementsCompartmentFigure();
			pane.remove(
					((WebDevProjectMM.diagram.edit.parts.DetailCRUDDetailCRUDElementsCompartmentEditPart) childEditPart)
							.getFigure());
			return true;
		}
		return false;
	}

	/**
	* @generated
	*/
	protected void addChildVisual(EditPart childEditPart, int index) {
		if (addFixedChild(childEditPart)) {
			return;
		}
		super.addChildVisual(childEditPart, -1);
	}

	/**
	* @generated
	*/
	protected void removeChildVisual(EditPart childEditPart) {
		if (removeFixedChild(childEditPart)) {
			return;
		}
		super.removeChildVisual(childEditPart);
	}

	/**
	* @generated
	*/
	protected IFigure getContentPaneFor(IGraphicalEditPart editPart) {
		if (editPart instanceof WebDevProjectMM.diagram.edit.parts.DetailCRUDDetailCRUDSocialnetworkcontentCompartmentEditPart) {
			return getPrimaryShape().getDetailCRUDSocialnetworkcontentCompartmentFigure();
		}
		if (editPart instanceof WebDevProjectMM.diagram.edit.parts.DetailCRUDDetailCRUDElementsCompartmentEditPart) {
			return getPrimaryShape().getDetailCRUDElementsCompartmentFigure();
		}
		return getContentPane();
	}

	/**
	* @generated
	*/
	protected NodeFigure createNodePlate() {
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(40, 40);
		return result;
	}

	/**
	* Creates figure for this edit part.
	* 
	* Body of this method does not depend on settings in generation model
	* so you may safely remove <i>generated</i> tag and modify it.
	* 
	* @generated
	*/
	protected NodeFigure createNodeFigure() {
		NodeFigure figure = createNodePlate();
		figure.setLayoutManager(new StackLayout());
		IFigure shape = createNodeShape();
		figure.add(shape);
		contentPane = setupContentPane(shape);
		return figure;
	}

	/**
	* Default implementation treats passed figure as content pane.
	* Respects layout one may have set for generated figure.
	* @param nodeShape instance of generated figure class
	* @generated
	*/
	protected IFigure setupContentPane(IFigure nodeShape) {
		if (nodeShape.getLayoutManager() == null) {
			ConstrainedToolbarLayout layout = new ConstrainedToolbarLayout();
			layout.setSpacing(5);
			nodeShape.setLayoutManager(layout);
		}
		return nodeShape; // use nodeShape itself as contentPane
	}

	/**
	* @generated
	*/
	public IFigure getContentPane() {
		if (contentPane != null) {
			return contentPane;
		}
		return super.getContentPane();
	}

	/**
	* @generated
	*/
	protected void setForegroundColor(Color color) {
		if (primaryShape != null) {
			primaryShape.setForegroundColor(color);
		}
	}

	/**
	* @generated
	*/
	protected void setBackgroundColor(Color color) {
		if (primaryShape != null) {
			primaryShape.setBackgroundColor(color);
		}
	}

	/**
	* @generated
	*/
	protected void setLineWidth(int width) {
		if (primaryShape instanceof Shape) {
			((Shape) primaryShape).setLineWidth(width);
		}
	}

	/**
	* @generated
	*/
	protected void setLineType(int style) {
		if (primaryShape instanceof Shape) {
			((Shape) primaryShape).setLineStyle(style);
		}
	}

	/**
	* @generated
	*/
	public EditPart getPrimaryChildEditPart() {
		return getChildBySemanticHint(WebDevProjectMM.diagram.part.WebDevProjectMMVisualIDRegistry
				.getType(WebDevProjectMM.diagram.edit.parts.DetailCRUDNameEditPart.VISUAL_ID));
	}

	/**
	* @generated
	*/
	public EditPart getTargetEditPart(Request request) {
		if (request instanceof CreateViewAndElementRequest) {
			CreateElementRequestAdapter adapter = ((CreateViewAndElementRequest) request).getViewAndElementDescriptor()
					.getCreateElementRequestAdapter();
			IElementType type = (IElementType) adapter.getAdapter(IElementType.class);
			if (type == WebDevProjectMM.diagram.providers.WebDevProjectMMElementTypes.SocialNetworkContent_3003) {
				return getChildBySemanticHint(WebDevProjectMM.diagram.part.WebDevProjectMMVisualIDRegistry.getType(
						WebDevProjectMM.diagram.edit.parts.DetailCRUDDetailCRUDSocialnetworkcontentCompartmentEditPart.VISUAL_ID));
			}
			if (type == WebDevProjectMM.diagram.providers.WebDevProjectMMElementTypes.Text_3001) {
				return getChildBySemanticHint(WebDevProjectMM.diagram.part.WebDevProjectMMVisualIDRegistry.getType(
						WebDevProjectMM.diagram.edit.parts.DetailCRUDDetailCRUDElementsCompartmentEditPart.VISUAL_ID));
			}
			if (type == WebDevProjectMM.diagram.providers.WebDevProjectMMElementTypes.MediaContent_3002) {
				return getChildBySemanticHint(WebDevProjectMM.diagram.part.WebDevProjectMMVisualIDRegistry.getType(
						WebDevProjectMM.diagram.edit.parts.DetailCRUDDetailCRUDElementsCompartmentEditPart.VISUAL_ID));
			}
		}
		return super.getTargetEditPart(request);
	}

	/**
	* @generated
	*/
	protected void handleNotificationEvent(Notification event) {
		if (event.getNotifier() == getModel()
				&& EcorePackage.eINSTANCE.getEModelElement_EAnnotations().equals(event.getFeature())) {
			handleMajorSemanticChange();
		} else {
			super.handleNotificationEvent(event);
		}
	}

	/**
	 * @generated
	 */
	public class DetailCRUDFigure extends RoundedRectangle {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureDetailCRUDLabelFigure;
		/**
		 * @generated
		 */
		private RectangleFigure fDetailCRUDSocialnetworkcontentCompartmentFigure;
		/**
		 * @generated
		 */
		private RectangleFigure fDetailCRUDElementsCompartmentFigure;

		/**
		 * @generated
		 */
		public DetailCRUDFigure() {
			this.setCornerDimensions(new Dimension(getMapMode().DPtoLP(8), getMapMode().DPtoLP(8)));
			this.setBackgroundColor(THIS_BACK);
			this.setBorder(new MarginBorder(getMapMode().DPtoLP(5), getMapMode().DPtoLP(5), getMapMode().DPtoLP(5),
					getMapMode().DPtoLP(5)));
			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureDetailCRUDLabelFigure = new WrappingLabel();

			fFigureDetailCRUDLabelFigure.setText("DetailCRUD");
			fFigureDetailCRUDLabelFigure
					.setMaximumSize(new Dimension(getMapMode().DPtoLP(10000), getMapMode().DPtoLP(50)));

			this.add(fFigureDetailCRUDLabelFigure);

			fDetailCRUDSocialnetworkcontentCompartmentFigure = new RectangleFigure();

			fDetailCRUDSocialnetworkcontentCompartmentFigure.setOutline(false);

			this.add(fDetailCRUDSocialnetworkcontentCompartmentFigure);

			fDetailCRUDElementsCompartmentFigure = new RectangleFigure();

			fDetailCRUDElementsCompartmentFigure.setOutline(false);

			this.add(fDetailCRUDElementsCompartmentFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureDetailCRUDLabelFigure() {
			return fFigureDetailCRUDLabelFigure;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getDetailCRUDSocialnetworkcontentCompartmentFigure() {
			return fDetailCRUDSocialnetworkcontentCompartmentFigure;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getDetailCRUDElementsCompartmentFigure() {
			return fDetailCRUDElementsCompartmentFigure;
		}

	}

	/**
	 * @generated
	 */
	static final Color THIS_BACK = new Color(null, 203, 115, 92);

}
