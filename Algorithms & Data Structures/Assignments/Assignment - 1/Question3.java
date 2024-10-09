import java.util.*;

public class Question3 {

    public static int factorial( int n) { // Time Complexity: O(n), Space Complexity: O(n)
        if(n == 0 || n == 1) {
            return 1;
        }

        return n * factorial(n-1);
    }
    public static void main(String[] args) {
        
        int choice;
        Scanner sc = new Scanner(System.in);
        
        do {
            System.out.println("Press 1 to find factorial");
            System.out.println("Press 2 to exit the program");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch(choice) {
                case 1: 
                System.out.print("\nEnter a number: ");
                int num = sc.nextInt();

                System.out.println("Factorial of "+num+ " is: "+factorial(num)+"\n");
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
