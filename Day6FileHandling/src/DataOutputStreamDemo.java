import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutputStreamDemo {
	public static void main(String[] args) {
		DataOutputStream stream = null;		
		try {
			stream = new DataOutputStream(new FileOutputStream("dataIO"));
			stream.writeInt(65);
			stream.writeFloat(12.34f);
			stream.writeChar('A');
			stream.writeBoolean(true);
			System.out.println("Data written in file");
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
