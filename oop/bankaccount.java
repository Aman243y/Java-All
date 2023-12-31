package oop;

public class bankaccount {
	static int generateNextAccountNumber=50000;
	double Balance;
	int accountNumber;
	
	bankaccount(){
		Balance=0.0;
		accountNumber=generateNextAccountNumber;
		generateNextAccountNumber++;
		
		
	}
	void getdetails() {
		System.out.println("bank Details for"+accountNumber+":");
		System.out.println("current balance is:"+Balance+" "+accountNumber);
	}
	void deposite(double amt) {
		Balance =Balance+amt;
		System.out.println("Deposited INR"+amt+"to your bank account");
	}
	

}
