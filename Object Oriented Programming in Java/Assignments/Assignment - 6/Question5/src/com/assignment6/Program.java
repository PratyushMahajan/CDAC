package com.assignment6;

import java.util.Arrays;
import java.util.Scanner;

public class Program {

    public static void acceptRecord(int[] array) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter " + array.length + " integers in Array:");
        for (int i=0; i<array.length; i++) {
            array[i] = sc.nextInt();
        }
    }

    public static int[] findIntersection(int[] array1, int[] array2) {
        Arrays.sort(array1);
        Arrays.sort(array2);

        int[] tempArray = new int[Math.min(array1.length, array2.length)];
        int index = 0;
        
        int i = 0;
        int j = 0;
        
        while (i < array1.length && j < array2.length) {
        	
            if (array1[i] == array2[j]) {
            	
                tempArray[index] = array1[i];
                index++;
                i++;
                j++;
                
            } 
            else if (array1[i] < array2[j]) {	
                i++;                
            } 
            else {          	
                j++;               
            }
        }

        int[] resultArray = new int[index];
        
        for (int k=0; k<index; k++) {
            resultArray[k] = tempArray[k];
        }

        return resultArray;
    }

    public static void printRecord(int[] array) {
        if (array.length == 0) {
            System.out.println("No common elements.");
        } 
        else {
            System.out.println("\nIntersection of both Arrays:");
            
            for (int i=0; i<array.length; i++) {
                System.out.print(array[i] + " ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of first Array: ");
        int size1 = sc.nextInt();
        int[] array1 = new int[size1];
        acceptRecord(array1);

        System.out.print("\nEnter the size of second Array: ");
        int size2 = sc.nextInt();
        int[] array2 = new int[size2];
        acceptRecord(array2);

        int[] intersection = findIntersection(array1, array2);
        printRecord(intersection);
    }
}
