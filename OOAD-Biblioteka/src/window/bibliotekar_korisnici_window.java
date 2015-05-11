package window;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;

public class bibliotekar_korisnici_window {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					bibliotekar_korisnici_window window = new bibliotekar_korisnici_window();
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
	public bibliotekar_korisnici_window() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 190, 240);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Dodaj novog korisnika:");
		lblNewLabel.setBounds(10, 11, 121, 24);
		panel.add(lblNewLabel);
		
		JLabel lblImeIPrezime = new JLabel("Ime i prezime:");
		lblImeIPrezime.setBounds(0, 46, 84, 24);
		panel.add(lblImeIPrezime);
		
		JLabel lblGodinaRodjenja = new JLabel("Godina rodjenja:");
		lblGodinaRodjenja.setBounds(0, 77, 84, 24);
		panel.add(lblGodinaRodjenja);
		
		JLabel label = new JLabel("Godina rodjenja:");
		label.setBounds(0, 112, 84, 24);
		panel.add(label);
		
		textField = new JTextField();
		textField.setBounds(94, 48, 86, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(94, 79, 86, 20);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(94, 114, 86, 20);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnPotvrdi = new JButton("Potvrdi");
		btnPotvrdi.setBounds(59, 206, 89, 23);
		panel.add(btnPotvrdi);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(223, 11, 201, 120);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblPretraiKorisnikaPo = new JLabel("Pretra\u017Ei korisnika po imenu:");
		lblPretraiKorisnikaPo.setHorizontalAlignment(SwingConstants.CENTER);
		lblPretraiKorisnikaPo.setBounds(0, 10, 200, 34);
		panel_1.add(lblPretraiKorisnikaPo);
		
		JLabel label_1 = new JLabel("Ime i prezime:");
		label_1.setBounds(10, 46, 84, 24);
		panel_1.add(label_1);
		
		textField_3 = new JTextField();
		textField_3.setBounds(105, 48, 86, 20);
		panel_1.add(textField_3);
		textField_3.setColumns(10);
		
		JButton button = new JButton("Potvrdi");
		button.setBounds(53, 81, 89, 23);
		panel_1.add(button);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(223, 143, 201, 108);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JLabel label_2 = new JLabel("Pretra\u017Ei korisnika po imenu:");
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setBounds(0, 0, 200, 34);
		panel_2.add(label_2);
		
		JLabel label_3 = new JLabel("Ime i prezime:");
		label_3.setBounds(10, 39, 84, 24);
		panel_2.add(label_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(104, 41, 86, 20);
		panel_2.add(textField_4);
		
		JButton button_1 = new JButton("Potvrdi");
		button_1.setBounds(54, 74, 89, 23);
		panel_2.add(button_1);
	}

}
