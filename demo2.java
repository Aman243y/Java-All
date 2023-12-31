import java.util.HashMap;

public class demo2 {

	public static void main(String[] args) {
		// input
		int n[]= {1,2,3,1,1,1};
		//processing
		HashMap<Integer, Integer> hm=new HashMap<Integer, Integer>();
		int maxCount=0; Integer mfe=null;
		
		for(int i:n) {
			//is element in hm
			if(hm.containsKey(i)) {
				Integer newVal=hm.get(i)+1;
				hm.put(i, newVal);
			}
			else {
				hm.put(i, 1);
			}
			//keep track of maxCount amd mfe
			if(hm.get(i)>maxCount) {
				maxCount=hm.get(i);
				mfe=i;
			}
			
		}
		System.out.println(mfe);
		System.out.println(maxCount);
	}

}
