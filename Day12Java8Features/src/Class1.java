
public class Class1 implements Interface1,Interface2{

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		System.out.println("m1");
		
	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		System.out.println("m2");
	}

	

	@Override
	public void m3() {
		// TODO Auto-generated method stub
		Interface2.super.m3();
		Interface1.super.m3();
		
	}

	public static void main(String[] args) {
		Interface1 c = new Class1();
		c.m1();
		c.m2();
		c.m3();
	   Interface1.m4();
	}

}
