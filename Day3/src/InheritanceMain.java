public class InheritanceMain {
	public static void main(String[] args) {
		Person person = new Person("Shruti",34);
		//person.setName("shruti");
	//	person.setAge(34);
		System.out.println("Name : "+person.getName());
		System.out.println("Age : "+person.getAge());
		
		Employee employee = new Employee("Abisha",45,353,"Developer");
		System.out.println(employee);
	}
	

}
