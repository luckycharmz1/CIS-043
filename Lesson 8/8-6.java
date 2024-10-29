public class SavingsAccount {
    // Static variable to store the annual interest rate for all account holders
    private static double annualInterestRate;

    // Instance variable to store the savings balance for each account holder
    private double savingsBalance;

    // Constructor to initialize savings balance
    public SavingsAccount(double balance) {
        this.savingsBalance = balance;
    }

    // Method to calculate monthly interest and update savings balance
    public void calculateMonthlyInterest() {
        double monthlyInterest = (savingsBalance * annualInterestRate) / 12;
        savingsBalance += monthlyInterest;
    }

    // Static method to modify the annual interest rate
    public static void modifyInterestRate(double newRate) {
        annualInterestRate = newRate;
    }

    // Method to get the savings balance
    public double getSavingsBalance() {
        return savingsBalance;
    }
}