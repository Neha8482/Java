import java.util.Scanner;

public class Input {

	private int input;
	private boolean flag;
	
	public Input() {
		flag = true;
	}
	public synchronized int getInput() {
		
		if(flag == true) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		//System.out.println("Input is : "+input);
		flag = true;
		notify();
		return input;
	}
	public synchronized void setInput(int input) {
		if(flag == false) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		this.input = input;
		System.out.println("The input entered is "+input);
		flag = false;
		notify();
	}
	
	
	
}
