package in.aurosoft;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertUser {

	public static void main(String[] args) {
		String dbURL = "jdbc:mysql://localhost:3306/aurosoft_db";
		String username = "root";
		String password = "root";
		 
		try {
		 
		    Connection conn = DriverManager.getConnection(dbURL, username, password);
		 
		    String sql = "INSERT INTO Users (username, password, fullname, email) VALUES (?, ?, ?, ?)";
		    
		    PreparedStatement statement = conn.prepareStatement(sql);
		    statement.setString(1, "khushi");
		    statement.setString(2, "khushi1234");
		    statement.setString(3, "Khushi Bhanushali");
		    statement.setString(4, "khushi@gmail.com");
		     
		    int rowsInserted = statement.executeUpdate();
		    if (rowsInserted > 0) {
		        System.out.println("A new user was inserted successfully!");
		    }
		        
		        conn.close();
		    
		} catch (SQLException ex) {
		    ex.printStackTrace();
		}
	}

}

