import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo {
public static void main(String[] args) {
	Map<Integer,String> map = new HashMap();//key unique value can be repeated
	
	map.put(123, "Shree");
	map.put(125, "Hari");
	map.put(173, "Pournima");
	map.put(193, "Darshana");
	System.out.println(map);
	
	//print only keys from the map
	Set<Integer> keys = map.keySet();
	for(Integer key : keys) {
		System.out.println(key +" : "+map.get(key));
	}
	
	Collection<String> values = map.values();
	for(String value: values) {
		System.out.println(value);
	}
	
	int findvalue = 123;
	System.out.println(map.get(findvalue));
	
	Set<Map.Entry<Integer, String>> entry = map.entrySet();
	for(Map.Entry<Integer, String> entry2 : entry) {
		System.out.println(entry2.getKey()+" : "+entry2.getValue());
	}
	
	
}

}
