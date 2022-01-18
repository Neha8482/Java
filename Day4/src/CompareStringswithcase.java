import java.util.Scanner;

/*
 * Write a Java program to compare two strings lexicographically, ignoring case differences.
 */
public class CompareStringswithcase {
public static void main(String[] args) {
	String string1;
	String string2;
	int count = 0;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter First String");
	string1 = sc.nextLine().toLowerCase();
	System.out.println("Enter Second String");
	string2 = sc.nextLine().toLowerCase();
	
	if(string1.equals(string2)) {
		System.out.println("Same");
	}
	else {
		System.out.println("Not same");
	}
	
/*	if(string1.length() == string2.length()) {
		for(int i=0; i < string1.length();i++) {
			if(string1.charAt(i) == string2.charAt(i)) {
				count= count+1;
			}
			
		}
		if(count==string1.length()) {
			System.out.println("Two strings are same");
		}
		else {
			System.out.println("Two strings are not same");
		}
	}
	else {
		System.out.println("Two entered strings are not equal lexicographically");
	}
	*/
}

}
