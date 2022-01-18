package com.xyz;

public class FormString {
	static String convert(String input) {
		int length = input.length();
		String result = "";  //a2b3c4
		StringBuilder sb = new StringBuilder(result);
		int i = 0;
		while (i < length) {
			char p = input.charAt(i);
			int flag = 0;
			int j = i + 1;
			while (flag == 0 && j < length) {
				int t = input.charAt(j); //
				if (t >= 97 && t <= 123) {
					flag = 1;
					break;
				}
				j++;
			}
			if(j == length -1)
				j++;
			int number = Integer.parseInt(input.substring(i + 1, j));
			for (int k = 0; k < number; k++) {
				sb.append(String.valueOf(p));
			}
			i = j;
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		System.out.println(convert("2a3b4c"));
	}

}
