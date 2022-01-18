import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectOutputStreamDEmo {
public static void main(String[] args) {
	
	ObjectOutputStream stream = null;
	try {
		stream = new ObjectOutputStream(new FileOutputStream("stringIO"));
		String str = "Hello World";
		stream.writeObject(str);
		System.out.println("String written in file");
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}finally {
		if(stream != null) {
			try {
				stream.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	
}
}
