
import java.sql.*;
import javax.swing.*;
public class sqliteConnection_1 {
	 Connection conn=null;
	public static Connection dbConnection()	
	{
		try {
			Class.forName("org.sqlite.JDBC");
			Connection conn=DriverManager.getConnection("jdbc:sqlite:E:\\STUDY\\Java\\code for java\\comcc\\EmpData.sqlite"); 
			//JOptionPane.showMessageDialog(null, "The Connection is Successfull");
			return conn;
		}
			
		 catch (Exception e) {
			//JOptionPane.showMessageDialog(null, e);
			 System.out.println(e);
			return null;
	}

}
}
