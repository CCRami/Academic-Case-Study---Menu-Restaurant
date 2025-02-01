package spring.demo2.entities.universite;

import java.io.Serializable;
import java.util.Date;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Universite implements Serializable {

    @Id
    private String IdUniversite;
    private Date nomUniversite;
    private String adresse;

    public Universite(String idUniversite, Date nomUniversite, String adresse) {
        IdUniversite = idUniversite;
        this.nomUniversite = nomUniversite;
        this.adresse = adresse;
    }

    public Universite() {

    }
}
