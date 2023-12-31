package exception;

public class demoexception3 {

	public static void main(String[] args) {
		System.out.println("hello from main method");
		try {
			int div=10/0;
			System.out.println(div);
		}
		catch(Exception e){
			System.out.println("catch");
			
		}
		finally {
			System.out.println("chalega");
		}
		
			
	
		

	}

}
