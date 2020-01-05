
import java.sql.*;
import javax.swing.*;


public class SqliteConnection {
	
	static Connection conn = null;
	
	public static Connection dbConnector() {
		try {
			Class.forName("org.sqlite.JDBC");
			Connection conn = DriverManager.getConnection("jdbc:sqlite:E:\\STUDY\\Java\\code for java\\comcc\\Employeedata.sqlite");
			//JOptionPane.showMessageDialog(null, "Connection Successful");
			
			return conn;
			
		} catch (Exception e) {
			// TODO: handle exception
			JOptionPane.showMessageDialog(null, e);
			return null;
			
		}
	
		
	}
	

}
