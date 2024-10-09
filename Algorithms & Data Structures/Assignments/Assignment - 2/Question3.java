import java.util.*;

public class Question3 {
    public static String removeWhiteSpaces(String str) { // Time Complexity: 
       StringBuilder sb = new StringBuilder();
       for(char c: str.toCharArray()) {
        if(c != ' ') {
            sb.append(c);
        }
       }
       return sb.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        System.out.println("The string without white spaces is: " +removeWhiteSpaces(str));
        sc.close();
    }
}
