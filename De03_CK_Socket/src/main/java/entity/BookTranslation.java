package entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "book_translations")
public class BookTranslation implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Column(name = "translate_name", nullable = false)
	private String translateName;
	@Column(name = "language", nullable = false)
	private String language;
	
	@Id
//	@OneToOne(fetch = FetchType.LAZY)
	@OneToOne
	@JoinColumn(name = "ISBN", referencedColumnName = "ISBN")
	private Book book;

	public String getTranslateName() {
		return translateName;
	}

	public void setTranslateName(String translateName) {
		this.translateName = translateName;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public BookTranslation() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BookTranslation(String translateName, String language, Book book) {
		super();
		this.translateName = translateName;
		this.language = language;
		this.book = book;
	}


	

	
}
