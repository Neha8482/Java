import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectINputStreamUserDemo {
public static void main(String[] args) {
	ObjectInputStream stream =null;
	
	try {
		stream = new ObjectInputStream(new FileInputStream("userIO"));
		User user1 = (User)stream.readObject();
		System.out.println(user1);
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
