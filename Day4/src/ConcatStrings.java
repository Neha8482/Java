import java.util.Scanner;

public class ConcatStrings {

	public static void main(String[] args) {
		String string1;
		String string2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first String");
		string1 = sc.nextLine();
		System.out.println("Enter second String");
		string2 = sc.nextLine();
		String string3=string1.concat(string2);
		System.out.println("The string after concatenation is");
		System.out.println(string3);
	}
}
