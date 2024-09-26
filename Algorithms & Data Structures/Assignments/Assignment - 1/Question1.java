import java.util.*;
public class Question1 {

    public static double checkArmstrongNumber(int n) {
        if(n == 0)
        return 0;

        return Math.pow(n%10,3) + checkArmstrongNumber(n/10);
    }
    public static void main(String[] args) {
        int choice;
        Scanner sc = new Scanner(System.in);
        
        do {
            System.out.println("Press 1 to check Armstrong Number");
            System.out.println("Press 2 to exit the program");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch(choice) {
                case 1: 
                System.out.print("\nEnter a number: ");
                int num = sc.nextInt();
                if(checkArmstrongNumber(num) == num) {
                    System.out.println("True: "+(int)checkArmstrongNumber(num)+ " is an Armstrong Number\n");
                }
                else {
                    System.out.println("False: "+num+ " is not an Armstrong Number\n");
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