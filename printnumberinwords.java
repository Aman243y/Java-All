package loops;

import java.util.Scanner;

public class printnumberinwords {
	 //Define an Array for Digit Names:
	//Create an array to hold the names of digits from 0 to 9.
	private static String[] units= {"zero","one","two","thrree","four","five","six","seven","eight","nine"};
    private static final String[] teens = { "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
    private static final String[] tens = { "Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};


	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        // Step 3: Prompt User for Input
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        // Step 4: Handle Special Cases (0 and Negative Numbers)
        if (num== 0) {
            System.out.println(units[0]);
        } else if (num < 0) {
            System.out.println("Please enter a non-negative number.");
        } else {
            // Step 5: Convert Number to Words
            System.out.println(convertToWords(num));
        }

        scanner.close();
        
       
         
		 

	}


	private static String convertToWords(int num) {
		 if (num < 10) {
	            return units[num];
	        }else if (num >= 11 && num <= 19) {
	            return teens[num - 11];
	        } else if (num < 100) {
	            return tens[num / 10] + ((num % 10 != 0) ? " " + units[num % 10] : "");
	        } else if (num < 1000) {
	            return units[num / 100] + " Hundred" + ((num % 100 != 0) ? " and " + convertToWords(num % 100) : "");
	        } else {
	            return "Number is too large to convert.";
	        }
		 
		
		
	}


	

	}
