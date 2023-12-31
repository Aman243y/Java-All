
public class demo {

	public static void main(String[] args) {
		//static array declaration
		int[] n= {1,2,1,3,4,1};
		
		System.out.println(n[0]);
		System.out.println(n[1]);
		System.out.println(n[2]);
		System.out.println(n[3]);
		System.out.println(n[4]);
		System.out.println(n[5]);
		//System.out.println(n[6]);
		
		System.out.println("Alternative to visit each element in given array");
		//use for each loop
		for(int vada:n) {
			System.out.println(vada);
		}

	}

}
