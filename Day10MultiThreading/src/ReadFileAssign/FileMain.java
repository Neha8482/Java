package ReadFileAssign;

public class FileMain {
	public static void main(String[] args) {
		GetFile file = new GetFile();
		new ReadFile(file);
		new CalculateFact(file);
	}
}
