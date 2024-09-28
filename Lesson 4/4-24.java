import java.util.Scanner;

public class ValidateInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int choice = 0;
        
        while (true) {
            System.out.print("Enter 1 or 2: ");
            if (input.hasNextInt()) {
                choice = input.nextInt();
                if (choice == 1 || choice == 2) {
                    break; // Exit the loop if input is 1 or 2
                } else {
                    System.out.println("Invalid input. Please enter 1 or 2.");
                    input.nextLine(); // Clear the input buffer
                }
            } else {
                System.out.println("Invalid input. Please enter a valid number.");
                input.nextLine(); // Clear the input buffer
            }
        }
        
        System.out.println("You entered: " + choice);
        
        input.close();
    }
}
