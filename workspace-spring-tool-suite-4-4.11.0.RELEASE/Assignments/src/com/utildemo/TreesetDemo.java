package com.utildemo;

import java.util.TreeSet;

public class TreesetDemo {
	public static void main(String[] args) {
		TreeSet<User> al = new TreeSet<User>();
		
		al.add(new User(101, "adam", "adam@email.com"));
		al.add(new User(102, "chavi","chavi@email.com"));
		al.add(new User(103, "tom", "tom@email.com"));
		al.add(new User(101, "adam", "adam@email.com"));
		
		for(User us:al) {
			System.out.println(us);
		}
		System.out.println(al.size());
	}

}
