import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
public static void main(String[] args) {
	Set<Integer> set = new HashSet<>(); //it gives the random order 
	set.add(45);
	set.add(34);
	set.add(47);
	set.add(50);
	//set.add(78);
	set.add(78);
	set.add(56);
	System.out.println("Hashset: "+set);
	
	 set = new LinkedHashSet<>(); //in the same order as in the input
	set.add(45);
	set.add(34);
	set.add(47);
	set.add(50);
	//set.add(78);
	set.add(78);
	set.add(56);
	System.out.println("LinkedHashset: "+set);
	
	set = new TreeSet<>(); //sorted ouput
	set.add(45);
	set.add(34);
	set.add(47);
	set.add(50);
	//set.add(78);
	set.add(78);
	set.add(56);
	System.out.println("Treeset: "+set);
	
	
}
}
