
public class Printer extends Thread{
	
	private Storage storage;

	public Printer(Storage storage) {
		this.storage = storage;
		start();
	}
	
	@Override
	public void run() {
		int l =0;
		while(l < 10) {
			storage.getNum();
			l++;
		}
	}
}
