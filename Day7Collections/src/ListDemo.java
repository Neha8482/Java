import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo {
public static void main(String[] args) {
	List<Integer>  list = new ArrayList<>();
	System.out.println(list.size() + " : "+list);
	//add elements
	Integer intObj = 10;
	list.add(intObj);
	Integer intObj2=20;
	list.add(intObj2);
	list.add(30);
	

	list.remove(2);//delete 
	list.indexOf(20);//search
	list.add(1,50);//update
	System.out.println(list.size()+" : "+list);
	for(int i=0; i < list.size();i++) {
		System.out.println(list.get(i));
	}
	for(int i:list ) {		
			System.out.println(i);
	}
	
	Iterator<Integer> iterateList = list.iterator();
	while(iterateList.hasNext()) {
		System.out.println(iterateList.next());	
	}
}
}

//difference between arrayList and LinkedList


