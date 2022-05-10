package jdbcDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertDemo {
	

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String data = "Insert into employees(uname, email, city, income)values(?,?,?,?)";
		Class.forName("com.mysql.jdbc.Driver");
		
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/pwcdb", "root", "root123");
		PreparedStatement pst = conn.prepareStatement(data);
		pst.setString(1, args[0]);
		pst.setString(2, args[1]);
		pst.setString(3, args[2]);
		pst.setInt(4, Integer.parseInt(args[3]));
		pst.executeUpdate();
		
		System.out.println("User is added");
		
	}

}
