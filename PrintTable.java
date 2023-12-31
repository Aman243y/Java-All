package multithreading;

public class PrintTable {
	synchronized void print(int n) {
		System.out.println("table for "+n);
		for(int s=1;s<=10;s++) {
			System.out.println(n + "*"+ s + "="+n*s);
		}
	}

}
