package ec.edu.uce.persistenciaDDBB.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "Autor")
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_author;
    @Column
    private String name_author;
    @Column
    private String lastname_author;

    //Registro de uno a muchos con autor
    @OneToMany(mappedBy = "author")
    private List<Book> books;

    public Author() {
    }

    public Author(String name_author, String lastname_author) {
        this.name_author = name_author;
        this.lastname_author = lastname_author;
    }

    public Long getId_author() {
        return id_author;
    }

    public void setId_author(Long id_author) {
        this.id_author = id_author;
    }

    public String getName_author() {
        return name_author;
    }

    public void setName_author(String name_author) {
        this.name_author = name_author;
    }

    public String getLastname_author() {
        return lastname_author;
    }

    public void setLastname_author(String lastname_author) {
        this.lastname_author = lastname_author;
    }
}
