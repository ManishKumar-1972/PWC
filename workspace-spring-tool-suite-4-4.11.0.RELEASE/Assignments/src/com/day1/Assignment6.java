package com.day1;

public class Assignment6 {
	class Operator {
		public static void main(String[] args) {
			
			int intVal = 10;
			float floatVal = 3.0f;
			boolean bool1 = true;
			boolean bool2 = false;
			boolean bool3 = true;
			
			System.out.println("Arithmetic");
			System.out.println(intVal + "%" + floatVal + "=" + (intVal % floatVal));
			System.out.println();
			
			
			System.out.println("String Concatenation");
			System.out.println("Day" + 2 + "Session");
			System.out.println("\n" + 2 + 3 + "\n" + (2+3));
			System.out.println();
			
			System.out.println("Relational");
			System.out.println(intVal + "==" + floatVal + "=" + (intVal==floatVal));
			
			floatVal = 10.0f;
			
			
			
		}
	}

}
