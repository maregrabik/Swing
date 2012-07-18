import java.security.acl.Group;

import javax.swing.ButtonGroup;
import javax.swing.ButtonModel;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSlider;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

public class DanePanel extends JPanel {

	private JLabel jlmiasto;
	private JLabel jlkolor;
	private JLabel jlwiek;
	private JLabel jlnarodowosc;
	private JLabel jldodatki;
	private JTextField jtmiasto;
	private JTextArea jtdodatki;
	private JComboBox box;
	private JSlider slide;
	private ButtonGroup group;
	
	public String getJtmiasto() {
		return jtmiasto.getText();
	}

	

	public String getJtdodatki() {
		return jtdodatki.getText();
	}

	public String getBox() {
		return (String)box.getSelectedItem();
	}


	public int getSlide() {
		return slide.getValue();
	}

	public static JLabel getIle() {
		return ile;
	}


	public String getYes() {
		if (yes.isSelected()) {return "Tak";}
		else {return "Nie";}
	}


	private static JLabel ile;
	private JRadioButton yes;
	private JRadioButton no;
	private JButton ok;
	private JButton czysc;

	public DanePanel() {
		super();
		SpringLayout laj = new SpringLayout();
		this.setLayout(laj);
		jlmiasto = new JLabel("Miasto: ");
		jlkolor = new JLabel("Kolor oczu:");
		jlwiek = new JLabel("Wiek");
		jlnarodowosc = new JLabel("Narodowosc: ");
		jldodatki = new JLabel("Dodatkowe informacje");
		jtmiasto = new JTextField(20);
		String[] oczy = { "Niebieskie", "Zielone", "Piwne" };
		box = new JComboBox(oczy);
		slide = new JSlider();
		slide.setMaximum(100);
		slide.setMinimum(0);
		slide.setMajorTickSpacing(50);
		slide.setPaintLabels(true);
		slide.setPaintTicks(true);
		ile = new JLabel();
		ile.setText(Integer.toHexString(slide.getValue()));
		slide.addChangeListener(new SlideListener(ile));
		yes = new JRadioButton("TAK");
		no = new JRadioButton("NIE");
		group = new ButtonGroup();
		group.add(yes);
		group.add(no);
		jtdodatki = new JTextArea(4, 20);
		ok = new JButton("OK");
		czysc = new JButton("Czysc");
		ok.addActionListener(new PanelDaneAction(this));
		

		add(jlmiasto);
		add(jtmiasto);
		add(jlkolor);
		add(jlwiek);
		add(jlnarodowosc);
		add(jldodatki);
		add(box);
		add(slide);
		add(ile);
		add(yes);
		add(no);
		add(jtdodatki);
		add(czysc);
		add(ok);

		laj.putConstraint(SpringLayout.NORTH, jlmiasto, 20, SpringLayout.NORTH,
				this);
		laj.putConstraint(SpringLayout.WEST, jlmiasto, 20, SpringLayout.WEST,
				this);
		laj.putConstraint(SpringLayout.NORTH, jlkolor, 15, SpringLayout.SOUTH,
				jlmiasto);
		laj.putConstraint(SpringLayout.WEST, jlkolor, 0, SpringLayout.WEST,
				jlmiasto);
		laj.putConstraint(SpringLayout.NORTH, jlwiek, 15, SpringLayout.SOUTH,
				jlkolor);
		laj.putConstraint(SpringLayout.WEST, jlwiek, 0, SpringLayout.WEST,
				jlmiasto);
		laj.putConstraint(SpringLayout.NORTH, jlnarodowosc, 30,
				SpringLayout.SOUTH, jlwiek);
		laj.putConstraint(SpringLayout.WEST, jlnarodowosc, 0,
				SpringLayout.WEST, jlmiasto);
		laj.putConstraint(SpringLayout.NORTH, jldodatki, 30,
				SpringLayout.SOUTH, jlnarodowosc);
		laj.putConstraint(SpringLayout.WEST, jldodatki, 0, SpringLayout.WEST,
				jlmiasto);

		laj.putConstraint(SpringLayout.WEST, jtmiasto, 100, SpringLayout.EAST,
				jlmiasto);
		laj.putConstraint(SpringLayout.NORTH, jtmiasto, 0, SpringLayout.NORTH,
				jlmiasto);
		laj.putConstraint(SpringLayout.NORTH, box, 0, SpringLayout.NORTH,
				jlkolor);
		laj.putConstraint(SpringLayout.WEST, box, 0, SpringLayout.WEST,
				jtmiasto);
		laj.putConstraint(SpringLayout.WEST, ile, 0, SpringLayout.WEST,
				jtmiasto);
		laj.putConstraint(SpringLayout.NORTH, ile, 15, SpringLayout.SOUTH, box);
		laj.putConstraint(SpringLayout.NORTH, slide, 0, SpringLayout.NORTH, ile);
		laj.putConstraint(SpringLayout.WEST, slide, 13, SpringLayout.EAST, ile);
		laj.putConstraint(SpringLayout.WEST, yes, 0, SpringLayout.WEST, ile);
		laj.putConstraint(SpringLayout.NORTH, yes, 15, SpringLayout.NORTH,
				jlnarodowosc);
		laj.putConstraint(SpringLayout.WEST, no, 15, SpringLayout.EAST, yes);
		laj.putConstraint(SpringLayout.NORTH, no, 15, SpringLayout.NORTH,
				jlnarodowosc);
		laj.putConstraint(SpringLayout.WEST, jtdodatki, 0, SpringLayout.WEST,
				yes);
		laj.putConstraint(SpringLayout.NORTH, jtdodatki, 0, SpringLayout.NORTH,
				jldodatki);
		laj.putConstraint(SpringLayout.EAST, czysc, 0, SpringLayout.EAST,
				jtdodatki);
		laj.putConstraint(SpringLayout.NORTH, czysc, 10, SpringLayout.SOUTH,
				jtdodatki);
		laj.putConstraint(SpringLayout.EAST, ok, -10, SpringLayout.WEST, czysc);
		laj.putConstraint(SpringLayout.NORTH, ok, 0, SpringLayout.NORTH, czysc);

	}

}
