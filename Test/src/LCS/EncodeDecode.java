package LCS;

import java.util.Scanner;

public class EncodeDecode {
	
	public static byte[] encode(String s) {
		byte[] encodedstring = s.getBytes();
		return encodedstring;
	}
	public static String decode(byte[] p) {
		String res="";
		StringBuilder sb = new StringBuilder(res);
		for(int i=0;i < p.length;i++) {
			System.out.println(p[i]);
			sb.append(Character.toString(p[i]));
		}
		return sb.toString();
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String h = sc.nextLine();
		byte[] p = encode(h);
		
		System.out.println(decode(p));
	}

}
