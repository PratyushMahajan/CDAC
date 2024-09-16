package com.assignment6;

import java.util.Arrays;
import java.util.Scanner;

public class Program {

    public static void acceptRecord(int[] array) {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter "+array.length+" integers in Array:");
        for (int i=0; i<array.length; i++) {
            array[i] = sc.nextInt();
        }
        
    }

    public static int[] removeDuplicates(int[] array) {
        Arrays.sort(array);  
        int uniqueCount = 1; 

        for (int i=1; i<array.length; i++) {
            if (array[i] != array[i-1]) {
                uniqueCount++;
            }
        }

        int[] resultArray = new int[uniqueCount];
        resultArray[0] = array[0];  

        int index = 1;
        for (int i=1; i<array.length; i++) {
            if (array[i] != array[i - 1]) {
                resultArray[index++] = array[i];
            }
        }

        return resultArray;
    }

    public static void printRecord(int[] array) {
        System.out.println("\nArray without Duplicates:");
        for (int i=0; i<array.length; i++) {
            System.out.print(array[i]+" ");
        }
    }
    
    public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in);
    	System.out.print("Enter the size of Array: ");
    	int size = sc.nextInt();
        int[] numbers = new int[size];
        
        acceptRecord(numbers);
        int[] uniqueNumbers = removeDuplicates(numbers);
        printRecord(uniqueNumbers);
        
    }
}
