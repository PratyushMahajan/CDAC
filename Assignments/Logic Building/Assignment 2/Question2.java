/*
Write a program that uses a nested switch statement to print out the day of the week based on an 
integer input (1 for Monday, 2 for Tuesday, etc.). Additionally, within each day, print whether it 
is a weekday or weekend. 
*/

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner((System.in));

        System.out.print("Enter your Input : ");
        int input = sc.nextInt();

        switch(input) {

            case 1: System.out.println("Its Monday - Weekday"); break;
            case 2: System.out.println("Its Tuesday - Weekday"); break;
            case 3: System.out.println("Its Wednesday - Weekday"); break;
            case 4: System.out.println("Its Thursday - Weekday"); break;
            case 5: System.out.println("Its Friday - Weekday"); break;
            case 6: System.out.println("Its Saturday - Weekend"); break;
            case 7: System.out.println("Its Sunday - Weekend"); break;
            default: System.out.println("Input Integer from 1-7"); break;
            
        }
        sc.close();
    }
}
