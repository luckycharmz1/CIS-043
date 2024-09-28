import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        for (int i = 1; i <= 3; i++) {
            System.out.println("Enter hours worked for Employee " + i + ":");
            int hoursWorked = input.nextInt();
            
            System.out.println("Enter hourly rate for Employee " + i + ":");
            double hourlyRate = input.nextDouble();
            
            double grossPay;
            if (hoursWorked <= 40) {
                grossPay = hoursWorked * hourlyRate;
            } else {
                grossPay = (40 * hourlyRate) + ((hoursWorked - 40) * hourlyRate * 1.5);
            }
            
            System.out.println("Employee " + i + "'s gross pay is: $" + grossPay);
        }
        
        input.close();
    }
}
