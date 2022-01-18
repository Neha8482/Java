import java.io.Serializable;

public class User implements Serializable {

	private String userName;
	private String password;
	public User(String name, String pass) {
		// TODO Auto-generated constructor stub
		this.userName = name;
		this.password = pass;
	}
	@Override
	public String toString() {
		return "User [userName=" + userName + ", password=" + password + "]";
	}
}
