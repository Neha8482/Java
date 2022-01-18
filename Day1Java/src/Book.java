
public class Book {
	private String bookName;
	private int bookCost;
	private String bookPublication;
	
	Book(String bookName , int bookCost,String bookPublication){
		this.bookName=bookName;
		this.bookCost=bookCost;
		this.bookPublication=bookPublication;
		
	}

	@Override
	public String toString() {
		return "Book [bookName=" + bookName + ", bookCost=" + bookCost + ", bookPublication=" + bookPublication + "]";
	}

	
	
	

}
