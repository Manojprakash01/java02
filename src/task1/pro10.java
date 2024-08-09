package task1;
import java.util.Scanner;
public class pro10 {
	public static void main(String[] args) {
        // Create a Scanner object to get input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter an integer
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        // Calculate the number of digits
        int numberOfDigits = countDigits(number);

        // Print the number of digits
        System.out.println("The number of digits in " + number + " is " + numberOfDigits + ".");

        // Close the scanner
        scanner.close();
    }

    // Method to count the number of digits in an integer
    public static int countDigits(int number) {
        // Handle the case where the number is 0
        if (number == 0) {
            return 1;
        }

        // Convert the number to its absolute value to handle negative numbers
        number = Math.abs(number);

        // Convert the number to a string and return the length of the string
        return Integer.toString(number).length();
    }
}
