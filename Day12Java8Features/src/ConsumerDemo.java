import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
public class ConsumerDemo {

	static void printMessage(String name) {
		System.out.println("Hello "+name);
	}
	static void printValue(int val) {
		System.out.println(val);
	}
	
	public static void printList(List<Integer> listOfIntegers,Consumer<Integer> consumer) {
		for(Integer integer:listOfIntegers) {
		consumer.accept(integer);	
		}
	}
	
	public static void main(String[] args) {
		Consumer<String> consumer1 = ConsumerDemo::printMessage;
		consumer1.accept("John");
		
		Consumer<Integer> consumer2 = ConsumerDemo::printValue;
		consumer2.accept(12);
		
		Consumer<String> consumer3 = name -> System.out.println("Hello "+name);
		consumer3.accept("Smith");
		
		Consumer<Integer> consumer4 = value -> System.out.println("Square of "+value+" is "+value*value);
		consumer4.accept(12);
		
		Consumer<Integer> consumer = i -> System.out.println(" "+i);
		List<Integer> integerList = Arrays.asList(1,10,100,200,101,-10,0);
		printList(integerList,consumer);
		
		Consumer<Integer> consumerWithAndThen =consumer.andThen(i -> System.out.println(" (printed "+i+")"));
		List<Integer> integerList1 = Arrays.asList(1,10,100,200,101,-10,0);
		printList(integerList1,consumerWithAndThen);
	}
	
}
