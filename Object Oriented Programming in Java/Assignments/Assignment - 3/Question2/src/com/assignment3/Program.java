package com.assignment3;

import java.util.Scanner;

class CompoundInterestCalculator {
    private double principal;
    private double annualInterestRate;
    private int numberOfCompounds;
    private int years;
    private double futureValue;

    public void acceptRecord() {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the Principle Amount: ");
        principal = sc.nextDouble();
        System.out.print("Enter the Annual Interest Rate: ");
        annualInterestRate = sc.nextDouble();
        System.out.print("Enter number of compounds in a year: ");
        numberOfCompounds = sc.nextInt();
        System.out.print("Enter years of Investment: ");
        years = sc.nextInt();
        sc.close();
        
    }

    public void calculateFutureValue() {
        futureValue = principal * Math.pow(1 + annualInterestRate / numberOfCompounds / 100, numberOfCompounds * years);
    }

    public void printRecord() {
        double totalInterest = futureValue - principal;
        System.out.println();
        System.out.printf("Future Value: Rs.%.2f%n", futureValue);
        System.out.printf("Total Interest Earned: Rs.%.2f%n", totalInterest);
    }
}

public class Program {
    public static void main(String[] args) {
        CompoundInterestCalculator calculator = new CompoundInterestCalculator();
        calculator.acceptRecord();
        calculator.calculateFutureValue();
        calculator.printRecord();
    }
}
