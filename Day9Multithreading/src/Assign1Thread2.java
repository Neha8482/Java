
public class Assign1Thread2 implements Runnable {
	
	private Thread thread;
	public Assign1Thread2() {
		thread = new Thread(this);
		thread.start();
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Pong");
	}

}
