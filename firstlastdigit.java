package loops;

public class firstlastdigit {

	public static void main(String[] args) {
		int num=6234;
		int ld;
		int first =num;
		while(first >= 10)
	    {
	        first = first / 10;
	    }
		ld=num%10;
		System.out.println(ld);
		System.out.println(first);

	}

}
