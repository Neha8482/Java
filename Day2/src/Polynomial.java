public class Polynomial {
	Term[] terms;
	private static int count;
	
	public Polynomial() {
		terms=new Term[10];
		for(int i =0;i<terms.length;i++) {
			terms[i]=new Term();
			terms[i].setCoefficient(0);
			terms[i].setExponent(0);
		}		
	}
	
	public void setTerm(int coefficient,int exponent) {
		count++;
		for(int i=0;i < count;i++) {
			int exe=terms[i].getExponent();
			if((exe==exponent || exponent<0)) {
				System.out.println("Cannot use exponent twice");
				break;
				
			}
			else if(exe!=0) {
				continue;
			}
			else {
				terms[i].setCoefficient(coefficient);
				terms[i].setExponent(exponent);
			}
		}
	}
	
	public void sort() {
		for(int i =0;i<count-1;i++) {
			for(int j=i+1;j<count;j++) {
				int expi=terms[i].getExponent();
				int expj= terms[j].getExponent();
				if(expi<expj) {
					int temp1=terms[i].getCoefficient();
					int temp2=terms[i].getExponent();
					terms[i].setCoefficient(terms[j].getCoefficient());
					terms[i].setExponent(terms[j].getExponent());
					terms[j].setCoefficient(temp1);
					terms[j].setExponent(temp2);
				}
			}
		}
	}
	public void display() {
		for(int i=0;i<count;i++) {
			System.out.println(terms[i]);
		}
	}
	
	public static void main(String[] args) {
		Polynomial poly= new Polynomial();
		poly.setTerm(7,2);
		poly.setTerm(9,5);
		poly.setTerm(2,3);
		poly.display();
		System.out.println();
		poly.sort();
		poly.display();
		
	}
}
