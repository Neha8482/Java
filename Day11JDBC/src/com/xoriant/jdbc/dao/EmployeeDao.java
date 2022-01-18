package com.xoriant.jdbc.dao;

import java.util.Set;

import com.xoriant.jdbc.dto.Employee;

public interface EmployeeDao {

	public boolean addEmployee(Employee employee);
	public boolean updateEmployeeSalary(int empId, double salary);
	public boolean updateEmployeeDesignation(int empID,String designation);
	public boolean deleteEmployee(int empId);
	public Employee getEmployee(int empId);
	public Set<Employee> getAllEmployees();
}
