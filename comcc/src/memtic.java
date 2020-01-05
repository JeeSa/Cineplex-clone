

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class memtic extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;
	private JButton btnLogin;

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					memtic frame = new memtic();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	Connection connection=null;
	
	public memtic() {
		
		connection=SqliteConnection.dbConnector();	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 971, 553);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblMem = new JLabel("mem");
		Image image=new ImageIcon(this.getClass().getResource("/buy_Ticket.jpg")).getImage();
		
		btnLogin = new JButton("Login\r\n");
		btnLogin.setForeground(new Color(255, 255, 255));
		btnLogin.setBackground(new Color(128, 0, 128));
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String query = "Select * from MemberLogin where ID=? and Password=?";
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
						UserInfo usifo= new UserInfo();
						usifo.setVisible(true);
						
						
						
					} else if(count>1) {
						JOptionPane.showMessageDialog(null, "Duplicate Username And Password");
					}
					else {
						JOptionPane.showMessageDialog(null, "Username and Password is Incorrect And Try Again Later");
					}
					rs.close();
					pst.close();
					
					
				
				} catch (Exception e1) {
				JOptionPane.showMessageDialog(null, e1);
				}
			}
		});
	
			
		btnLogin.setBounds(165, 336, 127, 36);
		contentPane.add(btnLogin);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(165, 269, 215, 29);
		contentPane.add(passwordField);
		
		textField = new JTextField();
		textField.setBounds(165, 222, 215, 36);
		contentPane.add(textField);
		textField.setColumns(10);
		lblMem.setIcon(new ImageIcon(image));
		lblMem.setBounds(0, 0, 974, 523);
		contentPane.add(lblMem);
		
	}
}
