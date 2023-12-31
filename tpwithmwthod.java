package method;

public class tpwithmwthod {

	public static void main(String[] args) {
		int num=19;
		if(ops.isPrime(num)) {
			int rev=ops.reverse(num);
			if(ops.isPrime(rev)) {
				System.out.println("Twisted prime");
			}
			else {
				System.out.println("Not a twisted prime");
			}
		}
		else {
			System.out.println("ntp");
		}

	}

}
