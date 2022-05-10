package com.sam;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo {
	
	public static void main(String[] args) {
		ArrayList<User> al = new ArrayList<User>();
		
		al.add(new User(101, "adam", "adam@mail.com"));
		al.add(new User(102, "chavi", "chavi@mail.com"));
		al.add(new User(103, "tom", "tom@mail.com"));
		al.add(new User(104, "admin", "admin@mail.com"));
		
		Collections.sort(al,(User u1, User u2)-> u1.getUname().compareTo(u2.getUname()));
		
		for(User us:al) {
		System.out.println(us);
	}

}
}