package ec.edu.uce.persistenciaDDBB.service;

import ec.edu.uce.persistenciaDDBB.interfaceRepository.AuthorRepository;
import ec.edu.uce.persistenciaDDBB.model.Author;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthorService {

    @Autowired
    AuthorRepository authorRepository;

    public void saveAuthor(Author author) {
        authorRepository.save(author);
    }

}
