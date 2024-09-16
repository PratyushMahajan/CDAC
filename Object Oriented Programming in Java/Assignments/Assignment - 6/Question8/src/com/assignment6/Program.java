package com.assignment6;

import java.util.Scanner;

public class Program {

    private int[] array;

    public Program(int size) {
        array = new int[size];
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    public int[] getArray() {
        return array;
    }

    public void inputArray() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter " + array.length + " integers in Array:");
        for (int i=0; i<array.length; i++) {
            array[i] = sc.nextInt();
        }
    }

    public void displayArray() {
        System.out.print("Array elements are: ");
        for (int i=0; i<array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the Array: ");
        int size = sc.nextInt();

        Program p = new Program(size);
        p.inputArray();
        p.displayArray();
    }
}
