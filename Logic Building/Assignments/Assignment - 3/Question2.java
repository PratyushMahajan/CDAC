//Write a program to compute the factorial of the number 10. 

public class Question2 {
    public static void main(String[] args) {
        int result = 1;

        for(int i=1; i<=5; i++) {
            result *= i;
        }
        System.out.println("Factorial 10 is: "+result);
    }
}
