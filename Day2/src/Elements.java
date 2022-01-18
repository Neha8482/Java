
public class Elements {
	public static void main(String[] args) {
		
		int[] a = {3,2,4,5,6,4,5,7,3,2,3,4,7,1,2,0,0,0};
		int r=0;
		int smallest=a[0];
		for(int i=0;i<14;i++) {
			r=r+a[i];
			if(a[i]<smallest) {
				smallest=a[i];
			}
		}
		a[15]=r;
		int avg = (r+r)/a.length;
		a[16]=avg;
		a[17]=smallest;
		for(int j=0;j<a.length;j++) {
			System.out.println(a[j]);
		}
		
		
	}

}
