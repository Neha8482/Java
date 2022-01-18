package Tank;

public class Demo {
	private boolean flag;
	private int num;
	public Demo() {
		flag = true;
	}
	public synchronized int getNum() {
		if(flag == true) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println(this.num);
		flag = true;
		return this.num;
	}
	public synchronized void setNum(int num) {
		if(flag == false) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		this.num = num;
		System.out.println(this.num);
		flag = true;
		notify();
	}
	
	

}
