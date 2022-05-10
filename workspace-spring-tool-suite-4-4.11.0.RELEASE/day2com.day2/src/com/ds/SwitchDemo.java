package com.ds;

public class SwitchDemo {
	public static void main(String[] args) {
		int intValue=0;
		String userLocation;
		
		switch(intValue) {
		case 11:
			userLocation="PUNE";
			break;
		case 12:
			userLocation="MUMBAI";
			break;
		case 13:
			userLocation="NASIK";
			break;
			
			default:
				userLocation="UNKNOWN";
				break;
		}
		System.out.println("User Location" + userLocation);
	}

}
