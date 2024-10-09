import java.util.*;

public class Question4 {

    public static String reverseString(String str) {
        StringBuilder sb = new StringBuilder();

        for(int i=str.length()-1; i>=0; i--) {
            sb.append(str.charAt(i));
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        System.out.println("The Reverse String is: " +reverseString(str));
        sc.close();
    }
}
