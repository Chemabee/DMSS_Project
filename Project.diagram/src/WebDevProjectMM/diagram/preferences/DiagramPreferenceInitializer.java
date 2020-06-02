/*
 * 
 */
package WebDevProjectMM.diagram.preferences;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;

/**
 * @generated
 */
public class DiagramPreferenceInitializer extends AbstractPreferenceInitializer {

	/**
	* @generated
	*/
	public void initializeDefaultPreferences() {
		IPreferenceStore store = getPreferenceStore();
		WebDevProjectMM.diagram.preferences.DiagramGeneralPreferencePage.initDefaults(store);
		WebDevProjectMM.diagram.preferences.DiagramAppearancePreferencePage.initDefaults(store);
		WebDevProjectMM.diagram.preferences.DiagramConnectionsPreferencePage.initDefaults(store);
		WebDevProjectMM.diagram.preferences.DiagramPrintingPreferencePage.initDefaults(store);
		WebDevProjectMM.diagram.preferences.DiagramRulersAndGridPreferencePage.initDefaults(store);

	}

	/**
	* @generated
	*/
	protected IPreferenceStore getPreferenceStore() {
		return WebDevProjectMM.diagram.part.WebDevProjectMMDiagramEditorPlugin.getInstance().getPreferenceStore();
	}
}
