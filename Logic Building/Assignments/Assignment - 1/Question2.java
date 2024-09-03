/*
Write a Java program that checks if a predefined number is negative using an 
if-else statement and displays the result.
*/

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int num = sc.nextInt();


        if(num<0) {
            System.out.println(num+ " is a Negative Number");
        }
        else {
            System.out.println(num+ " is a Positive Number");
        }
        sc.close();
    }
}
