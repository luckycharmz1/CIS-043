public class CheckMultiples {
    
    public static boolean isMultiple(int first, int second) {
        if (second % first == 0) {
            return true;
        } else {
            return false;
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter pairs of integers (enter 0 0 to exit):");
        
        while (true) {
            int first = scanner.nextInt();
            int second = scanner.nextInt();
            
            if (first == 0 && second == 0) {
                break;
            }
            
            if (isMultiple(first, second)) {
                System.out.println(second + " is a multiple of " + first);
            } else {
                System.out.println(second + " is not a multiple of " + first);
            }
        }
        
        scanner.close();
    }
}
