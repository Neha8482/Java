
public class User implements ModeOfPayments{
	
	public static void main(String[] args) {
		Payment payment = Payment.DEBITCARD;
		
		System.out.println("User selected mode of Payment as : "+payment);
	
		String paymentModeByUser = "CreditCard";
		Payment[] paymentModes = Payment.values();
		for(Payment payment2 : paymentModes) {
			System.out.println(payment2);
			System.out.println(payment2.toString().equals(paymentModeByUser.toUpperCase()));
			
			System.out.println(payment2.equals(Payment.valueOf(paymentModeByUser.toUpperCase())));
		}
		
		double amount = 1000.00;
		
		int charge = payment.getCharges();
		System.out.println(amount+charge);
		
	
		
	
	}
	
}
