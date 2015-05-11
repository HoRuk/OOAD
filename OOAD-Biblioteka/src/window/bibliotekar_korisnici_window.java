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
	private JTextField textField_5;

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
		panel.setBounds(0, 11, 213, 240);
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
		
		JLabel lblAdresaStanovanja = new JLabel("Adresa stanovanja:");
		lblAdresaStanovanja.setBounds(0, 112, 105, 24);
		panel.add(lblAdresaStanovanja);

		textField = new JTextField();
		textField.setBounds(104, 46, 86, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(104, 79, 86, 20);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(104, 114, 86, 20);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnPotvrdi = new JButton("Potvrdi");
		btnPotvrdi.setBounds(59, 206, 89, 23);
		panel.add(btnPotvrdi);
		
		JLabel lblBrojTelefona = new JLabel("Broj telefona:");
		lblBrojTelefona.setBounds(0, 153, 105, 24);
		panel.add(lblBrojTelefona);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(104, 155, 86, 20);
		panel.add(textField_5);
		
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
		
		JButton btnPretrai = new JButton("Pretra\u017Ei");
		btnPretrai.setBounds(53, 81, 89, 23);
		panel_1.add(btnPretrai);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(223, 143, 201, 108);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblPretraiKorisnikaPo_1 = new JLabel("Pretra\u017Ei korisnika po broju kartice:");
		lblPretraiKorisnikaPo_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblPretraiKorisnikaPo_1.setBounds(0, 0, 200, 34);
		panel_2.add(lblPretraiKorisnikaPo_1);
		
		JLabel lblBrojKartice = new JLabel("Broj kartice:");
		lblBrojKartice.setBounds(10, 39, 84, 24);
		panel_2.add(lblBrojKartice);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(104, 41, 86, 20);
		panel_2.add(textField_4);
		
		JButton btnPretrai_1 = new JButton("Pretra\u017Ei");
		btnPretrai_1.setBounds(54, 74, 89, 23);
		panel_2.add(btnPretrai_1);
	}

}
