package method;

public class ops {
	static boolean isPrime(int num) {
		boolean isPrime=true;
		for(int s=2;s<num;s++) {
			if(num%s==0) {
				isPrime=false;
			}
		}
		return isPrime;
		
	}
	static int reverse(int num) {
		int ld,rev=0;
		while(num!=0) {
			ld=num%10;
			rev=ld+rev*10;
			num=num/10;
		}
		return rev;
	}
	
	

}
