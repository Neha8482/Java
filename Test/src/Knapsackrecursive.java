public class Knapsackrecursive {
	public int knapsackf(int[] wt, int[] v, int w,int n)
	
	{
		int t[][] = new int[n+1][w+1];
		
		if(n == 0 || w==0)
			return 0;
		else if(wt[n-1] <= w) {
			return Math.max(v[n-1]+ knapsackf(wt,v,w-wt[n-1],n-1),knapsackf(wt,v,w,n-1));
		}
		else {
			return knapsackf(wt,v,w,n-1);
		}
	}
	
	
	public static void main(String[] args) {
		int[] wt = {2,1,4,3};
		int[] v= {5,2,3,4};
		int w=5;
		Knapsackrecursive k = new Knapsackrecursive();
		System.out.println(k.knapsackf(wt,v,w,4));
	}

}
