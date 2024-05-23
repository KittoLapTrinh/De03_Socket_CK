package entity;

import java.io.Serializable;
//import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import jakarta.persistence.Table;
@Entity
@Table(name = "books")
public class Book implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "ISBN", nullable = false, unique = true)
	private String ISBN;
	@Column(nullable = false)
	private String name;
	@Column(name= "publish_year", nullable = false)
	private int publishYear;
	@Column(name = "num_of_pages",nullable = false)
	private int numOfPages;
	@Column(name = "price",nullable = false)
	private double price;
	
//	@Column(name = "author")
//	private Set<String> authors;
	
	
//	@ManyToOne(fetch = FetchType.LAZY)
	@ManyToOne
	@JoinColumn(name = "publisher_id", referencedColumnName = "publisher_id")
	private Publisher publisher;

	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Book(String iSBN, String name, int publishYear, int numOfPages, double price, Publisher publisher) {
		super();
		ISBN = iSBN;
		this.name = name;
		this.publishYear = publishYear;
		this.numOfPages = numOfPages;
		this.price = price;
		this.publisher = publisher;
	}

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPublishYear() {
		return publishYear;
	}

	public void setPublishYear(int publishYear) {
		this.publishYear = publishYear;
	}

	public int getNumOfPages() {
		return numOfPages;
	}

	public void setNumOfPages(int numOfPages) {
		this.numOfPages = numOfPages;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Publisher getPublisher() {
		return publisher;
	}

	public void setPublisher(Publisher publisher) {
		this.publisher = publisher;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	

	
	

	
	
	
	
}
