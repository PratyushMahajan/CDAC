package com.assignment4;

public class LoanAmortizationCalculator {
	
	 private double principal;
	 private double annualInterestRate;
	 private int loanTerm;
	 
	public LoanAmortizationCalculator(double principal, double annualInterestRate, 
			int loanTerm) {
		
		this.principal = principal;
		this.annualInterestRate = annualInterestRate;
		this.loanTerm = loanTerm;
		
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

	public int getLoanTerm() {
		return loanTerm;
	}

	public void setLoanTerm(int loanTerm) {
		this.loanTerm = loanTerm;
	}
	
	public double calculateMonthlyPayment() {
        double monthlyInterestRate = (getAnnualInterestRate() / 12) / 100;
        int numberOfMonths = getLoanTerm() * 12;

        return getPrincipal() * (monthlyInterestRate * Math.pow(1 + monthlyInterestRate, numberOfMonths)) /
                (Math.pow(1 + monthlyInterestRate, numberOfMonths) - 1);
    }

    
    public double calculateTotalAmountPaid() {
        return calculateMonthlyPayment() * getLoanTerm() * 12;
    }

	@Override
	public String toString() {
		
		return "\nPrinciple: Rs." + getPrincipal() + "\n" +
	               "Annual Interest Rate: " + getAnnualInterestRate() + "%\n" +
	               "Loan Term: " + getLoanTerm() + " years\n" +
	               "Monthly Payment: Rs." + String.format("%.2f", calculateMonthlyPayment()) + "\n" +
	               "Total Amount Paid: Rs." + String.format("%.2f", calculateTotalAmountPaid());
	}
	
	 
}
