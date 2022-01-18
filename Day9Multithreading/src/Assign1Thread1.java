
public class Assign1Thread1 implements Runnable{
	
	private Thread thread;
	public Assign1Thread1() {
		thread = new Thread(this);
		thread.start();
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Ping");
	}
}
