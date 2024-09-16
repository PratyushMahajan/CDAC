package com.assignment4;
import java.util.Scanner;

public class BMITrackerUtil {
	
	Scanner sc = new Scanner(System.in);
	private BMITracker bt;
	
	public void acceptRecord() {
		
		if(bt == null) {
			bt = new BMITracker(0,0);
		}
		
		System.out.print("\nEnter Weight in Kgs: ");
		double weight = sc.nextDouble();
		bt.setWeight(weight);
		
		System.out.print("Enter Height in Meters: ");
	    double height = sc.nextDouble();
	    bt.setHeight(height);
	    
	    
	    bt = new BMITracker(weight, height);   
    
	}
	
	public void printRecord() {
		
		if (bt != null) {
            System.out.println(bt.toString());
        } else {
            System.out.println("No records found. Please enter details first.");
        }
		
	}
	
	public int menuList(Scanner sc) {
		
        System.out.println("\n--- BMI Calculator ---\n");
        System.out.println("1. Calculate BMI");
        System.out.println("2. Display BMI & Classification");
        System.out.println("3. Exit");
        System.out.print("Enter your choice: ");
       
        int choice = sc.nextInt();
        
        return choice;
    }
	 
}
