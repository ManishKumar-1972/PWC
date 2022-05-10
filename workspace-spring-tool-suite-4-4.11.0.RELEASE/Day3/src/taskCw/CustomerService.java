package taskCw;

public class CustomerService {
	
	private Banking bank;

	public CustomerService(Banking bank) {
		super();
		this.bank = bank;
	}

	public String withdrawService(int amount) {
		return bank.withdraw(amount);
	}
	
	public String depositeService(int amount) {
		return bank.deposit(amount);
	}
	
	public String checkbalanceService() {
		return bank.checkbalance();
	}

}
