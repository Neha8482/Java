public class Student {
	private static int rollNo;
	private String studentName;
	private int marks;
	

	public Student(String studentName,int marks) {
		rollNo++;
		this.studentName=studentName;
		this.marks=marks;
	}


	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", studentName=" + studentName + ", marks=" + marks + "]";
	}
	
	
}
