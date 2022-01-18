public class Income {

	private int tax;
	public int check(int income) {
		if(income > 0 && income < 180000) {
			tax=0;
		}
		else if(income > 180000 && income < 300000) {
			tax=income*10/100;
		}
		else if(income > 300000 && income < 500000) {
			tax=income*20/100;
		}
		else if(income > 500000 && income < 1000000) {
			tax=income*30/100;
		}
		return tax;
	}
	public static void main(String[] args) {
		int tax1;
		Income inc = new Income();
		tax1=inc.check(450000);
		System.out.println(tax1);
	}
}
