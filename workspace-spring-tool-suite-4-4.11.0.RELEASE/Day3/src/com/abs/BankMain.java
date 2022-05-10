package com.abs;

public class BankMain {
	
	public static void main(String[] args) {
		
		Bank bank = new PublicSectorBank();
		bank.checkBalance();
		bank.deposit();
		bank.businessBanking();
	}

}
