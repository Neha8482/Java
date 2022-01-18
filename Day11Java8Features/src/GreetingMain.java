import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class GreetingMain {
public static void main(String[] args) {
	Greeting1 greeting = new GoodMorning();
	greeting.greet();
	
 greeting = new GoodAfternoon();
	greeting.greet();
	
	Greeting1 greeting2 = new Greeting1() {
		@Override
		public void greet() {
			System.out.println("Hello from Anonymous class");
		}
	};
	
	List<Integer> l = new ArrayList<>();
	l.add(10);
	l.add(20);
	l.add(30);
	l.add(45);
	
	Optional<Integer> l1 = l.stream().reduce((a,b) -> a+b);
	System.out.println(l1.get());
	greeting2.greet();
	
	Greeting1 greeting3 = () -> System.out.println("Hello from Lambda Expression");
	greeting3.greet();
	/*
	Greeting1 greeting3 = () -> "Hello";
	System.out.println(greeting3.greet());
	
	Greeting1 greeting3 = () -> return "Hello";
	System.out.println(greeting3.greet());
	
	Greeting greeting3 = (String name) -> return "Hello"+name;
	System.out.println(greeting.greet("Neha"));
	
	
	*/
}
}
