import java.util.Scanner;

/*
 * Write a Java program to test if a given string contains the specified sequence of char values.
 * 
 */
public class StringContains {
public static void main(String[] args) {
	String string;
	String substring;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the String");
	string = sc.nextLine();
	System.out.println("Enter the string to check");
	substring=sc.next();
	System.out.println(string.contains(substring));
	
}
}
