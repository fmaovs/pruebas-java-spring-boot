package co.edu.sena;

import co.edu.sena.entities.Librarian;
import co.edu.sena.entities.User;
import co.edu.sena.repository.LibrarianRepository;
import co.edu.sena.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
@SpringBootApplication
public class Main implements CommandLineRunner {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);

    }

    @Autowired
    private UserRepository r;

    @Autowired
    private LibrarianRepository librarian;

    @Override
    public void run(String... args) throws Exception {

        Librarian k = new  Librarian("Sara", "s21" , "sdfsd" , "asdfsaf" , "344");
        r.save(k);

        List<Librarian> lis = this.librarian.findAll().forEach(Librarian);



    }


}