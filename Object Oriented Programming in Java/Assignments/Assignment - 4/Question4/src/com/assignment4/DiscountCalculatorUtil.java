package com.assignment4;
import java.util.Scanner;

public class DiscountCalculatorUtil {
	
	Scanner sc = new Scanner(System.in);
	private DiscountCalculator dc;
	
	public void acceptRecord() {
		
		if(dc == null) {
			dc = new DiscountCalculator(0,0);
		}
		
		System.out.print("\nEnter Original Price: ");
		double originalPrice = sc.nextDouble();
		dc.setOriginalPrice(originalPrice);
		
		System.out.print("Enter Disount Rate(%): ");
	    double discountRate = sc.nextDouble();
	    dc.setDiscountRate(discountRate);
	    
	    
	    dc = new DiscountCalculator(originalPrice, discountRate);   
    
	}
	
	public void printRecord() {
		
		if (dc != null) {
            System.out.println(dc.toString());
        } else {
            System.out.println("No records found. Please enter details first.");
        }
		
	}
	
	public int menuList(Scanner sc) {
		
        System.out.println("\n--- Discount Calculator ---\n");
        System.out.println("1. Calculate Discount");
        System.out.println("2. Display Discount & Final Price");
        System.out.println("3. Exit");
        System.out.print("Enter your choice: ");
       
        int choice = sc.nextInt();
        
        return choice;
    }
	 
}
