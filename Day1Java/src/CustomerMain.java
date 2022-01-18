
public class CustomerMain {

	public void modifyAddress(String Address,Customer cus) {
		cus.setCustomerAddress(Address);
	}
	public static void main(String[] args) {
		Customer cust= new Customer(23,"shital","Shade park");
		Customer cust2= new Customer(25,"rg","gngftbnf");
		Customer cust3= new Customer(27,"vb ","defedfved");
		CustomerMain cusain = new CustomerMain();
		cusain.modifyAddress("Park Road", cust);
		System.out.println(cust);
		System.out.println(cust2);
		System.out.println(cust3);
		
		Customer[] customers;
		customers = new Customer[3];
		customers[0] = new Customer(2,"firti","Pune");
		customers[1]=new Customer(3,"Shary","Katraj");
		customers[2]=new Customer(6,"Shakal","Lalatipur");
		
		for(Customer i :customers) {
			System.out.println(i);
		}
		
		
		
	}
}
