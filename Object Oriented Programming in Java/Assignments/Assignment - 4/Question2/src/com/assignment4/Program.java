package com.assignment4;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		 CompoundInterestCalculatorUtil u = new CompoundInterestCalculatorUtil();
	     Scanner sc = new Scanner(System.in);
	     int choice;
	     
	     do {
	    	choice = u.menuList(sc);
         	switch (choice) {
	             case 1:
	                 u.acceptRecord();
	                 break;
	             case 2:
	                 u.printRecord();
	                 break;
	             case 3:
	                 System.out.println("Exiting the program.");
	                 break;
	             default:
	                 System.out.println("Invalid choice. Please try again.");
	                 break;
         	}
	     
	     } while(choice != 3);
	   

	}
}
