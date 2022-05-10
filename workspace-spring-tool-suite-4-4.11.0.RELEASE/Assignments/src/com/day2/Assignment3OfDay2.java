package com.day2;

public class Assignment3OfDay2 {
	public static void main(String[] args) {
		char Grade = 'E';
		String Marks;
		
		switch(Grade) {
		case 'A':
			Marks="80-100";
			break;
		case 'B':
			Marks="73-79";
			break;
		case 'C':
			Marks="65-72";
			break;
		case 'D':
			Marks="55-64";
			break;
			
			default:
				Marks="<55";
				break;
		}
		System.out.println("Marks" + Marks);
	}
}
