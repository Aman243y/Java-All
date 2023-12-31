package exception;

import java.util.Scanner;

public class demoeception {

	public static void main(String[] args) {
		System.out.println("hello from main method");
		System.out.println("chalega");
		System.out.println("enter two number");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		try {
		int div=a/b;//cause exception
		System.out.println("Resultant of division is"+div);
		}
		catch(ArithmeticException vada) {
			System.out.println("oye infinite you cannot divide by zero");
		}
		System.out.println("main() ends here becoz next is closing curly bracket of main method");

	}

}
