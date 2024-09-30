import java.util.Scanner;

public class FindSmallestValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for the number of values to input
        System.out.print("Enter the number of values: ");
        int numberOfValues = scanner.nextInt();

        // Check if the number of values is valid
        if (numberOfValues <= 0) {
            System.out.println("Please enter a positive number.");
            return;
        }

        // Initialize the smallest value with the first input
        System.out.print("Enter value 1: ");
        int smallestValue = scanner.nextInt();

        // Loop through the remaining values
        for (int i = 2; i <= numberOfValues; i++) {
            System.out.print("Enter value " + i + ": ");
            int value = scanner.nextInt();

            // Update smallestValue if the current value is smaller
            if (value < smallestValue) {
                smallestValue = value;
            }
        }

        // Display the smallest value
        System.out.println("The smallest value is: " + smallestValue);
    }
}