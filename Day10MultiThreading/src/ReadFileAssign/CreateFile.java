package ReadFileAssign;

import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class CreateFile {
	public static void main(String[] args) {
		int[] arr = new int[5]; 
		arr[0]=1;
		arr[1]=3;
		arr[2]=4;
		arr[3]=7;
		arr[4]=2;
		
		BufferedWriter file = null;
		try {
			file= new BufferedWriter(new FileWriter("Numbers.txt"));
			for(int i =0 ; i< arr.length; i++) {
				file.write(Integer.toString(arr[i])+"\n");
				//file.newLine();
			}
			file.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
