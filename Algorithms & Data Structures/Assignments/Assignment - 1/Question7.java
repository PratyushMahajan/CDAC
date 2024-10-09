import java.util.*;
public class Question7 {

    public static List<Character> repeatedChars(String str) { // Time Complexity: O(n^2), Space Complexity: O(n)

        List<Character> charList = new ArrayList<>();

        for(int i=0; i<str.length(); i++) {
            for(int j=i+1; j<str.length(); j++) {
                if(str.charAt(i) == str.charAt(j) && !charList.contains(str.charAt(i))) {
                    charList.add(str.charAt(i));
                }
            }
        }
        return charList;

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
                
                System.out.println("The Repeated Character in the String '"+ str +  "' is: "+repeatedChars(str));
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

