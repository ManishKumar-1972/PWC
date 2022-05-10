package com.app;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class UserDaoImpl implements UserDao {

	@Override
	public void addUser(User user) throws DAOException {
		try {
			FileOutputStream fos = new FileOutputStream("c:\\");
		} catch (FileNotFoundException e) {
			throw new DAOException
			("something went wrong... try after some time", e);
			
		}
		
	}
	
	
	

}
