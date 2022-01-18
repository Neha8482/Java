import java.util.Scanner;
public class StringEndswith {
	public static void main(String[] args) {
		String string;
		String substring;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		string = sc.next();
		System.out.println("Enter the string to check");
		substring = sc.next();
		if(string.endsWith(substring)) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
	}

}
