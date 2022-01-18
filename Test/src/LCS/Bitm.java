package LCS;

public class Bitm {
	  // Function to find number of bits needed to be flipped to convert A to B
    public static int countBitsFlip(int a, int b){
        int mask =1;
        int count = 0;
        int ab=0;
        while(mask < Math.max(a, b)){
            if((a & mask) == (b & mask)){
                count= count;
            }
            else{
                    count= count+1;
            }
             mask = mask << 1;
            System.out.println(mask);
            System.out.println(count);
             ab=ab+1;
        }
        return count;
        
    }
    public static void main(String[] args) {
		Bitm b = new Bitm();
		countBitsFlip(34, 7);
	}

}
