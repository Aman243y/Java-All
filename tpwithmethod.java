package ifelse;

public class tpwithmethod {

	public static void main(String[] args) {
		int num=19;
		if(ops.isPrime(num)) {
			int rev=ops.reverse(num);
			if(ops.isPrime(rev)) {
				System.out.println("twisted prime");
			}
			else {
				System.out.println("not a twisted prime");
			}
		}
		else {
			System.out.println("ntp");
		}

	}

}
