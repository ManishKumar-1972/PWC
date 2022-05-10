package day2com.day2;

public class Student {
	
	private int stuRollNo;
	private String stuName;
	private String email;
	private String subject;
	
	public Student(int stuRollNo, String stuName, String email, String subject) {
		super();
		this.stuRollNo = stuRollNo;
		this.stuName = stuName;
		this.email = email;
		this.subject = subject;
	}
	
	public Student( ) {
		System.out.println("default constructor called");
	}

}
