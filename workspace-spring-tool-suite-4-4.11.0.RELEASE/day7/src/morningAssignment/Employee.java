package morningAssignment;

public class Employee {
	int id;
	String name;
	int income;
	String department;
	public Employee(int id, String name, int income, String department) {
		super();
		this.id = id;
		this.name = name;
		this.income = income;
		this.department = department;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getIncome() {
		return income;
	}
	public void setIncome(int income) {
		this.income = income;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	
	

}
