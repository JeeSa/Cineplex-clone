
import java.sql.*;
import javax.swing.*;


public class SqliteConnection {
	
	static Connection conn = null;
	
	public static Connection dbConnector() {
		try {
			Class.forName("org.sqlite.JDBC");
			Connection conn = DriverManager.getConnection("jdbc:sqlite:F:\\Study\\EmployeeData.sqlite");
			//JOptionPane.showMessageDialog(null, "Connection Successful");
			
			return conn;
			
		} catch (Exception e) {
			// TODO: handle exception
			JOptionPane.showMessageDialog(null, e);
			return null;
			
		}
	
		
	}
	

}
