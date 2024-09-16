package com.assignment4;
import java.util.Scanner;

public class CompoundInterestCalculatorUtil {
	
	Scanner sc = new Scanner(System.in);
	private CompoundInterestCalculator lc;
	
	public void acceptRecord() {
		
		if(lc == null) {
			lc = new CompoundInterestCalculator(0,0,0,0);
		}
		
		System.out.print("\nEnter the Principle Amount: ");
		double principal = sc.nextDouble();
		lc.setPrincipal(principal);
		
		System.out.print("Enter Annual Interest Rate: ");
	    double annualInterestRate = sc.nextDouble();
	    lc.setAnnualInterestRate(annualInterestRate);
	    
	    System.out.print("Enter number of compounds in a year: ");
        int numberOfCompounds = sc.nextInt();
        lc.setNumberOfCompounds(numberOfCompounds);
	        
        System.out.print("Enter years of Investment: ");
        int years = sc.nextInt();
        lc.setYears(years);
	    
	    lc = new CompoundInterestCalculator(principal, annualInterestRate, numberOfCompounds, years);   
    
	}
	
	public void printRecord() {
		
		if (lc != null) {
            System.out.println(lc.toString());
        } else {
            System.out.println("No records found. Please enter details first.");
        }
		
	}
	
	public int menuList(Scanner sc) {
		
        System.out.println("\n--- Compound Interest Calculator ---\n");
        System.out.println("1. Calculate Compound Interest");
        System.out.println("2. Display Amount & Interest");
        System.out.println("3. Exit");
        System.out.print("Enter your choice: ");
       
        int choice = sc.nextInt();
        
        return choice;
    }
	 
}
