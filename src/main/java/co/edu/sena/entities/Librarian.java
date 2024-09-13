package co.edu.sena.entities;


import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.NoArgsConstructor;


@Entity
@DiscriminatorValue("LIBRARIAN")
@NoArgsConstructor
public class Librarian extends User{

    public Librarian(String name, String username, String password, String email, String code) {
        super(name, username, password, email);
        this.code = code;
    }

    private String code;
}
