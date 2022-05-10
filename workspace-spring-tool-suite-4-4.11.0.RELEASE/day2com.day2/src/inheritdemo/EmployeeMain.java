package inheritdemo;

public class EmployeeMain {
	
	public static void main(String[] args) {
		Admin admin = new Admin(101, "Paras", "IT");
		System.out.println(admin);
		
		Manager manager = new Manager(102, "Lola", "Jalebi");
		System.out.println(manager);
	}

}
