package com.assignment3;

import java.util.Scanner;

class TollBoothRevenueManager {
    private double carRate;
    private double truckRate;
    private double motorcycleRate;
    private int numberOfCars;
    private int numberOfTrucks;
    private int numberOfMotorcycles;
    private double totalRevenue;
    Scanner sc = new Scanner(System.in);

    public void setTollRates() {
        
        System.out.print("Enter toll rate for Car: ");
        carRate = sc.nextDouble();
        System.out.print("Enter toll rate for Truck: ");
        truckRate = sc.nextDouble();
        System.out.print("Enter toll rate for Motorcycle: ");
        motorcycleRate = sc.nextDouble();
        
    }

    public void acceptRecord() {
        System.out.println();
        System.out.print("Enter the number of Cars: ");
        numberOfCars = sc.nextInt();
        System.out.print("Enter the number of Trucks: ");
        numberOfTrucks = sc.nextInt();
        System.out.print("Enter the number of Motorcycles: ");
        numberOfMotorcycles = sc.nextInt();
        
        sc.close();
    }

    public void calculateRevenue() {
        totalRevenue = (numberOfCars * carRate) + (numberOfTrucks * truckRate) + (numberOfMotorcycles * motorcycleRate);
    }

    public void printRecord() {
        int totalVehicles = numberOfCars + numberOfTrucks + numberOfMotorcycles;
        System.out.println();
        System.out.printf("Total Number of Vehicles: %d%n", totalVehicles);
        System.out.printf("Total Revenue Collected: Rs.%.2f%n", totalRevenue);
    }
    
   
}

public class Program {
    public static void main(String[] args) {
        TollBoothRevenueManager manager = new TollBoothRevenueManager();
        manager.setTollRates();
        manager.acceptRecord();
        manager.calculateRevenue();
        manager.printRecord();
    }
}
