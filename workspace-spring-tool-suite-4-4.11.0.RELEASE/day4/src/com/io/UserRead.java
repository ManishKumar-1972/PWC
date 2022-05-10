package com.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class UserRead {
	
	public static void main(String[] args) throws ClassNotFoundException, IOException {
		FileInputStream fis = new FileInputStream("userdata.txt");
		
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		User user = (User)ois.readObject();
		
		System.out.println(user);
	}

}
