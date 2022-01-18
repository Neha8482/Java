
public class RunnableDemo implements Runnable {
	
	private Thread thread;
	public RunnableDemo(String name) {
		thread = new Thread(this);
		thread.setName(name);
		thread.start();
	}
	

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Inside run");
		for(int i =0 ;i< 10 ; i++) {
			System.out.println(thread.getName()+": "+i);
			try {
				Thread.sleep(2000); // paused state
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	public static void main(String[] args) {
		RunnableDemo o1 = new RunnableDemo("ONE");
	//	Thread t1 = new Thread(); in case of this in t1.start run method defined by Thread class will be called so to call the run of this class object of this class is passed into Thread constructor like in next stmt
	//	Thread t1 = new Thread(o1);
	
		
		for(int i =0; i< 10 ; i++) {
			
			System.out.println("Main method: "+i);
	}
	}
}
