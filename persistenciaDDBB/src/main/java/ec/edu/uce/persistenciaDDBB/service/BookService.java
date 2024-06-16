package ec.edu.uce.persistenciaDDBB.service;

import ec.edu.uce.persistenciaDDBB.interfaceRepository.BookRepository;
import ec.edu.uce.persistenciaDDBB.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {

    @Autowired
    BookRepository bookRepository;

    public void saveBook(Book book) {
        // Verificar y/o establecer las relaciones antes de guardar
        if (book.getMembership() != null && book.getAuthor() != null) {
            // Guardar el registro, Spring Data JPA manejará las relaciones
            bookRepository.save(book);
        } else {
            throw new IllegalArgumentException("Book debe tener una membresia y un autor asociados.");
        }

    }

}
