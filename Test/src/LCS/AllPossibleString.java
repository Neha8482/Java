package LCS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class AllPossibleString {
	public static List<String> AllPossibleStrings(String s)
    {
        List<String> res = new ArrayList<>();
        List<String> st = new ArrayList<>(Arrays.asList(s));
			int n = s.length();
			for(int i = 0; i < (1 << n); i++){
				String temp ="";
				for(int j = 0; j < n; j++){
					if((i & (1 << j)) > 0) {
						temp.concat(Character.toString(s.charAt(j)));
					System.out.println(temp);
					}
				}
				if(temp.length() > 0)
				res.add(temp);
			}
			Collections.sort(res);
			return res;
    }
	public static void main(String[] args) {
		List<String> s = AllPossibleStrings("abc");
		for(String sy : s)
			System.out.println(sy);
	}

}
