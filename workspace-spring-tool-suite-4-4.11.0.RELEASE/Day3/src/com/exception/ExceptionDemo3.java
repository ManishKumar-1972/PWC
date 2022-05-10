package com.exception;

public class ExceptionDemo3 {
	
	public static void demo() {
		throw new NullPointerException("Exception called");
	}
	public static void main(String[] args) {
		try {
			demo();
		} catch (NullPointerException e) {
			System.out.println("caught again");
		}
	}

}
