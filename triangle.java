package ifelse;

public class triangle {

	public static void main(String[] args) {
		int angle1=40;
		int angle2=50;
		int angle3=90;
		if(angle1+angle2+angle3==180&&angle1 > 0 && angle2 > 0 && angle3 > 0) {
			System.out.println("triangle is valid");
			
		}
		else {
			System.out.println("triangleis not valid");
		}

	}

}
