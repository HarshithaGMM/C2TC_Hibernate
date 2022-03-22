package tnsif.c2tc.b09;



import tnsif.c2tc.b09.entity.Book;
import tnsif.c2tc.b09.service.BookService;
import tnsif.c2tc.b09.service.BookServiceImpl;

public class Client {

	public static void main(String[] args) {
		BookService service= new BookServiceImpl();
		Book book=new Book();
		book.setId(102);
		book.setTitlt("Wings of fire");
		book.setAuthor("A.P.J");
		book.setPrice(100.0);
		//service.addBook(book);
	    System.out.println("************Listing total number of books*************");
		System.out.println("Total book:"+service.getBookCount());
		System.out.println("************Listing book with id 105*************");
		System.out.println("Book with ID 105:"+service.getBookById(105));
		System.out.println("**********Listing All books***********");
		for(Book bk:service.getAllBooks())
		{
		System.out.println(bk);
		}
		System.out.println("*********Listing book written by A.P.J************");
		for(Book bk:service.getAuthorBooks("A.P.J")) {
			System.out.println(bk);
		}
		System.out.println("**********Listing book on Wings of fire*********");
		for(Book bk:service.getBookByTitle("Wings of fire")) {		
			System.out.println(bk);
		}
		System.out.println("***Listing all books between 400 and 600******");
		for(Book bk:service.getBooksinPricerange( 400.0,  600.0)) {
			System.out.println(bk);
		}
			

	}

}
