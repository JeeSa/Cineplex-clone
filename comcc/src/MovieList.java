import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

import java.awt.Font;

import javax.swing.JTable;
import javax.swing.JScrollPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.*;

import javax.swing.*;

import net.proteanit.sql.DbUtils;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Color;



public class MovieList extends JFrame {

	private JPanel contentPane;
	private JTable table;
	
	public JComboBox comboMovieName;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MovieList frame = new MovieList();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	Connection connection = null;
	private JTextField textFieldEid;
	private JTextField textFieldShow_1;
	private JTextField textFieldShow_2;
	private JTextField textFieldMovieName;
	private JTextField textFieldShow_3;
	
	
	public void refreshTable() {
		
		try {
			
			//String query = "select * from employeeinfo";
			
			String query = "select rowid,MovieName,Show1,Show2,Show3 from movielist";
			PreparedStatement pst = connection.prepareStatement(query);
			ResultSet rs = pst.executeQuery();
			
			table.setModel(DbUtils.resultSetToTableModel(rs));
			
			pst.close();
			rs.close();
			
		} catch (Exception e) {
			// TODO: handle exception
			JOptionPane.showMessageDialog(null, e);
		}
		
		
	}
	
	public void fillComboBox()
	{
		try {
			String query = "select * from movielist";
			PreparedStatement pst = connection.prepareStatement(query);
			
			ResultSet rs = pst.executeQuery();
			
			while(rs.next())
			{
				comboMovieName.addItem(rs.getString("moviename"));
				//comboBoxId.addItem(rs.getString("rowid"));
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			JOptionPane.showMessageDialog(null, e);
		}
	}

	/**
	 * Create the frame.
	 */
	public MovieList() {
		connection = SqliteConnection.dbConnector();
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 725, 415);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(240, 48, 459, 302);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				try {
					
					int row = table.getSelectedRow();
					
					String query = "select * from employeeinfo where name =?";
					PreparedStatement pst = connection.prepareStatement(query);
					pst.setString(1, (String)comboMovieName.getSelectedItem());
					
					ResultSet rs = pst.executeQuery();
					
					while(rs.next())
					{
						textFieldEid.setText(rs.getString("eid"));
						textFieldMovieName.setText(rs.getString("name"));
						textFieldShow_1.setText(rs.getString("surname"));
						textFieldShow_2.setText(rs.getString("age"));
						
					}
					
					pst.close();
					
				} catch (Exception e) {
					// TODO: handle exception
					JOptionPane.showMessageDialog(null, e);
				}
				
			}
		});
		scrollPane.setViewportView(table);
		
		JLabel lblEid = new JLabel("Movie ID");
		lblEid.setFont(new Font("Microsoft JhengHei", Font.BOLD, 18));
		lblEid.setBounds(20, 47, 82, 22);
		contentPane.add(lblEid);
		
		JLabel lblName = new JLabel("Movie Name");
		lblName.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 16));
		lblName.setBounds(0, 81, 102, 22);
		contentPane.add(lblName);
		
		JLabel lblSurname = new JLabel("Show 1");
		lblSurname.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 18));
		lblSurname.setBounds(20, 114, 82, 22);
		contentPane.add(lblSurname);
		
		JLabel lblAge = new JLabel("Show 2");
		lblAge.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 18));
		lblAge.setBounds(20, 147, 82, 22);
		contentPane.add(lblAge);
		
		textFieldEid = new JTextField();
		textFieldEid.setEditable(false);
		textFieldEid.setBounds(112, 52, 118, 20);
		contentPane.add(textFieldEid);
		textFieldEid.setColumns(10);
		
		textFieldShow_1 = new JTextField();
		textFieldShow_1.setColumns(10);
		textFieldShow_1.setBounds(112, 118, 118, 20);
		contentPane.add(textFieldShow_1);
		
		textFieldShow_2 = new JTextField();
		textFieldShow_2.setColumns(10);
		textFieldShow_2.setBounds(112, 151, 118, 20);
		contentPane.add(textFieldShow_2);
		
		textFieldMovieName = new JTextField();
		textFieldMovieName.setColumns(10);
		textFieldMovieName.setBounds(112, 85, 118, 20);
		contentPane.add(textFieldMovieName);
		
		JButton btnSave = new JButton("Save");
		btnSave.setBackground(new Color(0, 255, 0));
		btnSave.setForeground(new Color(0, 0, 0));
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				try {
					
					//String query = "select * from employeeinfo";
					
					String query = "insert into movielist (MovieName,Show1,Show2,Show3) values(?,?,?,?) ";
					PreparedStatement pst = connection.prepareStatement(query);
					
					
					pst.setString(1, textFieldMovieName.getText());
					pst.setString(2, textFieldShow_1.getText());
					pst.setString(3, textFieldShow_2.getText());
					pst.setString(4, textFieldShow_3.getText());
					
					
					//ResultSet rs = pst.executeQuery();
					pst.execute();
					
					JOptionPane.showMessageDialog(null, "Movie Selected");
					
					
					pst.close();
					//rs.close();
					
					
				} catch (Exception e) {
					// TODO: handle exception
					JOptionPane.showMessageDialog(null, e);
				}
				
				refreshTable();
				
			}
		});
		btnSave.setFont(new Font("Microsoft JhengHei", Font.BOLD, 23));
		btnSave.setBounds(0, 249, 111, 57);
		contentPane.add(btnSave);
		
		JLabel lblUserName = new JLabel("Show 3");
		lblUserName.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 18));
		lblUserName.setBounds(20, 180, 104, 22);
		contentPane.add(lblUserName);
		
		textFieldShow_3 = new JTextField();
		textFieldShow_3.setColumns(10);
		textFieldShow_3.setBounds(112, 184, 118, 20);
		contentPane.add(textFieldShow_3);
		
		JButton btnUpdate = new JButton("Update");
		btnUpdate.setBackground(new Color(204, 204, 153));
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				try {
					
					//String query = "select * from employeeinfo";
					
					String query = "update movielist set  moviename = '"+textFieldMovieName.getText()+"', show1 = '"+textFieldShow_1.getText()+"', show2 = '"+textFieldShow_2.getText()+"', show3 = '"+textFieldShow_3.getText()+"'    where moviename = '"+textFieldMovieName.getText()+"'";
					PreparedStatement pst = connection.prepareStatement(query);
					
					
					//ResultSet rs = pst.executeQuery();
					pst.execute();
					
					JOptionPane.showMessageDialog(null, "Data Updated");
					
					
					pst.close();
					//rs.close();
					
					
				} catch (Exception e) {
					// TODO: handle exception
					JOptionPane.showMessageDialog(null, e);
				}
				refreshTable();
			}
		});
		btnUpdate.setFont(new Font("Microsoft JhengHei", Font.BOLD, 15));
		btnUpdate.setBounds(123, 249, 94, 23);
		contentPane.add(btnUpdate);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.setBackground(new Color(204, 255, 0));
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				try {
					
					//String query = "select * from employeeinfo";
					
					String query = "delete from movielist where moviename='"+textFieldMovieName.getText()+"'";
					PreparedStatement pst = connection.prepareStatement(query);
					
					
					//ResultSet rs = pst.executeQuery();
					pst.execute();
					
					JOptionPane.showMessageDialog(null, "Data Deleted");
					
					
					pst.close();
					//rs.close();
					
					
				} catch (Exception e) {
					// TODO: handle exception
					JOptionPane.showMessageDialog(null, e);
				}
				
				refreshTable();
			}
		});
		btnDelete.setFont(new Font("Microsoft JhengHei", Font.BOLD, 16));
		btnDelete.setBounds(123, 283, 94, 23);
		contentPane.add(btnDelete);
		
		comboMovieName = new JComboBox();
		comboMovieName.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					
					String query = "select * from movielist where moviename =?";
					PreparedStatement pst = connection.prepareStatement(query);
					pst.setString(1, (String)comboMovieName.getSelectedItem());
					
					ResultSet rs = pst.executeQuery();
					
					while(rs.next())
					{
						//textFieldEid.setText(rs.getString("rowid"));
						textFieldMovieName.setText(rs.getString("moviename"));
						textFieldShow_1.setText(rs.getString("show1"));
						textFieldShow_2.setText(rs.getString("show2"));
						textFieldShow_3.setText(rs.getString("show3"));
						
					}
					
					pst.close();
					
				} catch (Exception e) {
					// TODO: handle exception
					JOptionPane.showMessageDialog(null, e);
				}
			}
		});
		comboMovieName.setBounds(93, 11, 124, 20);
		contentPane.add(comboMovieName);
		refreshTable();
		fillComboBox();
	}
}
