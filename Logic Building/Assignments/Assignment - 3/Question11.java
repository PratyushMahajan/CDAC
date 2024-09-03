//Write a Java program to demonstrate the use of both pre-increment and post-decrement operators in a single expression 

public class Question11 {
    public static void main(String[] args) {
        int num = 5;
        ++num;
        System.out.println("Number after pre-increment: "+num);
        num = 5;
        System.out.println("Number before post-decrement: "+num);
        num--;
        System.out.println("Number after post-decrement: "+num);
    }
}
