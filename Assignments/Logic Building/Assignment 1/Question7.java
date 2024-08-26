/*
Write a Java program that finds and prints the largest of three predefined 
numbers using if-else statements. 
*/

import java.util.Scanner;

public class Question7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number1: ");
        int num1 = sc.nextInt();

        System.out.print("Enter Number2: ");
        int num2 = sc.nextInt();

        System.out.print("Enter Number3: ");
        int num3 = sc.nextInt();

        if(num1>num2 && num1>num3) {
            System.out.println(num1+" is the largest number");
        }
        if(num2>num3 && num2>num1) {
            System.out.println(num2+" is the largest number");
        }
        if(num3>num1 && num3>num2) {
            System.out.println(num3+" is the largest number");
        }
        sc.close();
    }
}
