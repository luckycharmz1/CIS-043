import java.util.Scanner;

public class SalesCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double totalSales = 0.0;

        while (true) {
            // Prompt the user for product number
            System.out.print("Enter product number (1-5) or 0 to exit: ");
            int productNumber = scanner.nextInt();

            // Sentinel value to exit the loop
            if (productNumber == 0) {
                break; // Exit the loop
            }

            // Check if the product number is valid
            if (productNumber < 1 || productNumber > 5) {
                System.out.println("Invalid product number. Please enter a number between 1 and 5.");
                continue; // Continue to the next iteration of the loop
            }

            // Prompt the user for quantity sold
            System.out.print("Enter quantity sold: ");
            int quantitySold = scanner.nextInt();

            // Calculate the price based on the product number
            double price = 0.0;
            switch (productNumber) {
                case 1:
                    price = 2.98;
                    break;
                case 2:
                    price = 4.50;
                    break;
                case 3:
                    price = 9.98;
                    break;
                case 4:
                    price = 4.49;
                    break;
                case 5:
                    price = 6.87;
                    break;
            }

            // Calculate total sales for the current product and add to total sales
            totalSales += price * quantitySold;
            System.out.printf("Added $%.2f to total sales from product %d.\n", price * quantitySold, productNumber);
        }

        // Display the final total sales
        System.out.printf("Total retail value of all products sold: $%.2f\n", totalSales);
    }
}