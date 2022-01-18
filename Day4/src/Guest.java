import Hotel.Food;
import Hotel.GuestBill;
import Hotel.RoomRent;

/*
 * A hotel in M’shwar is offering following discounts on room rent & food to their customers.
a.	50% discount on room rent & 20% on food in the month of Nov, Dec, Jan, Feb, Mar.
b.	20% discount on room rent & 10% discount on food in the month of Apr, May, Jun, July & Aug.
c.	10% discount on room rent & 5% discount on food in the month of Sept, Oct.
Design a class Guest_Bill as
		guestName 			String
		month			String
		roomrent			double
		food				double
Define setter & getter methods for all the above properties. Store this class in a package hotel.
Create an array of this class by importing it in some other program for 3 guests. Read details of guest from user by using setter & getter methods & store them in an array. The details may be like this
P.C.Mathur		July		2000.00		3000.00
Calculate the room rent, food & then net payable amount considering above slabs.

Display the bill for each guest in following format.
Hotel Paradise
Name: P.C. Mathur

Room Rent	: 	2000.00
Food		:	3000.00
Discount	:	  700.00
   Net payable amount 	 4300.00
 */
public class Guest {
	
	public static void main(String[] args) {
		double discount ;
		
		GuestBill[] bill = new GuestBill[3];
		bill[0]= new GuestBill();
		bill[0].setGuestName("P.C.Mathur");
		bill[0].setMonth("JUL");
		bill[0].setRoomrent(2000);
		bill[0].setFood(3000);
		
		discount = bill[0].calcdiscount(bill[0].getMonth());
		bill[0].calcTotal(discount);
		System.out.println(bill[0]);
		
	
		
		
	}

}
