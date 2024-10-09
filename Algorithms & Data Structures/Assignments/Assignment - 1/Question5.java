import java.util.*;

public class Question5 {

    public static int gcd(int a, int b) { // Time Complexity: O(log(min(a,b))), Space Complexity: O(log(min(a,b)))

        if(b == 0) 
            return a;
  
        return gcd(b, a % b);
    }
    
    public static void main(String[] args) {
      
        int choice;
        Scanner sc = new Scanner(System.in);
        
        do {
            System.out.println("\nPress 1 to find GCD of two numbers");
            System.out.println("Press 2 to exit the program");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch(choice) {
                case 1: 
                System.out.print("\nEnter a Number - A: ");
                int a = sc.nextInt();
                System.out.print("Enter a Number - B: ");
                int b = sc.nextInt();

                System.out.println("The GCD of " + a + " and " + b + " is: " +gcd(a, b));
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
