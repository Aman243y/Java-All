package loops;

public class Palindrome {

	public static void main(String[] args) {
		int num=1001;
		int reverse=0;
		int n=num;

		while(n!=0) {
			reverse = (reverse * 10) + (n % 10);
	        n /= 10;
	        
			
		}
		System.out.println(reverse);
		if(reverse==num) {
			System.out.println("number is Palindrome"+num);
		}
		else {
			System.out.println("number is not palindrome"+num);
		}
		 

	}

}
