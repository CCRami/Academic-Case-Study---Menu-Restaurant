package com.example.firstproject.Repositories;

import com.example.firstproject.Entities.Client;
import com.example.firstproject.Entities.Menu;
import com.example.firstproject.Entities.TypeComposant;
import com.example.firstproject.Entities.TypeMenu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface MenuRepository extends JpaRepository<Menu, Long>, CrudRepository<Menu, Long> {
    //1.4 liste des menus selon le type menu avec le prix total des composants est supérieur à un montant donné en paramètres
    List<Menu> findByTypeMenuAndPrixTotalGreaterThan(TypeMenu typeMenu, Float prixTotal);

    @Query("select m.libelleMenu from Menu m where m.typeMenu = :type order by m.prixTotal")
    List<String> findByTypeMenuOrderByPrixTotal(@Param("type")TypeMenu type);

    @Query("select m from Menu m JOIN m.composants c where c.typeComposant = :type")
    List<Menu> findByNomComposant(@Param("type") TypeComposant type);


}
