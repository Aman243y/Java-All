package loops;

import java.util.Scanner;

public class printnumberinwords3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Input number from user
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        // Variable to store the word representation of the number
        String wordRepresentation = "";

        while (num > 0) {
            // Step 2: Extract last digit
            int digit = num % 10;

            // Step 3: Switch case to convert digit to word
            switch (digit) {
                case 0:
                    wordRepresentation = "Zero " + wordRepresentation;
                    break;
                case 1:
                    wordRepresentation = "One " + wordRepresentation;
                    break;
                case 2:
                    wordRepresentation = "Two " + wordRepresentation;
                    break;
                case 3:
                    wordRepresentation = "Three " + wordRepresentation;
                    break;
                case 4:
                    wordRepresentation = "Four " + wordRepresentation;
                    break;
                case 5:
                    wordRepresentation = "Five " + wordRepresentation;
                    break;
                case 6:
                    wordRepresentation = "Six " + wordRepresentation;
                    break;
                case 7:
                    wordRepresentation = "Seven " + wordRepresentation;
                    break;
                case 8:
                    wordRepresentation = "Eight " + wordRepresentation;
                    break;
                case 9:
                    wordRepresentation = "Nine " + wordRepresentation;
                    break;
            }

            // Step 4: Remove last digit
            num /= 10;
        }

        // Print the word representation of the number
        System.out.println("Word representation: " + wordRepresentation);

        scanner.close();
    }
}

