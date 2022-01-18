

public class CountSubset {
	public static int subsum(int[] wt,int w, int n) {
		int[][] t = new int[n+1][w+1];
		for(int i=0; i< n+1; i++) {
			for(int j=0; j < w+1; j++) {
				if(j==0) {
					t[i][j]= 1;
				}
				else if(i==0) {
					t[i][j]= 0;
				}
				else if(wt[i-1] <= j) {
					t[i][j] = t[i-1][j - wt[i-1]] + t[i-1][j];
				}
				else {
					t[i][j] = t[i-1][j];
				}
				System.out.print(t[i][j]+" ");
			}
			System.out.println();
		}
		return t[n][w];
	}
	
	public static void main(String[] args) {
		int[] wt = {3,8,10,2,7};
		int w=10;
		int n= wt.length;
		System.out.println(subsum(wt,w,n));
	}
}
