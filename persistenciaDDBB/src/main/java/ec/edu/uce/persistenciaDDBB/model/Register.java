package ec.edu.uce.persistenciaDDBB.model;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "Registro")
public class Register {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_register;
    @Column
    private Date date_register;

    // Relacion de muchos a muchos pero creando la tabla entre User y Biblioteca Manualmente
    // porque utilizo esa tabla para una relacion de una a uno
    @ManyToOne
    @JoinColumn(name = "id_user")
    private User user;

    @ManyToOne
    @JoinColumn(name = "id_library")
    private Library library;

    // Relación de uno a uno con membresia
    @OneToOne(mappedBy = "register")
    private Membership membership;

    public Register() {
    }

    public Register(Date date_register) {
        this.date_register = date_register;
    }

    public Long getId_register() {
        return id_register;
    }

    public void setId_register(Long id_register) {
        this.id_register = id_register;
    }

    public Date getDate_register() {
        return date_register;
    }

    public void setDate_register(Date date_register) {
        this.date_register = date_register;
    }


    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Library getLibrary() {
        return library;
    }

    public void setLibrary(Library library) {
        this.library = library;
    }

}
