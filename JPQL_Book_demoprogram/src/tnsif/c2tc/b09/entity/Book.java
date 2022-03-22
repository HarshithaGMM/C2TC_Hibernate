package tnsif.c2tc.b09.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table( name ="books")
@NamedQueries(@NamedQuery(name ="getAllBooks", query = "select b from Book b"))

public class Book implements Serializable{
	
	private static final long serialVersionUID = 1L;
	@Id
	private int id;
	private String titlt;
	private String author;
	private Double price;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitlt() {
		return titlt;
	}
	public void setTitlt(String titlt) {
		this.titlt = titlt;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Book [id=" + id + ", titlt=" + titlt + ", author=" + author + ", price=" + price + "]";
	}
	
	

}
