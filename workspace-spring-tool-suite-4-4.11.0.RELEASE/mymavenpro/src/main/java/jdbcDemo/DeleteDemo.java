package jdbcDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteDemo {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String data = "Delete from employees where uname=?";
		Class.forName("com.mysql.jdbc.Driver");
		
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/pwcdb", "root", "root123");
		PreparedStatement pst = conn.prepareStatement(data);
		pst.setString(1, args[0]);
		
		pst.executeUpdate();
		
		System.out.println("User is Deleted..");
		
	}

}
