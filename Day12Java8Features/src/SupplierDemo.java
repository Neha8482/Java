import java.util.function.Supplier;
import java.util.Date;
public class SupplierDemo {

	public static Date getDate() {
		return new Date();
	}
	public static void main(String[] args) {
		
		//non-static
		Supplier<String> stringObject = () -> new String("Hello World");
		System.out.println(stringObject.get());
		
		//static
		Supplier<Date> dateObject = SupplierDemo::getDate;
		Date today = dateObject.get();
		System.out.println(today);
		
		
		Supplier<Integer> addition = ClassDemo::addData;
		System.out.println(addition.get());
		
	}
}
