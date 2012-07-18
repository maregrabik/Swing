import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.border.LineBorder;




public class PierwszeOkno extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private GlPanel panel;
	private DaneOsobowe dane;



	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PierwszeOkno frame = new PierwszeOkno();
					frame.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	
	
		public PierwszeOkno(){
			
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			this.setLayout(new BorderLayout());		
			setSize(new Dimension(300,200));
			panel = new GlPanel();
			dane = new DaneOsobowe();
			//dane.show(true);
			panel.setBorder(new LineBorder(Color.blue, 1));
			panel.setPreferredSize(new Dimension(350, 150));
			JMenuBar pasek = new JMenuBar();
			JMenu menuOp = new JMenu("Opcje");
			JMenuItem menuA = new JMenuItem("O autorze");
			JMenuItem item1 = new JMenuItem("Wyjscie");
			item1.addActionListener(new ActionZamknij());
			JMenuItem item2 = new JMenuItem("Dane Osobowe");
			item2.addActionListener(new ActionDane(dane));
//			item2.addActionListener(new ActionListener() {
//				public void actionPerformed(ActionEvent arg0) {
//					dane.setVisible(true);
//				}
//			});
			menuA.addActionListener(new ActionAbout(panel));
			pasek.add(menuOp);
			pasek.add(menuA);
			menuOp.add(item2);
			menuOp.add(item1);
			add(pasek, BorderLayout.NORTH);
			add(panel,BorderLayout.CENTER);			
			pack();
				
		}
}






