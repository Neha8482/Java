import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedOutputDemo {
public static void main(String[] args) {
	try {
		BufferedOutputStream buffer = new BufferedOutputStream(new FileOutputStream("BufferFile"));
		buffer.write("This is buuferOutputStream Demo".getBytes());
		buffer.close();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	
	
}
}
