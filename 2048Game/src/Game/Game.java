package Game;

import java.util.Scanner;

public class Game {
	void playGame() {
		Grid grid = new Grid(4);
		Scanner sc = new Scanner(System.in);
		while(true) {
			if(grid.checkGridFull()) {
				System.out.println("Grid Full");
				break;	
			}
			if(grid.check2048()) {
				System.out.println("Winner");
				break;
			}
			switch(sc.nextInt()) {
			case 1:
				grid.moveLeft();
				break;
			case 2:
				grid.moveRight();
				break;
			case 3: 
				grid.moveUp();
				break;
			case 4:
				grid.moveDown();
				break;
			default:
				System.out.println("Enter moves between 1 -4");
				break;
			}
		}
		
	}
}
