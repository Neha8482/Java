import java.util.Scanner;

public class TotalNoOfCharacters {

	public static void main(String[] args) {
		int count =0;
		String string ;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the string");
		string = sc.nextLine();
		System.out.println("Enter the range to find number of characters within that range");
		int index1=sc.nextInt();
		int index2 = sc.nextInt();
		for(int i = index1-1; i < index2;i++) {
			if(string.charAt(i) != ' ') {
				count = count + 1; 
			}
		}
		System.out.println("The number of characters are "+count);
	}
}
