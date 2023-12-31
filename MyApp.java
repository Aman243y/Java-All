package multithreading;

public class MyApp extends Thread {

	public static void main(String[] args) {
		MyApp t1=new MyApp();
		t1.start();
		
	}
	public void run() {
		PrintTable pt=new PrintTable();
		pt.print(5);
		pt.print(6);

		
	}
	

}
