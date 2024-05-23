package entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "people")
public class Person implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "person_id", nullable = false, unique = true)
	private int id;
	@Column(name = "last_name", nullable = false)
	private String lastName;
	@Column(name = "first_name" , nullable = false)
	private String firstName;
	@Column(nullable = false)
	private String email;
	
	@Column(name = "professional_title", nullable = false)
	private String professionalTitle;
	
}
