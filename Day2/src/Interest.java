
public class Interest {
	
	public static void main(String[] args) {
	 int principal=100;
     int rate=10;
     int time=3; 
     int number=1;
		double interest = (principal * time * rate) / 100;
		 double Compoundinterest = principal * (Math.pow((1 + rate/100), (time * number))) - principal;

		 System.out.println(interest);
		 System.out.println(Compoundinterest);
	}

}
