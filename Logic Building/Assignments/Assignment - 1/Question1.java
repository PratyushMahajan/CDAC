/*
Write a Java program that checks if a predefined number is positive using an 
if-else statement and prints the appropriate message. 
*/

import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int num = sc.nextInt();


        if(num>0) {
            System.out.println(num+ " is a Positive Number");
        }
        else {
            System.out.println(num+ " is a Negative Number");
        }
        sc.close();

    }
}