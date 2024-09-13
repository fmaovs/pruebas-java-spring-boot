package co.edu.sena.repository;

import co.edu.sena.entities.Librarian;
import jakarta.transaction.Transactional;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface LibrarianRepository extends CrudRepository<Librarian, String> {
    public Librarian findByCode(String code);

    //public Optional<Librarian> putLibrarian(Librarian librarian);
}
