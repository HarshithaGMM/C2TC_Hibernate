package tnsif.c2tc.b09.dao;

import java.util.List;

import tnsif.c2tc.b09.entity.Book;

public interface BookDao {

	Long getBookCount();

	void getTranscation();

	void addBook(Book book);

	void endTranscation();


	public List<Book> getAllBooks();

	public Book getBookById(int i);

	

	public List<Book> getAuthorBooks(String string);

	public List<Book> getBookByTitle(String string);

	public List<Book> getBooksinPricerange(double i, double j);

	

	

	


	

}
