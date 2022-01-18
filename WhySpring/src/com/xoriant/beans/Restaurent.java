package com.xoriant.beans;

public class Restaurent {

	public Beverage placeOrder(String beverageName) {

		if(beverageName.equals("Tea")) {
			
			return new Tea().getBeverage();
		}
		else if(beverageName.equals("Coffee")) {
			return new Coffee();
		}
		else
		return null;
	}
	
	public static void main(String[] args) {
	Restaurent res = new Restaurent();
	res.placeOrder("Tea");
	res.placeOrder("Coffee");
	}
}
