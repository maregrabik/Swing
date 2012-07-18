import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.JOptionPane;

public class ActionAbout extends AbstractAction {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private GlPanel panel;

	public ActionAbout(final GlPanel panel) {

		super();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JOptionPane.showMessageDialog(panel, "Stworzone przez Marek H.",
				"About", JOptionPane.INFORMATION_MESSAGE);

	}
}
