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
public class FormEditPart extends ShapeNodeEditPart {

	/**
	* @generated
	*/
	public static final int VISUAL_ID = 2007;

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
	public FormEditPart(View view) {
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
				new WebDevProjectMM.diagram.edit.policies.FormItemSemanticEditPolicy());
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
		return primaryShape = new FormFigure();
	}

	/**
	* @generated
	*/
	public FormFigure getPrimaryShape() {
		return (FormFigure) primaryShape;
	}

	/**
	* @generated
	*/
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof WebDevProjectMM.diagram.edit.parts.FormNameEditPart) {
			((WebDevProjectMM.diagram.edit.parts.FormNameEditPart) childEditPart)
					.setLabel(getPrimaryShape().getFigureFormLabelFigure());
			return true;
		}
		if (childEditPart instanceof WebDevProjectMM.diagram.edit.parts.FormFormSocialnetworkcontentCompartmentEditPart) {
			IFigure pane = getPrimaryShape().getFormSocialnetworkcontentCompartmentFigure();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(
					((WebDevProjectMM.diagram.edit.parts.FormFormSocialnetworkcontentCompartmentEditPart) childEditPart)
							.getFigure());
			return true;
		}
		if (childEditPart instanceof WebDevProjectMM.diagram.edit.parts.FormFormElementsCompartmentEditPart) {
			IFigure pane = getPrimaryShape().getFormElementsCompartmentFigure();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((WebDevProjectMM.diagram.edit.parts.FormFormElementsCompartmentEditPart) childEditPart)
					.getFigure());
			return true;
		}
		if (childEditPart instanceof WebDevProjectMM.diagram.edit.parts.FormFormQuestionsCompartmentEditPart) {
			IFigure pane = getPrimaryShape().getFormQuestionsCompartmentFigure();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((WebDevProjectMM.diagram.edit.parts.FormFormQuestionsCompartmentEditPart) childEditPart)
					.getFigure());
			return true;
		}
		return false;
	}

	/**
	* @generated
	*/
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof WebDevProjectMM.diagram.edit.parts.FormNameEditPart) {
			return true;
		}
		if (childEditPart instanceof WebDevProjectMM.diagram.edit.parts.FormFormSocialnetworkcontentCompartmentEditPart) {
			IFigure pane = getPrimaryShape().getFormSocialnetworkcontentCompartmentFigure();
			pane.remove(
					((WebDevProjectMM.diagram.edit.parts.FormFormSocialnetworkcontentCompartmentEditPart) childEditPart)
							.getFigure());
			return true;
		}
		if (childEditPart instanceof WebDevProjectMM.diagram.edit.parts.FormFormElementsCompartmentEditPart) {
			IFigure pane = getPrimaryShape().getFormElementsCompartmentFigure();
			pane.remove(((WebDevProjectMM.diagram.edit.parts.FormFormElementsCompartmentEditPart) childEditPart)
					.getFigure());
			return true;
		}
		if (childEditPart instanceof WebDevProjectMM.diagram.edit.parts.FormFormQuestionsCompartmentEditPart) {
			IFigure pane = getPrimaryShape().getFormQuestionsCompartmentFigure();
			pane.remove(((WebDevProjectMM.diagram.edit.parts.FormFormQuestionsCompartmentEditPart) childEditPart)
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
		if (editPart instanceof WebDevProjectMM.diagram.edit.parts.FormFormSocialnetworkcontentCompartmentEditPart) {
			return getPrimaryShape().getFormSocialnetworkcontentCompartmentFigure();
		}
		if (editPart instanceof WebDevProjectMM.diagram.edit.parts.FormFormElementsCompartmentEditPart) {
			return getPrimaryShape().getFormElementsCompartmentFigure();
		}
		if (editPart instanceof WebDevProjectMM.diagram.edit.parts.FormFormQuestionsCompartmentEditPart) {
			return getPrimaryShape().getFormQuestionsCompartmentFigure();
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
				.getType(WebDevProjectMM.diagram.edit.parts.FormNameEditPart.VISUAL_ID));
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
						WebDevProjectMM.diagram.edit.parts.FormFormSocialnetworkcontentCompartmentEditPart.VISUAL_ID));
			}
			if (type == WebDevProjectMM.diagram.providers.WebDevProjectMMElementTypes.Text_3001) {
				return getChildBySemanticHint(WebDevProjectMM.diagram.part.WebDevProjectMMVisualIDRegistry
						.getType(WebDevProjectMM.diagram.edit.parts.FormFormElementsCompartmentEditPart.VISUAL_ID));
			}
			if (type == WebDevProjectMM.diagram.providers.WebDevProjectMMElementTypes.MediaContent_3002) {
				return getChildBySemanticHint(WebDevProjectMM.diagram.part.WebDevProjectMMVisualIDRegistry
						.getType(WebDevProjectMM.diagram.edit.parts.FormFormElementsCompartmentEditPart.VISUAL_ID));
			}
			if (type == WebDevProjectMM.diagram.providers.WebDevProjectMMElementTypes.StoredQuestion_3004) {
				return getChildBySemanticHint(WebDevProjectMM.diagram.part.WebDevProjectMMVisualIDRegistry
						.getType(WebDevProjectMM.diagram.edit.parts.FormFormQuestionsCompartmentEditPart.VISUAL_ID));
			}
			if (type == WebDevProjectMM.diagram.providers.WebDevProjectMMElementTypes.QuestionDefinition_3005) {
				return getChildBySemanticHint(WebDevProjectMM.diagram.part.WebDevProjectMMVisualIDRegistry
						.getType(WebDevProjectMM.diagram.edit.parts.FormFormQuestionsCompartmentEditPart.VISUAL_ID));
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
	public class FormFigure extends RoundedRectangle {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureFormLabelFigure;
		/**
		 * @generated
		 */
		private RectangleFigure fFormSocialnetworkcontentCompartmentFigure;
		/**
		 * @generated
		 */
		private RectangleFigure fFormElementsCompartmentFigure;
		/**
		 * @generated
		 */
		private RectangleFigure fFormQuestionsCompartmentFigure;

		/**
		 * @generated
		 */
		public FormFigure() {
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

			fFigureFormLabelFigure = new WrappingLabel();

			fFigureFormLabelFigure.setText("Form");
			fFigureFormLabelFigure.setMaximumSize(new Dimension(getMapMode().DPtoLP(10000), getMapMode().DPtoLP(50)));

			this.add(fFigureFormLabelFigure);

			fFormSocialnetworkcontentCompartmentFigure = new RectangleFigure();

			fFormSocialnetworkcontentCompartmentFigure.setOutline(false);

			this.add(fFormSocialnetworkcontentCompartmentFigure);

			fFormElementsCompartmentFigure = new RectangleFigure();

			fFormElementsCompartmentFigure.setOutline(false);

			this.add(fFormElementsCompartmentFigure);

			fFormQuestionsCompartmentFigure = new RectangleFigure();

			fFormQuestionsCompartmentFigure.setOutline(false);

			this.add(fFormQuestionsCompartmentFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureFormLabelFigure() {
			return fFigureFormLabelFigure;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getFormSocialnetworkcontentCompartmentFigure() {
			return fFormSocialnetworkcontentCompartmentFigure;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getFormElementsCompartmentFigure() {
			return fFormElementsCompartmentFigure;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getFormQuestionsCompartmentFigure() {
			return fFormQuestionsCompartmentFigure;
		}

	}

	/**
	 * @generated
	 */
	static final Color THIS_BACK = new Color(null, 212, 224, 155);

}
