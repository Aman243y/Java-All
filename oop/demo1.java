package oop;

public class demo1 {

	public static void main(String[] args) {
		new demo1();   //no error becouse each class has non-parameterized constructor
		new demo1("Nora");
		new demo1();
		new demo1("Nora");
		

	}
	demo1(String nameswer){
		System.out.println("paraeterized constructor,becouse it has a string parameter");
	}
	demo1(){
		System.out.println("non-paramerized constructor, becouse it dosn't have any parameter ");
		
	}

}
