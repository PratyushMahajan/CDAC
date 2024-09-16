package com.assignment4;

public class CompoundInterestCalculator {
	
	 private double principal;
	 private double annualInterestRate;
	 private int numberOfCompounds;
	 private int years;
	 
	public CompoundInterestCalculator(double principal, double annualInterestRate, 
			int numberOfCompounds, int years) {
		
		this.principal = principal;
		this.annualInterestRate = annualInterestRate;
		this.numberOfCompounds = numberOfCompounds;
		this.years = years;
		
	}

	public double getPrincipal() {
		return principal;
	}

	public void setPrincipal(double principal) {
		this.principal = principal;
	}

	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}
	
	public int getNumberOfCompounds() {
		return numberOfCompounds;
	}

	public void setNumberOfCompounds(int numberOfCompounds) {
		this.numberOfCompounds = numberOfCompounds;
	}

	public int getYears() {
		return years;
	}

	public void setYears(int years) {
		this.years = years;
	}
	
	public double calculateFutureValue() {
		double futureValue = getPrincipal() * Math.pow(1 + getAnnualInterestRate() / getNumberOfCompounds() / 100, 
				getNumberOfCompounds() * getYears());
		return futureValue;
	}

    public double calculateTotalInterest() {
        return calculateFutureValue() - getPrincipal();
    }

	@Override
	public String toString() {
		
		return "\nPrinciple: Rs." + getPrincipal() + "\n" +
	               "Annual Interest Rate: " + getAnnualInterestRate() + "%\n" +
	               "Number of Compounds: " + getNumberOfCompounds() + " \n" +
	               "Years: " + getYears() +" years\n"+
	               "Future Value: Rs." + String.format("%.2f", calculateFutureValue()) + "\n" +
	               "Interest Earned: Rs." + String.format("%.2f", calculateTotalInterest());
		
	}
	
	 
}
