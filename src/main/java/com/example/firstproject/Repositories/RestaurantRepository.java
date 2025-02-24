package com.example.firstproject.Repositories;

import com.example.firstproject.Entities.Client;
import com.example.firstproject.Entities.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

public interface RestaurantRepository extends JpaRepository<Restaurant, Long> {
    //1.5. liste des restaurants ayant une capacité supérieur à 100 (paramètre) et dont la chaine de restauration a été crée avant 2020 (paramètre)
    List<Restaurant> findByNbPlacesMaxGreaterThanAndChaineRestaurationDateCreationBefore(Long capacite, LocalDate dateCreation);
}
