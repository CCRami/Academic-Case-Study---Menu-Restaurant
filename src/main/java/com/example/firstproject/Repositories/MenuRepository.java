package com.example.firstproject.Repositories;

import com.example.firstproject.Entities.Client;
import com.example.firstproject.Entities.Menu;
import com.example.firstproject.Entities.TypeMenu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface MenuRepository extends JpaRepository<Menu, Long>, CrudRepository<Menu, Long> {
    //1.4 liste des menus selon le type menu avec le prix total des composants est supérieur à un montant donné en paramètres
    List<Menu> findByTypeMenuAndPrixTotalGreaterThan(TypeMenu typeMenu, Float prixTotal);

    @Query("select m.libelleMenu from Menu m where m.typeMenu = :type order by m.prixTotal")
    List<String> findByTypeMenuOrderByPrixTotal(TypeMenu type);

    @Query("select m from Menu m JOIN m.composants c where c.nomComposant = :nom")
    List<Menu> findByNomComposant(String nom);


}
