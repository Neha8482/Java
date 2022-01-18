import java.util.Scanner;

public class StringRegion {
public static void main(String[] args) {
	String string;
	String substring;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the first string");
	string=sc.nextLine();
	System.out.println("Enter the substring");
	substring=sc.nextLine();
	System.out.println(string.regionMatches(0, substring, 0, 1));
}
}
