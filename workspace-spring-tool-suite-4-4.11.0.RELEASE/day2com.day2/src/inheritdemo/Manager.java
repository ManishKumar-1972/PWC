package inheritdemo;

public class Manager extends Employee {
	
	private String FavFood;
	public Manager (int empID, String empName, String FavFood) {
		super(empID, empName);
		this.FavFood = FavFood;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Manager [FavFood=" + FavFood + "]";
	}
}
