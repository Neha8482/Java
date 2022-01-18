import java.util.Scanner;

class Player{
	char piece;
	String name;
	public Player(char piece, String name) {
		this.piece = piece;
		this.name  = name;
	}
}
class Game{
	char[][] board;
	int boardSize;
	public Game(int boardSize) {
		this.boardSize  = boardSize;
		board = new char[boardSize][boardSize];
		for(int i=0; i < boardSize;i++) {
			for(int j =0; j < boardSize;j++) {
				board[i][j] = '-';
			}
		}
	}
	void printBoard() {
		for(int i=0; i < boardSize;i++) {
			for(int j =0; j < boardSize;j++) {
			  System.out.println(board[i][j]+" ");
			}
			System.out.println();
		}
	}
	int move(Player player,int row,int col) throws IllegalArgumentException{
		if(row < 0 || col < 0 || row >= this.boardSize || col >=  this.boardSize || board[row][col] != '-') {
			throw new IllegalArgumentException("invalid Move");
		}else {
			boolean winRow = true,winCol = true,winDiag = true,winRevDiag = true;
			board[row][col] = player.piece;
			for(int i=0; i < boardSize;i++) {
				if(board[i][col] != player.piece) winRow = false;

				if(board[row][i] != player.piece) winCol = false;

				if(board[i][i] != player.piece) winDiag  = false;

				if(board[boardSize-1-i][boardSize-i-1] != player.piece) winRevDiag= false;
			}
			if(winCol || winRevDiag || winRow || winDiag ) return 1;
			return 0;
		}
	}
	
	
}


public class TicTacToe {
	public static void main(String[] args) {
		int boardSize= 3;
		int noofPlayer = 2;
		Scanner sc = new Scanner(System.in);
		Game game = new Game(3);
		Player[] player = new Player[2];
		String input1 = sc.nextLine();
		player[0] = new Player(input1.charAt(0),input1.substring(2));
		String input2 = sc.nextLine();
		player[1] = new Player(input2.charAt(0),input2.substring(2));
		game.printBoard();
		int i =0;
		int flag = 0;
		int row,col;
		while(i < boardSize) {
			String inp = sc.nextLine();
			if(inp.equals("exit")) break;
			else {
				 row = Integer.parseInt(String.valueOf(inp.charAt(0)));
				 col = Integer.parseInt(String.valueOf(inp.charAt(2)));
			}
			int currentPlayer = i%noofPlayer;
			try {
				if(game.move(player[currentPlayer],row,col) == 0) continue;
				else{
					System.out.println(player[currentPlayer].name);
					flag = 1;
					break;
				}
			}catch(IllegalArgumentException e) {
				System.out.println(e);
			}
			i++;
		}
		if(flag == 0)
			System.out.println("GameOver");
	}
}