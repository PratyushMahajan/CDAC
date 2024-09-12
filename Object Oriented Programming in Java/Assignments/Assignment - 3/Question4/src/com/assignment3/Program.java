package com.assignment3;

import java.util.Scanner;

class DiscountCalculator {
    private double originalPrice;
    private double discountRate;
    private double discountAmount;
    private double finalPrice;

    public void acceptRecord() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Price: ");
        originalPrice = sc.nextDouble();
        System.out.print("Enter the Discount Rate: ");
        discountRate = sc.nextDouble();
    }

    public void calculateDiscount() {
        discountAmount = originalPrice * (discountRate / 100);
        finalPrice = originalPrice - discountAmount;
    }

    public void printRecord() {
    	System.out.println();
        System.out.printf("Discount Amount: Rs%.2f%n", discountAmount);
        System.out.printf("Final Price: Rs%.2f%n", finalPrice);
    }
}

public class Program {
    public static void main(String[] args) {
        DiscountCalculator calculator = new DiscountCalculator();
        calculator.acceptRecord();
        calculator.calculateDiscount();
        calculator.printRecord();
    }
}
