package loops;

import java.util.Scanner;

public class printnumberinwords2 {
    private static final String[] units = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 3: Prompt User for Input
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Step 4: Handle Special Cases (0 and Negative Numbers)
        if (number == 0) {
            System.out.println(units[0]);
        } else if (number < 0) {
            System.out.println("Please enter a non-negative number.");
        } else {
            // Step 5: Convert Number to Words
            System.out.println(convertToWords(number));
        }

        scanner.close();
    }

    public static String convertToWords(int number) {
        StringBuilder words = new StringBuilder();

        int num;
        int count = 0;
        do {
            // Extract the last digit
            num = number % 10;

            // Convert the digit to word
            switch (count) {
                case 0:
                    words.insert(0, units[num]);
                    break;
                case 1:
                    words.insert(0, units[num] + " Teen");
                    break;
                case 2:
                    words.insert(0, units[num] + " Hundred");
                    break;
                case 3:
                    words.insert(0, units[num] + " Thousand");
                    break;
                // Add more cases as needed for larger numbers
                default:
                    words.insert(0, "Number is too large to convert.");
                    break;
            }

            // Move to the next digit
            number /= 10;
            count++;
        } while (number > 0);

        return words.toString();
    }
}
