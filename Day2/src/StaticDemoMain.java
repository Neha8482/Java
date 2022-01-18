
public class StaticDemoMain {

	public static void main(String[] args) {
		StaticDemo demo = new StaticDemo();
		demo.intVar=10;
		System.out.println(demo.intVar);
		
		StaticDemo.staticintVar=20;
		System.out.println(StaticDemo.staticintVar);
		
		demo.displayData();
		StaticDemo.printData();
	}
}
