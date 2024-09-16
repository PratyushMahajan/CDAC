package com.assignment4;

public class BMITracker {
	
	 private double weight;
	 private double height;
	
	
	public BMITracker(double weight, double height) {
		this.weight = weight;
		this.height = height;
	}
	
	public double getWeight() {
		return weight;
	}
	
	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double calculateBMI() {
		double bmi = getWeight() / (getHeight() * getHeight());
		return bmi;
	}

    public String classifyBMI() {
        String classification;
        double bmi = calculateBMI();
        
        if (bmi < 18.5) {
            classification = "Underweight";
        } else if (bmi < 24.9) {
            classification = "Normal Weight";
        } else if (bmi < 29.9) {
            classification = "Overweight";
        } else {
            classification = "Obese";
        }
        
        return classification;
    }

	@Override
	public String toString() {
		
		return "\nWeight: " + getWeight() + " Kgs\n" +
	               "Height: " + getHeight() + " Meters\n" +
	               "BMI: " + String.format("%.2f", calculateBMI()) + "\n" +
	               "Classification: " + classifyBMI();
		
	}
	
	 
}
