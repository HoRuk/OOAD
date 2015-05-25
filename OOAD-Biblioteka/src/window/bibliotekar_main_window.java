package window;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class bibliotekar_main_window {

	private JFrame frame;
	private JButton btnObrisiPostojeegKorisnika;
	private JButton btnOpcijeSaKnjigama;

	public JFrame GetFrame(){
		return this.frame;
	}
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					bibliotekar_main_window window = new bibliotekar_main_window();
					window.frame.setTitle("zovem se");
					window.frame.setVisible(true);
				} catch (Exception e) {
					System.out.println("dosao");
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public bibliotekar_main_window() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 251, 210);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 215, 149);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		btnObrisiPostojeegKorisnika = new JButton("Opcije sa korisnikom");
		btnObrisiPostojeegKorisnika.setBounds(35, 27, 139, 34);
		panel.add(btnObrisiPostojeegKorisnika);
		
		btnOpcijeSaKnjigama = new JButton("Opcije sa knjigama");
		btnOpcijeSaKnjigama.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnOpcijeSaKnjigama.setText("hoæu knjige");
			}
		});
		btnOpcijeSaKnjigama.setBounds(35, 87, 139, 34);
		panel.add(btnOpcijeSaKnjigama);
	}
}
