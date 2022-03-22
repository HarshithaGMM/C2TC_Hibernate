package tnsif.c2tc.b09.service;

import java.util.List;

import tnsif.c2tc.b09.entity.Book;

public interface BookService {

	public void addBook(Book book);

	public Long getBookCount();

	public Book getBookById(int i);

	public List<Book> getAllBooks();

	public List<Book> getAuthorBooks(String string);

	public List<Book> getBookByTitle(String string);

	public List<Book> getBooksinPricerange(double i, double j);

	

	

}
