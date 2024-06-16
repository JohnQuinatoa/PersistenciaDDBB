package ec.edu.uce.persistenciaDDBB.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "Biblioteca")
public class Library {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_library;
    @Column
    private String name_library;
    @Column
    private String address_library;

    // Relacion de muchos a muchos con user asi creo la tabla intermedia manualmente
    @OneToMany(mappedBy = "library")
    private List<Register> registers;


    public Library() {
    }

    public Library(String name_library, String address_library) {
        this.name_library = name_library;
        this.address_library = address_library;
    }

    public Long getId_library() {
        return id_library;
    }

    public void setId_library(Long id_library) {
        this.id_library = id_library;
    }

    public String getName_library() {
        return name_library;
    }

    public void setName_library(String name_library) {
        this.name_library = name_library;
    }

    public String getAddress_library() {
        return address_library;
    }

    public void setAddress_library(String address_library) {
        this.address_library = address_library;
    }
}
