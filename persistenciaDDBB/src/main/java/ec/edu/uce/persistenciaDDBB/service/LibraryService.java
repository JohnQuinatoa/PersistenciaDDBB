package ec.edu.uce.persistenciaDDBB.service;

import ec.edu.uce.persistenciaDDBB.interfaceRepository.LibraryRepository;
import ec.edu.uce.persistenciaDDBB.model.Library;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LibraryService {

    @Autowired
    LibraryRepository libraryRepository;

    public void saveLibrary(Library library) {
        libraryRepository.save(library);
    }



}
