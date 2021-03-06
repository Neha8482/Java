package Game;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Grid {
	int[][] grid;
	int size;
	
	Grid(int size){
		this.size = size;
		grid = new int[this.size][this.size];
		setGrid();
		printGrid();
	}
	
   public boolean checkGridFull() {
		for(int i =0; i < size;i++) {
			for(int j = 0;j < size; j++) {
				if(grid[i][j] != 0)
					return false;
			}
		}
		return true;
	}
   public boolean check2048() {
		for(int i =0; i < size;i++) {
			for(int j = 0;j < size; j++) {
				if(grid[i][j] == 2048)
					return true;
			}
		}
		return false;
	}

	void printGrid() {
		for(int i =0; i < size;i++) {
			for(int j = 0;j < size; j++) {
				System.out.print(grid[i][j]+" ");
			}
			System.out.println();
		}
	}
	private void setGrid(){
		Random random = new Random();
		List<List<Integer>> emptySpaces = new ArrayList<>();
		for(int i =0; i < size;i++) {
			for(int j = 0;j < size; j++) {
				if(grid[i][j] == 0) {
					emptySpaces.add(Arrays.asList(i,j));
				}
			}
		}
		int p = random.nextInt(emptySpaces.size()-1);
		int x = emptySpaces.get(p).get(0);
		int y = emptySpaces.get(p).get(1);
		grid[x][y] = 2;
	}
	
	void moveLeft() {
		for(int i =0; i < size;i++) {
			int prev,prevy=-1;
			if(grid[i][0] == 0) {
				prev = grid[i][0];
				prevy = -1;
			}
			else {
				for(int j=1;j < size;j++) {
					if(grid[i][j] == 0) {
						prev = grid[i][j-1];
						prevy = j-1;
						break;
					}
					else if(grid[i][j] == grid[i][j-1]) {
						grid[i][j-1] = grid[i][j-1]+grid[i][j];
						prevy = j-1;
						grid[i][j] = 0;
						break;
					}
				}
			}
			    int ind = prevy+1;
				for(int p = prevy+1;p < size;p++) {
					if(grid[i][p] == 0) continue;
					if(ind-1 >= 0 && grid[i][ind-1] == grid[i][p]) {
						grid[i][ind-1] = grid[i][ind-1]+grid[i][p];
						grid[i][p] = 0;
						continue;
					}
					if(grid[i][ind++] != grid[i][p]) {
					grid[i][ind++] = grid[i][p];
					grid[i][p] = 0;
					}
				}
	      }
		setGrid();
		printGrid();
	}
	void moveRight() {
		for(int i =0; i < size;i++) {
			int prev,prevy=-1;
			if(grid[i][size-1] == 0) {
				prev = grid[i][size-1];
				prevy = size;
			}
			else {
				for(int j=size-2;j >=0;j--) {
					if(grid[i][j] == 0) {
						prev = grid[i][j+1];
						prevy = j+1;
						break;
					}
					else if(grid[i][j] == grid[i][j+1]) {
						grid[i][j+1] = grid[i][j+1]+grid[i][j];
						prevy = j+1;
						grid[i][j] =0;
						break;
					}
				}
			}
			int ind = prevy-1;
				for(int p = prevy-1;p >= 0;p--) {
					if(grid[i][p] == 0) continue;
					if(ind+1 < size && grid[i][ind+1] == grid[i][p]) {
						grid[i][ind+1] = grid[i][ind+1]+grid[i][p];
						grid[i][p]=0;
						continue;
					}
					grid[i][ind--] = grid[i][p];
					grid[i][p] = 0;
				}
	}
		setGrid();
		printGrid();
	}
	void moveUp() {
		for(int i =0; i < size;i++) { //column
			int prev,prevy=-1;
			if(grid[0][i] == 0) {
				prev = grid[0][i];
				prevy = -1;
			}
			else {
				for(int j=1;j < size;j++) {
					if(grid[j][i] == 0) {
						prev = grid[j-1][i];
						prevy = j-1;
						break;
					}
					else if(grid[j][i] == grid[j-1][i]) {
						grid[j-1][i] = grid[j-1][i]+grid[j][i];
						prevy = j-1;
						break;
					}
				}
			}
			int ind = prevy+1;
				for(int p = prevy+1;p < size;p++) {
					if(grid[p][i] == 0) continue;
					if(ind-1 >= 0 && grid[ind-1][i] == grid[p][i]) {
						grid[ind-1][i] = grid[ind-1][i]+grid[p][i];
						grid[p][i]=0;
						continue;
					}
					grid[ind++][i] = grid[p][i];
					grid[p][i] = 0;
				}

	}
		setGrid();
		printGrid();
	}
	void moveDown() {
		for(int i =0; i < size;i++) {
			int prev,prevy=-1;
			if(grid[size-1][i] == 0) {
				prev = grid[size-1][i];
				prevy = size;
			}
			else {
				for(int j=size-2;j >=0;j--) {
					if(grid[j][i] == 0) {
						prev = grid[j-1][i];
						prevy = j-1;
						break;
					}
					else if(grid[j][i] == grid[j+1][i]) {
						grid[j+1][i] = grid[j+1][i]+grid[j][i];
						prevy = j+1;
						grid[j][i] =0;
						break;
					}
				}
			}
			int ind = prevy-1;
				for(int p = prevy-1;p >= 0;p--) {
					if(grid[p][i] == 0) continue;
					if(ind+1 < size && grid[ind+1][i] == grid[p][i]) {
						grid[ind+1][i] = grid[ind+1][i] + grid[p][i];
						grid[p][i] = 0;
						continue;
					}
					grid[ind--][i] = grid[p][i];
					grid[p][i] = 0;
				}
	}
		setGrid();
		printGrid();
	}
	
}
