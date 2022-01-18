package Hotel;

public enum RoomRent {
	
	JAN(50),FEB(50),MAR(50),APR(20),MAY(20),JUN(20),JUL(20),AUG(20),SEP(10),OCT(10),NOV(50),DEC(50);

	double discount;
	RoomRent(double discount) {
		// TODO Auto-generated constructor stub
		this.discount=discount;
	}
	
	
	public double getdiscount() {
		return this.discount;
	}

}
