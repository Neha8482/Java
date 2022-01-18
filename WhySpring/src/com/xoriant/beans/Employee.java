package com.xoriant.beans;

public class Employee {

	private int empid;
	private String empName;
	private Address Address;
	public Employee(int empid, String empName, Address address) {
		super();
		this.empid = empid;
		this.empName = empName;
		Address = address;
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empName=" + empName + ", Address=" + Address + "]";
	};
	
}
