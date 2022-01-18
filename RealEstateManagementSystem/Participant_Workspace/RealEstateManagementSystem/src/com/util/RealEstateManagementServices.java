package com.util;

import java.util.List;
import java.util.Map;
import java.util.Set;

import com.beans.Owner;
import com.beans.Property;
import com.beans.Transactions;
import com.exception.InvalidPropertyIdException;

public interface RealEstateManagementServices {
	Set<Owner> fetchOwnerData();
	
	List<Property> getPropertyDetails();
	
	List<Transactions> getTransactionDetails();
	
	List<Owner> getPropertiesOwnedByOwner(Set<Owner> owners, List<Transactions> transactions, List<Property> properties);
	
	Map<Integer,List<Property>> getSoldProperties(List<Transactions> transactions,List<Property> properties);
	
	List<Property> searchPropertiesWithExemption(Set<Owner> owners, List<Transactions> transactions);
	
	double getProfit(int propertyId, List<Property> properties,	List<Transactions> transactions) throws InvalidPropertyIdException;
	
	Map<Integer,List<Property>> getPropertiesSoldAtProfit(Set<Owner> owners,List<Transactions> transactions);
	
	int getMaximumTaxPayer(Map<Integer,List<Property>> propertiesSoldWithProfit,List<Transactions> transactions);

	
}
