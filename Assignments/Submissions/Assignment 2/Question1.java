import java.util.*;

public class Question1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Score : ");

        int score = sc.nextInt();

        if(score >= 90) {
            System.out.println("Grade : A");
        }
        else if (score >= 80 && score <= 89) {
            System.out.println("Grade : B");
        }
        else if (score >= 70 && score <= 79) {
            System.out.println("Grade : C");
        }
        else if (score >= 60 && score <= 69) {
            System.out.println("Grade : D");
        }
        else {
            System.out.println("Grade : F");
        }
    }
}