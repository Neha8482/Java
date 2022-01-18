public class User {

	private int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) throws AgeException {
		if(age < 18) {
			throw new AgeException();
		}
		else {
		   this.age = age;
	    }
	}
	
	public static void main(String[] args) {
		User user = new User();
		try {
			user.setAge(13);
		} catch (AgeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Age is : "+user.getAge());
	}
}
