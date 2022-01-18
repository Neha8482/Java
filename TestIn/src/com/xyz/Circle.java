package com.xyz;

public class Circle implements Shape {
	double aread ;
    float radius ;
  
 
	public Circle(float radius) {
		super();
		this.radius = radius;
	}

	@Override
	public boolean equals(Shape s) {
		// TODO Auto-generated method stub
		boolean x;
	
		if(s instanceof  Circle) {
			Circle c = (Circle) s;
			if(c.radius == this.radius)
			      x=true;
			else {
				x=false;
			}
		}
		else {
			x=false;
		}
		return x;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		this.aread = 3.14 * this.radius *this.radius;
		return(aread);
		
	}

}
