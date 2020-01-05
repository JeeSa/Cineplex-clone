import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JLabel;

import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

import javax.swing.BoxLayout;

import java.awt.Font;
import java.awt.Color;

import javax.swing.SwingConstants;
import javax.swing.event.AncestorListener;
import javax.swing.event.AncestorEvent;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Show extends JFrame {

	private JPanel contentPane;

		 static Show frame;
		 
		 static SeatNumber obseatnumber;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					 frame = new Show("ANT-MAN","3:30","","","","");
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
	public Show(String Movie_Name,String First_Show,String Second_Show,String Third_show,String Fourth_show,String Fith_show) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 521, 159);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 83, 485, 38);
		contentPane.add(panel);
		panel.setLayout(null);
		
		
		JButton button_1 = new JButton("");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UserInfo.info_data_show(First_Show);
				//JOptionPane.showMessageDialog(null, First_Show);
				 obseatnumber = new SeatNumber();
				
				//SeatNumber.frame.setVisible(true);
				try {
					UserInfo.obshow.dispose();
				} catch (Exception e2) {
					// TODO: handle exception
					JOptionPane.showMessageDialog(null, e2);
				}
				UserInfo.frame.setVisible(false);
				obseatnumber.setVisible(true);
				
			}
		});
		button_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		button_1.setBounds(194, 0, 97, 38);
		button_1.setText(First_Show);
		panel.add(button_1);
		
	
		
		JButton button_2 = new JButton("");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UserInfo.info_data_show(Second_Show);
				obseatnumber = new SeatNumber();
				try {
					UserInfo.obshow.dispose();
					
				} catch (Exception e2) {
					// TODO: handle exception
					JOptionPane.showMessageDialog(null, e2);
				}
				UserInfo.frame.setVisible(false);
				obseatnumber.setVisible(true);
				
			}
		});
		button_2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		button_2.setBounds(388, 0, 97, 38);
		button_2.setText(Second_Show);
		panel.add(button_2);
		
		JButton button_3 = new JButton("");
		button_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UserInfo.info_data_show(Third_show);
				obseatnumber = new SeatNumber();
				try {
					UserInfo.obshow.dispose();
				} catch (Exception e2) {
					// TODO: handle exception
					JOptionPane.showMessageDialog(null, e2);
				}
				UserInfo.frame.setVisible(false);
				obseatnumber.setVisible(true);
			}
		});
		button_3.setBounds(97, 0, 97, 38);
		button_3.setText(Third_show);
		panel.add(button_3);
		
		JButton button_4 = new JButton("");
		button_4.setFont(new Font("Tahoma", Font.BOLD, 14));
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				UserInfo.info_data_show(Fourth_show);
				obseatnumber = new SeatNumber();
				try {
					UserInfo.obshow.dispose();
				} catch (Exception e) {
					// TODO: handle exception
					JOptionPane.showMessageDialog(null, e);
				}
				UserInfo.frame.setVisible(false);
				obseatnumber.setVisible(true);
			}
		});
		button_4.setBounds(0, 0, 97, 38);
		button_4.setText(Fourth_show);
		panel.add(button_4);
		
		JButton button_5 = new JButton("");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UserInfo.info_data_show(Fith_show);
				obseatnumber = new SeatNumber();
				try {
					UserInfo.obshow.dispose();
					
				} catch (Exception e3) {
					// TODO: handle exception
					JOptionPane.showMessageDialog(null, e3);
				}
				UserInfo.frame.setVisible(false);
				obseatnumber.setVisible(true);
			}
		});
		button_5.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		button_5.setBounds(291, 0, 97, 38);
		button_5.setText(Fith_show);
		panel.add(button_5);
		
		JLabel lblmoviename = new JLabel("");
		lblmoviename.setHorizontalAlignment(SwingConstants.CENTER);
		lblmoviename.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblmoviename.setBounds(10, 0, 485, 38);
		lblmoviename.setText(Movie_Name);
		contentPane.add(lblmoviename);
		
		
		JLabel lblAvailableShows = new JLabel("Available Shows");
		lblAvailableShows.setHorizontalAlignment(SwingConstants.CENTER);
		lblAvailableShows.setForeground(Color.MAGENTA);
		lblAvailableShows.setFont(new Font("Tempus Sans ITC", Font.BOLD | Font.ITALIC, 18));
		lblAvailableShows.setBounds(10, 49, 485, 23);
		contentPane.add(lblAvailableShows);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					UserInfo.obshow.dispose();
				} catch (Exception e2) {
					// TODO: handle exception
					JOptionPane.showMessageDialog(null, e2);
				}
				
			}
		});
		btnBack.setBounds(416, 0, 89, 23);
		contentPane.add(btnBack);
	}
}
