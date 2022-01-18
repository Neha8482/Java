package Diary;

import java.util.Scanner;

public class PersonMain {
	
	private int id;
	private String name;
	private String  telephone;
	private String date;
	private int day;
	private String month;
	private int year;
	Scanner sc = new Scanner(System.in);
	
	private static int count=0;
	Person[] person = new Person[100];
	
	
	
	public void addPerson() {
		System.out.println("Enter the Person Details");
		System.out.println("Enter Id");
		this.id = sc.nextInt();
		System.out.println("Enter Name");
		this.name = sc.next();
		System.out.println("Enter Telephone");
		this.telephone=sc.next();
		System.out.println("Enter DOB");
		System.out.println("Enter Day");
		this.day=sc.nextInt();
		System.out.println("Enter Month");
		this.month=sc.next();
		System.out.println("Enter year");
		this.year=sc.nextInt();
		
		person[count] = new Person(this.day,this.month,this.year,this.id,this.name,this.telephone);
		count++;
		
	}
	
	private void searchPerson(String mon) {
		for(int i=0; i <count ; i++) {
		//	System.out.println(person[i].getMonth());
	//		System.out.println(mon);
			if(person[i].getMonth().equals(mon)) {
			System.out.println(person[i]);
			
		}
		}
		
	}
	
	public void displayAll() {
	//	Person[] person = new Person[count];
		for(int i=0; i <count ; i++) {
			System.out.println(person[i]);
		}
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		PersonMain person1 = new PersonMain();
		String ch = "y";
		String searchByMonth;
		int choice;
		do {
			System.out.println("MENU");
			System.out.println("1 . Add PErson");
			System.out.println("2 . Search Person");
			System.out.println("3 . Display All");
			System.out.println("4 . Exit");
			System.out.println("Enter choice");
			choice = sc.nextInt();
			
			switch(choice) {
			case 1:
				person1.addPerson();
				break;
			case 2:
				System.out.println("Enter the birth month");
				searchByMonth = sc.next();
				person1.searchPerson(searchByMonth);
				break;
			case 3:
				person1.displayAll();
				break;
			case 4:
			    System.exit(0);
				break;
			default:
				System.out.println("Enter valid choice");
				break;
			}
			System.out.println("Do you want to continue y/n");
			ch = sc.next();
			
		}while(ch!="y");
		
		
	}

	

	
}
