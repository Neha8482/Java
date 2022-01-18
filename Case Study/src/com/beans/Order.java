package com.beans;

public class Order {

	private int orderId;
	private ShoppingCart shoppingCart;
	private String orderDate;
	
	
	public Order(int orderId, ShoppingCart shoppingCart, String orderDate) {
		super();
		this.orderId = orderId;
		this.shoppingCart = shoppingCart;
		this.orderDate = orderDate;
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public ShoppingCart getShoppingCart() {
		return shoppingCart;
	}
	public void setShoppingCart(ShoppingCart shoppingCart) {
		this.shoppingCart = shoppingCart;
	}
	public String getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}
	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", shoppingCart=" + shoppingCart + ", orderDate=" + orderDate + "]";
	}
	
}
