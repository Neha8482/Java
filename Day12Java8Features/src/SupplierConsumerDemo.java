import java.util.function.Supplier;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class SupplierConsumerDemo {
public static void main(String[] args) {
	Supplier<Integer> num = Test::getNumber;
	Consumer<Integer> square = Test::calculateSquare;
	square.accept(num.get());
	
	List<Integer> aList = new ArrayList<>();
	aList.add(num.get());
	
}
}

class Test{
	public static int getNumber() {
		return 10;
	}
	public static void calculateSquare(int num) {
		System.out.println("Square of "+num+" is "+num*num);
	}
}