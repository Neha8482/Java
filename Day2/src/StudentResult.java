public class StudentResult {

	public void check(int subject1,int subject2,int subject3) {
		if(subject1 > 60 && subject2 > 60 && subject3 > 60) {
			System.out.println("Passed");
		}
		if((subject1 >60 && subject2 > 60) || (subject2 > 60 && subject3> 60) || (subject1> 60 && subject3> 60) ) {
			System.out.println("Promoted");
		}
		else {
			System.out.println("Failed");
		}
	}
	public static void main(String[] args) {
		StudentResult result = new StudentResult();
		result.check(56,78,90);
	}
}
