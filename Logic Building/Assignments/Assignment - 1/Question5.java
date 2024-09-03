/*
Write a Java program that calculates the area of a square using the formula 
area = side * side. Use a predefined side length. 
*/

import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Side of the Square: ");
        int side = sc.nextInt();

        System.out.println("Area of the Square: "+side*side);
        sc.close();
    }
}
