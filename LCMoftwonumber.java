package loops;

import java.util.Scanner;

public class LCMoftwonumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();
        
        int lcm = 1;
		int max = (num1>num2) ? num1 : num2;
		
		int i = max;
	    
	    /* Run loop indefinitely till LCM is found */
	    
		while(true)
	    {
	        if(lcm%num1==0 && lcm%num2==0)
	        {
	            /*
	             * If 'i' divides both 'num1' and 'num2'
	             * then 'i' is the LCM.
	             */
	            lcm = i;

	            /* Terminate the loop after LCM is found */
	            break;
	        }

	        /*
	         * If LCM is not found then generate next 
	         * multiple of max between both numbers
	         */
	        i += max;
        
	}

}
}
