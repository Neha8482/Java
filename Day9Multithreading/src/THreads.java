
public class THreads extends Thread {
	
	public THreads(String name) {
		setName(name);
		start();
	}
	@Override
	//3.Running state - run method / thread execution in process
		public void run() {
			// TODO Auto-generated method stub
		System.out.println("Inside run");
		for(int i =0 ;i< 10 ; i++) {
			System.out.println(this.getName()+": "+i);
			try {
				sleep(2000); // paused state
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		}
	
	//4. Dead state - thread execution is complete
public static void main(String[] args) {
	//1. New born state - thread object is created
	THreads t1 = new THreads("ONE");
	THreads t2 = new THreads("TWO");
	THreads t3 = new THreads("THREE");
	
	System.out.println(t1);
	System.out.println(t2);
	System.out.println(t3);
	
	//t1.start();
	//t2.start();
	//t3.start();//developer will not have any control after this/runnable state
	for(int i =0; i< 10 ; i++) {
	
		System.out.println("Main method: "+i);
	}

	//System.out.println("Main");
	//2. Ready state - calling start method
	
}
}
