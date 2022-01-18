package Diary;

public class Person {
	private int person_ID;
	private String person_Name;
	private String person_Telephone;
	private int day;
	private String month;
	private int year;
	
	public Person(int day,String month,int year,int person_ID, String person_Name, String person_Telephone) {
		DOB date = new DOB(day,month,year);
		this.person_ID = person_ID;
		this.person_Name = person_Name;
		this.person_Telephone = person_Telephone;
		this.day=day;
		this.month=month;
		this.year=year;
	}
	
	
	public Person() {
		// TODO Auto-generated constructor stub
	}

	

	public String getMonth() {
		return month;
	}


	@Override
	public String toString() {
		return "Person [person_ID=" + person_ID + ", person_Name=" + person_Name + ", person_Telephone="
				+ person_Telephone + ", day=" + day + ", month=" + month + ", year=" + year + "]";
	}
	
	


	
	
	
	
	

}
