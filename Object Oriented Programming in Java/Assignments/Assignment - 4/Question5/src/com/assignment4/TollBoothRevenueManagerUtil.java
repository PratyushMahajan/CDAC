package com.assignment4;
import java.util.Scanner;

public class TollBoothRevenueManagerUtil {
	
	Scanner sc = new Scanner(System.in);
	private TollBoothRevenueManager boothutil;
	
	public void acceptRecord() {
		
		if(boothutil == null) {
			boothutil = new TollBoothRevenueManager(0,0,0,0,0,0);
		}
		
		System.out.print("\nEnter toll rate for Car: ");
        double carRate = sc.nextDouble();
        boothutil.setCarRate(carRate);
        
        System.out.print("Enter toll rate for Truck: ");
        double truckRate = sc.nextDouble();
        boothutil.setTruckRate(truckRate);
        
        System.out.print("Enter toll rate for Motorcycle: ");
        double motorcycleRate = sc.nextDouble();
        boothutil.setMotorcycleRate(motorcycleRate);;
        
        System.out.print("\nEnter the number of Cars: ");
        int numberOfCars = sc.nextInt();
        boothutil.setNumberOfCars(numberOfCars);
        
        System.out.print("Enter the number of Trucks: ");
        int numberOfTrucks = sc.nextInt();
        boothutil.setNumberOfTrucks(numberOfTrucks);
        
        System.out.print("Enter the number of Motorcycles: ");
        int numberOfMotorcycles = sc.nextInt();
        boothutil.setNumberOfMotorcycles(numberOfMotorcycles);
	    
	    
	    boothutil = new TollBoothRevenueManager(carRate, truckRate, motorcycleRate, numberOfCars, numberOfTrucks, numberOfMotorcycles);   
    
	}
	
	public void printRecord() {
		
		if (boothutil != null) {
            System.out.println(boothutil.toString());
        } else {
            System.out.println("No records found. Please enter details first.");
        }
		
	}
	
	public int menuList(Scanner sc) {
		
        System.out.println("\n--- Toll Booth Revenue Calculator ---\n");
        System.out.println("1. Calculate Revenue");
        System.out.println("2. Display Revenue");
        System.out.println("3. Exit");
        System.out.print("Enter your choice: ");
       
        int choice = sc.nextInt();
        
        return choice;
    }
	 
}
