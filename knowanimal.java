package inheritance;

public class knowanimal {

	public static void main(String[] args) {
		dog d1=new dog();
		cat c1=new cat();
		
		System.out.println("**********about dog********");
		d1.eat("pedigre");
		d1.makesound("bhow bhow bhow");
		
		System.out.println("**********about cat******");
		c1.eat("fish");
		c1.makesound("meow meow");

	}

}
