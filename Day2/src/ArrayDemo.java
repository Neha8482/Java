
public class ArrayDemo {
	public static void main(String[] args) {
		//int intVar = 10;
		
		int[] marks; //declaration of an array
		marks = new int[5];//initialization of array
		marks[0]=10;
		marks[1]=20;
		marks[2]=30;
		marks[3]=40;
		marks[4]=50;
		
		for(int i=0; i < marks.length;i++) {
			System.out.println(marks[i]);
		}
		
		for(int i :marks) {
			System.out.println(i);
		}//initialization cannot be done using for loop
		
		String[] names = {"Arti","Aditi","Alvira"};
		for(String i:names) {
			System.out.println(i);
		}
		
	}

}
