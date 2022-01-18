package com.xoriant.beans;

public class Tea  implements Beverage{

	public  Tea() {
		System.out.println("Preparing tea....");
	}

	@Override
	public Beverage getBeverage() {
		// TODO Auto-generated method stub
		return new Tea();
	}
}
