package com.xoriant.jdbc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import com.xoriant.jdbc.dto.Employee;
import com.xoriant.jdbc.util.DBUtilImpl;

public class EmployeeDaoImpl implements EmployeeDao{

	private Connection connection;
	PreparedStatement preparedStatement;
	
	public EmployeeDaoImpl() {
		connection = new DBUtilImpl().getConnection();
	}

	@Override
	public boolean addEmployee(Employee employee) {
		boolean isRecordInserted = false;
		/*String sql = "insert into empdata values("+employee.getEmpID()+",'"+employee.getEmpName()+"',"+employee.getSalary()+",'"+employee.getDesignation()+"')";
		try {
			int result = connection.createStatement().executeUpdate(sql);
			if(result  >0)
				isRecordInserted = true;
		}catch(SQLException e) {
			e.printStackTrace();
		}
		*/
		String sql = " insert into empdata values(?,?,?,?)";
		
		try {
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1,employee.getEmpID());//index starts with 1
			preparedStatement.setString(2, employee.getEmpName());
			preparedStatement.setDouble(3, employee.getSalary());
			preparedStatement.setString(4, employee.getDesignation());
			int result = preparedStatement.executeUpdate();
			if(result  >0)
				isRecordInserted = true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return isRecordInserted;
	}
	@Override
	public boolean updateEmployeeSalary(int empId, double salary) {
		boolean isRecordUpdated = false;
		String sqlupdate = "update empdata set salary = ? where empid = ?";
		try {
			preparedStatement = connection.prepareStatement(sqlupdate);
			preparedStatement.setDouble(1, salary);
			preparedStatement.setInt(2,empId);
			int result = preparedStatement.executeUpdate();
			if(result  >0)
				isRecordUpdated = true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return isRecordUpdated;
	}
	@Override
	public boolean updateEmployeeDesignation(int empID, String designation) {
		boolean isRecordUpdated = false;
		String sqlupdate = "update empdata set designation = ? where empid = ?";
		try {
			preparedStatement = connection.prepareStatement(sqlupdate);
			preparedStatement.setString(1, designation);
			preparedStatement.setInt(2,empID);
			int result = preparedStatement.executeUpdate();
			if(result  >0)
				isRecordUpdated = true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return isRecordUpdated;
	}

	@Override
	public boolean deleteEmployee(int empId) {
		boolean isRecordDeleted = false;
		String sqldelete = "delete from empdata where empid = ?";
	
		try {
			preparedStatement = connection.prepareStatement(sqldelete);
			preparedStatement.setInt(1, empId);
			int result = preparedStatement.executeUpdate();
			if(result  >0)
				isRecordDeleted = true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
		return isRecordDeleted;
	}

	@Override
	public Employee getEmployee(int empId) {
		Employee employee = null;
		String getEmployeedata = "select * from empdata where empid = ?";
		try {
			preparedStatement = connection.prepareStatement(getEmployeedata);
			preparedStatement.setInt(1, empId);
		    ResultSet resultSet = preparedStatement.executeQuery();
		    while(resultSet.next()) {
		    	String empName = resultSet.getString(2);
		    	double salary = resultSet.getDouble(3);
		    	String designation = resultSet.getString(4);
		    	employee = new Employee(empId,empName,salary,designation);
		    }
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return employee;
	}

	@Override
	public Set<Employee> getAllEmployees() {
		Employee employee = null;
		Set<Employee> employees = new HashSet<>();
		String getdata = "select * from empdata";
		try {
			preparedStatement = connection.prepareStatement(getdata);
			ResultSet resultSet = preparedStatement.executeQuery();
			while(resultSet.next()) {
				int empId = resultSet.getInt(1);
				String empName = resultSet.getString(2);
		    	double salary = resultSet.getDouble(3);
		    	String designation = resultSet.getString(4);
		    	employee = new Employee(empId,empName,salary,designation);
		        employees.add(employee);
			}
			//resultSet.close();
			//preparedStatement.close();
			//connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return employees; 
	}

	
	
}
