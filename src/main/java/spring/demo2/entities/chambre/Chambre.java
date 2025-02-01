package spring.demo2.entities.chambre;

import java.io.Serializable;
import java.util.Date;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Chambre implements Serializable {

    @Id
    private String IdChambre;
    private Long numeroChambre;
    private typeC TypeChambre;

    public Chambre(String idChambre, Long numeroChambre, typeC typeChambre) {
        IdChambre = idChambre;
        this.numeroChambre = numeroChambre;
        TypeChambre = typeChambre;
    }

    public Chambre() {

    }
}
