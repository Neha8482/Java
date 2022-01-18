
public class StaticBlockDEmo {
	static{
		System.out.println("Static Block");
	}
	{
		System.out.println("Instance Block");
	}
	StaticBlockDEmo(){
		System.out.println("constructor");
	}
	//Static blocks are executed main the main method as class is executed
	//We can have multiple static blocks
	public static void main(String[] args) {
		StaticBlockDEmo s = new StaticBlockDEmo();
		System.out.println("Main Method");
	}

}
