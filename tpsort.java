package method;

public class tpsort {

	public static void main(String[] args) {
		int num=16;
		String res=ops.isPrime(num)?ops.isPrime(ops.reverse(num))?"TWISTED PRIME":"NOT A TWISTED PRIME":"NTP";
		System.out.println(res);
	
    }

}
