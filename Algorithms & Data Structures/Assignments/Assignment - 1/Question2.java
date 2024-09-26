import java.util.*;
public class Question2 {

    public static boolean checkPrime(int n, int divisor) {
        if (divisor == 1) {
            return true;
        }
        else {
           if (n % divisor == 0) {
             return false;
           }
           else {
             return checkPrime(n, divisor-1);
           } 
        }       
    }
    
     
    public static void main(String[] args) {
        int choice;
        Scanner sc = new Scanner(System.in);
        
        do {
            System.out.println("Press 1 to check Prime Number");
            System.out.println("Press 2 to exit the program");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch(choice) {
                case 1: 
                System.out.print("\nEnter a number: ");
                int num = sc.nextInt();

                if(checkPrime(num, num/2)) {
                    System.out.println("True: "+num+" is a prime number\n");
                }
                else {
                    System.out.println("False: "+num+" is not a prime number\n");
                }
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
