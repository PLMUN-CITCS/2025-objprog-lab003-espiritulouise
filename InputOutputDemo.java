import java.util.Scanner;

public class InputOutputDemo {
    public static void main(String[] args) {
        // Create Scanner object for input
        Scanner input = new Scanner(System.in);
        
        // Prompt user for an integer and read it
        System.out.print("Enter an integer: ");
        int userInt = input.nextInt();
        
        // Prompt user for a decimal number and read it
        System.out.print("Enter a decimal number: ");
        double userDouble = input.nextDouble();
        
        // Consume the leftover newline character after reading a number
        input.nextLine();  // This is necessary to handle the newline after nextDouble()

        // Prompt user for a string (word or sentence)
        System.out.print("Enter a word or sentence: ");
        String userString = input.nextLine();

        // Print the results in a formatted way
        System.out.printf("Your integer: %d%n", userInt);
        System.out.printf("Your decimal number: %.2f%n", userDouble);
        System.out.printf("Your string: %s%n", userString);
        
        // Close the scanner object to prevent resource leaks
        input.close();
    }
}
