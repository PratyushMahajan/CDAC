/*
Write a program that determines whether a student passes or fails based on their grades in three 
subjects. If the student scores more than 40 in all subjects, they pass. If the student fails in one or 
more subjects, print the number of subjects they failed in. 
*/

import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter marks scored in Maths : ");
        int maths = sc.nextInt();

        System.out.print("Enter marks scored in Science : ");
        int science = sc.nextInt();

        System.out.print("Enter marks scored in English : ");
        int english = sc.nextInt();

        int passedSubjects = 0;

        if(maths > 40) {
            passedSubjects++;
        }
        if(science > 40) {
            passedSubjects++;
        }
        if(english > 40) {
            passedSubjects++;
        }

        switch(passedSubjects) {
            case 0: System.out.println("You have failed in all 3 subjects");
            break;

            case 1: System.out.println("You have failed in all 2 subjects");
            break;

            case 2: System.out.println("You have failed in all 1 subject");
            break;

            case 3: System.out.println("COngratulations! You have passed in all 3 subjects");
            break;

        }
        sc.close();
    }
}
