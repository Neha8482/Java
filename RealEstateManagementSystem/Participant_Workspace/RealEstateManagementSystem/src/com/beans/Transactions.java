package com.beans;

import java.util.Date;

public class Transactions {
	private int transactionId;
	private int ownerId;
	private String bankName;
	private int propertyId;
	private DealType dealType;
	private Date dealDate;
	private double sellingRate;
	
	public Transactions() {}

	public Transactions(int transactionId, int ownerId, String bankName, int propertyId, DealType dealType,
			Date dealDate, double sellingRate) {
		super();
		this.transactionId = transactionId;
		this.ownerId = ownerId;
		this.bankName = bankName;
		this.propertyId = propertyId;
		this.dealType = dealType;
		this.dealDate = dealDate;
		this.sellingRate = sellingRate;
	}
	
	

	@Override
	public String toString() {
		return "Transactions [transactionId=" + transactionId + ", ownerId=" + ownerId + ", bankName=" + bankName
				+ ", propertyId=" + propertyId + ", dealType=" + dealType + ", dealDate=" + dealDate + ", sellingRate="
				+ sellingRate + "]";
	}

	public int getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(int transactionId) {
		this.transactionId = transactionId;
	}

	public int getOwnerId() {
		return ownerId;
	}

	public void setOwnerId(int ownerId) {
		this.ownerId = ownerId;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public int getPropertyId() {
		return propertyId;
	}

	public void setPropertyId(int propertyId) {
		this.propertyId = propertyId;
	}

	public DealType getDealType() {
		return dealType;
	}

	public void setDealType(DealType dealType) {
		this.dealType = dealType;
	}

	public Date getDealDate() {
		return dealDate;
	}

	public void setDealDate(Date dealDate) {
		this.dealDate = dealDate;
	}

	public double getSellingRate() {
		return sellingRate;
	}

	public void setSellingRate(double sellingRate) {
		this.sellingRate = sellingRate;
	}

	
}
