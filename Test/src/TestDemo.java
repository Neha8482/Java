import java.util.Hashtable;
import java.util.LinkedList;

abstract class A{
	int i=10;
	abstract void dis();
}
class B extends A{
	int i;
	void dis() {
		System.out.println(i);
	}
}

public class TestDemo {
	
	public static void main(String[] args) {
	String[][] ac = new String[2][2];
	int x;
	ac[0]= args;
	x= ac[0].length;
	for(int y=0;y<x;y++) {
		System.out.println(" " + ac[0][y]);
	}
	
	}
}
