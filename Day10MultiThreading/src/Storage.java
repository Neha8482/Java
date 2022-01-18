import java.util.ArrayList;
import java.util.List;

/*Implement three classes: Storage, Counter and Printer.

The Storage class should store an integer. 
The Counter class should create a thread and starts counting from 0 (0,1,2,3…) and stores each value in the Storage class. 
The Printer  Class should create a thread that keeps reading the value in the Storage class and printing it.

Write a program that creates an instance of the Storage class and set up a Counter and Printer object to operate on it.

Identify that, whether synchronization is required or not in this assignment. If yes, implement it.
       
 * 
 */
public class Storage{
	
	private int num;
	private boolean flag;
	
	Storage(){
		flag = true;
	}
	
	List<Integer> list1 = new ArrayList<>();

	public synchronized int getNum() {
		if(flag == true) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Printer : "+this.num);
		System.out.println(list1);
		flag= true;
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
		list1.add(this.num);
		System.out.println("Counter : " +num);
		flag=false;
		notify();
	}
	
	


}
