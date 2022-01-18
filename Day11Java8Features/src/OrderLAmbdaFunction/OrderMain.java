package OrderLAmbdaFunction;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * Write an application using lambda expressions to print Orders 
 * having 2 criteria implemented: 1) order price more than 10000 
 * 2) order status is ACCEPTED or COMPLETED.
 */
class Order{
	private String item;
	private int price;
	private String status;
	public Order(String item, int price, String status) {
		super();
		this.item = item;
		this.price = price;
		this.status = status;
	}
	
	public Order() {
		// TODO Auto-generated constructor stub
	}

	public int sortOrder(Order o1) {
		if(o1.price > 1000 && o1.status == "ACCEPTED") {
			return 1;
		}
		else {
			return -1;
		}
	}
	
	@Override
	public String toString() {
		return "Order [item=" + item + ", price=" + price + ", status=" + status + "]";
	}
	
	
	
}

public class OrderMain {
	public static void main(String[] args) {
		
		List<Order> list = new ArrayList<>();
	     list.add(new Order("Pizza",2000,"ACCEPTED"));
		 list.add(new Order("Burger",5600,"COMPLETED"));
	     list.add(new Order("Fries",120,"REJECTED"));
	     
	     for(Order o : list) {
	     Order or = new Order();
	     if(or.sortOrder(o) >= 1) {
	    	 System.out.println(o);
	     }
	     }
	    // Collections.sort(list, Order :: sortOrder);
	    // System.out.println(list);
	}

}
