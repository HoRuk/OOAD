package window;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPanel;

public class Nadjena_Knjiga {

	private JFrame frame;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Nadjena_Knjiga window = new Nadjena_Knjiga();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Nadjena_Knjiga() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 471, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 434, 240);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel label = new JLabel("Prona\u0111ena knjiga:");
		label.setBounds(0, 0, 200, 50);
		panel.add(label);
		
		JLabel label_1 = new JLabel("Naziv knjige:");
		label_1.setBounds(10, 43, 102, 25);
		panel.add(label_1);
		
		JLabel label_2 = new JLabel("Ime autora:");
		label_2.setBounds(10, 75, 102, 25);
		panel.add(label_2);
		
		JLabel label_3 = new JLabel("Datum izdavanja:");
		label_3.setBounds(10, 110, 102, 25);
		panel.add(label_3);
		
		JLabel label_4 = new JLabel("Izdanje:");
		label_4.setBounds(10, 141, 102, 25);
		panel.add(label_4);
		
		JLabel label_5 = new JLabel("Izdava\u010D:");
		label_5.setBounds(10, 172, 102, 25);
		panel.add(label_5);
		
		JLabel label_6 = new JLabel("Trenutno zadu\u017Eena kod:");
		label_6.setBounds(212, 78, 126, 25);
		panel.add(label_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(106, 48, 86, 20);
		panel.add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(106, 82, 86, 20);
		panel.add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(106, 114, 86, 20);
		panel.add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(106, 149, 86, 20);
		panel.add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(106, 177, 86, 20);
		panel.add(textField_11);
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		textField_12.setBounds(348, 80, 86, 20);
		panel.add(textField_12);
		
		JLabel label_7 = new JLabel("Bar kod:");
		label_7.setBounds(212, 110, 102, 25);
		panel.add(label_7);
		
		textField_13 = new JTextField();
		textField_13.setColumns(10);
		textField_13.setBounds(348, 112, 86, 20);
		panel.add(textField_13);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(212, 141, 212, 73);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnRazduiKnjigu = new JButton("Razdu\u017Ei knjigu");
		btnRazduiKnjigu.setBounds(10, 11, 110, 23);
		panel_1.add(btnRazduiKnjigu);
		
		JButton button = new JButton("Obri\u0161i knjigu ");
		button.setBounds(10, 39, 110, 23);
		panel_1.add(button);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(130, 11, 72, 51);
		panel_1.add(btnNewButton);
	}

}
