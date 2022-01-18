import java.io.FileWriter;
import java.io.IOException;

public class FilewriterDemo {
public static void main(String[] args) {
	try {
		FileWriter file = new FileWriter("Filewriterfile");
		file.write("This is character stream example");
		file.close();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
