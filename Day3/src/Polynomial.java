public class Polynomial {

	double area;
	
	public void calcArea(double l, double b) {
		area = l*b + (l* 2.5) + ( l * b * 2.5);
	}
	public void displayArea() {
		System.out.println("Area is : "+area);
	}
}
