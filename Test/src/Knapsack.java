
public class Knapsack {
	
	public int knapsackf(int[] wt, int[] v, int w,int n)
	
	{
		int t[][] = new int[n+1][w+1];
		for(int i =0 ; i <= n ; i++) {
			for(int j=0; j <= w; j++) {
				if(i==0 || j==0)
					t[i][j]=0;
				else if(wt[i-1] <= j) {
					t[i][j] = Math.max(v[i-1]+ t[i-1][j-wt[i-1]], t[i-1][j]);
				}
				else {
					t[i][j]= t[i-1][j];
				}
				System.out.print(t[i][j]+" ");
			}
			System.out.println( );
		}
		return t[n][w];
	}
	
	
	public static void main(String[] args) {
		int[] wt = {2,1,4,3};
		int[] v= {5,2,3,4};
		int w=5;
		Knapsack k = new Knapsack();
		System.out.println(k.knapsackf(wt,v,w,4));
	}
	
}
