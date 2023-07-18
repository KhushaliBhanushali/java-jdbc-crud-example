package in.aurosoft;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class UserManager {

	public static void main(String[] args) {
		String dbURL = "jdbc:mysql://localhost:3306/aurosoft_db";
		String username = "root";
		String password = "root";
		 
		try {
		 
		    Connection conn = DriverManager.getConnection(dbURL, username, password);
		 
		    if (conn != null) {
		        System.out.println("Connected");
		    }
		        
		        conn.close();
		    
		} catch (SQLException ex) {
		    ex.printStackTrace();
		}
	}

}
