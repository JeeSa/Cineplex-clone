import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextPane;
import java.awt.Font;
import java.awt.Color;

public class Showtime extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Showtime frame = new Showtime();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Showtime() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 665, 503);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblShowtime = new JLabel("Showtime");
		lblShowtime.setBackground(new Color(220, 220, 220));
		lblShowtime.setBounds(10, 0, 653, 554);
		Image image=new ImageIcon(this.getClass().getResource("/sh.jpg")).getImage();
		contentPane.setLayout(null);
		
		JTextPane txtpnPm = new JTextPane();
		txtpnPm.setBackground(new Color(211, 211, 211));
		txtpnPm.setFont(new Font("Lucida Bright", Font.PLAIN, 19));
		txtpnPm.setText("p.m");
		txtpnPm.setBounds(588, 56, 51, 30);
		contentPane.add(txtpnPm);
		lblShowtime.setIcon(new ImageIcon(image));
		contentPane.add(lblShowtime);
	}
}
