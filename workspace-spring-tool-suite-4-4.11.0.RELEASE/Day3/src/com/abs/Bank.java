package com.abs;

public abstract class Bank {
	
	public abstract void checkBalance();
	public abstract void withdraw();
	public abstract void deposit();
	
	public void businessBanking() {
		System.out.println("default imp");
	}
	

}
