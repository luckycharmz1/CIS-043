public class PrimeNumbers {
  
    // Method to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int count = 0;
        
        System.out.println("Prime numbers less than 10,000:");
        for (int i = 2; i < 10000; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
                count++;
            }
        }
        
        System.out.println("\nTotal prime numbers found: " + count);
    }
}
