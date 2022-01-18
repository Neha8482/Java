
public class Labour extends EmployeeComp {

	private int overtime;
	
	
	
	public Labour(String organization, int salary, int overtime) {
		super(organization, salary);
		this.overtime = overtime;
	}



	public static void main(String[] args) {
		Labour labour = new Labour("Steel",5676,6787);
		labour.setOrganization("Steel");
		labour.setSalary(34000);
		labour.overtime=3434;
		
	}
}
