package oop;

public class demo {

	public static void main(String[] args) {
		System.out.println("me main aahe");
		demo obj1=new demo();
		obj1.show();
		

	}
	public demo() {
		System.out.println("me constuctor aahe,will execute apne aap");
	}
	public void show() {
		System.out.println("bieng called by object name");
	}

}
