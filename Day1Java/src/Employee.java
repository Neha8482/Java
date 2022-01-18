
public class Employee {
	private int empID;
	private String empName;
	private String designation;
	
	public Employee() {
	empID = 234;
	empName="shanti";
	designation="Developer";
	}
	public Employee(int empID,String empName,String designation) {
		this.empID=empID;
		this.empName=empName;
	    this.designation=designation;
	}

	@Override
	public String toString() {
		return "Employee [empID=" + empID + ", empName=" + empName + ", designation=" + designation + "]";
	}
	

}
