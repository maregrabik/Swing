import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;



public class menu extends JMenuBar {
	private DaneOsobowe dane;

	public menu(final DaneOsobowe dane) {
		super();
		this.dane = dane;
		
		JMenu pasek = new JMenu("Opcje");
		JMenuItem wyjscie = new JMenuItem("Wyjscie");
		wyjscie.addActionListener(new ActionZamknij());
				
		pasek.add(wyjscie);
		add(pasek);
		
		
	}
	
	
	
	
	
	
	
	

}
