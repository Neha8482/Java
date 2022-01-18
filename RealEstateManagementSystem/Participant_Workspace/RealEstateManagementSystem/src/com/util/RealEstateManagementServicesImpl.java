package com.util;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.beans.Bank;
import com.beans.DealType;
import com.beans.Owner;
import com.beans.Property;
import com.beans.Transactions;
import com.exception.InvalidPropertyIdException;

public class RealEstateManagementServicesImpl implements RealEstateManagementServices{

	static int index = 0;
	private Connection connection;
	private PreparedStatement preparedStatement;
	public RealEstateManagementServicesImpl() {
		connection = new  ConnectionManagerImpl().getConnection();
	}

	@Override
	public Set<Owner> fetchOwnerData() {
		Owner owner = null;
		Set<Owner> owners = new HashSet<>();
		String sql = "select * from owner";
		try {
			preparedStatement = connection.prepareStatement(sql);
			ResultSet resultSet = preparedStatement.executeQuery();
			while(resultSet.next()) {
				int id = resultSet.getInt(1);
				String name = resultSet.getString(2);
				String address = resultSet.getString(3);
				owner = new Owner(id,name,address,null);
				owners.add(owner);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Owners");
		return owners;
	}

	@Override
	public List<Property> getPropertyDetails() {
		Property property = null;
		String st;
		BufferedReader br =null;
		List<Property> propertyDetails = new ArrayList<>();
		try {
			br =  new BufferedReader(new FileReader("D://propertydetails.txt"));
			while((st = br.readLine()) != null) {
				String[] split = st.split(",");
				System.out.println(split[3]);
				double area = Double.parseDouble(split[2]);
				double rate = Double.parseDouble(split[3]);
				double cost = area * rate;
				double propertyCost = cost + (cost * 5/100);
				double loanForProperty = propertyCost * 80/100 ;
				boolean isExempted = false;
				property = new Property(Integer.parseInt(split[0]),split[1], Double.parseDouble(split[2]), Double.parseDouble(split[2]),propertyCost,loanForProperty,isExempted);
				propertyDetails.add(property);
				
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
		     try {
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		Collections.sort(propertyDetails, new Comparator<Property>() {
			@Override
			public int compare(Property o1, Property o2) {
				Double p1= o1.getPropertyCost();
				Double p2 = o2.getPropertyCost();
				return p1.compareTo(p2);
			}
		});
		System.out.println("Property");
		return propertyDetails;
	}

	@Override
	public List<Transactions> getTransactionDetails() {
		Transactions transaction = null;
		List<Transactions> transactionDetails = new ArrayList<>();
		
		String sql = "select * from property_transactions";
		try {
			preparedStatement = connection.prepareStatement(sql);
			ResultSet resultSet = preparedStatement.executeQuery();
			while(resultSet.next()) {
			transaction = new Transactions(resultSet.getInt(1),resultSet.getInt(2),
					resultSet.getString(3),resultSet.getInt(4),DealType.valueOf(resultSet.getString(5)),
					resultSet.getDate(6),resultSet.getDouble(7));
			transactionDetails.add(transaction);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Transactions");
		return transactionDetails;
	}

	@Override
	public List<Owner> getPropertiesOwnedByOwner(Set<Owner> owners, List<Transactions> transactions,
			List<Property> properties) {
		
		List<Owner> ownerprop  = new ArrayList<>();
		for(Owner o : owners) {
			List<Property> prop = new ArrayList<>();
		     for(Transactions t : transactions) {
				if(t.getOwnerId() == o.getOwnerId()) {
					Property p ;
					for(int i =0; i < properties.size();i++) {
						p= properties.get(i);
						if(t.getPropertyId() == p.getPropertyId() && t.getDealType() != DealType.sales) {
					//	System.out.println("added "+p.getPropertyId());
							prop.add(p);
						//	System.out.println(prop.indexOf(p));
						}
						else if(t.getPropertyId() == p.getPropertyId() && t.getDealType() == DealType.sales) {
						///	System.out.println("removed "+p.getPropertyId());
						//	System.out.println(prop.lastIndexOf(p.getPropertyId()));
							prop.remove(prop.lastIndexOf(p));
						}
					}
				}
			}
		     ownerprop.add(new Owner(o.getOwnerId(),o.getOwnerName(),o.getAddress(),prop));
		}
		return ownerprop;
	}

	@Override
	public Map<Integer, List<Property>> getSoldProperties(List<Transactions> transactions, List<Property> properties) {
		Map<Integer, List<Property>> ownedprops = new HashMap<>();
		Collections.sort(transactions,new Comparator<Transactions>() {
			@Override
			public int compare(Transactions o1, Transactions o2) {
				Integer i1 = o1.getOwnerId();
				Integer i2= o2.getOwnerId();
				return i1.compareTo(i2);
			}
		});
		//int track = transactions.get(0).getOwnerId();
		for(Transactions t : transactions) {
			if(t.getDealType() == DealType.sales) {
			if(ownedprops.containsKey(t.getOwnerId())) {
				List<Property> p = new ArrayList<>();
				p = ownedprops.get(t.getOwnerId());
				for(Property pr : properties) {
					if(t.getPropertyId() == pr.getPropertyId()) {
						p.add(pr);
					}
				}
			}else {
				List<Property> p = new ArrayList<>();
				for(Property pr : properties) {
				if(t.getPropertyId()== pr.getPropertyId()) {
					p.add(pr);
				}
				}
				ownedprops.put(t.getOwnerId(), p);
			}
		}else {
			continue;
		}
		}
			
		return ownedprops;
	}

	@Override
	public List<Property> searchPropertiesWithExemption(Set<Owner> owners, List<Transactions> transactions) {
		Map<Integer,List<String>> track = new HashMap<>();
		List<Property> properties = getPropertyDetails();
		for(Transactions t : transactions ) {
			if(t.getDealType() == DealType.purchase) {
				if(track.containsKey(t.getOwnerId())) {
					List<String> s = track.get(t.getOwnerId());
					//System.out.println(s);
					if(s.size() >=3) {
						if(s.contains(t.getBankName())) {
					Set<String> sets = new HashSet<>(s);
					for(String string : sets) {
						if(Collections.frequency(s, string) >=3) {
							for(Property p : properties) {
								if(t.getPropertyId() == p.getPropertyId()) {
								//	System.out.println(p);
									p.setExempted(true);
								}
							}
						}
					}
						}
					}
					s.add(t.getBankName());
				}else {
					List<String> e = new ArrayList<>();
					e.add(t.getBankName());
					track.put(t.getOwnerId(),e);
				}
			}
			else
				continue;
		}
		
		
		return properties;
	}

	@Override
	public double getProfit(int propertyId, List<Property> properties, List<Transactions> transactions)
			throws InvalidPropertyIdException {
		Property property = new Property();
		for(Property p : properties) {
			if(p.getPropertyId() == propertyId) {
				property = p;
			}
		}
		Transactions tpurchase= new Transactions();
		Transactions tsell= new Transactions();
		tsell =null;
		for(Transactions tr : transactions) {
			if(tr.getPropertyId() == propertyId && tr.getDealType() == DealType.purchase) {
				tpurchase = tr;
			}
			if(tr.getPropertyId() == propertyId && tr.getDealType() == DealType.sales) {
				tsell = tr;
			}
		}
		System.out.println(tpurchase);
		System.out.println(tsell);
		if(tsell == null) {
			return 0.0;
		}
		double cp = property.getPropertyCost();
		double processingFee = 0;
		double rate = 0;
		switch(tpurchase.getBankName()) {
		case "HDFC":
			Bank bank1 = Bank.HDFC;
			processingFee = property.getLoanForProperty() *  bank1.getProcessingFee()/100;
			rate = bank1.getInterestRate();
			break;
		case "SBI":
			Bank bank2 = Bank.SBI;
			processingFee = property.getLoanForProperty() *   bank2.getProcessingFee()/100;
			rate = bank2.getInterestRate();
			break;
		case "PNB":
			Bank bank3 = Bank.PNB;
			processingFee =  property.getLoanForProperty() *   bank3.getProcessingFee()/100;
			rate = bank3.getInterestRate();
			break;
		case "KOTAK":
			Bank bank4 = Bank.KOTAK;
			processingFee =  property.getLoanForProperty() *   bank4.getProcessingFee()/100;
			rate = bank4.getInterestRate();
			break;
		case "ICICI":
			Bank bank5 = Bank.ICICI;
			processingFee =  property.getLoanForProperty() *   bank5.getProcessingFee()/100;
			rate = bank5.getInterestRate();
			break;
		case "IDBI":
			Bank bank6 = Bank.IDBI;
			processingFee = property.getLoanForProperty() *   bank6.getProcessingFee()/100;
			rate = bank6.getInterestRate();
			break;	
		}
		if(property.isExempted() == false) {	
			cp = cp +processingFee  ;
		}
		java.util.Date d1 = tpurchase.getDealDate();
		java.util.Date d2 = tsell.getDealDate();
		long timediffinmillisecs = d2.getTime() - d1.getTime();
		double diffindays = timediffinmillisecs / (1000 * 60 *60 * 24) ;
		 double interest = property.getLoanForProperty() * rate * (float)(diffindays/365.00)/100;
		//System.out.println((float)diffindays/365);
		 cp =cp +interest;
		System.out.println(interest);
		System.out.println("CP "+cp);
		
		double sp = tsell.getSellingRate() * property.getAreaInSqFeet();
		System.out.println("SP "+sp);
		double profit = sp - cp;
		System.out.println(profit);
		return profit;
	}

	@Override
	public Map<Integer, List<Property>> getPropertiesSoldAtProfit(Set<Owner> owners, List<Transactions> transactions) {
		Map<Integer,List<Property>> ownerprofit = new HashMap<>();
		List<Property> properties = new ArrayList<>();
		properties = searchPropertiesWithExemption(owners,transactions);
		for(Transactions t : transactions) {
			if(t.getDealType() == DealType.sales) {
				if(ownerprofit.containsKey(t.getOwnerId())) {
					List<Property> prop = new ArrayList<>();
							prop = ownerprofit.get(t.getOwnerId());
					for(Property p : properties) {
						if(t.getPropertyId() == p.getPropertyId()) {
							try {
								double profit = getProfit(t.getPropertyId(),properties,transactions);
								System.out.println(profit+"  there"+t.getOwnerId()+"  "+t.getPropertyId());
								if(profit > 0) {
									prop.add(p);
									System.out.println("added second");
								}
							} catch (InvalidPropertyIdException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
						}
					}	
				}else {
					List<Property> prop = new ArrayList<>();
					for(Property p : properties) {
						if(t.getPropertyId() == p.getPropertyId()) {
							try {
								double profit = getProfit(t.getPropertyId(),properties,transactions);
								System.out.println(profit +"  here"+t.getOwnerId()+"  "+t.getPropertyId());
								if(profit > 0) {
									prop.add(p);
									ownerprofit.put(t.getOwnerId(),prop);
									System.out.println("added first");
								}
							} catch (InvalidPropertyIdException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
						}
					}
					//ownerprofit.put(t.getOwnerId(),prop);
					//System.out.println(prop);
				}
			}else continue;
		}
		return ownerprofit;
	}

	@Override
	public int getMaximumTaxPayer(Map<Integer, List<Property>> propertiesSoldWithProfit,
			List<Transactions> transactions) {
		//List<Property> properties = new ArrayList<>();
		//int oid;
		
		
		Map<Integer,Double> mapvalue = new HashMap<>();
		propertiesSoldWithProfit.entrySet().forEach(
				entry -> {
					List<Property> prop = entry.getValue();
					int oid = entry.getKey();
					double profitamt =0;
					double capitaltax = 0;
					Set<Owner> o = new HashSet<>();
					o = fetchOwnerData();
					List<Property> properties = searchPropertiesWithExemption(o,transactions);
					for(Property pp : prop) {
						try {
							profitamt = getProfit(pp.getPropertyId(),properties,transactions);
							Transactions tpurchase= new Transactions();
							Transactions tsell= new Transactions();
							for(Transactions tr : transactions) {
								if(tr.getPropertyId() == pp.getPropertyId() && tr.getDealType() == DealType.purchase) {
									tpurchase = tr;
								}
								if(tr.getPropertyId() == pp.getPropertyId() && tr.getDealType() == DealType.sales) {
									tsell = tr;
								}
							}
							java.util.Date d1 = tpurchase.getDealDate();
							java.util.Date d2 = tsell.getDealDate();
							long timediffinmillisecs = d2.getTime() - d1.getTime();
							long diffindays = timediffinmillisecs / (1000 * 60 *60 * 24) ;
							float time  = (float)diffindays/365;
							if(time <= 0.50) {
								capitaltax = capitaltax + (profitamt * 10/100);
							}else {
								capitaltax = capitaltax + (profitamt * 15/100);
							}
						} catch (InvalidPropertyIdException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
					mapvalue.put(oid, capitaltax);
				});
		double maxtax = 0;
		int id =0;
		for(Map.Entry<Integer, Double> entry: mapvalue.entrySet()) {
			System.out.println(entry.getKey()+" has paid tax "+entry.getValue());
		if(maxtax < entry.getValue()) {
			maxtax = entry.getValue();
			id = entry.getKey();
		}
		}
		
		return id;
	}

}
