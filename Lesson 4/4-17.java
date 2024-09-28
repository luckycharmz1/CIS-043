import java.util.Scanner;

public class GasMileage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int totalMiles = 0;
        int totalGallons = 0;
        
        System.out.println("Enter the miles driven and gallons used for each trip (Enter -1 to exit):");
        
        int miles = 0;
        int gallons = 0;
        int tripCount = 0;
        
        while (true) {
            System.out.print("Enter miles driven: ");
            miles = input.nextInt();
            if (miles == -1) {
                break;
            }
            
            System.out.print("Enter gallons used: ");
            gallons = input.nextInt();
            
            tripCount++;
            
            double mpg = (double) miles / gallons;
            System.out.printf("Miles per gallon for trip %d: %.2f\n", tripCount, mpg);
            
            totalMiles += miles;
            totalGallons += gallons;
            
            double combinedMpg = (double) totalMiles / totalGallons;
            System.out.printf("Combined miles per gallon up to trip %d: %.2f\n\n", tripCount, combinedMpg);
        }
        
        System.out.println("Exiting program...");
        input.close();
    }
}
