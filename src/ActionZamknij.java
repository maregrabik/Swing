import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;


public class ActionZamknij extends AbstractAction {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public void actionPerformed(ActionEvent e) {
		System.exit(1);
		
	}
	
}