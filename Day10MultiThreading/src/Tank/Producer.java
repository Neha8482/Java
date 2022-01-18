package Tank;

public class Producer extends Thread{
	private Demo demo;
	int l =0;
	
	public Producer(Demo demo){
		this.demo = demo;
		start();
	}
	
	public void run() {
		l= 4;
		int c =0;
		while(l > 0) {
			demo.setNum(c++);
			l=l-1;
		}
	}
	

}
