package com.beans;

public class Login {

	private int customerID;
	private String password;
	public Login(int customerID, String password) {
		super();
		this.customerID = customerID;
		this.password = password;
	}


	public int getCustomerID() {
		return customerID;
	}
	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "Login [customerID=" + customerID + ", password=" + password + "]";
	}
	
}
