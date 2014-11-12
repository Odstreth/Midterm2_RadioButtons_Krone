import java.awt.EventQueue;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JTextPane;


public class RadioButts {

	private JFrame frmRadioButts;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RadioButts window = new RadioButts();
					window.frmRadioButts.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public RadioButts() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmRadioButts = new JFrame();
		frmRadioButts.setTitle("Radio Butts");
		frmRadioButts.setBounds(100, 100, 450, 300);
		frmRadioButts.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmRadioButts.getContentPane().setLayout(null);
		
		JRadioButton rdbtnNewRadioButtonSmall = new JRadioButton("MEDIUM");
		rdbtnNewRadioButtonSmall.setBounds(155, 100, 109, 23);
		frmRadioButts.getContentPane().add(rdbtnNewRadioButtonSmall);
		
		JRadioButton rdbtnNewRadioButtonMed = new JRadioButton("LARGE");
		rdbtnNewRadioButtonMed.setBounds(155, 154, 109, 23);
		frmRadioButts.getContentPane().add(rdbtnNewRadioButtonMed);
		
		JRadioButton rdbtnNewRadioButtonLarge = new JRadioButton("SMALL");
		rdbtnNewRadioButtonLarge.setSelected(true);
		rdbtnNewRadioButtonLarge.setBounds(155, 45, 109, 23);
		frmRadioButts.getContentPane().add(rdbtnNewRadioButtonLarge);
		
		ButtonGroup butts = new ButtonGroup();
		butts.add(rdbtnNewRadioButtonSmall);
		butts.add(rdbtnNewRadioButtonMed);
		butts.add(rdbtnNewRadioButtonLarge);
		
		
	}
}
