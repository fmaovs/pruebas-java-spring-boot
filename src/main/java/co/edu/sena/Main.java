package co.edu.sena;

import co.edu.sena.entities.Librarian;
import co.edu.sena.entities.User;
import co.edu.sena.repository.LibrarianRepository;
import co.edu.sena.repository.UserRepository;
import co.edu.sena.services.LibrarianService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

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
    private LibrarianService librarian;

    @Override
    public void run(String... args) throws Exception {
        /*Scanner sc = new Scanner(System.in);
            String nombre = sc.nextLine();
            String username = sc.nextLine();
            String email = sc.nextLine();
            String password = sc.nextLine();
            String code = sc.nextLine();
            Librarian librarian = new Librarian( = nombre, username, email, password, code);
            r.save(librarian);
            System.out.println("Desea continuar? ingrese 1 para si, 0 para no");*/


        //Librarian k = new  Librarian("Cristian", "c21" , "sdfsd" , "asdfsaf" , "347");
        //r.save(k);

        List<Librarian> lis = this.librarian.getAllLibrarian();

        for (Librarian lib : lis) {
            System.out.println(lib.getId());
            System.out.println(lib.getName());
            System.out.println(lib.getEmail());
            System.out.println(lib.getUsername());
        }

        Optional<Librarian> l1 = this.librarian.getLibrarianByCode("347");
        l1.ifPresent(lib -> lib.setEmail("laprueba@gmail.com" ));
        r.save(l1.get());




    }

        //System.out.println(lis);



    }




