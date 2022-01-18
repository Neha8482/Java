package com.beans;

public class Property {
	private int propertyId;
	private String location;
	private double areaInSqFeet;
	private double ratePerSqFeet;
	private double propertyCost;
	private double loanForProperty;
	private boolean isExempted;
	
	
	public Property(int propertyId, String location, double areaInSqFeet, double ratePerSqFeet, double propertyCost,
			double loanForProperty, boolean isExempted) {
		super();
		this.propertyId = propertyId;
		this.location = location;
		this.areaInSqFeet = areaInSqFeet;
		this.ratePerSqFeet = ratePerSqFeet;
		this.propertyCost = propertyCost;
		this.loanForProperty = loanForProperty;
		this.isExempted = isExempted;
	}

	public Property() {}

	public int getPropertyId() {
		return propertyId;
	}

	public void setPropertyId(int propertyId) {
		this.propertyId = propertyId;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public double getAreaInSqFeet() {
		return areaInSqFeet;
	}

	public void setAreaInSqFeet(double areaInSqFeet) {
		this.areaInSqFeet = areaInSqFeet;
	}

	public double getRatePerSqFeet() {
		return ratePerSqFeet;
	}

	public void setRatePerSqFeet(double ratePerSqFeet) {
		this.ratePerSqFeet = ratePerSqFeet;
	}

	public double getPropertyCost() {
		return propertyCost;
	}

	public void setPropertyCost(double propertyCost) {
		this.propertyCost = propertyCost;
	}

	public double getLoanForProperty() {
		return loanForProperty;
	}

	public void setLoanForProperty(double loanForProperty) {
		this.loanForProperty = loanForProperty;
	}

	public boolean isExempted() {
		return isExempted;
	}

	public void setExempted(boolean isExempted) {
		this.isExempted = isExempted;
	}

	@Override
	public String toString() {
		return "\n"+"propertyId=" + propertyId + ", location=" + location + ", areaInSqFeet=" + areaInSqFeet
				+ ", ratePerSqFeet=" + ratePerSqFeet + ", propertyCost=" + propertyCost + ", loanForProperty="
				+ loanForProperty + ", isExempted=" + isExempted ;
	}
	
	
	
	
	
	}