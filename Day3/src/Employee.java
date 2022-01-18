
public class Employee extends Person {

	private int Empid;
	private String designation;
	
	public Employee(String name,int age,int empid, String designation) {
		super(name,age);
		this.Empid = empid;
		this.designation = designation;
	}

	public int getEmpid() {
		return Empid;
	}
	public void setEmpid(int empid) {
		Empid = empid;
	}
	
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}

	@Override
	public String toString() {
		return "Employee [Empid=" + Empid + ", designation=" + designation + "]";
	}
	
	
}
