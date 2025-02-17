package com.example.firstproject.Repositories;

import com.example.firstproject.Entities.Client;
import com.example.firstproject.Entities.Commande;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.time.LocalDate;
import java.util.List;

public interface CommandeRepository extends JpaRepository<Commande, Long> {
    //1.1 Liste des commandes d'un client
    List<Commande> findByClientIdClient(long idclient);

    //1.2 Liste des commandes d'un client dont la date commande entre deux dates
    List<Commande> findbyClientIdClientAnddateDateCommandeBetween(long idclient,LocalDate date1, LocalDate date2);

    //1.3 liste des commandes dont la date commande entre deux dates ordonné par note prix croissant
    List<Commande> findByDateCommandeBetweenOrderByNoteAsc(LocalDate date1, LocalDate date2);



}
