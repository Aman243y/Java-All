package inheritance;

public class SavingAccount extends account {
	private double intrestRate;
	public SavingAccount(String accountNumber, double balance,double intrestRate) {
		super(accountNumber, balance);
		this.intrestRate=intrestRate;
		
	}
	public double getIntrestRate() {
		return intrestRate;
	}
	public void addIntrest() {
		double intrest=getBalance()*intrestRate/100;
		deposit(intrest);
		System.out.println("Added intrest" +intrest);
	}

	
	
	
	
	

}
