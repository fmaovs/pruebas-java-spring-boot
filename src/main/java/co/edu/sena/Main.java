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
    private LibrarianRepository r;

    public List<Librarian> getAllLibrarian(){
        return (List<Librarian>) this.r.findAll();
    };

    public Librarian getLibrarianByCode(String code){
        return this.r.findByCode(code);
    }

    @Override
    public void run(String... args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name");
        String name = sc.nextLine();
        System.out.println("Enter username");
        String username = sc.nextLine();
        System.out.println("Enter password");
        String password = sc.nextLine();
        System.out.println("Enter email");
        String email = sc.nextLine();
        System.out.println("Enter code");
        String code = sc.nextLine();
        Librarian librarian = new Librarian(name, username, password, email, code);
        r.save(librarian);


        //Librarian k = new  Librarian("Cristian", "c21" , "sdfsd" , "asdfsaf" , "347");
        //r.save(k);

        List<Librarian> lis = getAllLibrarian();

        System.out.println("Librarians: ");
        for (Librarian lib : lis) {
            System.out.println(lib.getId());
            System.out.println(lib.getName());
            System.out.println(lib.getEmail());
            System.out.println(lib.getUsername());
            System.out.println("----------------");
        }

        System.out.println("Enter code of librarian");
        String c = sc.nextLine();
        Librarian l1 = getLibrarianByCode(c);
        System.out.println("Enter new email of " + l1.getName());
        String e = sc.nextLine();
        l1.setEmail(e);
        r.save(l1);
        System.out.println("Librarians saved");




    }

        //System.out.println(lis);



    }




