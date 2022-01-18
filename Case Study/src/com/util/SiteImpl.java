package com.util;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;
import java.util.Set;

import com.beans.Customer;
import com.beans.Login;
import com.beans.Order;
import com.beans.Product;
import com.beans.ShoppingCart;

import java.util.UUID;
import java.util.stream.Collectors;

public class SiteImpl implements Site{
	
	private Connection connection;
	private static int orderid ;
	private PreparedStatement preparedStatement;
	
	public SiteImpl() {
		connection  = new ConnectionManagerImpl().getConnection();
	}

	@Override
	public Product getProductById(int productId) {
		Product product = null ;
		String sql = "select * from product where productid = ?";
		try {
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, productId);
			ResultSet resultSet = preparedStatement.executeQuery();
			while(resultSet.next()) {
				product = new Product(productId,resultSet.getString(2),resultSet.getFloat(3),resultSet.getInt(4),resultSet.getString(5),resultSet.getString(6));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return product;
	}

	@Override
	public List<Product> getAllProducts() {
		Product product = null;
		List<Product> products = new ArrayList<>();
		String sql = "select * from product";
		try {
			preparedStatement = connection.prepareStatement(sql);
			ResultSet resultSet = preparedStatement.executeQuery();
			while(resultSet.next()) {
				product = new Product(resultSet.getInt(1),resultSet.getString(2),resultSet.getFloat(3),resultSet.getInt(4),resultSet.getString(5),resultSet.getString(6));
				products.add(product);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return products;
	}

	@Override
	public Order placeOrder(int customerid,Map<Integer,Integer> products,float totalprice) {
		List<Product> selectedProducts = getSelectedProductsList(products);
		Random rand = new Random();
		orderid = rand.nextInt();
		Customer customer ;
		customer = getCustomerbyId(customerid);
		ShoppingCart cart = new ShoppingCart(customer,selectedProducts,totalprice); 
		for(Entry<Integer,Integer> p : products.entrySet()) {
			String sql1 = "insert into orders values(?,?,?)";
			try {
				preparedStatement = connection.prepareStatement(sql1);
				preparedStatement.setInt(1, orderid);
				preparedStatement.setInt(2, p.getKey());
				preparedStatement.setInt(3, customerid);
				int result1 = preparedStatement.executeUpdate();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		String sql = "insert into transactions values(?,?,?)";
		try {
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, orderid);
			preparedStatement.setInt(2, customerid);
			preparedStatement.setFloat(3, totalprice);
			int result = preparedStatement.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Order order = new Order(orderid,cart,java.time.LocalDate.now().toString());
		
		return order;
	}

	@Override
	public boolean setCustomer(int customerID, String customerName, double contactNumber, String address) {
		boolean setCustomer = false;
		String sql = "insert into customer values(?,?,?,?)";
		try {
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, customerID);
			preparedStatement.setString(2, customerName);
			preparedStatement.setDouble(3, contactNumber);
			preparedStatement.setString(4, address);
			int result = preparedStatement.executeUpdate();
			if(result > 0)
				setCustomer = true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return setCustomer;
	}
	
	

	@Override
	public boolean setLogin(int id, String password) {
		boolean setid = false;
		String sql = "insert into login values(?,?)";
		try {
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, id);
			preparedStatement.setString(2, password);
			int result = preparedStatement.executeUpdate();
			if(result > 0 )
				setid = true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return setid;
	}

	@Override
	public Customer getCustomerbyId(int id) {
		Customer customer = null;
		String sql= "select * from customer where customerid = ?";
		try {
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, id);
			ResultSet resultSet = preparedStatement.executeQuery();
			while(resultSet.next()) {
				customer = new Customer(resultSet.getInt(1),resultSet.getString(2),resultSet.getDouble(3),resultSet.getString(4));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		return customer;
	}

	@Override
	public List<Product> getSelectedProductsList(Map<Integer,Integer> ids) {
		List<Product> products = new ArrayList<>();
		Product product;
		for(Entry<Integer, Integer> i : ids.entrySet()) {
			for(int j =0 ; j < i.getValue();j++ ) {
			products.add(getProductById(i.getKey()));
			}
		}
		return products;
	}

	@Override
	public float calculatePrice(List<Product> products) {
		float total = 0;
		for(Product p : products) {
			total = total + p.getProductPrice();
		}
		return total;
	}

	@Override
	public boolean checkUserLogin(int id, String password) {
		Login login;
		boolean userexists =false;
		Map<Integer,String> users = new HashMap<>();
		String sql = "select * from login where customerID= ?";
		try {
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, id);
			ResultSet resultSet = preparedStatement.executeQuery();
			while(resultSet.next()) {
				users.put(resultSet.getInt(1),resultSet.getString(2));
			}
			if(users.containsKey(id)) {
				System.out.println(id);
				if(users.get(id).equals(password)) {
					System.out.println(password);
					userexists = true;
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return userexists;
	}

	@Override
	public boolean checkcustomerId(int id) {
		boolean isexists = true;
	List<Integer> ids = new ArrayList<>();
	String sql = "select * from customer";
	try {
		preparedStatement = connection.prepareStatement(sql);
		ResultSet resultSet = preparedStatement.executeQuery();
		while(resultSet.next()) {
			ids.add(resultSet.getInt(1));
		}
	//	System.out.println(ids);
		for(int i : ids) {
			if(id == i) {
				isexists = false;
			}
		}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		// TODO Auto-generated method stub
		return isexists;
	}
	
	

}
