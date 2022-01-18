package LCS;

public class CountBits {
	public static int countSetBits(int n){
        int mul=1;
        int m=1;
        int c=0;
         if(n% 2 ==0){
                m=(int)Math.pow(2,mul);
                c=c+n/m;
            }
            else{
                m =(int) Math.pow(2,mul);
                c=c+((n-1)/m)+1;
            }
        while((int)Math.pow(2,mul) <= n ){
            if(n% 2 ==0){
                m=(int)Math.pow(2,mul);
                c=c+n/m;
            }
            else{
                m =(int) Math.pow(2,mul);
                c=c+((n-1)/m)+1;
            }
            mul=mul+1;
            System.out.println(c);
            System.out.println(mul);
        }
        return c;
        
    }
	 public static int countSetBitss(int n){
	        int mul= 0;
	        int m = 0 ;
	        n=n+1;
	        int numone;
	        int c=0;
	        
	        while(Math.pow(2,mul) <= n){
	        	System.out.println("1111111");
	            m=(int)Math.pow(2,mul);
	            System.out.println(m);
	            int u = (int)n/(m);
	            numone = (int)(u/2);
	            numone = numone *m;
	            System.out.println(numone +" it");
	            if(u % 2 != 0) {
	            	numone = numone + n%m;
	            	System.out.println(numone+" here");
	            }
	            System.out.println(numone +" j");
	            c= c+ numone ;
	            mul = mul+1;
	            System.out.println("222222");
	        }
	        return c;
	    }
	 static int countSetBi(int n)
	 {
	  
	     // Ignore 0 as all the bits are unset
	     n++;
	  
	     // To store the powers of 2
	     int powerOf2 = 2;
	  
	     // To store the result, it is initialized
	     // with n/2 because the count of set
	     // least significant bits in the integers
	     // from 1 to n is n/2
	     int cnt = n / 2;
	  
	     // Loop for every bit required to represent n
	     while (powerOf2 <= n)
	     {
	  System.out.println(powerOf2);
	         // Total count of pairs of 0s and 1s
	         int totalPairs = n / powerOf2;
	  
	         // totalPairs/2 gives the complete
	         // count of the pairs of 1s
	         // Multiplying it with the current power
	         // of 2 will give the count of
	         // 1s in the current bit
	         cnt += (totalPairs / 2) * powerOf2;
	  
	         // If the count of pairs was odd then
	         // add the remaining 1s which could
	         // not be groupped together
	         cnt += (totalPairs % 2 == 1) ?
	                       (n % powerOf2) : 0;
	  
	         // Next power of 2
	         powerOf2 <<= 1;
	     }
	  
	     // Return the result
	     return cnt;
	 }
	 public static void main(String[] args) {
		System.out.println(countSetBitss(14));
	}
}
