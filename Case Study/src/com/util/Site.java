package com.util;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.beans.Customer;
import com.beans.Order;
import com.beans.Product;

public interface Site {

	public Product getProductById(int productId);
	
	public List<Product> getAllProducts();
	
	public Order placeOrder(int customerId,Map<Integer,Integer> selectedProducts,float totalprice);
	
	public boolean setCustomer(int customerID, String customerName, double contactNumber, String address);
	
	public boolean setLogin(int id,String password);
	
	public boolean checkUserLogin(int id , String password);
	
	public Customer getCustomerbyId(int id);
	
	public List<Product> getSelectedProductsList(Map<Integer,Integer> ids);
	
	public float calculatePrice(List<Product> products);
	
	public boolean checkcustomerId(int id);
	
}
