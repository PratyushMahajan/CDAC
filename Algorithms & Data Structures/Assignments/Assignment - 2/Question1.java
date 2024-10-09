import java.util.*;
public class Question1 {

    public static void printPattern(int n) { // Time Complexity: O(n^2), Space Complexity: O(1)

        for(int i=0; i<n; i++) {
            for(int j=0; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = sc.nextInt();
        printPattern(n);
        sc.close();
    }
}