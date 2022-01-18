import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterDemo {
public static void main(String[] args) {
	try {
		BufferedWriter buffer = new BufferedWriter(new FileWriter("BufferWriter"));
		buffer.write("This is Buffered Writer Demo");
		buffer.close();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
}
