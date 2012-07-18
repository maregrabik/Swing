import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.AbstractAction;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

public class GlPanel extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField imie;
	private JTextField nazwisko;
	private JLabel Limie;
	private JLabel Lnazwisko;

	public void czyscImie() {
		this.imie.setText("");
	}

	public void czyscNazwisko() {
		this.nazwisko.setText("");
	}

	public void czyscPassword() {
		this.password.setText("");
	}

	private JLabel Lpassword;
	private JPasswordField password;

	public GlPanel() {
		SpringLayout lajalt = new SpringLayout();
		this.setLayout(lajalt);
		imie = new JTextField(15);
		nazwisko = new JTextField(15);
		Limie = new JLabel("Imie: ");
		Lnazwisko = new JLabel("Nazwisko: ");
		JButton guzik = new JButton("OK");
		Lpassword = new JLabel("Password:");
		password = new JPasswordField(15);
		JButton czysc = new JButton("Czyœæ");
		guzik.addActionListener(new AkcjaOk());
		czysc.addActionListener(new AkcjaCzysc());
		add(imie);
		add(nazwisko);
		add(Limie);
		add(Lnazwisko);
		add(guzik);
		add(czysc);
		add(Lpassword);
		add(password);

		lajalt.putConstraint(SpringLayout.NORTH, czysc, 0, SpringLayout.NORTH,
				guzik);
		lajalt.putConstraint(SpringLayout.WEST, czysc, 10, SpringLayout.EAST,
				guzik);
		lajalt.putConstraint(SpringLayout.NORTH, Lpassword, 10,
				SpringLayout.SOUTH, Lnazwisko);
		lajalt.putConstraint(SpringLayout.WEST, password, 20,
				SpringLayout.EAST, Lpassword);
		lajalt.putConstraint(SpringLayout.NORTH, password, 0,
				SpringLayout.NORTH, Lpassword);
		lajalt.putConstraint(SpringLayout.NORTH, guzik, -30,
				SpringLayout.SOUTH, this);
		lajalt.putConstraint(SpringLayout.EAST, guzik, -90, SpringLayout.EAST,
				this);
		lajalt.putConstraint(SpringLayout.NORTH, Limie, 20, SpringLayout.NORTH,
				this);
		lajalt.putConstraint(SpringLayout.NORTH, Lnazwisko, 10,
				SpringLayout.SOUTH, Limie);
		lajalt.putConstraint(SpringLayout.NORTH, imie, 0, SpringLayout.NORTH,
				Limie);
		lajalt.putConstraint(SpringLayout.NORTH, nazwisko, 0,
				SpringLayout.NORTH, Lnazwisko);
		lajalt.putConstraint(SpringLayout.WEST, nazwisko, 20,
				SpringLayout.EAST, Lnazwisko);
		lajalt.putConstraint(SpringLayout.WEST, imie, 0, SpringLayout.WEST,
				nazwisko);

	}

	public class AkcjaOk extends AbstractAction {

		public void actionPerformed(ActionEvent e) {

			System.out.println("Imie: " + getImie());
			System.out.println("Nazwisko " + getNazwisko());
			System.out.println("Has³o: " + getPassword());

		}

	}

	public class AkcjaCzysc extends AbstractAction {

		@Override
		public void actionPerformed(ActionEvent e) {
			czyscImie();
			czyscNazwisko();
			czyscPassword();

		}

	}

	public String getPassword() {
		return password.getText();
	}

	public String getImie() {
		return imie.getText();
	}

	public String getNazwisko() {
		return nazwisko.getText();
	}

}
