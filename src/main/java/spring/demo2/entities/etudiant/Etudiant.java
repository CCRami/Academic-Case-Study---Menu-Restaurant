package spring.demo2.entities.etudiant;

import java.io.Serializable;
import java.util.Date;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Etudiant implements Serializable {

    @Id
    private String CIN;
    @Id
    private String nom;
    private String prenom;
    private String email;
    private Date dateNaissance;
    public Etudiant() {

    }

    public Etudiant(String CIN, String nom, String prenom, String email, Date dateNaissance) {
        this.CIN = CIN;
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.dateNaissance = dateNaissance;
    }


}
