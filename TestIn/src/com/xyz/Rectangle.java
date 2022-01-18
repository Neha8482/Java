package com.xyz;

public class Rectangle implements Shape {
	double aread ;
    int length ;
    int width ;
    
	

	public Rectangle( int length, int width) {
		super();
		this.length = length;
		this.width = width;
	}

	@Override
	public boolean equals(Shape s) {
	// TODO Auto-generated method stub
	boolean x;

	if(s instanceof  Rectangle) {
		Rectangle r = (Rectangle) s;
		if(r.length == this.length && r.width == this.width) {
		      x=true;
		}
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
		this.aread = this.length * this.width;
		return(aread);
		
	}

}
