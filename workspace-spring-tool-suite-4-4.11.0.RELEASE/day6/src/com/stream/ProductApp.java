package com.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ProductApp {
	
	public static void main(String[] args) {
		List<String> members = new ArrayList<String>();
		
		members.add("admin");
		members.add("administrator");
		members.add("manager");
		members.add("tester");
		
		
		List<String>newdata=members.stream().sorted().filter((s)->s.startsWith("a")).map(String::toUpperCase).collect(Collectors.toList());
		System.out.println(newdata);
	}
	

}
