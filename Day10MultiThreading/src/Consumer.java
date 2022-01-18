
public class Consumer extends Thread {

	private Demo demo;
	
	public Consumer(Demo demo) {
		this.demo = demo;
		start();
	}
	
	@Override
	public void run() {
		int l=0;
		while(l < 4) {
		 demo.getNum();
		 l++;
	}
		}
}
