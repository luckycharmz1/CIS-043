public class Factorials {
    public static void main(String[] args) {
        System.out.printf("%-10s%-20s%n", "Number", "Factorial");
        System.out.println("-------------------------------------");

        for (int i = 1; i <= 20; i++) {
            long factorial = calculateFactorial(i);
            System.out.printf("%-10d%-20d%n", i, factorial);
        }
    }

    // Method to calculate factorial
    public static long calculateFactorial(int n) {
        long result = 1; // Start with 1 since factorial of 0 is 1
        for (int i = 1; i <= n; i++) {
            result *= i; // Multiply each integer to get factorial
        }
        return result;
    }
}