package ec.edu.uce.persistenciaDDBB.service;

import ec.edu.uce.persistenciaDDBB.interfaceRepository.RegisterRepository;
import ec.edu.uce.persistenciaDDBB.model.Register;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegisterService {

    @Autowired
    private RegisterRepository registerRepository;

    public void saveRegister(Register register) {
        // Verificar y/o establecer las relaciones antes de guardar
        if (register.getUser() != null && register.getLibrary() != null) {
            // Guardar el registro, Spring Data JPA manejará las relaciones
            registerRepository.save(register);
        } else {
            throw new IllegalArgumentException("Register debe tener un usuario y una biblioteca asociados.");
        }
    }



}
