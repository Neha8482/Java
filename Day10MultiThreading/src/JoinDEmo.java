class Threads extends Thread{
	public void run() {
		
		// TODO Auto-generated method stub
		super.run();
		for(int i=0 ; i < 3 ; i++) {
			System.out.println(this.getName());
		}
	}
}

public class JoinDEmo {
	public static void main(String[] args) {
		Threads t1 = new Threads();
		Threads t2 = new Threads();
		Threads t3 = new Threads();
		
		t1.start();
		t2.start();
		t3.start();
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//t2.start();
		try {
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	//	t3.start();
		try {
			t3.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
