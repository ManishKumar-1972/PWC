package com.abs;

public class PublicSectorBank extends Bank {

	@Override
	public void checkBalance() {
		
		System.out.println("public sector balance");
	}

	@Override
	public void withdraw() {
		System.out.println("public sector withdraw");
		
	}

	@Override
	public void deposit() {
		System.out.println("public sector deposit");
		
	}
	
	

}
