package inheritance;

class ada{
	int x=100;
}

class apa extends ada{
	//int x=50;
}

public class superdemo extends apa {
	//int x=10;
	void show() {
		System.out.println(x);
		System.out.println("show");
		
	}

	public static void main(String[] args) {
	superdemo sd=new superdemo();
	sd.show();

	}

}
