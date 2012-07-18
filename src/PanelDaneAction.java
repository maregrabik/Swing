import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;


public class PanelDaneAction extends AbstractAction {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private DanePanel panel;
	public PanelDaneAction(final DanePanel panel) {
		super();
		this.panel = panel;
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		System.out.println("Miasto: "+ panel.getJtmiasto());
		System.out.println("Kolor oczu:" + panel.getBox());
		System.out.println("Ile lat: " + panel.getSlide());
		System.out.println("Nardowosc polska: " + panel.getYes());
		System.out.println("Dodatkowe informacje"+ panel.getJtdodatki());

	}

}
