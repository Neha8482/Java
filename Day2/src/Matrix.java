import java.util.Arrays;

public class Matrix {
	private int t;

	private int r;
	private int c;
	private int matrix[][];
	public Matrix() {
		matrix=new int[10][10];
		
	}
	public Matrix(int r,int c){
		this.r=r;
		this.c=c;
	}
	
	public void setElement(int r,int c,int value) {
		for(int i=0; i < r;i++) {
			for(int j =0; j <c; j++) {
				if(value>0) {
				matrix[i][j]=value;
				System.out.print("\t"+value);
			}}
				System.out.println("s");
			}
		
	}
	public void transpose(int r,int c) {
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;i++) {
				t=matrix[i][j];
				matrix[i][j]=matrix[j][i];
				matrix[j][i]=t;
			}
		}
	}
	
	public void print(int r,int c) {
		for(int i=0;i<c;i++) {
			for(int j=0;j<r;i++) {
				System.out.print("\t"+ matrix[i][j]);
			}
			System.out.println("p");
		}
	}
	public static void main(String[] args) {
		Matrix matrix1 = new Matrix();
		matrix1.setElement(3,3,4);
		matrix1.transpose(3,3);
		matrix1.print(3,3);
		
		
	}
	@Override
	public String toString() {
		return "Matrix [t=" + t + ", r=" + r + ", c=" + c + ", matrix=" + Arrays.toString(matrix) + "]";
	}
	
	
}
