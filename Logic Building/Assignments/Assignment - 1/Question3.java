/*
Write a Java program that checks if a predefined number is odd or even. Use 
an if-else statement and the modulus operator (%) to determine whether the number is 
divisible by 2 or not. 
*/

import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int num = sc.nextInt();


        if(num%2 == 0) {
            System.out.println(num+ " is an Even Number");
        }
        else {
            System.out.println(num+ " is an Odd Number");
        }
        sc.close();
    }
}
