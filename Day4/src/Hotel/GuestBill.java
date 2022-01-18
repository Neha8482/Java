package Hotel;

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
		switch(month) {
		case "FEB":
		case "MAR":
		case "NOV":
		case "DEC":
		case "JAN":
			RoomRent rent = RoomRent.JAN;
			discount=rent.getdiscount()/100 * this.roomrent;
			Food food = Food.JAN;
			discount = discount + (food.getdiscount()/100 * this.food);
			break;
		case "APR":
		case "MAY":
		case "JUN":
		case "JUL":
		case "AUG":
			RoomRent rent1 = RoomRent.AUG;
			discount=rent1.getdiscount()/100 * this.roomrent;
			Food food1 = Food.AUG;
			discount = discount + (food1.getdiscount()/100 * this.food);
			break;
		case "OCT":
		case "SEP":
			RoomRent rent2 = RoomRent.JAN;
			discount=rent2.getdiscount()/100 * this.roomrent;
			Food food2 = Food.JAN;
			discount = discount + (food2.getdiscount()/100 * this.food);
			break;
		}
		return discount;
	}
	
	public void calcTotal(double discount2) {
	totalPayableAmount = this.food+this.roomrent - discount2;
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
