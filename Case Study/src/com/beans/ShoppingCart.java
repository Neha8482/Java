package com.beans;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

	private Customer customer;
	private List<Product> wishlist;
	private float totalPrice;

	public ShoppingCart(Customer customer, List<Product> selectedProducts, float totalPrice) {
		super();
		this.customer = customer;
		this.wishlist = selectedProducts;
		this.totalPrice = totalPrice;
	}



	public Customer getCustomer() {
		return customer;
	}


	public void setCustomer(Customer customer) {
		this.customer = customer;
	}


	public List<Product> getWishlist() {
		return wishlist;
	}


	public void setWishlist(List<Product> wishlist) {
		this.wishlist = wishlist;
	}


	public float getTotalPrice() {
		return totalPrice;
	}


	public void setTotalPrice(float totalPrice) {
		this.totalPrice = totalPrice;
	}


	@Override
	public String toString() {
		return "ShoppingCart [customer=" + customer + ", wishlist=" + wishlist + ", totalPrice=" + totalPrice + "]";
	}
	
	
}
