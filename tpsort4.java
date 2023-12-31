package ifelse;

public class tpsort4 {

	public static void main(String[] args) {
		int num=16;
		String res=ops.isPrime(num)?ops.isPrime(ops.reverse(num))?"TP":"NOT TP":"NTP";
		System.out.println(res);

	}

}
