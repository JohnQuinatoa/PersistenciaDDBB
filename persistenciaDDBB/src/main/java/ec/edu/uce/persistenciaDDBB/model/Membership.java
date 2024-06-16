package ec.edu.uce.persistenciaDDBB.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "Membresia")
public class Membership {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_membership;
    @Column
    private String type_membership;

    // Relacion uno a uno con registro
    @OneToOne
    @JoinColumn(name = "id_register")
    private Register register;

    // Relacion de uno a muchos con Libros
    @OneToMany(mappedBy = "membership")
    private List<Book> books;

    public Membership() {
    }

    public Membership(String type_membership) {
        this.type_membership = type_membership;
    }

    public Long getId_membership() {
        return id_membership;
    }

    public void setId_membership(Long id_membership) {
        this.id_membership = id_membership;
    }

    public String getType_membership() {
        return type_membership;
    }

    public void setType_membership(String type_membership) {
        this.type_membership = type_membership;
    }

    public Register getRegister() {
        return register;
    }

    public void setRegister(Register register) {
        this.register = register;
    }

}
