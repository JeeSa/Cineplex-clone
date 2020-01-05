import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;

import java.awt.Font;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.CardLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;


public class UserInfo extends JFrame {

	private JPanel contentPane;
	private static JTextField textFieldCustomerName;
	String  x;
	static JComboBox comboBoxMovieName;
	static Show obshow;
	static Connection connection = null;
	
	
	static UserInfo frame;
	
	String show1,show2,show3,show4,show5;
	
	
	static String showw,seatt;
	static String Customer_name;
	static String Contuct_Number;
	static String hall;
	static String MovieName;
	static double Cost;
	
	
	
	JLabel lblspider;
	
	
	
	private static JTextField textFieldcntctNumber;
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					 frame = new UserInfo();
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
	@SuppressWarnings("unchecked")
	public UserInfo() {
		
		connection = SqliteConnection.dbConnector();
		
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 661, 440);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(10, 170, 625, 225);
		contentPane.add(panel);
		panel.setLayout(null);
		
		textFieldCustomerName = new JTextField();
		textFieldCustomerName.setBounds(148, 11, 149, 25);
		panel.add(textFieldCustomerName);
		textFieldCustomerName.setColumns(10);
		
		JLabel lblName = new JLabel("Name : ");
		lblName.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		lblName.setBounds(57, 9, 81, 25);
		panel.add(lblName);
		
		JLabel lblMovieName = new JLabel("Movie Name:");
		lblMovieName.setForeground(Color.BLUE);
		lblMovieName.setFont(new Font("Tempus Sans ITC", Font.BOLD | Font.ITALIC, 18)); // হে 
		lblMovieName.setBounds(10, 83, 124, 25);
		panel.add(lblMovieName);
		
		 comboBoxMovieName = new JComboBox();
		 comboBoxMovieName.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent arg0) {
		 		//JOptionPane.showMessageDialog(null, comboBox.getSelectedItem());
		 		
		 		
		 			
		 			
		 			Image img3 = new ImageIcon(this.getClass().getResource("/"+comboBoxMovieName.getSelectedItem()+".jpg")).getImage();		/// v.v. important to make EXE . >> 
		 			lblspider.setIcon(new ImageIcon(img3));
					
				
		 		
		 		try {
					
		 			
					String query = "select * from movielist where moviename =?";
					PreparedStatement pst = connection.prepareStatement(query);
					pst.setString(1, (String)comboBoxMovieName.getSelectedItem());
					
					ResultSet rs = pst.executeQuery();
					
					while(rs.next())
					{
						
						show1 = rs.getString("show1");
						show2 = rs.getString("show2");
						show3 = rs.getString("show3");
						show4 = rs.getString("show4");
						show5 = rs.getString("show5");
						
//						textFieldEid.setText(rs.getString("eid"));
//						textFieldName.setText(rs.getString("name"));
//						textFieldSurname.setText(rs.getString("surname"));
//						textFieldAge.setText(rs.getString("age"));
						
					}
					
					pst.close();
					
				} catch (Exception e) {
					// TODO: handle exception
					JOptionPane.showMessageDialog(null, e);
				}
		 		
		 		
		 		//JOptionPane.showMessageDialog(null, show1+show2+show3);
		 		
		 		obshow = new Show((String)comboBoxMovieName.getSelectedItem(),show1,show2,show3,show4,show5);
				obshow.setVisible(true);
		 		
		 	}
		 });
		comboBoxMovieName.setModel(new DefaultComboBoxModel(new String[] {"ANT-MAN", "Dark Night", "Wall - E", "Minions (3d)", "Spider-Man", "Three Idiots"}));
		comboBoxMovieName.setBounds(148, 87, 149, 20);
		panel.add(comboBoxMovieName);
		
		JButton btnBuy = new JButton("Purchase");
		btnBuy.setForeground(Color.BLACK);
		btnBuy.setBackground(Color.LIGHT_GRAY);
		btnBuy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		
				
				
				try {
					
					String sum = null ;
					String query = "select sum(Cost) from ticket where customername = '"+textFieldCustomerName.getText()+"'";
					PreparedStatement pst = connection.prepareStatement(query);
					
					ResultSet rs = pst.executeQuery();
					
					if (rs.next()) {
						
						 sum = rs.getString("sum(cost)");
						
					}
					
					JOptionPane.showMessageDialog(null, "You Have To Pay "+sum+" dollars only");
					
					
					
					pst.close();
					rs.close();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					//e1.printStackTrace();
					JOptionPane.showMessageDialog(null, e1);
				} 
				
				
			}
		});
		btnBuy.setFont(new Font("Sylfaen", Font.BOLD | Font.ITALIC, 16));
		btnBuy.setBounds(148, 118, 149, 31);
		panel.add(btnBuy);
		
		JLabel lblMobileNumber = new JLabel("Mobile Number");
		lblMobileNumber.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		lblMobileNumber.setBounds(10, 47, 128, 25);
		panel.add(lblMobileNumber);
		
		textFieldcntctNumber = new JTextField();
		textFieldcntctNumber.setColumns(10);
		textFieldcntctNumber.setBounds(148, 49, 149, 25);
		panel.add(textFieldcntctNumber);
		
		lblspider = new JLabel("");
		lblspider.setBounds(365, 0, 262, 153);
		panel.add(lblspider);
		
		
		
		String [] movie = {"ANT-MAN",
				"Dark Night",
				"Wall - E",
				"Minions (3d)",
				"Spider-Man",
				"Three Idiots"};
		
	
		//JOptionPane.showMessageDialog(null, movie[1]);
		
	
		
		JLabel lblMovie1 = new JLabel("\r\n");
		lblMovie1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				final String targetUrl =  String.valueOf(getClass()
	                      .getResource("Ant - Man.html"));

				try {
					java.awt.Desktop.getDesktop().browse(java.net.URI.create(targetUrl));
				} catch (IOException e) {
					// TODO Auto-generated catch block
					JOptionPane.showMessageDialog(null, e);
				}

			}
		});
		lblMovie1.setBounds(0, 152, 124, 81);
		panel.add(lblMovie1);
		
		
		JLabel lblMovie2 = new JLabel("");
		lblMovie2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				final String targetUrl = String.valueOf(getClass()
	                      .getResource("Dark Night.html"));

				try {
					java.awt.Desktop.getDesktop().browse(java.net.URI.create(targetUrl));
				} catch (IOException e2) {
					// TODO Auto-generated catch block
					JOptionPane.showMessageDialog(null, e2);
				}

			}
		});
		lblMovie2.setBounds(123, 152, 124, 81);
		panel.add(lblMovie2);
		
		
		JLabel lblMovie3 = new JLabel("");
		lblMovie3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				final String targetUrl =String.valueOf(getClass()
	                      .getResource("Wall - E.html"));

				try {
					java.awt.Desktop.getDesktop().browse(java.net.URI.create(targetUrl));
				} catch (IOException e) {
					// TODO Auto-generated catch block
					JOptionPane.showMessageDialog(null, e);
				}

			}
		});

		lblMovie3.setBounds(245, 152, 124, 81);
		panel.add(lblMovie3);
		
		
		
		JLabel lblMovie4 = new JLabel("");
		lblMovie4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				final String targetUrl = String.valueOf(getClass()
	                      .getResource("Minions 3d.html"));

				try {
					java.awt.Desktop.getDesktop().browse(java.net.URI.create(targetUrl));
				} catch (IOException e) {
					// TODO Auto-generated catch block
					JOptionPane.showMessageDialog(null, e);
				}

			}
		});

		lblMovie4.setBounds(363, 152, 128, 81);
		panel.add(lblMovie4);
		
		
		Image img3 = new ImageIcon(this.getClass().getResource("/"+movie[0]+".jpg")).getImage();		/// v.v. important to make EXE . >> 
		lblMovie1.setIcon(new ImageIcon(img3));
		
		Image img4 = new ImageIcon(this.getClass().getResource("/"+movie[1]+".jpg")).getImage();		/// v.v. important to make EXE . >> 
		lblMovie2.setIcon(new ImageIcon(img4));
		
		Image img5 = new ImageIcon(this.getClass().getResource("/"+movie[2]+".jpg")).getImage();		/// v.v. important to make EXE . >> 
		lblMovie3.setIcon(new ImageIcon(img5));
		
		Image img6 = new ImageIcon(this.getClass().getResource("/"+movie[3]+".jpg")).getImage();		/// v.v. important to make EXE . >> 
		lblMovie4.setIcon(new ImageIcon(img6));
		
		JLabel lblMovie5 = new JLabel("");
		lblMovie5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				final String targetUrl = String.valueOf(getClass()
	                      .getResource("Spider Man.html")); 

				try {
					java.awt.Desktop.getDesktop().browse(java.net.URI.create(targetUrl));
				} catch (IOException e) {
					// TODO Auto-generated catch block
					JOptionPane.showMessageDialog(null, e);
				}

			}
		});

		lblMovie5.setBounds(490, 152, 137, 81);
		panel.add(lblMovie5);
		
		Image img7 = new ImageIcon(this.getClass().getResource("/"+movie[4]+".jpg")).getImage();		/// v.v. important to make EXE . >> 
		lblMovie5.setIcon(new ImageIcon(img7));
		
//		
//		final String targetUrl = "https://www.youtube.com/watch?v=oX9ZT3RbYE4";
//		try {
//			java.awt.Desktop.getDesktop().browse(java.net.URI.create(targetUrl));
//		} catch (IOException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}
		
		
		
		JLabel lblHallCover = new JLabel("");
		lblHallCover.setBounds(0, 0, 647, 168);
		contentPane.add(lblHallCover);
		
		Image img2 = new ImageIcon(this.getClass().getResource("/HallCover22.jpg")).getImage();		/// v.v. important to make EXE . >> 
		lblHallCover.setIcon(new ImageIcon(img2));
		
		  x = comboBoxMovieName.getToolTipText();
		  
		  
		  
		  
		  
		  
		  
		  
		  
//		  for (int i = 0; i < 25; i++) {
//				try{
//
//					  Thread.sleep(10);
//					}catch(InterruptedException ex){
//						JOptionPane.showMessageDialog(null, ex);
//					  //do stuff
//					}
//				System.out.println(i);
//				Image img3 = new ImageIcon(this.getClass().getResource("/"+movie[i]+".jpg")).getImage();		/// v.v. important to make EXE . >> 
//				lblMovie1.setIcon(new ImageIcon(img3));
//				
////				Image img4 = new ImageIcon(this.getClass().getResource("/"+movie[i+1]+".jpg")).getImage();		/// v.v. important to make EXE . >> 
////				lblMovie2.setIcon(new ImageIcon(img4));
////				
////				Image img5 = new ImageIcon(this.getClass().getResource("/"+movie[i+2]+".jpg")).getImage();		/// v.v. important to make EXE . >> 
////				lblMovie3.setIcon(new ImageIcon(img5));
////				
////				Image img6 = new ImageIcon(this.getClass().getResource("/"+movie[i+3]+".jpg")).getImage();		/// v.v. important to make EXE . >> 
////				lblMovie4.setIcon(new ImageIcon(img6));
////				
//				if (i==4) {
//					i = 0;
//					
//				}
//				
//			}
		
		
		
		
	}
	
	public static void  info_data_show(String show)
	{
		showw =  show;
	}
	
	public static void info_data_seat(String seat,String hall)
	{
		Customer_name =  textFieldCustomerName.getText();
		Contuct_Number = textFieldcntctNumber.getText();
		MovieName =(String)comboBoxMovieName.getSelectedItem();
		Cost = 200;
		seatt = seat;
		UserInfo.hall = hall;
		
		try {
			
			//String query = "select * from employeeinfo";
			
			String query = "insert into ticket (customername,contuctnumber,seat,cost,hall,moviename,show) values(?,?,?,?,?,?,?) ";
			PreparedStatement pst = connection.prepareStatement(query);
			
			
			pst.setString(1, Customer_name);
			pst.setString(2, Contuct_Number);
			pst.setString(3, seatt);
			pst.setLong(4, (long) Cost);
			pst.setString(5, UserInfo.hall);
			pst.setString(6, MovieName);
			pst.setString(7, showw);
			
			
			//ResultSet rs = pst.executeQuery();
			pst.execute();
			
			JOptionPane.showMessageDialog(null, "Data Saved");
			
			
			pst.close();
			//rs.close();
			
			
		} catch (Exception e) {
			// TODO: handle exception
			JOptionPane.showMessageDialog(null, e);
		}

		
		
		
		
	}
}
