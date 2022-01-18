
public class Resource {
public synchronized void printMsg(String msg) {
	System.out.println("[" + msg);
	
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.print("]");
}


}
