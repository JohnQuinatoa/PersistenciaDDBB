package ec.edu.uce.persistenciaDDBB.interfaceRepository;

import ec.edu.uce.persistenciaDDBB.model.Library;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LibraryRepository extends JpaRepository<Library, Long> {
}
