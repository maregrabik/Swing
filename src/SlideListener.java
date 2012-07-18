import javax.swing.JLabel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;


public class SlideListener implements ChangeListener {

	private JLabel ile;
	public SlideListener(final JLabel ile) {
		
	this.ile = ile;
		
		
	}

	@Override
	public void stateChanged(ChangeEvent arg0) {
		 JSlider source = (JSlider)arg0.getSource();
	        if (!source.getValueIsAdjusting()) {
	            ile.setText(Integer.toString(source.getValue()));

	}

}
}
