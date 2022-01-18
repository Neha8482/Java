import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int noOfPlayers = sc.nextInt();
		int id = 1;
		List<Player> playerslist = new ArrayList<>();
		for(int i =0; i < noOfPlayers;i++) {
			playerslist.add(new Player(id++,sc.next()));
		}
		int noOfSnakes = sc.nextInt();
		int noOfladders = sc.nextInt();
		
		Game game = new Game();
		game.playGame();
	}

}
