package com.day2;

public class CourseManagement {
	public static void main(String[] args) {
		Student student = new Student();
		
		student.setStudentId(10);
		student.setStudentType('F');
		
		System.out.println(student);
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Student [Type " + studentId + " Student Type " + studentType + "]";
	}

}
