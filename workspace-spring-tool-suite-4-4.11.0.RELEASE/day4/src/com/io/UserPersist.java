package com.io;

import java.io.FileNotFoundException;


public class UserPersist {
	public static void main(String[] args) throws IOException {
		User user = new User(101,"santosh", "santosh@mail.com");
		
		System.out.println(user);
		
		FileOutputStream fos = new FileOutputStream("userdata.txt");
		ObjectOutputStream oos= new ObjectOutputStream(fos);
		oos.writeObject(user);
		System.out.println("done");
	}

}
