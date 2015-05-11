package window;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Biblioteka {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Biblioteka window = new Biblioteka();
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
	public Biblioteka() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 228, 162);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 187, 105);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblOdaberiteNainPrijave = new JLabel("Odaberite na\u010Din prijave na sistem:");
		lblOdaberiteNainPrijave.setBounds(11, 5, 164, 14);
		panel.add(lblOdaberiteNainPrijave);
		
		JButton btnNewButton = new JButton("Bibliotekar");
		btnNewButton.setBounds(49, 30, 81, 23);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel.add(btnNewButton);

		JButton btnNewButton_1 = new JButton("Korisnik");
		btnNewButton_1.setBounds(49, 64, 81, 23);
		panel.add(btnNewButton_1);
	}
}
