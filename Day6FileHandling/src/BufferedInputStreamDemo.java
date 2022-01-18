import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class BufferedInputStreamDemo {
public static void main(String[] args) {
	BufferedInputStream buffer = null;
	
	try {
		buffer = new BufferedInputStream(new FileInputStream("BufferFile"));
		System.out.println(buffer.read());
		buffer.close();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
