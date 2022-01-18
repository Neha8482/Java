
public enum Payment {

	DEBITCARD(2),CREDITCARD(3),NETBANKING(0);
	
	int charges;
	
	private Payment(int charges) {
		this.charges=charges;
	}
	
	public int getCharges() {
		return charges;
	}
}
