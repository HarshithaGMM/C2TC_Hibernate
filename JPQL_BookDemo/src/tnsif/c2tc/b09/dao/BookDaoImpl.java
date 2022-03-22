package tnsif.c2tc.b09.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import tnsif.c2tc.b09.entity.Book;


public class BookDaoImpl implements BookDao{
	EntityManager em;
	public BookDaoImpl()
	{
		em=Configuration.getEntityManager();
	}

	@Override
	public void getTranscation() {
		em.getTransaction().begin();
		
	}


	@Override
	public void endTranscation() {
		em.getTransaction().commit();
		
	}

	@Override
	public void addBook(Book book) {
		em.persist(book);
		
	}

	@Override
	public Long getBookCount() {
		String query="Select COUNT(book.id) from Book book";
		TypedQuery<Long> t=em.createQuery(query,Long.class);
		Long count=t.getSingleResult();
		return count;
	}

	@Override
	public Book getBookById(int i) {
		Book book=em.find(Book.class, i);
		
		return book;
	}

	@Override
	public List<Book> getAllBooks() {
		Query query=em.createNamedQuery("getAllBooks");
		List<Book> list=query.getResultList();
		return list;
	}

	@Override
	public List<Book> getAuthorBooks(String string) {
		String query="Select b from Book b "+ " where b.author like: name";
		TypedQuery<Book> t= em.createQuery(query, Book.class);
		t.setParameter("name","%"+string+"%");
	    List<Book> list=t.getResultList();
			return list;
	}

	@Override
	public List<Book> getBookByTitle(String string) {
		String query="Select b from Book b "+ " where b.titlt like: name";
		TypedQuery<Book> t= em.createQuery(query, Book.class);
		t.setParameter("name","%"+string+"%");
	    List<Book> list=t.getResultList();
			return list;
	}

	@Override
	public List<Book> getBooksinPricerange(double i, double j) {
		String query="Select b from Book b "+ " where b.price between:i and :j";
		TypedQuery<Book> t= em.createQuery(query, Book.class);
		t.setParameter("i",i);
		t.setParameter("j",j);
	    List<Book> list=t.getResultList();
		return list;
	}


	}


