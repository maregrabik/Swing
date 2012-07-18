import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

public class ActionDane extends AbstractAction {

	private static final long serialVersionUID = 1L;
	private DaneOsobowe dane;

	public ActionDane(final DaneOsobowe dane) {
		super();
		this.dane = dane;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {

		dane.setVisible(true);

	}

}
