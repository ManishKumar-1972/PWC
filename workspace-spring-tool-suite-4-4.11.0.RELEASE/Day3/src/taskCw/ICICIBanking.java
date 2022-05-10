package taskCw;

public class ICICIBanking implements Banking {

	@Override
	public String withdraw(int amt) {
		return "amount withdrawn from ICIC account:"+amt;
	}

	@Override
	public String deposit(int amt) {
		return "amount deposited to ICICI account:"+amt;
	}

	@Override
	public String checkbalance() {
		return "available balance in ICICI account:";
	}

}
