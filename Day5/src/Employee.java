
public class Employee {
	
	private int empId;
	private String empName;
	private String designation;
	private int basic;
	private int hra;
	
	
	
	public Employee(int empId, String empName, String designation, int basic) throws LowSalException {
		this.empId = empId;
		this.empName = empName;
		this.designation = designation;
		if(basic < 500) {
			throw new LowSalException();
		}
		else {
			this.basic = basic;
		}
	}

	public void calculateHRA(String designation) {
		switch(designation) {
		case "Manager":
			this.hra = this.basic * 10/100;
			break;
		case "Officer":
			this.hra = this.basic * 12/100 ;
			break;
		case "Clerk":
			this.hra = this.basic * 5/100 ;
			break;
		}
		
	}
	public String printDET() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", designation=" + designation + ", basic=" + basic
				+ ", hra=" + hra + "]";
		
	}
	public static void main(String[] args) {
		try {
			Employee employee = new Employee(23,"shital","Manager",2000);
			employee.calculateHRA(employee.designation);
			 System.out.println(employee.printDET());
		} catch (LowSalException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
