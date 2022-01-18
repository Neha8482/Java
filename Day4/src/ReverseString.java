import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args) {
		String string;
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		string = sc.nextLine();
		StringBuilder stringBuilder = new StringBuilder(string);
		
		System.out.println(stringBuilder.reverse());
	}

}
