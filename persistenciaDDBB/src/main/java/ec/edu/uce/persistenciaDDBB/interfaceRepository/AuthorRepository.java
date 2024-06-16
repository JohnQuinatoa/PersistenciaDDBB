package ec.edu.uce.persistenciaDDBB.interfaceRepository;

import ec.edu.uce.persistenciaDDBB.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Long> {
}
