
public class Cat  implements Animal{

	@Override
	public void speak() {
		// TODO Auto-generated method stub
		System.out.println("Meaw");
	}
	 
	 int variable =20;
	

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Milk and Rats");
		System.out.println(variable);
	}

}
