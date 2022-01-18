package com.xoriant.jdbc.Client;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import com.xoriant.jdbc.dao.EmployeeDao;
import com.xoriant.jdbc.dao.EmployeeDaoImpl;
import com.xoriant.jdbc.dto.Employee;

public class Client {
	EmployeeDao dao = new EmployeeDaoImpl();
	
	public void add(Employee employee) {
		boolean isRecordInserted = dao.addEmployee(employee);
		if(isRecordInserted == false)
			System.out.println("Record Not Inserted");
		else
			System.out.println("Record Inserted Successfully");
	}
	
	public void get(int id) {
		Employee emp = dao.getEmployee(id);
		if(emp == null)
			System.out.println("Employee with this id is not present in the database");
		else
			System.out.println(emp);
	}
	
	public void getall() {
		Set<Employee> emp = new HashSet<>();
		emp	= dao.getAllEmployees();
		if(emp == null)
			System.out.println("No employees in the database");
		else
			System.out.println(emp);
	}
	
	public void updateSalary(int id,double sal) {
		boolean isSalaryUpdated = dao.updateEmployeeSalary(id,sal);
		if(isSalaryUpdated == false)
			System.out.println("Salary not updated");
		else
			System.out.println("Salary updated Successfully");
	}
	
	public void updateDesignation(int id,String designation) {
		boolean isDesignationUpdated = dao.updateEmployeeDesignation(id,designation);
		if(isDesignationUpdated == false)
			System.out.println("Designation not updated");
		else
			System.out.println("Designation Updated Successfully");
	}
	
	public void delete(int id) {
		boolean isRecordDeleted = dao.deleteEmployee(id);
		if(isRecordDeleted == false)
			System.out.println("Record Not Deleted");
		else
			System.out.println("Record Deleted Successfully");
	}
	
public static void main(String[] args) {
	
	Client client = new Client();
	//client.add(new Employee(11,"Shreya",66700,"HR"));
	//client.updateSalary(4,90000);
//	client.updateDesignation(2,"Resource Manager");
//	client.get(2);
//	client.delete(11);
	client.getall();
}
}
