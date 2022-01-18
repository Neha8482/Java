package LCS;

public class TestP {
public static void main(String[] args) {
	String s1 = "amazon";
	String s2 = "azonam sff dgg rgr";
	char[] l = s2.toCharArray();
	
	StringBuilder st = new StringBuilder();
	System.out.println((s1.substring(2,s1.length()) + st.append(s1.substring(0,2)).toString()));
	System.out.println(st.toString());
	if((s1.substring(2,s1.length()) + s1.substring(0,2)).equals(s2)  || 
			(s2.substring(2,s2.length()) + s2.substring(0,2)).equals(s1)	||
			(s1.substring(s1.length()-2,s1.length())+s1.substring(0,s1.length()-2)).equals(s2)  ||
			(s2.substring(s2.length()-2,s2.length())+s2.substring(0,s2.length()-2)).equals(s1) ) {
		System.out.println(true);
	}
	else
		System.out.println(false);
}
}
