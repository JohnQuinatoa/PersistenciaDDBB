package ec.edu.uce.persistenciaDDBB.interfaceRepository;

import ec.edu.uce.persistenciaDDBB.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
