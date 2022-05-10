package com.miniapp;

public class Guest {
	
	public static void main(String[] args) {
		
		FrontdeskService fds = new FrontdeskService(new ItalianRestaurant());
		
		System.out.println(fds.takeOrder("pasta"));
	}

}
