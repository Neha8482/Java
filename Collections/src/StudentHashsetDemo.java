import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class StudentHashsetDemo {
public static void main(String[] args) {
	/*Set<Student> student = new HashSet<>();
	student.add(new Student(101,"Bharti",3,98));
	student.add(new Student(103,"Shamita",4,94));
	student.add(new Student(108,"Anjali",2,92));
	student.add(new Student(111,"Kalri",4,95));
	student.add(new Student(112,"Origami",5,99));
	System.out.println("Student : "+student);
	*/
   Set<Student> student = new TreeSet<>(new RollNoComparator());
	student.add(new Student(101,"Bharti",3,98));
	student.add(new Student(103,"Shamita",4,94));
	student.add(new Student(108,"Anjali",2,92));
	student.add(new Student(111,"Kalri",4,95));
	student.add(new Student(112,"Origami",5,99));
	System.out.println("Student : "+student);
	
	student = new TreeSet<>(new Comparator<Student>() {

		@Override
		public int compare(Student o1, Student o2) {
			// TODO Auto-generated method stub
			return o1.getName().compareTo(o2.getName());
		}
	});
	student.add(new Student(101,"Bharti",3,98));
	student.add(new Student(103,"Shamita",4,94));
	student.add(new Student(108,"Anjali",2,92));
	student.add(new Student(111,"Kalri",4,95));
	student.add(new Student(112,"Origami",5,99));
	System.out.println("Student : "+student);
	
}
}
