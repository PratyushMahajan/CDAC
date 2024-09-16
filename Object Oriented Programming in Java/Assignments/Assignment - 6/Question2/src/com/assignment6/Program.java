package com.assignment6;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        int[] numbers = new int[5];

        acceptRecord(numbers);
        printRecord(numbers);
    }

    public static void acceptRecord(int[] array) {
        Scanner sc = new Scanner(System.in);
        for (int i=0; i<array.length; i++) {
            System.out.print("Enter value for index " + i + ": ");
            array[i] = sc.nextInt();
        }
        sc.close();
    }

    public static void printRecord(int[] array) {
        System.out.println("\nArray Values:");
        for (int i=0; i<array.length; i++) {
            System.out.println("Value at index " + i + ": " + array[i]);
        }
    }
}
