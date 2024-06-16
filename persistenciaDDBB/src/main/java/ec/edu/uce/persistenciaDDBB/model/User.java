package ec.edu.uce.persistenciaDDBB.model;

import jakarta.persistence.*;

import java.util.List;


@Entity
@Table(name = "Usuario")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_user;
    @Column
    private String name_user;
    @Column
    private String lastname_user;

    // Relacion de muchos a muchos pero con la tabla de Bibliotecas
    // entonces cramos la relacion manualmente aqui porque necesitamos la tabla intermedia que se crea automaticamente
    @OneToMany(mappedBy = "user")
    private List<Register> registers;

    public User() {
    }

    public User(String name_user, String lastname_user) {
        this.name_user = name_user;
        this.lastname_user = lastname_user;
    }

    public Long getId_user() {
        return id_user;
    }

    public void setId_user(Long id_user) {
        this.id_user = id_user;
    }

    public String getName_user() {
        return name_user;
    }

    public void setName_user(String name_user) {
        this.name_user = name_user;
    }

    public String getLastname_user() {
        return lastname_user;
    }

    public void setLastname_user(String lastname_user) {
        this.lastname_user = lastname_user;
    }
}
