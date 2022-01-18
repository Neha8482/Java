
public class StorageMain {
public static void main(String[] args) {
	Storage storage = new Storage();
	new Counter(storage);
	new Printer(storage);
}
}
