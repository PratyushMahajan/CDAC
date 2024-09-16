package com.assignment6;

import java.util.Scanner;

public class Program {

    private char[][] seats;

    public Program(int rows, int columns) {
        seats = new char[rows][columns];
        initializeSeats();
    }

    private void initializeSeats() {
        for (int i=0; i<seats.length; i++) {
            for (int j=0; j<seats[i].length; j++) {
                seats[i][j] = 'O';  
            }
        }
    }

    public void bookSeat(int row, int column) {
        if (isValidSeat(row, column)) {
            if (seats[row][column] == 'O') {
                seats[row][column] = 'X';  
                System.out.println("Seat booked successfully.");
            } else {
                System.out.println("Seat is already occupied.");
            }
        } else {
            System.out.println("Invalid seat number.");
        }
    }

    public void cancelBooking(int row, int column) {
        if (isValidSeat(row, column)) {
            if (seats[row][column] == 'X') {
                seats[row][column] = 'O';  
                System.out.println("Booking cancelled successfully.");
            } else {
                System.out.println("Seat is not occupied.");
            }
        } else {
            System.out.println("Invalid seat number.");
        }
    }

    public boolean checkAvailability(int row, int column) {
        if (isValidSeat(row, column)) {
            return seats[row][column] == 'O';
        }
        return false;
    }

    private boolean isValidSeat(int row, int column) {
        return (row >= 0 && row < seats.length && column >= 0 && column < seats[row].length);
    }

    public void displaySeatingChart() {
        System.out.println("\nO: Available Seats       X: Occupied Seats");
        System.out.println("\nCurrent Seating Chart:");
        for (int i=0; i<seats.length; i++) {
            for (int j=0; j<seats[i].length; j++) {
                System.out.print(seats[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int columns = sc.nextInt();

        Program airplane = new Program(rows, columns);
        int choice;
        
        do {
            System.out.println("\n1. Book a Seat");
            System.out.println("2. Cancel a Booking");
            System.out.println("3. Check Seat Availability");
            System.out.println("4. Display Seating Chart");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter row number to book: ");
                    int bookRow = sc.nextInt();
                    System.out.print("Enter column number to book: ");
                    int bookColumn = sc.nextInt();
                    airplane.bookSeat(bookRow - 1, bookColumn - 1);
                    break;
                    
                case 2:
                    System.out.print("Enter row number to cancel: ");
                    int cancelRow = sc.nextInt();
                    System.out.print("Enter column number to cancel: ");
                    int cancelColumn = sc.nextInt();
                    airplane.cancelBooking(cancelRow - 1, cancelColumn - 1);
                    break;
                    
                case 3:
                    System.out.print("Enter row number to check: ");
                    int checkRow = sc.nextInt();
                    System.out.print("Enter column number to check: ");
                    int checkColumn = sc.nextInt();
                    boolean available = airplane.checkAvailability(checkRow - 1, checkColumn - 1);
                    System.out.println("Seat " + (available ? "is available" : "is occupied"));
                    break;
                    
                case 4:
                    airplane.displaySeatingChart();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                    
                default:
                    System.out.println("Invalid option. Please try again.");
                    break;
                    
            } 
        } while(choice != 5);

        sc.close();
    }
}
