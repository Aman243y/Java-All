package loops;

public class sumfirstlastdigit {

	public static void main(String[] args) {
		int num=6234;
		int ld;
		int first =num;
		while(first >= 10)
	    {
	        first = first / 10;
	    }
		ld=num%10;
		int sum = ld+first;
		System.out.println("last digit:" +ld);
		System.out.println("fisrt digit:" +first);
		System.out.println("the sum of first and last digit:"+sum);


	}

}
