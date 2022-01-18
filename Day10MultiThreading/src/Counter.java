
public class Counter extends Thread {
	
	private Storage storage;

	public Counter(Storage storage) {
		this.storage = storage;
		start();
	}
	
	@Override
	public void run() {
		int counter =0 ;
		int l=0;
		while(l<10) {
			storage.setNum(counter++);
			l++;
		}
	}
}
