package loops;

public class productofdigit {

	public static void main(String[] args) {
		int num=12;
		int ld;
		int product=1;
		while(num!=0) {
			ld=num%10;
			product=product*ld;
			num=num/10;
			
		}
		System.out.println(product);

	}

}
