import java.util.Scanner;

public class BarChart {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];

        // Prompt the user to enter five numbers
        System.out.println("Enter five numbers between 1 and 30:");

        for (int i = 0; i < 5; i++) {
            int num;
            do {
                System.out.print("Number " + (i + 1) + ": ");
                num = scanner.nextInt();
                if (num < 1 || num > 30) {
                    System.out.println("Please enter a number between 1 and 30.");
                }
            } while (num < 1 || num > 30);
            numbers[i] = num;
        }

        // Display the bar chart
        System.out.println("\nBar Chart:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Bar " + (i + 1) + ": ");
            for (int j = 0; j < numbers[i]; j++) {
                System.out.print("*");
            }
            System.out.println(); // Move to the next line after printing the asterisks
        }
    }
}