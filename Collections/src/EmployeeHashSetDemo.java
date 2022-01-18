import java.util.Set;
import java.util.TreeSet;

public class EmployeeHashSetDemo {
public static void main(String[] args) {
	  //Set<Student> student = new TreeSet<>(new RollNoComparator());
	Set<Employee> emp = new TreeSet<>(new SalaryComparator());
	emp.add(new Employee(101,"Shweta",6700,"Manager"));
	emp.add(new Employee(102,"Vijay",5645,"Clerk"));
	emp.add(new Employee(104,"Juhi",7877,"CEO"));
	emp.add(new Employee(106,"Arya",9800,"Developer"));
	emp.add(new Employee(108,"Priya",4500,"Tester"));
	emp.add(new Employee(111,"Harshita",6700,"CFO"));
	System.out.println(emp);
}
}


