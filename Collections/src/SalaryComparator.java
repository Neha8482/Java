import java.util.Comparator;

public class SalaryComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		Integer sal1 = o1.getSalary();
		Integer sal2 = o2.getSalary();
		if(sal1.equals(sal2)){
			String s1 = o1.getName();
			String s2 = o2.getName();
			return s1.compareTo(s2);
		}
		else
		return sal1.compareTo(sal2);
	}

}
