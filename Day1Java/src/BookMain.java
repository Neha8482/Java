
public class BookMain {
	public Book createbook(String bookName,int bookCost,String bookPublication) {
		//Can be done either by getters setters or by the constructor 
		//here constructor is used in that place book.set can be used to set the values
		//and then book.get to get the values
		
		Book book = new Book(bookName,bookCost,bookPublication);	
		return book;
	}
	public void display(Book book) {
		System.out.println(book);
	}
	public static void main(String[] args) {
		BookMain bookMain = new BookMain();
		Book book = bookMain.createbook("karty", 345, "Shree");
		bookMain.display(book);
	}

}
