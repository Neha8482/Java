package com.beans;

public class CreditAccount {
 
	private Customer customer;
	private int accno;
	private float amount;
	private int rewardPoints;
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public int getAccno() {
		return accno;
	}
	public void setAccno(int accno) {
		this.accno = accno;
	}
	public float getAmount() {
		return amount;
	}
	public void setAmount(float amount) {
		this.amount = amount;
	}
	public int getRewardPoints() {
		return rewardPoints;
	}
	public void setRewardPoints(int rewardPoints) {
		this.rewardPoints = rewardPoints;
	}
	@Override
	public String toString() {
		return "CreditAccount [customer=" + customer + ", accno=" + accno + ", amount=" + amount + ", rewardPoints="
				+ rewardPoints + "]";
	}
	
	
}
