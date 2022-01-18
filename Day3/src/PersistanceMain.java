
public class PersistanceMain {

	public static void main(String[] args) {
		Persistance persistance;
		
		persistance = new FilePersistance();
		persistance.persist();
		
	}
}
