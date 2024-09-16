package com.assignment6;

import java.util.Scanner;

public class Program {

    public static void acceptRecord(int[] array) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter " + array.length + " integers in Array:");
        for (int i=0; i<array.length; i++) {
            array[i] = sc.nextInt();
        }
    }

    public static int findMissingNumber(int[] array, int n) {
        int totalSum = n * (n + 1) / 2;
        int arraySum = 0;
        for (int i=0; i<array.length; i++) {
            arraySum += array[i];
        }
        return totalSum - arraySum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of N: ");
        int n = sc.nextInt();

        int[] array = new int[n-1];
        acceptRecord(array);

        int missingNumber = findMissingNumber(array, n);
        System.out.println("The Missing number is: " + missingNumber);
    }
}
