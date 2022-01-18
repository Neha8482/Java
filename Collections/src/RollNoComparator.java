import java.util.Comparator;

public class RollNoComparator implements Comparator<Student> {
	
	
public static void main(String[] args) {
	
}

@Override
public int compare(Student o1, Student o2) {
	// TODO Auto-generated method stub
	Integer rollNo1 = o1.getRollNo();
	Integer rollNo2 = o2.getRollNo();
	
	return rollNo1.compareTo(rollNo2);
}
public int compare(Student o1, Student o2,Student o3) {
	// TODO Auto-generated method stub
	String rollNo1 = o1.getName();
    String rollNo2 = o2.getName();
	
	return rollNo1.compareTo(rollNo2);
	}
}
