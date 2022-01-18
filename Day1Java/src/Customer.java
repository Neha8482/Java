
public class Customer {
	
	private int customerid;
	private String customerName;
	private String customerAddress;
	
	Customer(int customerID,String customerName,String customerAddress){
		customerid=customerID;
		this.customerName=customerName;
		this.customerAddress=customerAddress;
	}
	
	

	public String getCustomerAddress() {
		return customerAddress;
	}



	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}



	@Override
	public String toString() {
		return "Customer [customerid= " +customerid+  "  customerName=" + customerName + ", customerAddress=" + customerAddress + "]";
	}



	
	
	

}
