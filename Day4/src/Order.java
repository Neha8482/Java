public class Order {

	
	private int order_id;
	private String name;
	private int quantity;
	private float price;
	
	
	public Order(int order_id, String name, int quantity, float price) {
		super();
		this.order_id = order_id;
		this.name = name;
		this.quantity = quantity;
		this.price = price;
	}

	public void getStatus(String OrderStatus) {
		switch(OrderStatus) {
		case "NEW":
			Status status = Status.NEW;
			System.out.println("The possibility of order delivery is "+status.getPossibility());
			break;
		case "REJECTED":
			Status status1 = Status.REJECTED;
			System.out.println("The possibility of order delivery is "+status1.getPossibility());
			break;
		case "ACCEPTED":
			Status status2 = Status.ACCEPTED;
			System.out.println("The possibility of order delivery is "+status2.getPossibility());
			break;
		case "COMPLETED":
			Status status3 = Status.COMPLETED;
			System.out.println("The possibility of order delivery is "+status3.getPossibility());
			break;
		}
		
	}


	public static void main(String[] args) {
	
		Order order = new Order(23,"Kalri",3,56);
		order.getStatus("ACCEPTED");
		
		
	}
}
