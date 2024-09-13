package co.edu.sena.entities;

import jakarta.persistence.*;
import lombok.*;



@Getter
@Setter
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="type")
@NoArgsConstructor
@Table(name="users")
public abstract class User {

	public User(String name, String username, String password, String email) {
		this.name = name;
		this.username = username;
		this.password = password;
		this.email = email;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	protected Long id;

	protected String name;

	@Column(unique = true)
	protected String username;

	protected String password;

	protected String email;


}
