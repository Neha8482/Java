
public interface Interface1 {

	public void m1();
	public void m2();
	public default void m3() {
		System.out.println("m3");
	}
	
	public static void m4() {
		System.out.println("m4");
	}
}
