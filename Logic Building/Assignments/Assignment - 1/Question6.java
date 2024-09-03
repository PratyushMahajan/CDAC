/*
Write a Java program that calculates the area of a rectangle using the formula 
area = length * width. Use predefined values for length and width.  
*/

import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of Rectangle: ");
        int length = sc.nextInt();

        System.out.print("Enter breadth of Rectangle: ");
        int breadth = sc.nextInt();

        System.out.println("Area of the Rectange: "+length*breadth);
        sc.close();


    }
}
