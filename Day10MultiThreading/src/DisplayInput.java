
public class DisplayInput extends Thread{
	
	private Input input;

	public DisplayInput(Input input) {
		this.input=input;
		start();
	}
	
	@Override
	public void run() {
		int l= 0;
		while(l < 5) {
			input.getInput();
		}
	}
}
