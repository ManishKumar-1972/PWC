package com.exception;

public class ExceptionDemo2 {
	
	public static void main(String[] args) {
		
		try {
			int a[] = new int[5];
			a[5] = 20/0;
		} 
		catch (ArithmeticException e) {
			System.out.println("divide by zero");
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("check the length of array");
		}
		catch (Exception e) {
			System.out.println("handles everything");
		}
		finally {
			System.out.println("called always");
		}
	}

}
