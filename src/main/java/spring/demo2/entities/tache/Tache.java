package spring.demo2.entities.tache;

import java.io.Serializable;
import java.time.LocalDate;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Tache implements Serializable {

    @Id
    private String IdTache;
    private LocalDate dateTache;
    private int duree;
    private float tarifHoraire;
    private TypeTache typeTache;

    public Tache(String idTache, LocalDate dateTache, int duree, float tarifHoraire, TypeTache typeTache) {
        IdTache = idTache;
        this.dateTache = dateTache;
        this.duree = duree;
        this.tarifHoraire = tarifHoraire;
        this.typeTache = typeTache;
    }

    public Tache() {

    }
}
