/*Create a class Medicine to represent a drug manufactured by a pharmaceutical company.
 * Provide a function displayLabel() in this class to print Name and address of the company. 

Derive Tablet, Syrup and Ointment classes from the Medicine class. Override the displayLabel() 
function in each of these classes to print additional information suitable to the type of medicine. 
For example, in case of tablets, it could be “store in a cool dry place”, in case of ointments it could be “for external use only” etc.

Create a class TestMedicine . Write main function to do the following:
Declare an array of Medicine references of size 10
Create a medicine object of the type as decided by a randomly generated integer in the range 1 to 3. 

Refer Java API Documentation to find out random generation feature. 

Check the polymorphic behavior of the displayLabel() method.

Implement this assignment till then

*/


class Address{
	public String street;
	public String city;
	public Address(String street, String city) {
		super();
		this.street = street;
		this.city = city;
	}
	@Override
	public String toString() {
		return "Address [street=" + street + ", city=" + city + "]";
	}
	
}
class Medicine {
	public String name;
	public Address Address;
	 
	public Medicine(String name, Address address) {
		super();
		this.name = name;
		Address = address;
	}

	public void displayName() {
		System.out.println(this.name);
		System.out.println(this.Address);
	}  
}
class Tablet extends Medicine{
	public String tabname;

	public Tablet(String name, Address address, String tabname) {
		super(name, address);
		this.tabname=tabname;
	}
	public void displayName() {
		System.out.println("Store in dry place");
	} 
}
class Syrup extends Medicine{
	public String spname;

	public Syrup(String name, Address address, String spname) {
		super(name, address);
		this.spname=spname;
	}
	public void displayName() {
		System.out.println("Store in dry place this syrup");
	} 
	
}
class Ointment extends Medicine{
	public String oname;

	public Ointment(String name, Address address, String oname) {
		super(name, address);
		this.oname=oname;
	}
	public void displayName() {
		System.out.println("For exteranl use only");
	} 
	
}
