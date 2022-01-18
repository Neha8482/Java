package ReadFileAssign;

public class GetFile {
	
	private int num;
	private boolean flag;
	
	GetFile(){
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
		int fact = 1;
		for(int k =num; k > 1;k--) {
			fact=fact *k;
		}
		System.out.println("Factorial of the number is "+fact);
		flag = true;
		notify();
		return num;
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
		System.out.println("The number in the file is "+num);
		flag = false;
		notify();
	}
	
	

}
