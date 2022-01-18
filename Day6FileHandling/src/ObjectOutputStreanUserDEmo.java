import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectOutputStreanUserDEmo {
public static void main(String[] args) {
	ObjectOutputStream stream =null;
	User user = new User("user","password");
	try {
		stream = new ObjectOutputStream(new FileOutputStream("userIO"));
		stream.writeObject(user);
		//Object of serialize cannot be persisted
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
}
