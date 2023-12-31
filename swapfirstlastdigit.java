package loops;

public class swapfirstlastdigit {

	public static void main(String[] args) {
		int num=6234;
		int ld,vada ;
		int first =num;
		while(first >= 10)
	    {
	        first = first / 10;
	    }
		ld=num%10;
		ld=ld+first;
		first=ld-first;
		ld=ld-first;
		System.out.println(first);
		System.out.println(ld);


	}

}
