package com.model;

public class Department {
	
	private String departmentname;
	private String managername;
	public String getDepartmentname() {
		return departmentname;
	}
	public void setDepartmentname(String departmentname) {
		this.departmentname = departmentname;
	}
	public String getManagername() {
		return managername;
	}
	public void setManagername(String managername) {
		this.managername = managername;
	}
	public Department(String departmentname, String managername) {
		super();
		this.departmentname = departmentname;
		this.managername = managername;
	}
	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Department [departmentname=" + departmentname + ", managername=" + managername + "]";
	}
	
}
