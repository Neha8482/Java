package Hotel;

public enum Food {

	JAN(20),FEB(20),MAR(20),APR(10),MAY(20),JUN(10),JUL(10),AUG(10),SEP(5),OCT(5),NOV(20),DEC(20);

	double discount;
	Food(double discount) {
		// TODO Auto-generated constructor stub
		this.discount=discount;
	}
	
	public double getdiscount() {
		return this.discount;
	}
}
