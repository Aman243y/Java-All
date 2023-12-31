package loops;

import java.util.Scanner;

public class lcm2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your first number: ");
		int num1=sc.nextInt();
		System.out.println("enter your second number");
		int num2=sc.nextInt();
		int lcm= findLCM(num1,num2);
		System.out.println("the lcm of " + num1 + " and " + num2 + " is: " + lcm);
	}

	private static int findLCM(int num1, int num2) {
		int hcf=findHcf(num1,num2);
		int lcm= (num1*num2)/hcf;
		return lcm;
	}

	private static int findHcf(int num1, int num2) {
		while(num2!=0) {
			int temp=num2;
			num2=num1%num2;
			num1=temp;
		}
		return num1;
	}

}
