package com.xyz;

public class Square implements Shape {
	double aread ;
    int side  ;	
	public Square( int side) {
		super();
		this.side = side;
	}

	@Override
	public boolean equals(Shape s) {
	// TODO Auto-generated method stub
	boolean x;

	if(s instanceof Square) {
		Square c = (Square) s;
		if(c.side == this.side)
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
		this.aread = this.side * this.side;
		return(aread);
		
	}

}
