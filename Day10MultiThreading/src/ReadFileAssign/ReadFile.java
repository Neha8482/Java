package ReadFileAssign;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile extends Thread {

	private GetFile file;
	public ReadFile(GetFile file) {
		this.file=file;
		start();
	}
	
	@Override
	public void run() {
		int number;
		int i=0;
		BufferedReader file1 = null;
		try {
			file1 = new BufferedReader(new FileReader("Numbers.txt"));
			while(i < 5) {
				number = Integer.parseInt(file1.readLine());
				//System.out.println(number);
				file.setNum(number);
				i++;
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
