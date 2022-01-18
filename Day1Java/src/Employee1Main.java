
public class Employee1Main {
	

	public void display(Employee1 employee1) {
		System.out.println(employee1);
	}
	
	
	public static void main(String[] args) {
		Employee1Main employee1Main = new Employee1Main();
		Employee1 employee1 = new Employee1(23,"dfe",new Date("dvd",23,2001));
		employee1Main.display(employee1);
		
	}

}
