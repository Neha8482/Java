public class EmployeeUtility {
	Employee[] employees= new Employee[10];
	private static int count;
	
	public void createEmployee(String EmpName,String EmpAddress,String Empemail,String Empdesignation) {
		employees[count]=new Employee();
		employees[count].add(count++, EmpName, EmpAddress, Empemail, Empdesignation);	
	}
	
	public void displayAllEmployees() {
		for(int i=0;i<count;i++) {
			System.out.println(employees[i]);
		}
	}
	
	public void displayEmployeeDetails(int id) {
		if(id<count) {
		System.out.println(employees[id]);
		}
		else {
			System.out.println("Employee with "+id+"doesn't exist");
		}
	}
	public static void main(String[] args) {
		EmployeeUtility employeeutil= new EmployeeUtility();
		employeeutil.createEmployee("Pragati","Park Road","pragati@gmail.com","Manager");
		employeeutil.createEmployee("Shalvi","Katraj","shalvi@gmail.com","Recruiter");
		employeeutil.createEmployee("Shashit","Sion","shashit@gmail.com","Developer");
		employeeutil.createEmployee("Lary","Ring Road","lary@gmail.com","COO");
		employeeutil.displayAllEmployees();
		employeeutil.displayEmployeeDetails(3);
		
	}
	

}
