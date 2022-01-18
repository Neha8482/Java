
public class IsSubsequence {
	public static boolean isSubsequence(String s, String t) {
        int a = s.length();
        int b= t.length();
        boolean ti[][] = new boolean[a+1][b+1];
        for(int i=0; i < a+1; i++){
            for(int j=0; j < b+1; j++){
                if(i==0){
                    ti[i][j]=true;
                }
                else if(j==0){
                    ti[i][j]=false;
                }
                else if(s.charAt(i-1) == t.charAt(j-1)){
                    ti[i][j]=true;
                }
                else{
                    ti[i][j] = ti[i-1][j] || ti[i][j-1];
                }
                System.out.print(ti[i][j]+" ");
            }
            System.out.println();
        }
        return ti[a][b];
    }
	public static void main(String[] args) {
		isSubsequence("abc", "ahbgdc");
	}

}
