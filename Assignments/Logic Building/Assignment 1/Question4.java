/*
Write a Java program that displays a "Good Morning" message if the 
predefined time is between 5 AM and 12 PM. Use an if statement to implement the logic. 
*/

import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter time (1-12): ");
        int time = sc.nextInt();

        System.out.print("Enter Time Period AM/PM: ");
        String s = sc.next();

        if(time>=5 && time<=12) {
            if((time<12 && s.equals("AM")) || (time == 12 && s.equals("PM"))) {
                System.out.println("Good Morning");
            }
            else {
                System.out.println("Its not the correct time to wish good morning");
            }
            
        }
        else{
            System.out.println("Its not the correct time to wish good morning");
        }
        sc.close();
    }
}
