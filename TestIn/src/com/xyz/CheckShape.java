package com.xyz;

public class CheckShape {
	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder("abc");
		sb.append("ejvgedgvojed");
		System.out.println(sb.toString());
		"hackerearth".chars().distinct().peek(ch -> System.out.println(ch)).sorted();
		Shape T1 = new Triangle(4,5);
		System.out.println(T1.area());
		Shape r1 = new Rectangle(3,4);
		System.out.println(r1.area());
		Shape s1 = new Square(4);
		System.out.println(s1.area());
		float s =(float) 3.4;
		Shape c1 = new Circle(s);
		System.out.println(c1.area());
		
		Shape triangle = new Triangle(4,5);
		boolean check = triangle.equals(T1);
		if(check == true) {
			System.out.println("Area of a Triangle is "+triangle.area());
		}
		
	}

}
