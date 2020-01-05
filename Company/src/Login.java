import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;






import java.sql.*;

import javax.swing.*;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import java.awt.Color;
import java.awt.SystemColor;



public class Login {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	
	Connection connection = null;
	private JTextField txtUserName;
	private JPasswordField passField1;

	/**
	 * Create the application.
	 */
	public Login() {
		initialize();
		
		connection = SqliteConnection.dbConnector();    // কল করলাম dbconnector() method k  .. >>  SqliteConnection  class theke .
		
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(SystemColor.activeCaption);
		frame.setBounds(100, 100, 568, 273);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblUserName = new JLabel("User Name :");
		lblUserName.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblUserName.setBounds(193, 80, 106, 23);
		frame.getContentPane().add(lblUserName);
		
		JLabel lblPassword = new JLabel("Password : ");
		lblPassword.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblPassword.setBounds(193, 125, 106, 23);
		frame.getContentPane().add(lblPassword);
		
		txtUserName = new JTextField();
		txtUserName.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 22));
		txtUserName.setBounds(327, 72, 199, 33);
		frame.getContentPane().add(txtUserName);
		txtUserName.setColumns(10);
		
		passField1 = new JPasswordField();
		passField1.setFont(new Font("Tahoma", Font.BOLD, 18));
		passField1.setEchoChar('*');
		passField1.setBounds(327, 125, 199, 20);
		frame.getContentPane().add(passField1);
		
		JButton btnLogin = new JButton("Login");
		
		Image img = new ImageIcon(this.getClass().getResource("/ok.png")).getImage();		/// v.v. important to make EXE . >> 
		btnLogin.setIcon(new ImageIcon(img));
		
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					
					String query = "select * from Employeeinfo where username = ? and password = ?";   // bujhi nai  ********** // ********* 
					PreparedStatement pst = connection.prepareStatement(query) ;
					pst.setString(1, txtUserName.getText());  // here index always start from 1 not from ZERRO (0)
					pst.setString(2, passField1.getText());
					
					ResultSet rs = pst.executeQuery();
					
					int count =0;
					while (rs.next()) {
						count++;
						
					}
					if (count==1) {
						JOptionPane.showMessageDialog(null, "Username And Password is Correct");
						frame.dispose();
						EmployeeInfo obEmployeeInfo = new EmployeeInfo();
						
						obEmployeeInfo.setVisible(true);
						
					} 
					else if (count>1) {
						JOptionPane.showMessageDialog(null, " Duplicate Username And Password");
					}
					else {

						JOptionPane.showMessageDialog(null, "Username And Password is in-Correct . \n \t\ttry Again........");
					}
					
					rs.close();
					pst.close();
					
				} 
				catch (Exception e) {
					// TODO: handle exception
					JOptionPane.showMessageDialog(null, e);
				
				}
				//txtUserName.setText(null);
				passField1.setText(null);
		
			}
		});
		btnLogin.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnLogin.setBounds(379, 179, 126, 33);
		frame.getContentPane().add(btnLogin);
		
		
		
		JLabel label = new JLabel("");
		
		//label.setIcon(new ImageIcon("F:\\UrmiJava\\Company\\bin\\login.png"));
		
		Image img2 = new ImageIcon(this.getClass().getResource("/login.png")).getImage();		/// v.v. important to make EXE . >> 
		label.setIcon(new ImageIcon(img2));
		
		
		label.setBounds(22, 45, 148, 150);
		frame.getContentPane().add(label);
		
		JLabel label_pcman = new JLabel("");
		Image img3 = new ImageIcon(this.getClass().getResource("/man with pc.png")).getImage();		/// v.v. important to make EXE . >> 
		label_pcman.setIcon(new ImageIcon(img3));
		label_pcman.setBounds(396, 0, 191, 77);
		frame.getContentPane().add(label_pcman);
		
		JLabel labelBlackguards = new JLabel("BlackGuards");
		labelBlackguards.setToolTipText("\r\n");
		labelBlackguards.setEnabled(false);
		labelBlackguards.setBackground(new Color(128, 0, 0));
		labelBlackguards.setForeground(new Color(0, 0, 128));
		labelBlackguards.setFont(new Font("Wide Latin", Font.BOLD, 20));
		labelBlackguards.setBounds(133, 11, 255, 33);
		frame.getContentPane().add(labelBlackguards);
	}
}
