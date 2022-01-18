package Tank;

public class Consumer extends Thread {
	private Demo demo;
	int l =0;
	
	public Consumer(Demo demo){
		this.demo = demo;
		start();
	}
	
	public void run() {
		l= 4;
		while(l > 0) {
			System.out.println(demo.getNum());
			l=l-1;
		}
	}
	

}
