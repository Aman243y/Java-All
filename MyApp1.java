package multithreading;

public class MyApp1 {

	public static void main(String[] args) {
		PrintTable pt=new PrintTable();
		//annonymus class
		new Thread() {
			public void run() {
				pt.print(5);
			}
		}.start();
		new Thread() {
			public void run() {
				pt.print(6);
			}
		}.start();
		new Thread() {
			public void run() {
				pt.print(7);
			}
		}.start();
	}

}
