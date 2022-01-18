
public class Demo {

	private boolean flag;
	private int num;
	public Demo() {
		this.flag = true;
	}

	public synchronized int getNum() {
		if(flag == true) {
		try {
			wait();
		} catch (InterruptedException  e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
		System.out.println("GET : "+this.num);
		flag = true;
		notify();
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
		System.out.println("SET : "+this.num);
		flag = false;
		notify();	
	}
}
//create Producer THread to access setNum and 
//create Consumer Thread to access getNum