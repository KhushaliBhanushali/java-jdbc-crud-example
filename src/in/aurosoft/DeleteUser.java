package in.aurosoft;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteUser {

	public static void main(String[] args) {
		String dbURL = "jdbc:mysql://localhost:3306/sampledb";
		String username = "root";
		String password = "root";
		
		try {
			 
		    Connection conn = DriverManager.getConnection(dbURL, username, password);
		 
		    String sql = "DELETE FROM Users WHERE username=?";
		    
		    PreparedStatement statement = conn.prepareStatement(sql);
		    statement.setString(1, "john");
		     
		    int rowsDeleted = statement.executeUpdate();
		    if (rowsDeleted > 0) {
		        System.out.println("A user was deleted successfully!");
		    }
		        
		        conn.close();
		    
		} catch (SQLException ex) {
		    ex.printStackTrace();
		}

	}
}
