package com.inter;

public class PublicSectorBank implements Bank,InsuranceService,MutualFunds {

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

	@Override
	public void selfinsurance() {
		System.out.println("SelInsurance");
		
	}

	@Override
	public void settleClaims() {
		System.out.println("settleClaims");
		
	}

	@Override
	public void buy() {
		System.out.println("mf buy");
		
	}

	@Override
	public void sell() {
		System.out.println("mf sell");
		
	}
	

}
