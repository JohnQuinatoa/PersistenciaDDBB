package ec.edu.uce.persistenciaDDBB.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "Libro")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_book;
    @Column
    private String name_book;
    @Column
    private String editorial_book;

    // Relacion de muchos a uno con membresia
    @ManyToOne
    @JoinColumn(name = "id_membership")
    private Membership membership;

    // Relacion de muchos a uno con Autor
    @ManyToOne
    @JoinColumn(name = "id_author")
    private Author author;

    public Book() {
    }

    public Book(String name_book, String editorial_book) {
        this.name_book = name_book;
        this.editorial_book = editorial_book;
    }

    public long getId_book() {
        return id_book;
    }

    public void setId_book(long id_book) {
        this.id_book = id_book;
    }

    public String getName_book() {
        return name_book;
    }

    public void setName_book(String name_book) {
        this.name_book = name_book;
    }

    public String getEditorial_book() {
        return editorial_book;
    }

    public void setEditorial_book(String editorial_book) {
        this.editorial_book = editorial_book;
    }

    public Membership getMembership() {
        return membership;
    }

    public void setMembership(Membership membership) {
        this.membership = membership;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }
}
