package LCS;

public class CopySetBits {
	public static int copybit(int a, int b , int l, int r) {
		int mask;
		if(l < 1 || r > 32)
			return 0;
		for(int i=l ; i <= r; i++) {
			mask = 1 << i-1;
			
			if((b & mask) > 0)
				a =a | mask;
		}
		return a;
		
	}
	
	public static void main(String[] args) {
		System.out.println(copybit(10, 13, 2, 3));
	}

}
