package ifelse;

public class equilateral {

	public static void main(String[] args) {
		int a=30;
		int b=40;
		int c=50;
		if(a==b&b==c&c==a) {
			System.out.println("triangle is equilateral");
			
		}
		if(a==b||b==c||c==a) {
			System.out.println("triangle is scalene ");
		}
		if(a!=b&b!=c&c!=a) {
			System.out.println("triangle is isosceles");
		}

	}

}
