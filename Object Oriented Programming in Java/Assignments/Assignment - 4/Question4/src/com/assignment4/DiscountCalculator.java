package com.assignment4;

public class DiscountCalculator {
	
	private double originalPrice;
	private double discountRate;

    public DiscountCalculator(double originalPrice, double discountRate) {
		this.originalPrice = originalPrice;
		this.discountRate = discountRate;
	}

	public double getOriginalPrice() {
		return originalPrice;
	}

	public void setOriginalPrice(double originalPrice) {
		this.originalPrice = originalPrice;
	}

	public double getDiscountRate() {
		return discountRate;
	}

	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}

	public double calculateDiscount() {
		double discountAmount = getOriginalPrice() * (getDiscountRate() / 100);
        return discountAmount;
    }
	public double finalPrice() {
		double finalPrice = getOriginalPrice() - calculateDiscount();
		return finalPrice;
	}

	@Override
	public String toString() {
		
		return "\nOriginal Price: Rs." + getOriginalPrice() + " \n" +
	               "Discount Rate: " + getDiscountRate() + "%\n" +
	               "Discount Amount: Rs." + String.format("%.2f", calculateDiscount()) + "\n" +
	               "Final Price: Rs." + String.format("%.2f", finalPrice());
		
	}
	
	 
}
