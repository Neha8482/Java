
public class DesertShop {
	
	int noOfItems;
	int cost;
	
	public void Owner(int noOfCandy,int noOfCookie,int noOfIceCream) {
		DesertItem[] desertItem;
		
		desertItem = new Candy[noOfCandy];
		for(int i=0;i<noOfCandy;i++) {
			desertItem[i]=new Candy();
		}
		
		desertItem = new Cookie[noOfCookie];
		for(int i=0;i<noOfCookie;i++) {
			desertItem[i]=new Cookie();
		}
		
		desertItem = new IceCream[noOfIceCream];
		for(int i=0;i<noOfIceCream;i++) {
			desertItem[i]=new IceCream();
		}
		
	}
	public int Customer(int noOfCandy,int noOfCookie,int noOfIceCream) {
		DesertItem[] desertItem;
		
		desertItem = new Candy[noOfCandy];
		for(int i=0;i<noOfCandy;i++) {
			desertItem[i]=new Candy();
			this.cost=this.cost+desertItem[i].getCost();
		}
		
		desertItem = new Cookie[noOfCookie];
		for(int i=0;i<noOfCookie;i++) {
			desertItem[i]=new Cookie();
			this.cost=this.cost+desertItem[i].getCost();
		}
		
		desertItem = new IceCream[noOfIceCream];
		for(int i=0;i<noOfIceCream;i++) {
			desertItem[i]=new IceCream();
			this.cost=this.cost+desertItem[i].getCost();
		}
		return this.cost;
	}
	
	public static void main(String[] args) {
		String role = "Customer";
		int TotalCost;
		DesertShop shop = new DesertShop();
		if(role == "Owner") {
			shop.Owner(14, 10, 8);
		}
		else if(role == "Customer"){
			TotalCost=shop.Customer(6, 9, 4);
			System.out.println(TotalCost);
		}
	}

}
