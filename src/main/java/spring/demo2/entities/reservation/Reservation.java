package spring.demo2.entities.reservation;

import java.io.Serializable;
import java.util.Date;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Reservation implements Serializable {

    @Id
    private String IdReservation;
    private Date anneeUniversitaire;
    private boolean estValide;

    public Reservation(String idReservation, Date anneeUniversitaire, boolean estValide) {
        IdReservation = idReservation;
        this.anneeUniversitaire = anneeUniversitaire;
        this.estValide = estValide;
    }

    public Reservation() {

    }
}
