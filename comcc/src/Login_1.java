

import java.awt.EventQueue;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.activation.MailcapCommandMap;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JList;
import javax.swing.JSlider;
import javax.swing.JTable;
import javax.swing.JMenuBar;
import javax.swing.JTextPane;
import javax.xml.ws.soap.MTOM;
public class Login_1 {

	static JFrame frame;

	static Management  mng;
	
	static UserInfo ob =new UserInfo();;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login_1 window = new Login_1();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	Connection connection=null;
	private JTextField textField;
	private JPasswordField passwordField;
	public Login_1() {
		//frame.setResizable(false);
		initialize();
	connection=sqliteConnection_1.dbConnection();	
	}
	
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setForeground(new Color(64, 224, 208));
		frame.getContentPane().setBackground(new Color(128, 0, 128));
		frame.setBounds(100, 100, 887, 469);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Username");
		lblNewLabel.setForeground(new Color(240, 230, 140));
		lblNewLabel.setBackground(new Color(176, 224, 230));
		lblNewLabel.setFont(new Font("Franklin Gothic Demi", Font.PLAIN, 12));
		lblNewLabel.setBounds(680, 184, 63, 23);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Password");
		lblNewLabel_1.setForeground(new Color(240, 230, 140));
		lblNewLabel_1.setBackground(new Color(135, 206, 235));
		lblNewLabel_1.setFont(new Font("Cambria Math", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(690, 218, 50, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(753, 184, 108, 23);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.setFont(new Font("Trebuchet MS", Font.BOLD, 10));
		btnLogin.setBackground(new Color(0, 255, 0));
		btnLogin.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {
				try {
					String query = "Select * from EmployeeInfo where Username=? and Password=?";
					PreparedStatement pst=connection.prepareStatement(query);
					pst.setString(1, textField.getText());
					pst.setString(2, passwordField.getText());
					ResultSet rs=pst.executeQuery();
					int count = 0;
					while (rs.next()) {
						count=count+1;
					}
					if (count==1) {
						JOptionPane.showMessageDialog(null, "Username And Password is Correct");
						frame.dispose();
						 mng= new Management();
						mng.setVisible(true);
						
						
					} else if(count>1) {
						JOptionPane.showMessageDialog(null, "Duplicate Username And Password");
					}
					else {
						JOptionPane.showMessageDialog(null, "Username and Password is Incorrect And Try Again Later");
					}
					rs.close();
					pst.close();
//					frame.dispose();
//					Management mnt= new Management();
//					mnt.setVisible(true);
				
				} catch (Exception e1) {
				JOptionPane.showMessageDialog(null, e1);
				}
			}
		});
		btnLogin.setBounds(779, 252, 63, 23);
		frame.getContentPane().add(btnLogin);
		
		passwordField = new JPasswordField();
		passwordField.setEchoChar('*');
		passwordField.setBounds(763, 218, 98, 23);
		frame.getContentPane().add(passwordField);
		
		JLabel label = new JLabel("");
		Image image=new ImageIcon(this.getClass().getResource("/Star-Cineplex-Logo1.jpg")).getImage();
		label.setIcon(new ImageIcon(image));
		label.setBounds(731, 0, 140, 150);
		frame.getContentPane().add(label);
		
		JButton btnHome = new JButton("Home");
		btnHome.setFont(new Font("Microsoft JhengHei", Font.BOLD, 14));
		btnHome.setBounds(10, 84, 81, 36);
		frame.getContentPane().add(btnHome);
		
		JButton btnShowtime = new JButton("Showtime");
		btnShowtime.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Showtime sh= new Showtime();
				sh.setVisible(true);
				
			}
		});
		btnShowtime.setFont(new Font("Microsoft JhengHei", Font.BOLD, 14));
		btnShowtime.setBounds(114, 83, 104, 35);
		frame.getContentPane().add(btnShowtime);
		
		JButton btnAboutUs = new JButton("About Us");
		btnAboutUs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				About about= new About();
				about.setVisible(true);
				
			}
		});
		btnAboutUs.setFont(new Font("Microsoft JhengHei", Font.BOLD, 14));
		btnAboutUs.setBounds(607, 83, 104, 35);
		frame.getContentPane().add(btnAboutUs);
		
		JTextPane txtpnStarCineplexThe = new JTextPane();
		txtpnStarCineplexThe.setForeground(new Color(135, 206, 235));
		txtpnStarCineplexThe.setFont(new Font("Segoe Print", Font.BOLD, 22));
		txtpnStarCineplexThe.setBackground(new Color(128, 0, 128));
		txtpnStarCineplexThe.setText("Star Cineplex");
		txtpnStarCineplexThe.setBounds(309, 0, 186, 36);
		frame.getContentPane().add(txtpnStarCineplexThe);
		
		JTextPane txtpnTheUltimateMovie = new JTextPane();
		txtpnTheUltimateMovie.setText("The Ultimate Movie Experience\r\n");
		txtpnTheUltimateMovie.setForeground(new Color(255, 127, 80));
		txtpnTheUltimateMovie.setFont(new Font("Script MT Bold", Font.BOLD, 14));
		txtpnTheUltimateMovie.setBackground(new Color(128, 0, 128));
		txtpnTheUltimateMovie.setBounds(281, 36, 214, 29);
		frame.getContentPane().add(txtpnTheUltimateMovie);
		
		JTextPane txtpnAdminLogin = new JTextPane();
		txtpnAdminLogin.setText("Admin Login");
		txtpnAdminLogin.setForeground(new Color(189, 183, 107));
		txtpnAdminLogin.setFont(new Font("Segoe UI", Font.BOLD, 11));
		txtpnAdminLogin.setBackground(new Color(128, 0, 128));
		txtpnAdminLogin.setBounds(780, 161, 81, 29);
		frame.getContentPane().add(txtpnAdminLogin);
		
		JButton btnNewButton = new JButton("Special Offer");
		btnNewButton.setFont(new Font("Microsoft YaHei", Font.PLAIN, 9));
		btnNewButton.setBounds(279, 36, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnContact = new JButton("Contact");
		btnContact.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contact_us contact_us=new contact_us();
				contact_us.setVisible(true);
			}
		});
		btnContact.setFont(new Font("Microsoft JhengHei", Font.BOLD, 14));
		btnContact.setBounds(485, 81, 99, 35);
		frame.getContentPane().add(btnContact);
		
		JButton btnSpectre = new JButton("Dark Knight");
		btnSpectre.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				dark spnfo= new dark();
				spnfo.setVisible(true);
			}
		});
		btnSpectre.setFont(new Font("Microsoft YaHei", Font.PLAIN, 12));
		btnSpectre.setBackground(new Color(152, 251, 152));
		btnSpectre.setBounds(10, 204, 104, 23);
		frame.getContentPane().add(btnSpectre);
		
		
		JTextPane txtpnNowShowing = new JTextPane();
		txtpnNowShowing.setForeground(new Color(0, 206, 209));
		txtpnNowShowing.setBackground(new Color(128, 0, 128));
		txtpnNowShowing.setFont(new Font("Segoe Print", Font.BOLD | Font.ITALIC, 14));
		txtpnNowShowing.setText("Now Showing");
		txtpnNowShowing.setBounds(8, 166, 116, 32);
		frame.getContentPane().add(txtpnNowShowing);
		
		JButton btnNewButton_2 = new JButton("Spiderman");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Spiderman spdm= new Spiderman();
				spdm.setVisible(true);
			}
		});
		btnNewButton_2.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 13));
		btnNewButton_2.setBackground(new Color(152, 251, 152));
		btnNewButton_2.setBounds(10, 237, 104, 23);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Minions");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Minions spdm= new Minions();
				spdm.setVisible(true);
				
			}
		});
		btnNewButton_3.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 14));
		btnNewButton_3.setBackground(new Color(152, 251, 152));
		btnNewButton_3.setBounds(10, 267, 104, 23);
		frame.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Wall-E");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Wall spdm= new Wall();
				spdm.setVisible(true);
				
			}
		});
		btnNewButton_4.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 14));
		btnNewButton_4.setBackground(new Color(152, 251, 152));
		btnNewButton_4.setBounds(10, 298, 104, 23);
		frame.getContentPane().add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("AntMan");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Ant spdm= new Ant();
				spdm.setVisible(true);
			}
		});
		btnNewButton_5.setFont(new Font("Microsoft YaHei", Font.PLAIN, 14));
		btnNewButton_5.setBackground(new Color(152, 251, 152));
		btnNewButton_5.setBounds(10, 332, 104, 23);
		frame.getContentPane().add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("3idoits");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				id idoit=new id();
				idoit.setVisible(true);
			}
		});
		btnNewButton_6.setFont(new Font("Microsoft YaHei", Font.PLAIN, 14));
		btnNewButton_6.setBackground(new Color(152, 251, 152));
		btnNewButton_6.setBounds(10, 366, 104, 23);
		frame.getContentPane().add(btnNewButton_6);
		
		JLabel lblSlide = new JLabel("slide");
		Image pho=new ImageIcon(this.getClass().getResource("/pho.jpg")).getImage();
		lblSlide.setIcon(new ImageIcon(pho));
		lblSlide.setBounds(165, 143, 491, 281);
		frame.getContentPane().add(lblSlide);
		
		JLabel lblcardad = new JLabel("New label");
		Image ad=new ImageIcon(this.getClass().getResource("/card.jpg")).getImage();
		lblcardad.setIcon(new ImageIcon(ad));
		lblcardad.setBounds(680, 332, 181, 101);
		frame.getContentPane().add(lblcardad);
		
		JButton btnParchase = new JButton("Parchase");
		btnParchase.setFont(new Font("Microsoft JhengHei", Font.BOLD, 14));
		btnParchase.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
//				try {
//					Management.bukt.setVisible(true);
//				} catch (Exception e2) {
//					// TODO: handle exception
//					JOptionPane.showMessageDialog(null, e2);
//				}
				
//				 ob  = new UserInfo();
				ob.setVisible(true);
			//mng.bukt.setVisible(true);
			}
		});
		btnParchase.setBounds(239, 82, 98, 34);
		frame.getContentPane().add(btnParchase);
		
		JButton btnNewButton_1 = new JButton("Members");
		btnNewButton_1.setFont(new Font("Microsoft JhengHei", Font.BOLD, 14));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				members mb= new members();
				mb.setVisible(true);
			}
		});
		btnNewButton_1.setBounds(356, 81, 104, 36);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnMembersLogin = new JButton("Members Login");
		btnMembersLogin.setBackground(new Color(144, 238, 144));
		btnMembersLogin.setFont(new Font("Microsoft JhengHei UI", Font.BOLD, 17));
		btnMembersLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				memtic mt=new memtic();
				mt.setVisible(true);
			}
		});
		btnMembersLogin.setBounds(680, 306, 181, 29);
		frame.getContentPane().add(btnMembersLogin);
	}

	public void setVisible(boolean b) {
		// TODO Auto-generated method stub
		
	}
}
