import java.util.HashMap;

public class demo5 {

	public static void main(String[] args) {
		int n[]= {1,2,1,2,1,3,3,3,3,3,3,};
		HashMap<Integer,Integer> hm=new HashMap<Integer, Integer>();
		int maxCount=0;Integer mfe=null;
		for(int i:n) {
			if(hm.containsKey(i)) {
				Integer newVal=hm.get(i)+1;
				hm.put(i, newVal);
				
			}
			else {
				hm.put(i, 1);
			}
			if(hm.get(i)>maxCount) {
				maxCount=hm.get(i);
				mfe=i;
			}
		}
		System.out.println(mfe);
		System.out.println(maxCount);

	}

}
