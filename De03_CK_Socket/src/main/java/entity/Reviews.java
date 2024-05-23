package entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "reviews")
public class Reviews implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Column(nullable = false)
	private int rating;
	@Column(name = "comment")
	private String comment;
	
	@Id
	@ManyToOne
	@JoinColumn(name = "ISBN", referencedColumnName = "ISBN")
	private Book book;
	
	@Id
	@ManyToOne
	@JoinColumn(name = "person_id", referencedColumnName = "person_id")
	private Person person;
	
}
