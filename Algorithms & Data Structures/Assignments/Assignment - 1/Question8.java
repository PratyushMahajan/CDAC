import java.util.Scanner;

public class Question8 {

    public static String NonRepeatedChar(String str) { // Time Complexity: O(n^2), Space Complexity: O(1)
        
        for (int i=0; i<str.length(); i++) {
            char currentChar = str.charAt(i);
            boolean isRepeated = false;

            for (int j=0; j<str.length(); j++) {
                if (i != j && currentChar == str.charAt(j)) {
                    isRepeated = true;
                    break;
                }
            }

            if (!isRepeated) {
                return String.valueOf(currentChar);
            }
        }

        return null;
    }
    public static void main(String[] args) {

        int choice;
        Scanner sc = new Scanner(System.in);
        
        do {
            System.out.println("\nPress 1 to enter a string");
            System.out.println("Press 2 to exit the program");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch(choice) {
                case 1: 
                System.out.print("\nEnter a String: ");
                String str = sc.nextLine();
                String result = NonRepeatedChar(str);
                
                System.out.println("The first non-repeated character is: " +result);
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