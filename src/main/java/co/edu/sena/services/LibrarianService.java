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




}
