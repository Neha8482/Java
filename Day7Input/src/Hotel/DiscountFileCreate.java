package Hotel;

import java.io.FileWriter;
import java.io.IOException;

public class DiscountFileCreate {
public static void main(String[] args) {
	String fileContent = "Month:roomrent_discount:food_discount\r\n"
			+ "Nov, Dec, Jan, Feb, Mar: 50:20\r\n"
			+ "Apr, May, Jun, July, Aug:20:10\r\n"
			+ "Sept, Oct:10:5\r\n";
	try {
		FileWriter file = new FileWriter("Discount.txt");
		file.write(fileContent);
		file.close();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
