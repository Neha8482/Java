import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MinDiffsubset {
	
	public static boolean[][] subsetsumer(int[] arr , int sum , int n) {
		boolean[][] t = new boolean[n+1][sum+1];
		
		for(int i=0 ; i < n+1 ; i++) {
			for(int j =0;j < sum+1 ; j++) {
				if(i== 0 && j== 0)
					t[i][j] = true;
				else if(i==0)
					t[i][j]=false;
				else if(j == 0)
					t[i][j] = true;
				else if(arr[i-1] <= j) {
					t[i][j] = t[i-1][j-arr[i-1]] || t[i-1][j];
				}
				else {
					t[i][j]= t[i-1][j];
				}
				//System.out.print(t[i][j]+" ");
			}
			//System.out.println(" ");
		}
		return t;
	}
	
	public static void main(String[] args) {
		//System.out.println("Here");
		
		Map<Integer,Integer> m = new HashMap<>();
		System.out.println(m.get(3));
		
		int[] arr = {1,6,5,11};
		int sum=0;
		for(int i=0;i < arr.length; i++) {
			sum=sum + arr[i];
		}
	
		boolean[][] p;
		p = subsetsumer(arr,sum,arr.length);
		List<Integer> lis= new ArrayList<>();
		for(int k=0 ; k< sum+1; k++) {
			if(p[arr.length][k] == true) {
				lis.add(k); 
			}
		}
		
		int h=0;
		int mint= sum-(2*lis.get(h));
		while(lis.get(h) <= (int)(sum/2)) {
		    mint = Math.min(mint, sum-(2*lis.get(h)));	
		    h=h+1;
		}
		
		System.out.println(mint);
	}
}
