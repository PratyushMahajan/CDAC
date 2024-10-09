import java.util.*;

public class Question6 {
    public static void main(String[] args) { // Time Complexity: O(log n), Space Complexity: O(log n)
        int choice;
        Scanner sc = new Scanner(System.in);
        
        do {
            System.out.println("\nPress 1 to find Square root of a number");
            System.out.println("Press 2 to exit the program");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch(choice) {
                case 1: 
                System.out.print("\nEnter a Number: ");
                int a = sc.nextInt();
                int sqrt = (int)Math.sqrt(a);
                
                System.out.println("The Square root of "+ a + "(Integer Approximate): "+sqrt);
                break;

                case 2: 
                System.out.println("Exiting the program...");
                break;

                default: 
                System.out.println("Invalid Input\n");
                break;
            }

        } while(choice != 2);
        sc.close();
    }
}

