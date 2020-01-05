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



public class EmployeeInfo extends JFrame {

	private JPanel contentPane;
	private JTable table;
	
	public JComboBox comboBoxemployeeName,comboBoxId;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EmployeeInfo frame = new EmployeeInfo();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	Connection connection = null;
	private JTextField textFieldEid;
	private JTextField textFieldSurname;
	private JTextField textFieldAge;
	private JTextField textFieldName;
	private JTextField textFieldusername;
	private JPasswordField passwordField;
	private JTextField textField_TableName;
	
	
	public void refreshTable() {
		
		try {
			
			//String query = "select * from employeeinfo";
			
			String query = "select Eid,Name,SurName,Age from employeeinfo";
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
			String query = "select * from employeeinfo";
			PreparedStatement pst = connection.prepareStatement(query);
			
			ResultSet rs = pst.executeQuery();
			
			while(rs.next())
			{
				comboBoxemployeeName.addItem(rs.getString("name"));
				comboBoxId.addItem(rs.getString("eid"));
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			JOptionPane.showMessageDialog(null, e);
		}
	}

	/**
	 * Create the frame.
	 */
	public EmployeeInfo() {
		connection = SqliteConnection.dbConnector();
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 725, 415);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnload = new JButton("CustomerInfo");
		btnload.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				try {
					
					//String query = "select * from employeeinfo";
					
					String query = "select Eid,Name,SurName,Age from employeeinfo";
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
		});
		btnload.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnload.setBounds(369, 11, 204, 26);
		contentPane.add(btnload);
		
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
					pst.setString(1, (String)comboBoxemployeeName.getSelectedItem());
					
					ResultSet rs = pst.executeQuery();
					
					while(rs.next())
					{
						textFieldEid.setText(rs.getString("eid"));
						textFieldName.setText(rs.getString("name"));
						textFieldSurname.setText(rs.getString("surname"));
						textFieldAge.setText(rs.getString("age"));
						
					}
					
					pst.close();
					
				} catch (Exception e) {
					// TODO: handle exception
					JOptionPane.showMessageDialog(null, e);
				}
				
			}
		});
		scrollPane.setViewportView(table);
		
		JLabel lblEid = new JLabel("id ");
		lblEid.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblEid.setBounds(10, 48, 21, 22);
		contentPane.add(lblEid);
		
		JLabel lblName = new JLabel("Name");
		lblName.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblName.setBounds(10, 81, 53, 22);
		contentPane.add(lblName);
		
		JLabel lblSurname = new JLabel("Surname\r\n");
		lblSurname.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblSurname.setBounds(10, 114, 82, 22);
		contentPane.add(lblSurname);
		
		JLabel lblAge = new JLabel("Age");
		lblAge.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblAge.setBounds(10, 147, 34, 22);
		contentPane.add(lblAge);
		
		textFieldEid = new JTextField();
		textFieldEid.setBounds(112, 52, 118, 20);
		contentPane.add(textFieldEid);
		textFieldEid.setColumns(10);
		
		textFieldSurname = new JTextField();
		textFieldSurname.setColumns(10);
		textFieldSurname.setBounds(112, 118, 118, 20);
		contentPane.add(textFieldSurname);
		
		textFieldAge = new JTextField();
		textFieldAge.setColumns(10);
		textFieldAge.setBounds(112, 151, 118, 20);
		contentPane.add(textFieldAge);
		
		textFieldName = new JTextField();
		textFieldName.setColumns(10);
		textFieldName.setBounds(112, 85, 118, 20);
		contentPane.add(textFieldName);
		
		JButton btnSave = new JButton("Save");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				try {
					
					//String query = "select * from employeeinfo";
					
					String query = "insert into employeeinfo (Eid,Name,SurName,Age,username,password) values(?,?,?,?,?,?) ";
					PreparedStatement pst = connection.prepareStatement(query);
					
					pst.setString(1, textFieldEid.getText());
					pst.setString(2, textFieldName.getText());
					pst.setString(3, textFieldSurname.getText());
					pst.setString(4, textFieldAge.getText());
					pst.setString(5, textFieldusername.getText());
					pst.setString(6, passwordField.getText());
					
					//ResultSet rs = pst.executeQuery();
					pst.execute();
					
					JOptionPane.showMessageDialog(null, "Data Saved");
					
					
					pst.close();
					//rs.close();
					
					
				} catch (Exception e) {
					// TODO: handle exception
					JOptionPane.showMessageDialog(null, e);
				}
				
				refreshTable();
				
			}
		});
		btnSave.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnSave.setBounds(20, 255, 89, 23);
		contentPane.add(btnSave);
		
		JLabel lblUserName = new JLabel("User Name");
		lblUserName.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblUserName.setBounds(10, 180, 104, 22);
		contentPane.add(lblUserName);
		
		textFieldusername = new JTextField();
		textFieldusername.setColumns(10);
		textFieldusername.setBounds(112, 184, 118, 20);
		contentPane.add(textFieldusername);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblPassword.setBounds(10, 214, 104, 22);
		contentPane.add(lblPassword);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(112, 215, 118, 26);
		contentPane.add(passwordField);
		
		JButton btnUpdate = new JButton("Update");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				try {
					
					//String query = "select * from employeeinfo";
					
					String query = "update employeeinfo set eid='"+textFieldEid.getText()+"', name = '"+textFieldName.getText()+"', surname = '"+textFieldSurname.getText()+"', age = '"+textFieldAge.getText()+"', username = '"+textFieldusername.getText()+"' , password = '"+passwordField.getText()+"'  where eid = '"+textFieldEid.getText()+"'";
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
		btnUpdate.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnUpdate.setBounds(30, 289, 104, 23);
		contentPane.add(btnUpdate);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				try {
					
					//String query = "select * from employeeinfo";
					
					String query = "delete from employeeinfo where eid='"+textFieldEid.getText()+"'";
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
		btnDelete.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnDelete.setBounds(40, 327, 94, 23);
		contentPane.add(btnDelete);
		
		comboBoxemployeeName = new JComboBox();
		comboBoxemployeeName.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					
					String query = "select * from employeeinfo where name =?";
					PreparedStatement pst = connection.prepareStatement(query);
					pst.setString(1, (String)comboBoxemployeeName.getSelectedItem());
					
					ResultSet rs = pst.executeQuery();
					
					while(rs.next())
					{
						textFieldEid.setText(rs.getString("eid"));
						textFieldName.setText(rs.getString("name"));
						textFieldSurname.setText(rs.getString("surname"));
						textFieldAge.setText(rs.getString("age"));
						
					}
					
					pst.close();
					
				} catch (Exception e) {
					// TODO: handle exception
					JOptionPane.showMessageDialog(null, e);
				}
			}
		});
		comboBoxemployeeName.setBounds(10, 11, 124, 20);
		contentPane.add(comboBoxemployeeName);
		
		comboBoxId = new JComboBox();
		comboBoxId.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					
					String query = "select * from employeeinfo where eid =?";
					PreparedStatement pst = connection.prepareStatement(query);
					pst.setString(1, (String)comboBoxId.getSelectedItem());
					
					ResultSet rs = pst.executeQuery();
					
					while(rs.next())
					{
						textFieldEid.setText(rs.getString("eid"));
						textFieldName.setText(rs.getString("name"));
						textFieldSurname.setText(rs.getString("surname"));
						textFieldAge.setText(rs.getString("age"));
						
					}
					
					pst.close();
					
				} catch (Exception e2) {
					// TODO: handle exception
					JOptionPane.showMessageDialog(null, e2);
				}
				
			}
		});
		comboBoxId.setBounds(144, 11, 124, 20);
		contentPane.add(comboBoxId);
		
		JButton btnTable = new JButton("Table");
		btnTable.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				try {
					String query = "create table "+textField_TableName.getText()+" (id int,name varchar(20))";
					PreparedStatement pst = connection.prepareStatement(query);
					
					pst.execute();
					
					JOptionPane.showMessageDialog(null, "Table created");
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		});
		btnTable.setBounds(144, 343, 89, 23);
		contentPane.add(btnTable);
		
		textField_TableName = new JTextField();
		textField_TableName.setBounds(144, 316, 86, 20);
		contentPane.add(textField_TableName);
		textField_TableName.setColumns(10);
		refreshTable();
		fillComboBox();
	}
}
