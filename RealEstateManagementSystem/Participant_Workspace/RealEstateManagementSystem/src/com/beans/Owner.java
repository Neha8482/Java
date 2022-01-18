package com.beans;

import java.util.List;

public class Owner {
	private int ownerId;
	private String ownerName;
	private String address;
	private List<Property> ownedProperties;
	
	public Owner() {}
	

	public Owner(int ownerId, String ownerName, String address, List<Property> ownedProperties) {
		super();
		this.ownerId = ownerId;
		this.ownerName = ownerName;
		this.address = address;
		this.ownedProperties = ownedProperties;
	}

	public int getOwnerId() {
		return ownerId;
	}

	public void setOwnerId(int ownerId) {
		this.ownerId = ownerId;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public List<Property> getOwnedProperties() {
		return ownedProperties;
	}

	public void setOwnedProperties(List<Property> ownedProperties) {
		this.ownedProperties = ownedProperties;
	}


	@Override
	public String toString() {
		return "\n\n"+"ownerId=" + ownerId + ", ownerName=" + ownerName + ", address=" + address + ", ownedProperties="
				+ ownedProperties;
	}

	
}
