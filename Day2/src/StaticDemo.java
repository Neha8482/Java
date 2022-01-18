
public class StaticDemo {
	
	static {
		System.out.println("Static");
	}
	StaticDemo(){
		System.out.println("constructor");
	}
	int intVar;
	static int staticintVar;
	
	public void displayData() {
		System.out.println(this.intVar);
		intVar = 100;
		staticintVar=200;
		
	}
	
	public static void printData() {
		staticintVar = 300;
		StaticDemo demo = new StaticDemo();
		demo.intVar=400;
		
	}

}
