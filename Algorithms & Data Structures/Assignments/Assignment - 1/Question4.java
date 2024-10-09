import java.util.*;

public class Question4 {

    public static int fib(int n) { // Time Complexity: O(2^n), Space Complexity: O(n)
        if(n <= 1) 
            return n;

        return fib(n-1) + fib(n-2);   
    }

    public static void printSeries(int n) {
        for(int i=0; i<n; i++) {
            System.out.print(fib(i)+" ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        
        int choice;
        Scanner sc = new Scanner(System.in);
        
        do {
            System.out.println("\nPress 1 to print fibonacci series");
            System.out.println("Press 2 to exit the program");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch(choice) {
                case 1: 
                System.out.print("\nEnter value of N: ");
                int num = sc.nextInt();

                printSeries(num);
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
