
public class Producer extends Thread{

	private Demo demo;

	public Producer(Demo demo) {
		this.demo=demo;
		start();
	}
	@Override
	public void run() {
		int counter = 0;
		int l = 0;
		while(l< 4) {
			demo.setNum(counter++);
			l++;
		}
	}
}
