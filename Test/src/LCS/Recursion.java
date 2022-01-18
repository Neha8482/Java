package LCS;

import java.util.ArrayList;
import java.util.List;

public class Recursion {
	static String dup(String s, int cur,int n) {
		if(cur == n-1) {
			return Character.toString(s.charAt(cur));
		}
		else if(cur == n) {
			return "";
		}
		if(s.charAt(cur) == s.charAt(cur+1)) {
			return dup(s,cur+1,n);
		}
		else {
			return s.charAt(cur)+dup(s,cur+1,n);
		}
	}
	static int countPath(int s,int e) {
		if(s == e)
			return 1;
		return 1+countPath(s+1,e);
	}
	static List<String> letters(String s1,String s2) {
		List<String> l = new ArrayList<>();
		if(s1.length() == 0)
			return l;
		for(int i=0; i < s2.length();i++) {
			l.add(Character.toString(s1.charAt(0))+Character.toString(s2.charAt(i)));
		}
	    l.addAll(letters(s1.substring(1),s2));
	    return l;
	}
	static List<String> sub(String s,String res) {
		List<String> l = new ArrayList<>();
		if(s.length() == 0) {
			l.add(res);
			return l;
		}
		l.addAll(sub(s.substring(1),res+s.charAt(0)));
		l.addAll(sub(s.substring(1),res));
		return l;
	}
	
	static String remove(String s, int n, char c,String res) {
		if(s.length() == 0)
			return res;
		if(s.charAt(0) == c) {
			res=res+c;
			return remove(s.substring(1),n,c,res);
		}else {
	      	return s.charAt(0)+remove(s.substring(1),n,c,res);	
		}
	}
	public static void main(String[] args) {
		System.out.println(remove("abxxxxcdbefxxxjfoesxdxxxxsd","abxxxxcdbefxxxjfoesxdxxxxsd".length(),'x',""));
		System.out.println(dup("aaaabbbbbccccceee",0,"aaaabbbbbccccceee".length()));
		List<String> r = new ArrayList<>();
		r = sub("abc","");
		for(String s : r) {
			System.out.println(s);
		}
		List<String> rl = new ArrayList<>();
		rl = letters("abc","def");
		for(String s : rl) {
			System.out.println(s);
		}
		System.out.println(countPath(0,3));
	}
	

}
