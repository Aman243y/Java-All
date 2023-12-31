package loops;

import java.util.Scanner;

public class PowerofNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a base: ");
		double base=sc.nextInt();
		
		System.out.println("Enter a exponent: ");
		int exponent=sc.nextInt();
		
		double result=1;
		 for(int i=0;i<exponent;i++) {
			 result=result*base;
		 }
		 System.out.println(base + " raised to the power of " + exponent + " is: " + result);
		 sc.close();
		

	}

}
