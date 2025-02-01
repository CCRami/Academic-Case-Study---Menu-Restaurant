package spring.demo2.entities.bloc;

import java.io.Serializable;
import java.util.Date;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
public class Bloc implements Serializable {

    @Id
    private String IdBloc;
    private String nomBloc;
    private long capaciteBloc;

    public Bloc(String idBloc, String nomBloc, long capaciteBloc) {
        IdBloc = idBloc;
        this.nomBloc = nomBloc;
        this.capaciteBloc = capaciteBloc;
    }

    public Bloc() {

    }
}
