package com.assignment4;

public class TollBoothRevenueManager {
	
	private double carRate;
    private double truckRate;
    private double motorcycleRate;
    private int numberOfCars;
    private int numberOfTrucks;
    private int numberOfMotorcycles;

	public TollBoothRevenueManager(double carRate, double truckRate, double motorcycleRate, int numberOfCars,
			int numberOfTrucks, int numberOfMotorcycles) {
		
		this.carRate = carRate;
		this.truckRate = truckRate;
		this.motorcycleRate = motorcycleRate;
		this.numberOfCars = numberOfCars;
		this.numberOfTrucks = numberOfTrucks;
		this.numberOfMotorcycles = numberOfMotorcycles;
		
	}
	
	public double getCarRate() {
		return carRate;
	}

	public void setCarRate(double carRate) {
		this.carRate = carRate;
	}

	public double getTruckRate() {
		return truckRate;
	}

	public void setTruckRate(double truckRate) {
		this.truckRate = truckRate;
	}

	public double getMotorcycleRate() {
		return motorcycleRate;
	}

	public void setMotorcycleRate(double motorcycleRate) {
		this.motorcycleRate = motorcycleRate;
	}

	public int getNumberOfCars() {
		return numberOfCars;
	}

	public void setNumberOfCars(int numberOfCars) {
		this.numberOfCars = numberOfCars;
	}

	public int getNumberOfTrucks() {
		return numberOfTrucks;
	}

	public void setNumberOfTrucks(int numberOfTrucks) {
		this.numberOfTrucks = numberOfTrucks;
	}

	public int getNumberOfMotorcycles() {
		return numberOfMotorcycles;
	}

	public void setNumberOfMotorcycles(int numberOfMotorcycles) {
		this.numberOfMotorcycles = numberOfMotorcycles;
	}

	public double calculateRevenue() {
		double totalRevenue = (getNumberOfCars() * getCarRate()) + (getNumberOfTrucks() * getTruckRate()) + 
				(getNumberOfMotorcycles() * getMotorcycleRate());
        return totalRevenue;
    }
	
	public int totalVehicles() {
		int total = getNumberOfCars() + getNumberOfMotorcycles() + getNumberOfTrucks();
		return total;
	}

	@Override
	public String toString() {
		
		return "\nTotal Number of Vehicles: " + totalVehicles() + " \n" +
	               "Total revenue Collected: Rs." + String.format("%.2f", calculateRevenue());
		
	}
	
	 
}
