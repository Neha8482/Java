
public class Manager extends EmployeeComp {
	
	private String name;
	private int age;

	private int incentives;
	
	
	
	public Manager(String organization, int salary, String name, int age, int incentives) {
		super(organization, salary);
		this.name = name;
		this.age = age;
		this.incentives = incentives;
	}



	public static void main(String[] args) {
		Manager employee = new Manager("Steel",56788,"Kalish",54,6778);
		
		System.out.println(employee);
		employee.setOrganization("Steel");
		employee.setSalary(560000);
		employee.name="Hartisd";
		employee.age=34;
		employee.incentives=4566;
	}
	

}
