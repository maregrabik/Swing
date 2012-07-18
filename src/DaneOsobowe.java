import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;


public class DaneOsobowe extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public DaneOsobowe() {
		DanePanel panel = new DanePanel();
		this.setLayout(new BorderLayout());
		setDefaultCloseOperation(DaneOsobowe.EXIT_ON_CLOSE);
		setSize(new Dimension(400, 350));
		menu menuu = new menu(this);
		add(menuu, BorderLayout.NORTH);
		add(panel,BorderLayout.CENTER);
		
	}

}
