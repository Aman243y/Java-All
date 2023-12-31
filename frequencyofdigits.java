package loops;

import java.util.Scanner;

public class frequencyofdigits {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		//take user input
		System.out.println("Enter a number: ");
		int num=sc.nextInt();
		
		//initialize array to hold frequency
		int[] freq=new int[10];//array size 10 for 0 to 0
		
		//initialize the frequncy count to zero
		for(int i=0;i<10;i++) {
			freq[i]=0;
		}
		//iterate through the digit
		String number=Integer.toString(num);
		for(int i=0;i<number.length();i++) {
			int digit=Character.getNumericValue(number.charAt(i));
			//update frequency count
			freq[digit]++;
		}
		//result
		for(int i=0;i<10;i++) {
			if(freq[i]>0) {
				System.out.println("frequency of "+i+ ":"+ freq[i]);
			}
		}
		sc.close();

	}

}
