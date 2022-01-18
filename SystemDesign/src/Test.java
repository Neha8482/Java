import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Test {
	int[][] grid = new int[4][4];
	int size = 4;
public static void main(String[] args) {
	Test t = new Test();
	t.setGrid();
	t.printGrid();
	System.out.println();
	t.moveLeft();
	t.printGrid();
	System.out.println();
	t.setGrid();
	t.printGrid();
	System.out.println();
	t.moveLeft();
	t.printGrid();
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
	int p = random.nextInt(emptySpaces.size());
	int x = emptySpaces.get(p).get(0);
	int y = emptySpaces.get(p).get(1);
	grid[x][y] = 2;
}


}
