import java.util.Scanner;
import java.util.Stack;

public class Question2 {
    public static boolean isBalanced(String expr) {
        Stack<Character> stack = new Stack<>();

        for (int i=0; i<expr.length(); i++) {
            char ch = expr.charAt(i);

            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else if (ch == ')' || ch == '}' || ch == ']') {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if (!isMatchingPair(top, ch)) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    private static boolean isMatchingPair(char open, char close) {
        return (open == '(' && close == ')') ||
               (open == '{' && close == '}') ||
               (open == '[' && close == ']');
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an expression: ");
        String expression = sc.nextLine();

        if (isBalanced(expression)) {
            System.out.println("Balanced");
        } 
        else {
            System.out.println("Not Balanced");
        }
        sc.close();
    }
}
