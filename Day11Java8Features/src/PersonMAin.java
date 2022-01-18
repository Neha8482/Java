import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import 	java.util.List;

public class PersonMAin {
public static void main(String[] args) {
	List<Person> list = new ArrayList<>();
	list.add(new Person("Kanika",34));
	list.add(new Person("Pranish",23));
	list.add(new Person("Amit",35));
	list.add(new Person("Ferry",92));
	
	Person person = new Person();
	Collections.sort(list,person::sortByName);// we are not calling sortByName here we are just refering that method so :: is used instead of dot 
	System.out.println(list);
	Collections.sort(list,Person::sortByAge);// we are not calling sortByName here we are just refering that method so :: is used instead of dot and method is static so classname is used 
	System.out.println(list);
	
	
	
	/*Collections.sort(list,new Comparator<Person>() {

		@Override
		public int compare(Person o1, Person o2) {
			// TODO Auto-generated method stub
			return o1.getName().compareTo(o2.getName());
		}
		instead of doing this we have added one method which does the samw
		work and we are using it instead of comparator
		
		//Collections.sort(list, (p1,p2)-> p1.getAge() - p2.getAge());
	});*/
}
}
