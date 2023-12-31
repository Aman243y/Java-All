package multithreading;

public class Demothread extends Thread {

	public static void main(String[] args) {
		System.out.println("Invoked by main thread");
		Demothread t1=new Demothread();
		t1.start();
	}
	//threads job contained by run method
	public void run(){
		System.out.println("Executed by apna thread");
	}

}//class ends here
