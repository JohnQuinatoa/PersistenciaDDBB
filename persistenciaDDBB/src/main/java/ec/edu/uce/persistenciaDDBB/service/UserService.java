package ec.edu.uce.persistenciaDDBB.service;

import ec.edu.uce.persistenciaDDBB.interfaceRepository.UserRepository;
import ec.edu.uce.persistenciaDDBB.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public void saveUser(User user) {
        userRepository.save(user);
    }
}
