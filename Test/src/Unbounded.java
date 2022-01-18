
public class Unbounded {
	private static int unboundedKnapsack(int W, int n,
            int[] val, int[] wt)
{

// dp[i] is going to store maximum value
// with knapsack capacity i.
int dp[] = new int[W + 1];

// Fill dp[] using above recursive formula
for(int i = 0; i <= W; i++){
for(int j = 0; j < n; j++){
if(wt[j] <= i){
dp[i] = Math.max(dp[i], dp[i - wt[j]] +
            val[j]);
System.out.println(dp[i]+" "+ i);
}
}
}
return dp[W];
}

// Driver program
public static void main(String[] args)
{
int W = 8;
int val[] = {10, 40,50,70};
int wt[] = {1,3,4,5};
int n = val.length;
System.out.println(unboundedKnapsack(W, n, val, wt));
}

}
