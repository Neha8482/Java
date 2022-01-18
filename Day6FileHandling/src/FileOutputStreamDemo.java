import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {
	public static void main(String[] args) {
		FileOutputStream stream = null;
		try {
			stream  = new FileOutputStream("filewritedemo",true);
			String str = "Welcome";
			byte[] strToBytes = str.getBytes();
			    stream.write(strToBytes); //write accepts either byte or int
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
