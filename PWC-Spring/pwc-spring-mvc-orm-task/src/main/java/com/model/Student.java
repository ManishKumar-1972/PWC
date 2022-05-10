package com.model;

public class Student {
	
	private int rollno;
	private String stuname;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	private String subject;
	private int marks;
	public Student(int rollno, String stuname, String subject, int marks) {
		super();
		this.rollno = rollno;
		this.stuname = stuname;
		this.subject = subject;
		this.marks = marks;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getStuname() {
		return stuname;
	}
	public void setStuname(String stuname) {
		this.stuname = stuname;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", stuname=" + stuname + ", subject=" + subject + ", marks=" + marks + "]";
	}

}
