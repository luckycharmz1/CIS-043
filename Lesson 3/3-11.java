public class Account {
    private double balance;

    public Account(double initialBalance) {
        if (initialBalance > 0.0)
            balance = initialBalance;
    }

    public void deposit(double depositAmount) {
        if (depositAmount > 0.0)
            balance = balance + depositAmount;
    }

    public void withdraw(double withdrawalAmount) {
        if (withdrawalAmount <= balance) {
            balance = balance - withdrawalAmount;
        } else {
            System.out.println("Withdrawal amount exceeded account balance.");
        }
    }
    
    public double getBalance() {
        return balance;
    }
}
