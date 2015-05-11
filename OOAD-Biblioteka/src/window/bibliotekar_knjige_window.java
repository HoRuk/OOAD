package window;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;

public class bibliotekar_knjige_window {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					bibliotekar_knjige_window window = new bibliotekar_knjige_window();
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
	public bibliotekar_knjige_window() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBounds(10, 11, 238, 240);
		frame.getContentPane().add(panel);
		
		JButton button = new JButton("Potvrdi");
		button.setBounds(79, 206, 89, 23);
		panel.add(button);
		
		JLabel label = new JLabel("Naziv knjige:");
		label.setHorizontalAlignment(SwingConstants.RIGHT);
		label.setBounds(10, 30, 100, 23);
		panel.add(label);
		
		JLabel label_1 = new JLabel("Ime autora:");
		label_1.setHorizontalAlignment(SwingConstants.RIGHT);
		label_1.setBounds(10, 59, 100, 23);
		panel.add(label_1);
		
		JLabel label_2 = new JLabel("Prezime autora:");
		label_2.setHorizontalAlignment(SwingConstants.RIGHT);
		label_2.setBounds(10, 88, 100, 23);
		panel.add(label_2);
		
		JLabel label_3 = new JLabel("Datum izdavanja:");
		label_3.setHorizontalAlignment(SwingConstants.RIGHT);
		label_3.setBounds(10, 117, 100, 23);
		panel.add(label_3);
		
		JLabel label_4 = new JLabel("\u017Danr:");
		label_4.setHorizontalAlignment(SwingConstants.RIGHT);
		label_4.setBounds(10, 146, 100, 23);
		panel.add(label_4);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(120, 31, 86, 20);
		panel.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(120, 60, 86, 20);
		panel.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(120, 89, 86, 20);
		panel.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(120, 118, 86, 20);
		panel.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(120, 147, 86, 20);
		panel.add(textField_4);
		
		JLabel label_5 = new JLabel("Barkod:");
		label_5.setHorizontalAlignment(SwingConstants.RIGHT);
		label_5.setBounds(10, 175, 100, 23);
		panel.add(label_5);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(120, 175, 86, 20);
		panel.add(textField_5);
		
		JLabel lblDodajNovuKnjigu = new JLabel("Dodaj novu knjigu:");
		lblDodajNovuKnjigu.setHorizontalAlignment(SwingConstants.RIGHT);
		lblDodajNovuKnjigu.setBounds(0, 0, 100, 23);
		panel.add(lblDodajNovuKnjigu);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(258, 11, 166, 121);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblPretraiKnjige = new JLabel("Pretra\u017Ei knjige po autoru:");
		lblPretraiKnjige.setHorizontalAlignment(SwingConstants.CENTER);
		lblPretraiKnjige.setBounds(10, 21, 156, 23);
		panel_1.add(lblPretraiKnjige);
		
		textField_6 = new JTextField();
		textField_6.setBounds(41, 47, 86, 20);
		panel_1.add(textField_6);
		textField_6.setColumns(10);
		
		JButton btnPretrai = new JButton("Pretra\u017Ei");
		btnPretrai.setBounds(38, 78, 89, 23);
		panel_1.add(btnPretrai);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(258, 143, 166, 108);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblPretraiKnjigePo = new JLabel("Pretra\u017Ei knjige po nazivu:");
		lblPretraiKnjigePo.setHorizontalAlignment(SwingConstants.CENTER);
		lblPretraiKnjigePo.setBounds(10, 20, 156, 23);
		panel_2.add(lblPretraiKnjigePo);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(43, 44, 86, 20);
		panel_2.add(textField_7);
		
		JButton button_1 = new JButton("Pretra\u017Ei");
		button_1.setBounds(43, 75, 89, 23);
		panel_2.add(button_1);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(434, 11, 107, 240);
		frame.getContentPane().add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblUcitajKnjiguPo = new JLabel("Ucitaj knjigu \r\npo bar kodu:");
		lblUcitajKnjiguPo.setHorizontalAlignment(SwingConstants.CENTER);
		lblUcitajKnjiguPo.setBounds(10, 10, 87, 48);
		panel_3.add(lblUcitajKnjiguPo);
		
	}

}
