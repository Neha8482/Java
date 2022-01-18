public class AniamlMain {
    public static void main(String[] args) {
	
    	Animal animal;
    	
    	animal=new Dog();
    	animal.eat();
    	animal.speak();
    	
    	animal = new Cat();
    	animal.eat();
    	animal.speak();
    	
    	Reptile rep = new Snake();
    	rep.speak();
    	
    	animal = new Snake();
    	animal.eat();
    	animal.speak();
    	
    	
	}
}
