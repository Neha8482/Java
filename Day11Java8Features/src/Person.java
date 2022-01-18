
public class Person {

	private String name;
	private int age;
	
	public Person(){
		
	}
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
	public int sortByName(Person p1,Person p2) {
		return p1.getName().compareTo(p2.getName());
	}
	
	public static int sortByAge(Person p1,Person p2) {
		Integer age1 = p1.getAge();
		Integer age2= p2.getAge();
		return age1.compareTo(age2);
	}
}











