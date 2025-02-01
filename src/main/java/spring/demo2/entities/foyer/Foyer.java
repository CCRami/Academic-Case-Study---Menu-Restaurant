package spring.demo2.entities.foyer;

import java.io.Serializable;
import java.util.Date;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Foyer implements Serializable {

    @Id
    private String IdFoyer;
    private Date nomFoyer;
    private long capaciteFoyer;

    public Foyer(String idFoyer, Date nomFoyer, long capaciteFoyer) {
        IdFoyer = idFoyer;
        this.nomFoyer = nomFoyer;
        this.capaciteFoyer = capaciteFoyer;
    }

    public Foyer() {

    }
}
