package taskCw;

public class BankingClient {
	
	public static void main(String[] args) {
		CustomerService cs1=new CustomerService(new SBIBank());
		System.out.println(cs1.withdrawService(100));
		System.out.println(cs1.depositeService(100));
		System.out.println(cs1.checkbalanceService());
		
		CustomerService cs2=new CustomerService(new ICICIBanking());
		System.out.println(cs2.withdrawService(100));
		System.out.println(cs2.depositeService(100));
		System.out.println(cs2.checkbalanceService());
	}	

}
