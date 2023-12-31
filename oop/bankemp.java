package oop;

public class bankemp {

	public static void main(String[] args) {
		bankaccount aman=new bankaccount();//50000
		bankaccount tanuj=new bankaccount();//50001
		bankaccount pandey=new bankaccount();//50002
		
		
		aman.getdetails();
		aman.deposite(1000);
		aman.getdetails();
		

	}

}
