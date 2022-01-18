public class Employee1 {
	private int empNumber;
	private String empName;
	Date date;
	
	public Employee1(int empNumber,String empName,Date date){
		this.empName=empName;
		this.empNumber=empNumber;
		this.date=date;
	}

	@Override
	public String toString() {
		return "Employee1 [empNumber=" + empNumber + ", empName=" + empName + ", date=" + date + "]";
	}
	
	
}
