package ec.edu.uce.persistenciaDDBB.interfaceRepository;

import ec.edu.uce.persistenciaDDBB.model.Membership;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MembershipRepository extends JpaRepository<Membership, Long> {
}
