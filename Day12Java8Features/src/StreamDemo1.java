import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;



public class StreamDemo1 {
public static void main(String[] args) {
	List<String> names = Arrays.asList("Ram","Seeta","Geeta","Abhimanyu","Shirish","Shlok");
	Stream<String> namesInStream = names.stream();
	
	Stream<String> nameInUpper = namesInStream.map((name) -> name.toUpperCase());//it will iterate convert

	nameInUpper.forEach(System.out::println);//it we just want ot print it the method of stream for each can be used or else convert it back to collection
	
	Stream<String> namesWithS = names.stream();
	Stream<String> res = namesWithS.filter((name) -> name.startsWith("S"));
	res.forEach(System.out::println);
	
	List<Integer> numbers = Arrays.asList(2,3,4,5,6,8,10);
	Stream<Integer> squares = numbers.stream();
	Stream<Integer> res1 = squares.map((number) -> number*number);
	res1.forEach(System.out::println);
	
	
	List<String> memberNames = new ArrayList<>();
	memberNames.add("Amitabh");
	memberNames.add("Shekhar");
	memberNames.add("Ajit");
	memberNames.add("Rahul");
	memberNames.add("Shahrukh");
	memberNames.add("Salman");
	memberNames.add("Yana");
	memberNames.add("Lokesh");
	
	Stream<String> names2 = memberNames.stream();
	Stream<String> res2 = names2.sorted().map((nam) -> nam.toUpperCase());
	res2.forEach(System.out::println);
	
}
}
