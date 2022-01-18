
public class Ball1 implements Runnable {
	
	private Thread t1;
	private int max_speed;
	private int s =5;
	public Ball1(int max_speed) {
		this.max_speed=max_speed;
		t1= new Thread(this);
		t1.start();
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=s;i < max_speed ; i++) {
			System.out.println("Ball 1 with speed "+i+" UP");
			//System.out.println("UP");
			}
		for(int i = max_speed; i > s;i--)
			 {
			System.out.println("Ball 1 with speed "+i+" DOWN");
			//System.out.println("DOWN");
		}
			}
}
