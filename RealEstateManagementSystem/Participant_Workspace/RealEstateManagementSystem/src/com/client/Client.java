package com.client;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.beans.Owner;
import com.beans.Property;
import com.beans.Transactions;
import com.exception.InvalidPropertyIdException;
import com.util.RealEstateManagementServicesImpl;

public class Client {
	public static void main(String[] args) {
		Set<Owner> o = new HashSet<>();
		List<Property> p = new ArrayList<>();
		List<Transactions> t = new ArrayList<>();
		RealEstateManagementServicesImpl rs = new RealEstateManagementServicesImpl();
		System.out.println("Accessing");
		o=rs.fetchOwnerData();
	//	System.out.println(o);
	
		t=rs.getTransactionDetails();
		//System.out.println();
	//	System.out.println(t);
		
		
	p= rs.getPropertyDetails();
	//	System.out.println();
		System.out.println(p);
	/*List<Owner> owner = new ArrayList<>();
		owner = rs.getPropertiesOwnedByOwner(o,t,p);
		System.out.println(owner);
		
		
	/*	Map<Integer,List<Property>> po = new HashMap<>();
		
		po = rs.getSoldProperties(t,p);
		 po.entrySet().forEach(entry->{
			    System.out.println(entry.getKey() + " " + entry.getValue());  
			 });
			 */
		
		p=rs.searchPropertiesWithExemption(o,t);
		System.out.println(p);
		try {
			double r = rs.getProfit(106,p, t);
		} catch (InvalidPropertyIdException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			double r = rs.getProfit(102,p, t);
		} catch (InvalidPropertyIdException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}try {
			double r = rs.getProfit(107,p, t);
		} catch (InvalidPropertyIdException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}try {
			double r = rs.getProfit(109,p, t);
		} catch (InvalidPropertyIdException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}try {
			double r = rs.getProfit(105,p, t);
		} catch (InvalidPropertyIdException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}try {
			double r = rs.getProfit(108,p, t);
		} catch (InvalidPropertyIdException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}try {
			double r = rs.getProfit(101,p, t);
		} catch (InvalidPropertyIdException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Map<Integer,List<Property>> opt = new HashMap<>();
		opt = rs.getPropertiesSoldAtProfit(o, t);
		System.out.println(opt);
		
		int i =  rs.getMaximumTaxPayer(opt,t);
		System.out.println(i);
	}
}
