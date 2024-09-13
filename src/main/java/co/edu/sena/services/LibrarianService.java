package co.edu.sena.services;

import co.edu.sena.entities.Librarian;
import co.edu.sena.repository.LibrarianRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LibrarianService {

    @Autowired
    LibrarianRepository librarianRepository;

    public List<Librarian> getAllLibrarian(){
        return (List<Librarian>) this.librarianRepository.findAll();
    };

    public Optional<Librarian> getLibrarianByCode(String code){
        return this.librarianRepository.findByCode(code);
    }


}
