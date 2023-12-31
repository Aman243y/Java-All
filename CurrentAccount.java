package inheritance;

public class CurrentAccount extends account {
	double overdraftleft;
	
	public CurrentAccount(String accountNumber, double balance, double overdraftleft) {
		super(accountNumber, balance);
		this.overdraftleft = overdraftleft;
	}

	public double getOverdraftleft() {
		return overdraftleft;
	}
	

	
	

}
