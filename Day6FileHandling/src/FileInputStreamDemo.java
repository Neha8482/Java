import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamDemo {
	public static void main(String[] args) {
		FileInputStream stream = null;
		
		try {
			stream = new FileInputStream("filewriteDemo");
			int data;
			while((data = stream.read()) != -1) {
			System.out.print((char)data);
			}
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
		
		
	//	stream = new FileInputStream("filewriteDemo");
		//System.out.println("File Input Program");
	}

}
