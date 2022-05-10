package jdbcDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateDemo {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String data = "Update employees set email=? where uname=?";
		Class.forName("com.mysql.jdbc.Driver");
		
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/pwcdb", "root", "root123");
		PreparedStatement pst = conn.prepareStatement(data);
		pst.setString(1, args[0]);
		pst.setString(2, args[1]);
		
		pst.executeUpdate();
		
		System.out.println("User is updated..");
		
	}
	
	

}
