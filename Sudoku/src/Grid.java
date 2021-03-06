
public class Grid {
	int[][] grid;
	int size;
	
	Grid(int size){
		this.size = size;
		grid= new int[size][size];
		printGrid();
		Character.forDigit(4,9);
	}
	
	void setGrid() {
		
		
	}
	
	void printGrid() {
		for(int i =0 ; i < size;i++) {
			for(int j =0; j< size;j++) {
				System.out.print(grid[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	boolean validateMove(int row,int col,int num) {
		if(checkRow(num,row,col) || checkCol(num,row,col) || checkGrid(num,row,col))
			return false;
		return true;
	}
	
	boolean checkRow(int num,int rownum,int colnum) {
		for(int j=0; j < colnum;j++) {
			if(j == colnum) continue;
			if(grid[rownum][j] == num) return true;
		}
		return false;
	}
	
	boolean checkCol(int num, int rownum,int colnum) {
		for(int i=0; i< rownum;i++) {
			if(i == rownum) continue;
			if(grid[i][colnum] == num) return true;
		}
		return false;
	}
	
   boolean checkGrid(int num,int rownum,int colnum) {
	   int gridRow = rownum - (rownum%size);
	   int gridCol = colnum = (colnum%size);
	   for(int i = gridRow; i < gridRow+3; i++) {
		   for(int j =gridCol; j < gridCol+3;j++) {
			   if(i == rownum && j == colnum) continue;
			   if(grid[i][j] == num) return true;
		   }
	   }
	   reutrn false;
   }
}
