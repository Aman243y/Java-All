package ifelse;

public class tp17 {

	public static void main(String[] args) {
		int num=13;
		boolean isPrime=true;
		for(int s=2;s<num;s++) {
			if(num%s==0) {
				isPrime=false;
				
			}
		}
		if(isPrime) {
			int ld,rev=0;
			while(num!=0) {
				ld=num%10;
				rev=ld+rev*10;
				num=num/10;
				
			}
			for(int s=2;s<rev;s++) {
				if(rev%s==0) {
					isPrime=false;
				}
			}
			if(isPrime) {
				System.out.println("twisted prime");
			}
			else {
				System.out.println("not a twisted prime");
			}
		}
		else {
			System.out.println("NTP");
		}

	}

}
