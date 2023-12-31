package loops;

public class reversedigit {

	public static void main(String[] args) {
		int num=12345;
		int ld;
		
		int reverse=0;
		while(num!=0) {
			/* 
	         * Increase place value of reverse and 
	         * add last digit to reverse 
	         */
	        reverse = (reverse * 10) + (num % 10);

	        /* Remove last digit from 'num' */
	        num /= 10;
			
		}
		System.out.println(reverse);
		
				
	

	}

}
