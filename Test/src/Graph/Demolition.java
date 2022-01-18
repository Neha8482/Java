package Graph;

import java.util.LinkedList;
import java.util.Queue;

class Table{
	int x;
	int y;
	Table(int r,int c){
		this.x = r;
		this.y = c;
	}
}
public class Demolition {
	static int steps;
	static int[][] visited;
	
	public static void main(String[] args) {
		int n = 4;
		visited = new int[n][n];
		char[][] island = new char[][]{
			{'O', 'O', 'O', 'O'},
			{'O', 'O', 'D', 'O'},
			{'O', 'O', 'O', 'O'},
			{'X', 'D', 'D', 'O'}
	};

	Demolition d = new Demolition();
		int res = d.func(island,n,visited);
		System.out.println(res);
	}

    int func(char[][] arr , int n, int[][] visited){
    	if(n == 0)
    		return 0;
    	Queue<Table> q = new LinkedList<>();
    	q.add(new Table(0,0));
    	//visited[0][0] = 1;
       
    	while(!q.isEmpty()){
    		int y = q.size();
    		System.out.println();
    		for(int j = 0; j < y ;j++){
    		Table t = q.poll();
    		visited[t.x][t.y] = 1;
    		System.out.println(arr[t.x][t.y]);
    		System.out.println(t.x+" "+t.y);
    		if(arr[t.x][t.y] == 'X') 
    			return steps;
    			if(t.x+1 >= 0 && t.x+1 < n && t.y >= 0 && t.y < n && visited[t.x+1][t.y] != 1 && arr[t.x+1][t.y] != 'D'){
    				q.add(new Table(t.x+1,t.y));
    				//visited[t.x+1][t.y] =1;
    			}
    			if(t.x-1 >= 0 && t.x-1 < n && t.y >= 0 && t.y < n && visited[t.x-1][t.y] != 1 && arr[t.x-1][t.y] != 'D'){
    				q.add(new Table(t.x-1,t.y));
    				//visited[t.x-1][t.y] =1;
    			}
    			 if(t.x >= 0 && t.x < n && t.y+1 >= 0 && t.y+1 < n && visited[t.x][t.y+1] != 1 && arr[t.x][t.y+1] != 'D'){
    				q.add(new Table(t.x,t.y+1));
    				//visited[t.x][t.y+1] =1;
    			}
    		     if(t.x >= 0 && t.x < n && t.y-1 >= 0 && t.y-1 < n && visited[t.x][t.y-1] != 1 && arr[t.x][t.y-1] != 'D'){
    				q.add(new Table(t.x,t.y-1));
    				//visited[t.x][t.y-1] =1;
    			}
    	}
            steps++;
    	}
		return 0;
    }


	
}
