package ec.edu.uce.persistenciaDDBB.service;

import ec.edu.uce.persistenciaDDBB.interfaceRepository.MembershipRepository;
import ec.edu.uce.persistenciaDDBB.model.Membership;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MembershipService {

    @Autowired
    MembershipRepository membershipRepository;

    public void saveMembership(Membership membership) {
        // Verificar y/o establecer las relaciones antes de guardar
        if (membership.getRegister() != null) {
            // Guardar el registro, Spring Data JPA manejará las relaciones
            membershipRepository.save(membership);
        } else {
            throw new IllegalArgumentException("Membership debe tener un registro asociado.");
        }
    }

}
