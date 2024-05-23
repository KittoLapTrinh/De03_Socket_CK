package entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

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
