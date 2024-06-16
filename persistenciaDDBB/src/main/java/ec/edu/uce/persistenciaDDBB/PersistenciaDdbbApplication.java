package ec.edu.uce.persistenciaDDBB;

import ec.edu.uce.persistenciaDDBB.model.*;
import ec.edu.uce.persistenciaDDBB.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;



@SpringBootApplication
public class PersistenciaDdbbApplication implements CommandLineRunner {

	@Autowired
	private AuthorService authorService;

	@Autowired
	private UserService userService;

	@Autowired
	private LibraryService libraryService;

	@Autowired
	private RegisterService registerService;

	@Autowired
	private MembershipService membershipService;

	@Autowired
	private BookService bookService;


	public static void main(String[] args) {
		SpringApplication.run(PersistenciaDdbbApplication.class, args);

	}

	@Override
	public void run(String... args) throws Exception {

		// Creacion de  Autores
		Author author1 = new Author("Juan", "Quinatoa");
		authorService.saveAuthor(author1);
		Author author2 = new Author("Richard", "Perez");
		authorService.saveAuthor(author2);
		Author author3 = new Author("Steven", "Sisa");
		authorService.saveAuthor(author3);


		// Creacion de Bibliotecas
		Library library1 = new Library("Library 1", "Calle 1");
		libraryService.saveLibrary(library1);
		Library library2 = new Library("Library 2", "Calle 2");
		libraryService.saveLibrary(library2);
		Library library3 = new Library("Library 3", "Calle 3");
		libraryService.saveLibrary(library3);


		// Creacion de Autores
		User user1 = new User("Fernando", "Douglas");
		userService.saveUser(user1);
		User user2 = new User("Naidelin", "Tabango");
		userService.saveUser(user2);
		User user3 = new User("John", "Quinatoa");
		userService.saveUser(user3);


		// Crear y guardar el registro
		// El registro depende de que el usuario y la biblioteca ya existan en la base de datos.
		Register register1 = new Register(new Date());
		register1.setUser(user1); // Asignar el usuario al registro
		register1.setLibrary(library2); // Asignar la biblioteca al registro
		registerService.saveRegister(register1);


		// Crear y guardar la membresia
		// La membresia depende de que el registro exista en la base de datos.
		Membership membership1 = new Membership("Membresia 1");
		membership1.setRegister(register1);
		membershipService.saveMembership(membership1);

		// Crear y guardar el libro
		Book book1 = new Book("Book 1", "Editorial 1");
		book1.setAuthor(author1);
		book1.setMembership(membership1);
		bookService.saveBook(book1);
	}


}
