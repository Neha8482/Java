import java.util.Scanner;

class Player{
	char playpiece;
	String name;
	public Player(char playpiece, String name) {
		super();
		this.playpiece = playpiece;
		this.name = name;
	}
}
public class TicTac {
public static void main(String[] args) {
	int noOfPlayer= 2;int gridSize = 3;
	Scanner sc = new Scanner(System.in);
	Player[] players = new Player[2];
	for(int i =0 ; i < noOfPlayer;i++) {
		players[i] = new Player(sc.next().charAt(0),sc.nextLine()); 
	}
	char[][] grid = new char[gridSize][gridSize];
	for(int i =0; i < gridSize;i++) {
		for(int j =0; j < gridSize;j++) {
			grid[i][j] = '-';
			System.out.println(grid[i][j]+" ");
		}
		System.out.println();
	}
	int stop = 0;
	int i = 0;char currentChar = players[i].playpiece;char prev = ' ';
	
	while(stop == 0) {
		try {
			int x  = sc.nextInt();
			int y = sc.nextInt();
			if(grid[x-1][y-1] != '-') {
				System.out.println("Invalid move");
				continue;
			}
			if(grid[x-1][y-1]  == prev)
				continue;
			grid[x-1][y-1] = players[i++ % noOfPlayer].playpiece;
			prev = currentChar;
			for(int k =0; k < gridSize;k++) {
				for(int j =0; j < gridSize;j++) {
					System.out.println(grid[k][j]+" ");
				}
				System.out.println();
			}
		}catch(Exception e) {
			stop = 1;
		}
	}
	
	
}
}
