
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class employeeOps {
	
	public List<String> operation(List<Employee> emp){
		Stream<Employee> e = emp.stream();
		
		Stream<Employee> el = e.filter((employee) -> (employee.getSalary() > 20000)).filter(employee -> (employee.getDeptNo() == 10));
		List<String> emps = el.map(ep -> ep.getEname()).collect(Collectors.toList());
		Collections.sort(emps);
		return emps;
		
	}
/*
 * salary 20000 se zyda and department 10 jiska ho filter krky
name se sort krna hai

 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> empList= new ArrayList<>();
		empList.add(new Employee(1, "Onkar", "Trainer", 50000,10));
		empList.add(new Employee(2, "Amit", "Admin", 30000,20));
		empList.add(new Employee(3, "Rahul", "HR", 40000,30));
		empList.add(new Employee(4, "Ajay", "Trainer", 55000,10));
		empList.add(new Employee(5, "Kiran", "Admin", 35000,20));
		empList.add(new Employee(6, "Kumar", "HR", 40500,30));
		empList.add(new Employee(7, "Ajit", "CEO", 500000,100));
		empList.add(new Employee(8, "Laxman", "Trainer", 350000,10));
        /*
         *          */
		List<String> epys = new ArrayList<>();
		
		employeeOps employees = new employeeOps();
		epys= employees.operation(empList);
		for(String d:epys) {
			System.out.println(d);
		}
	}

}