public class Complex {
	private float a1,a2,a3,b1,b2,b3,a4,b4;
	
	public Complex(){
		a1=3;a2=7;
		b1=5;b2=4;
	}
	
	public float add(float a1,float a2) {
		return a1+a2;
	}
	
	public float sub(float a1,float a2) {
		return a1-a2;
	}
	
	public void display() {
		System.out.println("The complex number is "+a1+" + "+b1+"i");
		System.out.println("Sum of "+a1+" + "+b1+"i and "+a2+" + "+b2+"i"+" is : "+a3+" + "+b3+"i");
		System.out.println("Subtraction of "+a1+" + "+b1+"i and "+a2+" + "+b2+"i"+" is : "+a4+" + "+b4+"i");
	}
	
	public static void main(String[] args) {
		Complex comp= new Complex();
		comp.a3=comp.add(comp.a1,comp.a2);
		comp.b3=comp.add(comp.b1,comp.b2);
		
		comp.a4=comp.sub(comp.a1,comp.a2);
		comp.b4=comp.sub(comp.b1,comp.b2);
		
		comp.display();
		
	}

	
}
