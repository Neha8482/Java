public class ResourceThreadMain {
public static void main(String[] args) {

	Resource resource = new Resource();
	new ResourceThread(resource,"Java");
	new ResourceThread(resource,"MultiThreading");
	new ResourceThread(resource,"Welcome");
}
}
