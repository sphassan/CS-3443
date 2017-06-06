import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Controller for the model and view
 * Switches panels on button click
 * 
 * @author Sean Hassan
 */

public class PanelSwitcherController implements ActionListener
{
	/**
	 * The panel view
	 */
	private PanelSwitcherView view;
	/**
	 * The panel model
	 */
	private PanelSwitcherModel model;
	
	/**
	 * Creates the controller with a view and model
	 * 
	 * @param view The View of the panel
	 * @param model The Model of the panel
	 */
	public PanelSwitcherController(PanelSwitcherView view, PanelSwitcherModel model)
	{
		this.view = view;
		this.model = model;
	}
	
	/**
	 * Switches between the two JPanels when the JButton is clicked
	 * 
	 * @param arg0 The button click
	 */
	@Override
	public void actionPerformed(ActionEvent arg0)
	{
		model.switchPanel();
		view.displayPanel(model.whichPanel());
	}
	
}
