package com.assignment4;
import java.util.Scanner;

public class LoanAmortizationCalculatorUtil {
	
	Scanner sc = new Scanner(System.in);
	private LoanAmortizationCalculator lc;
	
	public void acceptRecord() {
		
		if(lc == null) {
			lc = new LoanAmortizationCalculator(0,0,0);
		}
		
		System.out.print("\nEnter the Principle Amount: ");
		double principal = sc.nextDouble();
		lc.setPrincipal(principal);
		
		System.out.print("Enter Annual Interest Rate: ");
	    double annualInterestRate = sc.nextDouble();
	    lc.setAnnualInterestRate(annualInterestRate);
	        
	    System.out.print("Enter loan term in years: ");
	    int loanTerm = sc.nextInt();
	    lc.setLoanTerm(loanTerm);
	    
	    lc = new LoanAmortizationCalculator(principal, annualInterestRate, loanTerm);
	   
    
	}
	
	public void printRecord() {
		
		if (lc != null) {
            System.out.println(lc.toString());
        } else {
            System.out.println("No loan records found. Please enter loan details first.");
        }
		
	}
	
	public int menuList(Scanner sc) {
		
        System.out.println("\n--- Loan Amortization Calculator ---\n");
        System.out.println("1. Enter Loan Details");
        System.out.println("2. Display Loan Details");
        System.out.println("3. Exit");
        System.out.print("Enter your choice: ");
       
        int choice = sc.nextInt();
        
        return choice;
    }
	 
}
