package LCS;

import java.util.Scanner;

public class LongestAND {
	
	public static int lcs(int[] arr,int n) {
		int[][] t = new int[n+1][n+1];
		int maxi=0;
		for(int i=0; i< n+1 ;i++) {
			int hi=0;
			int buffer = 0;
			for(int j=0;j < n+1 ; j++) {
				if(i == 0 || j == 0) {
					t[i][j]=0;
				}
				else if(j == 1) {
					buffer = arr[i-1] & j;
					if(buffer > 0)
						hi=hi+1;
					t[i][j]= hi;
					
				}
				else if(arr[i-1] == arr[j-1]) {
					//hi=hi+1;
					t[i][j] = hi;
				}
				else if((arr[i-1] & arr[j-1]) > 0 ) {
					if(buffer > 0) {
					buffer = buffer & (arr[i-1] & arr[j-1]);
					if(buffer > 0)
					hi=hi+1;
					}
					else {
						buffer = arr[i-1] & arr[j-1];
						hi=hi+1;
					}
					t[i][j] =hi;
				}
				else {
					t[i][j]= hi;
				}
			//	System.out.print(t[i][j]+" ");
			}
			maxi=Math.max(hi,maxi);
		//	System.out.println();
		}
		return maxi;
	}

	public static void main(String[] args) {
		
		int x;
		Scanner sc = new Scanner(System.in);
		x=sc.nextInt();
		for(int j =0; j < x; j++) {
			
		int in;
		in=sc.nextInt();
		int[] arr = new int[in];
		for(int i=1; i < in+1; i++) {
			arr[i-1]=i;
		}
		System.out.println(lcs(arr,in));
		}
	}
		
}
