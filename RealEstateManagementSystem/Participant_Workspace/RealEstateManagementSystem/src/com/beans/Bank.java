package com.beans;

public enum Bank {
	HDFC(10.5,0.25),KOTAK(10.0,0.30),SBI(8.5,0.25),IDBI(9.0,0.35),PNB(10.0,0.45),ICICI(9.25,0.25);
	
	private double interestRate;
	private double processingFee;
	
	private Bank(double interestRate, double processingFee){
		this.interestRate = interestRate;
		this.processingFee = processingFee;
	}
	public double getInterestRate() {
		return interestRate;
	}
	public double getProcessingFee() {
		return processingFee;
	}
}
