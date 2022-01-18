package com.xoriant.beans;

public class Coffee implements Beverage{

	Coffee(){
		System.out.println("Coffee.....");
	}
	@Override
	public Beverage getBeverage() {
		// TODO Auto-generated method stub
		return new Coffee();
	}

}
