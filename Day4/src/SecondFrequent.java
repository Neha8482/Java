import java.util.Scanner;

public class SecondFrequent {
	
	public static void main(String[] args) {

		String string;
		int max=0;
		int secondMax=0;
		char result = 0;
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter the string");
		string = sc.nextLine();
		
		int[] count = new int[256];
		
		for(int i=0 ; i < string.length();i++) {
			count[string.charAt(i)]++;
		}
		
		for(int i =0 ; i < string.length();i++) {
			if(max < count[string.charAt(i)]) {
				max=count[string.charAt(i)];
			}
		}
		for(int i =0 ; i < string.length();i++) {
			if(secondMax < count[string.charAt(i)] && count[string.charAt(i)]< max) {
				secondMax=count[string.charAt(i)];
				result=string.charAt(i);
			}
		}
		
		System.out.println("The second frequent character is "+result);
		

	}	
}
