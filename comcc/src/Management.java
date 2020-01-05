
import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.TextField;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.concurrent.ForkJoinPool.ManagedBlocker;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;

public class Management extends JFrame {

	private JPanel contentPane;
	static Management frame;
	static Login_1 lg;
	static UserInfo bukt;

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					 frame = new Management();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	Connection connection = null;
	

	/**
	 * Create the application.
	 */

	
	 public Management() {
		 connection = SqliteConnection.dbConnector();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 206, 209));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnBut = new JButton("Latest Transaction");
		btnBut.setFont(new Font("Microsoft JhengHei", Font.BOLD, 18));
		btnBut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				try {
					String query=  "select sum(cost) from Ticket";
					PreparedStatement pst = connection.prepareStatement(query) ;
					ResultSet rs=pst.executeQuery();
					
					
					String st=null;
					while (rs.next()) {
						
						st = rs.getString("sum(cost)");
					}
					
					JOptionPane.showMessageDialog(null, "Total Income" +st+ "Taka");
					
					
				} catch (Exception e2) {
					// TODO: handle exception
					JOptionPane.showMessageDialog(null, e2);
				}
			}
		});
		btnBut.setBounds(122, 189, 201, 51);
		contentPane.add(btnBut);
		
		JButton btnManageMovie = new JButton("Manage Movie");
		btnManageMovie.setFont(new Font("Microsoft JhengHei", Font.BOLD, 20));
		btnManageMovie.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login_1.mng.dispose();
				MovieList mvl= new MovieList();
				mvl.setVisible(true);
			}
			
		});
		btnManageMovie.setBounds(122, 108, 201, 51);
		contentPane.add(btnManageMovie);
		
		JButton btnParchaseTicket = new JButton("Sell Ticket");
		btnParchaseTicket.setFont(new Font("Microsoft JhengHei", Font.BOLD, 20));
		btnParchaseTicket.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login_1.mng.dispose();
				
				//frame.dispose();
				 bukt= new UserInfo();
				bukt.setVisible(true);
				
			}
		});
		btnParchaseTicket.setBounds(122, 34, 201, 51);
		contentPane.add(btnParchaseTicket);
		
		JButton btnLogout = new JButton("Logout");
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//frame.dispose();
				
				Login_1.mng.dispose();
				
				 lg= new Login_1();
				lg.setVisible(true);
				
			}
		});
		btnLogout.setBackground(new Color(255, 69, 0));
		btnLogout.setBounds(343, 11, 81, 23);
		contentPane.add(btnLogout);
	}
}
