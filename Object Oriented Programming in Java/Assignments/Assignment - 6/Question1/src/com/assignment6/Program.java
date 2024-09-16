package com.assignment6;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		int[] numbers = new int[5];

        for (int i=0; i<numbers.length; i++) {
            System.out.println("Default value at index " + i + ": " + numbers[i]);
        }

        Scanner sc = new Scanner(System.in);
        System.out.println();

        for (int i=0; i<numbers.length; i++) {
            System.out.print("Enter value for index " + i + ": ");
            numbers[i] = sc.nextInt();
        }

        System.out.println("\nUpdated values in the Array:");
        for (int i=0; i<numbers.length; i++) {
            System.out.println("Value at index " + i + ": " + numbers[i]);
        }

        sc.close();

	}

}
