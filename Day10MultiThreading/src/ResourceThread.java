
public class ResourceThread extends Thread {

	private Resource resource;
	private String msg;
	
	ResourceThread(Resource resource,String msg){
		this.resource= resource;
		this.msg = msg;
		start();
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		resource.printMsg(msg);
	}
}
