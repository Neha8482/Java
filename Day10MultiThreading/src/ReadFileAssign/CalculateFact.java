package ReadFileAssign;

public class CalculateFact extends Thread{

	private GetFile file;
	public CalculateFact(GetFile file) {
		this.file = file;
		start();
	}
	
	@Override
	public void run() {
		int i=0;
		while(i<5) {
			 file.getNum();
			i++;
		}
	}
}
