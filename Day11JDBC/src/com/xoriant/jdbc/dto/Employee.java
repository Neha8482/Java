package com.xoriant.jdbc.dto;

public class Employee {

	private int empID;
	private String empName;
	private double salary;
	private String designation;
	
	
	
	public int getEmpID() {
		return empID;
	}
	public void setEmpID(int empID) {
		this.empID = empID;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
	public Employee(int empID, String empName, double salary, String designation) {
		super();
		this.empID = empID;
		this.empName = empName;
		this.salary = salary;
		this.designation = designation;
	}
	@Override
	public String toString() {
		return "\n"+"empID=" + empID + ", empName=" + empName + ", salary=" + salary + ", designation="
				+ designation;
	}
	
	
}
