package tnsif.c2tc.b09.service;

import java.util.List;

import tnsif.c2tc.b09.dao.BookDao;
import tnsif.c2tc.b09.dao.BookDaoImpl;
import tnsif.c2tc.b09.entity.Book;

public class BookServiceImpl implements BookService {
	BookDao bd;
	public BookServiceImpl()
	{
		bd=new BookDaoImpl();
	}

	@Override
	public void addBook(Book book) {
		bd.getTranscation();
		bd.addBook(book);
		bd.endTranscation();
		
	}

	@Override
	public Long getBookCount() {
		
		return bd.getBookCount();
	
}

	@Override
	public Book getBookById(int i) {
		Book book= bd.getBookById(i);
		 return book;
		
	}

	@Override
	public List<Book> getAllBooks() {
		List<Book> list=bd.getAllBooks();
		return list;
	}

	@Override
	public List<Book> getAuthorBooks(String string) {
		List<Book> list=bd.getAuthorBooks(string);
		return list;
	}

	@Override
	public List<Book> getBookByTitle(String string) {
		List<Book> list=bd.getBookByTitle(string);
		return list;
	}

	@Override
	public List<Book> getBooksinPricerange(double i, double j) {
		List<Book> list=bd. getBooksinPricerange(i, j);
		return list;
	}
}