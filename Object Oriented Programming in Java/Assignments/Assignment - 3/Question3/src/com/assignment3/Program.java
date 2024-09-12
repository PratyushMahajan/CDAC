package com.assignment3;

import java.util.Scanner;

class BMITracker {
    private double weight;
    private double height;
    private double bmi;
    private String classification;

    public void acceptRecord() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Weight in Kgs: ");
        weight = sc.nextDouble();
        System.out.print("Enter Height in Meters: ");
        height = sc.nextDouble();
        sc.close();
    }

    public void calculateBMI() {
        bmi = weight / (height * height);
    }

    public void classifyBMI() {
        if (bmi < 18.5) {
            classification = "Underweight";
        } else if (bmi < 24.9) {
            classification = "Normal Weight";
        } else if (bmi < 29.9) {
            classification = "Overweight";
        } else {
            classification = "Obese";
        }
    }

    public void printRecord() {
    	System.out.println();
        System.out.printf("BMI: %.2f%n", bmi);
        System.out.println("Classification: " + classification);
    }
}

public class Program {
    public static void main(String[] args) {
        BMITracker tracker = new BMITracker();
        tracker.acceptRecord();
        tracker.calculateBMI();
        tracker.classifyBMI();
        tracker.printRecord();
    }
}
