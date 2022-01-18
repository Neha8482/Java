package com.beans;

public class Customer {

	private int customerID;
	private String customerName;
	private double contactNumber;
	private String address;
	
	
	
	public Customer(int customerID, String customerName, double contactNumber, String address) {
		super();
		this.customerID = customerID;
		this.customerName = customerName;
		this.contactNumber = contactNumber;
		this.address = address;
	}
	public int getCustomerID() {
		return customerID;
	}
	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public double getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(double contactNumber) {
		this.contactNumber = contactNumber;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Customer [customerID=" + customerID + ", customerName=" + customerName + ", contactNumber="
				+ contactNumber + ", address=" + address + "]";
	}
	
	
}
