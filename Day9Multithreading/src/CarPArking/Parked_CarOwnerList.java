package CarPArking;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Parked_CarOwnerList {
	 static int count=0;	
	
	Parked_CarOwner_Details[] arr1 =  new Parked_CarOwner_Details[20];
	Parked_CarOwner_Details[] arr2 =  new Parked_CarOwner_Details[20];
	Parked_CarOwner_Details[] arr3 =  new Parked_CarOwner_Details[20];
	Parked_CarOwner_Details[] arr4 =  new Parked_CarOwner_Details[20];
	
	
	public Parked_CarOwnerList() {
		// TODO Auto-generated constructor stub
	}

	private static int count1=0;
	private static int count2=0;
	private static int count3=0;
	
	Map<String,String> map =
		    new HashMap<String,String>();

static List<Parked_CarOwner_Details> floor1 = new ArrayList<Parked_CarOwner_Details>();
List<Parked_CarOwner_Details> floor2 = new ArrayList<Parked_CarOwner_Details>();
List<Parked_CarOwner_Details> floor3 = new ArrayList<Parked_CarOwner_Details>();


public void addCar(String ownerName,String carmodel,String carno,long mobile,String address)  {
	if(count1< 80) {
		floor1.add(new Parked_CarOwner_Details(ownerName,carmodel,carno, mobile,address));
		System.out.println("Floor1");
		//System.out.println(count1);
		System.out.println(new Parked_CarOwner_Details(ownerName,carmodel,carno, mobile,address));
		count1++;
		if(count1 < 20) {
			map.put(carno,"Floor1Section1");
		}
		if(count1 < 40) {
			map.put(carno,"Floor1Section2");
		}
		if(count1 < 60) {
			map.put(carno,"Floor1Section3");
		}
		if(count1 < 80) {
			map.put(carno,"Floor1Section4");
		}
	}
	else if(count2 < 80) {
		floor1.add(new Parked_CarOwner_Details(ownerName,carmodel,carno, mobile,address));
		System.out.println("Floor2");
		System.out.println(new Parked_CarOwner_Details(ownerName,carmodel,carno, mobile,address));
		count2++;
		if(count2 < 20) {
			map.put(carno,"Floor2Section1");
		}
		if(count2 < 40) {
			map.put(carno,"Floor2Section2");
		}
		if(count2 < 60) {
			map.put(carno,"Floor2Section3");
		}
		if(count2 < 80) {
			map.put(carno,"Floor2Section4");
		}
	}
	else if(count3 < 80) {
		floor1.add(new Parked_CarOwner_Details(ownerName,carmodel,carno, mobile,address));
		System.out.println("Floor3");
		System.out.println(new Parked_CarOwner_Details(ownerName,carmodel,carno, mobile,address));
		count3++;
		if(count3 < 20) {
			map.put(carno,"Floor3Section1");
		}
		if(count3 < 40) {
			map.put(carno,"Floor3Section2");
		}
		if(count3 < 60) {
			map.put(carno,"Floor3Section3");
		}
		if(count3 < 80) {
			map.put(carno,"Floor3Section4");
		}
	}
}

public void get_ParkedCarLocation(String carn) {
	System.out.println(map.get(carn));
}

public void removeCar(String name) {
	
	for(int i = 0; i < floor1.size(); i++) {
		if(floor1.get(i).getCarNo().equals(name)) {
			System.out.println("Car with details is removed ");
			System.out.println(floor1.get(i));
			floor1.remove(floor1.get(i));
		}
	}
	
	for(int j = 0; j < floor2.size(); j++) {
		if(floor2.get(j).getCarNo().equals(name)) {
			System.out.println("Car with details is removed ");
			System.out.println(floor2.get(j));
			floor2.remove(floor2.get(j));
		}
	}
	
	for(int k = 0; k < floor3.size(); k++) {
		if(floor3.get(k).getCarNo().equals(name)) {
			System.out.println("Car with details is removed ");
			System.out.println(floor3.get(k));
			floor3.remove(floor3.get(k));
		}
	}
	
}
	
 
public static void main(String[] args) {
	
	Parked_CarOwnerList  parking = new Parked_CarOwnerList();
	parking.addCar("Kariya","Mercedes","MH342424",244242424,"Park Road");
	parking.addCar("Shamita","Audi","TH342424",45363463,"Link Road");
	parking.addCar("Arya","Nano","GJ342424",56747474,"Rose Road");
	parking.addCar("Supriya","Innova","RT342424",97956858,"Kider Road");
	parking.addCar("Shreya","Swift","HL342424",78786868,"Shamse Road");
	parking.addCar("Shipra","Nano","GJ342424",56747474,"Rose Road");
	parking.addCar("Prerna","Innova","RT342424",97956858,"Kider Road");
	parking.addCar("Aboli","Swift","HL342424",78786868,"Shamse Road");
	
	parking.addCar("Pratik","Nano","GJ342424",56747474,"Rose Road");
	parking.addCar("Priya","Innova","RT342424",97956858,"Kider Road");
	parking.addCar("Gauri","Swift","HL342424",78786868,"Shamse Road");
	
	parking.addCar("Aanchal","Nano","GJ342424",56747474,"Rose Road");
	parking.addCar("Sriti","Innova","RT342424",97956858,"Kider Road");
	parking.addCar("Pooja","Swift","HL342424",78786868,"Shamse Road");
	parking.addCar("Anjali","Nano","GJ342424",56747474,"Rose Road");
	parking.addCar("Harshada","Innova","RT342424",97956858,"Kider Road");
	parking.addCar("Swati","Swift","HL342424",78786868,"Shamse Road");
	parking.addCar("Mayuri","Nano","GJ342424",8979786,"Rose Road");
	parking.addCar("Sayali","Innova","RT342424",97956858,"Kider Road");
	parking.addCar("Vaishnavi","Swift","HL342424",78786868,"Shamse Road");
	parking.addCar("Hemant","Nano","AD89797",56747474,"Rose Road");
	parking.addCar("Jasur","Innova","RT342424",97956858,"Kider Road");
	parking.addCar("Adesh","Swift","PQ78424",78786868,"Shamse Road");
	parking.addCar("Anmol","Nano","GJ342424",56747474,"Rose Road");
	parking.addCar("Ayush","Innova","RT342424",97956858,"Kider Road");
	parking.addCar("Vishal","Swift","XZ672424",78786868,"Shamse Road");
	
	
	parking.removeCar("AD89797");
	parking.removeCar("PQ78424");
	parking.removeCar("XZ672424");
	
	parking.get_ParkedCarLocation("\"XZ672424");
	
	

}
}
