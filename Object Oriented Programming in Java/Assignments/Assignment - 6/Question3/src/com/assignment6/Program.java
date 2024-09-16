package com.assignment6;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        int[] numbers = new int[5];
        acceptRecord(numbers);
        findMaxMin(numbers);
    }

    public static void acceptRecord(int[] array) {
        Scanner sc = new Scanner(System.in);
        for (int i=0; i<array.length; i++) {
            System.out.print("Enter value for index " + i + ": ");
            array[i] = sc.nextInt();
        }
        sc.close();
    }

    public static void findMaxMin(int[] array) {
        int max = array[0];
        int min = array[0];

        for (int i=1; i<array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
        }

        System.out.println("\nMaximum Value: " + max);
        System.out.println("Minimum Value: " + min);
    }
}
