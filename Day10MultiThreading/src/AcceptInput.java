import java.util.Scanner;

/*
 * Thread1 - accept input from user
Thread2 - write that input from user into a file

 */
public class AcceptInput extends Thread{
	
	private Input input;
	public AcceptInput(Input input) {
		this.input=input;
		start();
	}
	
	@Override
		public void run() {
		int number;
		int l = 0;
		Scanner sc = new Scanner(System.in);
		while(l< 5) {
		System.out.println("Enter the number");
		number = sc.nextInt();
		input.setInput(number);
		l++;
		}
		}
}
