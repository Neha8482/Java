import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Demo {
		public static void main(String[] args) {
			String x = "NEha Agrawale";
			x = x.toLowerCase();
			List<Character> l = new ArrayList<>();
			Map<Character, Integer> mp = new HashMap<>();
			for(int i = 0; i < x.length();i++) {
				if(i == ' ')
					continue;
				else {
					if(mp.get(x.charAt(i)) == null) {
					mp.put(x.charAt(i), 1);
					l.add(x.charAt(i));
					}
					else
						mp.put(x.charAt(i),mp.get(x.charAt(i))+1);
				}	
			}
			String res = "";
			for(int j =0 ; j < l.size();j++) {
				if(mp.get(l.get(j)) > 1) {
				res=res+l.get(j);	
				}
			}
			System.out.println(res);
		}
}
