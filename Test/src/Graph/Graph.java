package Graph;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Graph {
	
	public static void main(String[] args) {
		List<Integer> l = new ArrayList<>();
		l.add(1);l.add(2);
		l.add(0);
		List<Integer> l1 = new ArrayList<>();
		l.add(1);l.add(2);
		l.add(0);
		List<List<Integer>> l2 = new ArrayList<>();
		l2.add(l);
		l2.add(l1);
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] adjm = new int[n][n];
		//n+1 when vertices start from 1 else n
		List<List<Integer>> al = new ArrayList<>();
		for(int y=0; y < n ; y++) {
			al.add(new ArrayList<Integer>());
		}
		int e = sc.nextInt();
		for(int k=0; k < e; k++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			adjm[a][b] = 1;
			adjm[b][a] = 1;
			al.get(a).add(b);
			al.get(b).add(a);
		}
		for(int i=0; i < n; i++) {
			for(int j=0; j < n; j++) {
				System.out.print(adjm[i][j]+" ");
			}
			System.out.println();
		}
		for(int y=0; y < n ; y++) {
			for(int d = 0; d < al.get(y).size(); d++) {
				System.out.print(al.get(y).get(d)+" ");
			}
			System.out.println();
		}
	}

	

}
