package LCS;

public class MAtrix {
public static void main(String[] args) {
	int[][] a = {{1,2,3,4},
			     {5,2,3,4},
			     {4,5,6,8},
			     {4,5,6,8}};
	int n = a.length;
	int m  =a[0].length;
	int i,j;
	for(int k = 0; k < m;k++) {
	   	i = 0 ; j = k;
	   	while(i < n && j >= 0) {
	   		System.out.print(a[i][j]+" ");
	   		i++;j--;
	   	}
	   	System.out.println();
	}
	for(int k = 1; k < n;k++) {
		i= k; j = m-1;
		while(i < n && j >=0) {
			System.out.print(a[i][j]+" ");
			i++;j--;
		}
		System.out.println();
	}
	for(int ip =0; ip < n;ip++) {
		for(int jp =0; jp < ip;jp++) {
			int temp = a[ip][jp];
			a[ip][jp] = a[n-1-jp][ip];
			a[n-1-jp][ip] = a[ip][jp];
			System.out.print(a[ip][jp]+" ");
		}
		System.out.println();
	}
	for(int ip =0; ip < n;ip++) {
		for(int jp =0; jp < m;jp++) {
			System.out.print(a[ip][jp]+" ");
		}
		System.out.println();
	}
}
}
