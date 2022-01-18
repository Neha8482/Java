
public class BingoClass {
	public int[] array= {23,7,8,38,2};
	int x=0,y=0;
	public void check(int number1,int number2) {
		if(number1>0 && number1 < 41 && number2>0 && number2 < 41) {
			for(int i=0;i<array.length;i++) {
				if(array[i]==number1) {
					x=1;
				}
				if(array[i]==number2) {
					y=1;
				}
			}
		}
	}
	public static void main(String[] args) {
		BingoClass bingo = new BingoClass();
		bingo.check(38,7);
		if(bingo.x==1 && bingo.y==1) {
			System.out.println("BINGO");
		}
		
	}

}
