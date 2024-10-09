import java.util.*;

public class Question9 {

    public static boolean integerPalindrome(int num) { // Time Complexity: O(n), Space Complexity: O(n)

        String numStr = Integer.toString(num);
        for(int i=0; i<numStr.length()/2; i++) {
            if(numStr.charAt(i) != numStr.charAt(numStr.length() - i- 1)) {
                return false;
            }
        }
        return true;

    }
    public static void main(String[] args) {
        
        int choice;
        Scanner sc = new Scanner(System.in);
        
        do {
            System.out.println("\nPress 1 to enter a integer");
            System.out.println("Press 2 to exit the program");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch(choice) {
                case 1: 
                System.out.print("\nEnter a Integer: ");
                int num = sc.nextInt();

                System.out.println("Is the Integer a Palindrome: " + integerPalindrome(num));
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