package com.beans;

public class Product {

	private int productID;
	private String productName;
	private float productPrice;
	private int productQuantity;
	private String productBrand;
	private String productMake;
	
	
	
	public Product(int productID, String productName, float productPrice, int productQuantity, String productBrand,
			String productMake) {
		super();
		this.productID = productID;
		this.productName = productName;
		this.productPrice = productPrice;
		this.productQuantity = productQuantity;
		this.productBrand = productBrand;
		this.productMake = productMake;
	}
	public int getProductID() {
		return productID;
	}
	public void setProductID(int productID) {
		this.productID = productID;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public float getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(float productPrice) {
		this.productPrice = productPrice;
	}
	public int getProductQuantity() {
		return productQuantity;
	}
	public void setProductQuantity(int productQuantity) {
		this.productQuantity = productQuantity;
	}
	public String getProductBrand() {
		return productBrand;
	}
	public void setProductBrand(String productBrand) {
		this.productBrand = productBrand;
	}
	public String getProductMake() {
		return productMake;
	}
	public void setProductMake(String productMake) {
		this.productMake = productMake;
	}
	@Override
	public String toString() {
		return "\n\n"+"productID=" + productID + ", productName=" + productName + ", productPrice=" + productPrice
				+ ", productQuantity=" + productQuantity + ", productBrand=" + productBrand + ", productMake="
				+ productMake;
	}
	
	
}
