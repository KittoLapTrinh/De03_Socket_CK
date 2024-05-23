# De03_Socket_CK
# Class diagram
![image](https://github.com/KittoLapTrinh/De03_Socket_CK/assets/96908923/a5fc5c4b-a4d4-46b8-91ad-c5abf4023d3d)
# Database diagram
![image](https://github.com/KittoLapTrinh/De03_Socket_CK/assets/96908923/2b2061ba-f207-4728-b0ce-757bc6dfd4c6)
# Author.java
```
@Entity
@Table(name = "books_authors")
public class Author implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "author",nullable = false)
	private String author;
	
	@Id
	@ManyToOne
	@JoinColumn(name= "ISBN", referencedColumnName = "ISBN")
	private Book book;
}
```
# Book.java
```
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
	@ManyToOne
	@JoinColumn(name = "publisher_id", referencedColumnName = "publisher_id")
	private Publisher publisher;
}
```
# BookTranslation.java
```
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
```

# Person.java
```
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
```
# Publisher.java
```
@Entity
@Table(name = "publishers")
public class Publisher {
	@Id
	@Column(name = "publisher_id", nullable = false, unique = true)
//	@Column(name = "publisher_id")
	private String id;
	@Column(name = "name", nullable = false)
	private String name;
	@Column(nullable = false)
	private String address;
	@Column(nullable = false)
	private String email;
	@Column(nullable = false)
	private String phone;
}
```
# Review.java
```
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
```


