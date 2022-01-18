import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderDEmo {
public static void main(String[] args) {
	BufferedReader buffer = null;
	
	try {
		buffer = new BufferedReader(new FileReader("BufferWriter"));
		System.out.println(buffer.readLine());
		
		buffer.close();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
