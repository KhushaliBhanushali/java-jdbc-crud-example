package in.aurosoft;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateUser {

	public static void main(String[] args) {
		String dbURL = "jdbc:mysql://localhost:3306/aurosoft_db";
		String username = "root";
		String password = "root";
		
		try {
			 
		    Connection conn = DriverManager.getConnection(dbURL, username, password);
		 
		    String sql = "UPDATE Users SET password=?, fullname=?, email=? WHERE username=?";
		    
		    PreparedStatement statement = conn.prepareStatement(sql);
			
			  statement.setString(1, "aurosoft4321"); 
			  statement.setString(2,"aurosoft technologies"); 
			  statement.setString(3, "aurosoft2706@gmail.com");
			  statement.setString(4, "auro");
			 
		     
		    int rowsUpdated = statement.executeUpdate();
		    if (rowsUpdated > 0) {
		        System.out.println("An existing user was updated successfully!");
		    }
		        
		        conn.close();
		    
		} catch (SQLException ex) {
		    ex.printStackTrace();
		}

	}
}
