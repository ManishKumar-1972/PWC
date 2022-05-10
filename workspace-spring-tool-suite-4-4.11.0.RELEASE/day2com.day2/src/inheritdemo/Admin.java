package inheritdemo;

public class Admin extends Employee {
	
	private String domain;
	
	public Admin(int empID, String empName, String domain) {
		super(empID, empName);
		this.domain = domain;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Admin [domain=" + domain + "]";
	}

}
