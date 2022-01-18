
public abstract class Persistance {

	public abstract void persist();
}

class FilePersistance extends Persistance{

	@Override
	public void persist() {
		// TODO Auto-generated method stub
		System.out.println("File");
	}
	
}

class DatabasePersistance extends Persistance{

	@Override
	public void persist() {
		// TODO Auto-generated method stub
		System.out.println("Database");
	}
	
}
