package inheritance;
class A{
	A(){
		System.out.println("A");
	}
}
class B extends A{
	B(){
		System.out.println("B");
	}
	B(int x){
		System.out.println(x);
	}
}

public class c extends B{
	c(){
		super(100);
		System.out.println("c");
		System.out.println("c1");
	}
	c(int x1){
		super(x1);
	}
	
	public static void main(String[] args) {
		c b=new c(10);

	}

}
