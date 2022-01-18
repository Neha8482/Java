package com.xoriant.client;

import com.xoriant.beans.Address;
import com.xoriant.beans.Employee;

public class Client {
public static void main(String[] args) {
	Address address = new Address("Pune","12345");
	Employee employee = new Employee(101,"Shweta",null);
	System.out.println(employee);
}
}
