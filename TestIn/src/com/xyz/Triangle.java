package com.xyz;

public class Triangle implements Shape{
	double aread ;
    float height ;
    float base ;
    
	
	public Triangle( int height, int base) {
		super();
		this.height = height;
		this.base = base;
	}

	@Override
	public boolean equals(Shape s) {
		boolean x;

		if(s instanceof  Triangle) {
			Triangle t = (Triangle) s;
			if(t.height == this.height && t.base == this.base) {
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
		this.aread = (float)1/2 *(this.height * this.base);
		return(aread);
		
	}

}
