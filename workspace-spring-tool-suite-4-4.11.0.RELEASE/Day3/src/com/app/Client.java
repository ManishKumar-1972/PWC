package com.app;

public class Client {

	public static void main(String[] args) {
		
		User user = new User();
		UserDao ud = new UserDaoImpl();
		
		try {
		ud.addUser(user);
		} catch (DAOException e) {
			
		System.out.println(e.getMessage());
		}
		System.out.println("user added");
	}
}
