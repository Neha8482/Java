public class Term {
	private int coefficient;
	private int exponent;
	public int getCoefficient() {
		return coefficient;
	}
	public void setCoefficient(int coefficient) {
		this.coefficient = coefficient;
	}
	public int getExponent() {
		return exponent;
	}
	public void setExponent(int exponent) {
		this.exponent = exponent;
	}
	@Override
	public String toString() {
		return "Term [coefficient=" + coefficient + ", exponent=" + exponent + "] "+ coefficient +" x"+exponent;
	}
	
	
	
	
	

}
