package com.client;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import com.beans.Order;
import com.beans.Product;
import com.util.SiteImpl;

public class Client {
public static void main(String[] args) {
	SiteImpl site = new SiteImpl();
	List<Product> products = new ArrayList<>();
	products = site.getAllProducts();
	Scanner sc = new Scanner(System.in);
	System.out.println("Welcome to our Website");

	System.out.println("Browse site as Member or Guest Choose one");
	String choice = sc.nextLine();
	if(choice.toLowerCase().equals("member")) {
		System.out.println("Already a member y or n");
		String mem = sc.nextLine();
		if(mem.equals("n")) {
		System.out.println("Enter the details");
		System.out.println("Enter the id");
		int custid = Integer.parseInt(sc.nextLine());
		boolean userexists = site.checkcustomerId(custid);
		if(userexists == false) {
			System.out.println("User id already exists");
			System.exit(0);
		}
		System.out.println("Enter the name");
		String custname = sc.nextLine();
		System.out.println("Enter contact Number");
		double custNumber = Double.parseDouble(sc.nextLine());
		System.out.println("Enter the address");
		String address = sc.nextLine();
		site.setCustomer(custid, custname, custNumber, address);
		System.out.println("Enter the password");
		String pass= sc.next();
		site.setLogin(custid, pass);
		System.out.println("User with username "+custid+" is created");
		}
		else {
		System.out.println("Enter the username");
		int uname = sc.nextInt();
		System.out.println("Enter the password");
		String pass = sc.next();
		
		boolean check = site.checkUserLogin(uname, pass);
		if(check == true) {
		
		System.out.println(products);
		Map<Integer,Integer> selecteditems = new HashMap<>();
		System.out.println("Enter the item id and quantity");
		int id = sc.nextInt();
		int quantity = sc.nextInt();
		selecteditems.put(id, quantity);
		List<Product> selectedProducts = new ArrayList<>();
		selectedProducts = site.getSelectedProductsList(selecteditems);
		//System.out.println(selectedProducts);
		float TotalPrice = site.calculatePrice(selectedProducts);
		Order order = site.placeOrder(uname, selecteditems, TotalPrice);
		System.out.println(order);
		}else {
			System.out.println("Incorrect Credentials");
			System.exit(0);
		}
		}
	}else if(choice.toLowerCase().equals("guest")) {
		System.out.println(products);
	}else {
		System.out.println("Choose any one from two choices given");
	}
}
}
