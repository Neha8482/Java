
public class Equalpartition {
	
	private static boolean subsumequal(int[] arr, int w, int n) {
		// TODO Auto-generated method stub
		boolean[][] t = new boolean[n+1][w+1];
		
		for(int i=0; i< n+1; i++) {
			for(int j=0; j< w+1; j++) {
				if(i==0) {
					t[i][j]=false;
				}
				else if(j == 0) {
					t[i][j]=true;
				}
				else if(arr[i-1] <= j) {
					t[i][j] = t[i-1][j-arr[i-1]] || t[i-1][j];
				}
				else {
					t[i][j] = t[i-1][j];
				}
			}
		}
		return t[n][w];
	}
	
	
	
	public static void main(String[] args) {
		int[] arr = {3,5,11,5};
		int sum=0;
		for(int i =0; i< arr.length;i++) {
			sum=sum+arr[i];
		}
		if(sum % 2 !=0) {
			System.out.println(-1);
		}
		else {
			System.out.println(subsumequal(arr,sum/2,arr.length));
		}
		
	}



}
