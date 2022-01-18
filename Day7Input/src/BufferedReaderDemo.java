import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderDemo {
	public static void main(String[] args) {
		BufferedReader inputFromUser = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			String name = inputFromUser.readLine();
			System.out.println(name);
			int num1 = Integer.parseInt(inputFromUser.readLine());
			int num2 = Integer.parseInt(inputFromUser.readLine());
			System.out.println(num1 + num2);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
