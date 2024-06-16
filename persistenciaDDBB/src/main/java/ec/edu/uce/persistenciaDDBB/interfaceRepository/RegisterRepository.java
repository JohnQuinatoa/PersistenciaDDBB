package ec.edu.uce.persistenciaDDBB.interfaceRepository;

import ec.edu.uce.persistenciaDDBB.model.Register;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RegisterRepository extends JpaRepository<Register, Long> {
}
