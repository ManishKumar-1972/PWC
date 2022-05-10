package com.day2;

public class PassbyVal {
	public static void main(String[] args) {
		int sId = 25;
		PassbyVal val = new PassbyVal();
		System.out.println(sId);
		val.passTheValueMethod(sId);
		System.out.println("The sId are" + sId);
	}
	
	public void passTheValueMethod(int sId)
	{
		sId = 10;
		System.out.println("The sId are" + sId);
		
		
	}
	

}
