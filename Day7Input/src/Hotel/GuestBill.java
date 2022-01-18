package Hotel;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class GuestBill {
	private String guestName;
	private String month;
	private double roomrent;
	private double food;
	
	double totalDiscount;
	double totalPayableAmount;
	
	
	public String getGuestName() {
		return guestName;
	}
	public void setGuestName(String guestName) {
		this.guestName = guestName;
	}
	public String getMonth() {
		return month;
	}
	public void setMonth(String month) {
		this.month = month;
	}
	public double getRoomrent() {
		return roomrent;
	}
	public void setRoomrent(double roomrent) {
		this.roomrent = roomrent;
	}
	public double getFood() {
		return food;
	}
	public void setFood(double food) {
		this.food = food;
	}
	
double discount;
	
	public double calcdiscount(String month) {
		BufferedReader reader = null;
		try {
			reader = new BufferedReader(new FileReader("Discount.txt"));
			reader.readLine();
		String line;
		String[] linesplit; 
		int room_dis;
		int food_dis;
		switch(month) {
		case "FEB":
		case "MAR":
		case "NOV":
		case "DEC":
		case "JAN":
				line = reader.readLine();
				linesplit = line.split(":",3);
				room_dis = Integer.parseInt(linesplit[1]);
				food_dis = Integer.parseInt(linesplit[2]);
				discount= this.roomrent * room_dis/100 ;
				discount = discount + ( this.food * food_dis/100 );
			break;
		case "APR":
		case "MAY":
		case "JUN":
		case "JUL":
		case "AUG":
				reader.readLine();
				line = reader.readLine();
				linesplit = line.split(":",3);
				room_dis = Integer.parseInt(linesplit[1]);
				food_dis = Integer.parseInt(linesplit[2]);
				discount= this.roomrent * room_dis/100 ;
				discount = discount + ( this.food * food_dis/100 );
			break;
		case "OCT":
		case "SEP":
				reader.readLine();
				reader.readLine();
				line = reader.readLine();
				linesplit = line.split(":",3);
				room_dis = Integer.parseInt(linesplit[1]);
				food_dis = Integer.parseInt(linesplit[2]);
				discount= this.roomrent * room_dis/100 ;
				discount = discount + ( this.food * food_dis/100 );
			break;
		}
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return discount;
	}
	
	public void calcTotal(double discount2) {
	totalPayableAmount = this.food+this.roomrent - discount2;
	}
	
	public static void main(String[] args) {
		
		System.out.println("Method executed");
	}
	
	@Override
	public String toString() {
		return "Hotel Paradise"+"\n" +"Name :" + guestName
			+"\n"	+ "Month :" + month
			+ "\n"+	"Roomrent :" + roomrent 
			+ "\n"	+ "Food :" + food  
		+ "\n"		+ "Discount :" + discount 
			+ "\n\t"	+ "Net Payable Amount   " + totalPayableAmount ;
	}	

}
