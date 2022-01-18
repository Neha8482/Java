package com.xyz;
public class Exellarate {
	public static void main(String[] args) {
		String x = "efe";
		System.out.println(x.substring(0,2));
		System.out.println("method return -> "+m());
		}
		static String m(){
		try{
		int i=10/0;
		}catch(ArithmeticException e){
		return "catch";
		}finally{
		return "finally";
		}
		}

}
