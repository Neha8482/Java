
public class EmployeeComp {
	
	private String Organization;
	private int salary;
	
	
	
	public EmployeeComp(String organization, int salary) {
		super();
		this.Organization = organization;
		this.salary = salary;
	}
	public String getOrganization() {
		return Organization;
	}
	public void setOrganization(String organization) {
		Organization = organization;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "EmployeeComp [Organization=" + Organization + ", salary=" + salary + "]";
	}
	
	
	

}
