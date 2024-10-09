import java.util.Scanner;

public class Question10 {

    public static boolean isLeapYear(int year) { // Time Complexity: O(1), Space Complexity: O(1)
        if(year % 4 == 0) {
            if(year % 100 == 0) {
                if(year % 400 == 0) {
                    return true;
                } 
                else {
                    return false;
                }
            } 
            else {
                return true;
            }
        } 
        else {
            return false;
        }
    }
    public static void main(String[] args) {
        int choice;
        Scanner sc = new Scanner(System.in);
        
        do {
            System.out.println("\nPress 1 to check a leap year");
            System.out.println("Press 2 to exit the program");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch(choice) {
                case 1: 
                System.out.print("\nEnter a Year: ");
                int year = sc.nextInt();
                
                System.out.println("Is the year a leap year: " + isLeapYear(year));
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
    