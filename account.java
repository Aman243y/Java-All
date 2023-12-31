package inheritance;

public class account {
	private String accountNumber;
	private double balance;
	
	public account(String accountNumber, double balance) {
		super();
		this.accountNumber = accountNumber;
		this.balance = balance;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public double getBalance() {
		return balance;
	}
	public void deposit(double amount) {
		balance +=amount;
		System.out.println("deposited:$"+amount);
	}
	public void withdraw(double amount) {
		if(balance >=amount) {
			balance-=amount;
			System.out.println("withdraw:"+amount);
		}
		else {
			System.out.println("insufficient balance.");
		}
	}
	
	
	

}
