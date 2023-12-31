package loops;

import java.util.Scanner;

public class hcf2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your first number: ");
		int num1=sc.nextInt();
		
		System.out.println("Enter your second number: ");
		int num2=sc.nextInt();
		
		int hcf=findHCF(num1,num2);
        System.out.println("The HCF of " + num1 + " and " + num2 + " is: " + hcf);

		sc.close();
		
		
	}

	private static int findHCF(int num1, int num2) {
		while(num2!=0) {
			int temp=num2;
			num2=num1%num2;
			num1=temp;
		}
		return num1;
	}

}
