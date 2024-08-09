package task1;
import java.util.Scanner;
public class pro4 {

	public static void main(String[] args) {
        // Create a Scanner object to get input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the first number
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        // Prompt the user to enter the second number
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        // Display the original values
        System.out.println("Before swapping:");
        System.out.println("First number: " + num1);
        System.out.println("Second number: " + num2);

        // Use an additional variable to swap the values
        int temp = num1; // Store the value of num1 in temp
        num1 = num2;     // Assign the value of num2 to num1
        num2 = temp;     // Assign the value of temp (original num1) to num2

        // Display the swapped values
        System.out.println("After swapping:");
        System.out.println("First number: " + num1);
        System.out.println("Second number: " + num2);

        // Close the scanner
        scanner.close();
    }
}
