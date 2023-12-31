package multithreading;

public class Demothread1 implements Runnable {

	public static void main(String[] args) {
		 System.out.println("main method is Invoked by" );
		 Demothread1 dt1=new Demothread1();
		 Thread t1=new Thread(dt1);
		 t1.start();

	}

	@Override
	public void run() {
		System.out.println("This method is bieng created by runnable ");
		
	}
	

}
