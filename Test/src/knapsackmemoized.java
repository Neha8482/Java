
public class knapsackmemoized {
		public int knapsackf(int[] wt, int[] v, int w,int n,int[][] t)
		{
			
			if(n == 0 || w==0)
				return 0;
			 if(t[n][w] != -1) {
				return t[n][w];
			}
			else if(wt[n-1] <= w) {
				t[n][w]=Math.max(v[n-1]+ knapsackf(wt,v,w-wt[n-1],n-1,t),knapsackf(wt,v,w,n-1,t));
		         return t[n][w];
			}
			else {
				t[n][w]=knapsackf(wt,v,w,n-1,t);
			 return t[n][w];
			}
				
		}
		
		
		public static void main(String[] args) {
			 int w=5;
			int n= 4;
			
			int[][] t = new int[n+1][w+1];
			for(int i=0; i< n+1;i++) {
				for(int j=0;j < w+1;j++) {
					t[i][j]=-1;
				}
			}
			int[] wt = {2,1,4,3};
			int[] v= {5,2,3,4};
			
			knapsackmemoized k = new knapsackmemoized();
			System.out.println(k.knapsackf(wt,v,w,4,t));
		}

	}
