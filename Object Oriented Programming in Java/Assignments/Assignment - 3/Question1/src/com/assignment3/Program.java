package com.assignment3;

import java.util.Scanner;

class LoanAmortizationCalculator {
    private double principal;
    private double annualInterestRate;
    private int loanTerm;
    private double monthlyPayment;

    public void acceptRecord() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Principle Amount: ");
        principal = sc.nextDouble();
        System.out.print("Enter the Annual Interest Rate: ");
        annualInterestRate = sc.nextDouble();
        System.out.print("Enter the Loan Term: ");
        loanTerm = sc.nextInt();
        sc.close();
    }

    public void calculateMonthlyPayment() {
        double monthlyInterestRate = annualInterestRate / 12 / 100;
        int numberOfMonths = loanTerm * 12;
        monthlyPayment = principal * (monthlyInterestRate * Math.pow(1 + monthlyInterestRate, numberOfMonths)) /
                (Math.pow(1 + monthlyInterestRate, numberOfMonths) - 1);
    }

    public void printRecord() {
        double totalPayment = monthlyPayment * loanTerm * 12;
        System.out.println();
        System.out.printf("Monthly Payment: Rs.%.2f%n", monthlyPayment);
        System.out.printf("Total Payment: Rs.%.2f%n", totalPayment);
    }
}

public class Program {

	public static void main(String[] args) {
		LoanAmortizationCalculator calculator = new LoanAmortizationCalculator();
        calculator.acceptRecord();
        calculator.calculateMonthlyPayment();
        calculator.printRecord();
		
	}

}
