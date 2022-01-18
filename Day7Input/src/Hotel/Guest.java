package Hotel;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Guest {
public static void main(String[] args) {
	double discount ;
	BufferedReader bufferReader = null;
	
	bufferReader = new BufferedReader(new InputStreamReader(System.in));
	
	GuestBill[] bill = new GuestBill[3];
	bill[0]= new GuestBill();
	
	try {
		System.out.println("Enter the Guest Name");
		bill[0].setGuestName(bufferReader.readLine());
		System.out.println("Enter the month");
		bill[0].setMonth(bufferReader.readLine().toUpperCase().substring(0, 3));
		System.out.println("Enter the RoomRent Amount");
		bill[0].setRoomrent(Double.parseDouble(bufferReader.readLine()));
		System.out.println("Enter the Food Amount");
		bill[0].setFood(Double.parseDouble(bufferReader.readLine()));
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	discount = bill[0].calcdiscount(bill[0].getMonth());
	bill[0].calcTotal(discount);
	System.out.println(bill[0]);
	
}

}
