package com.example.firstproject.Repositories;

import com.example.firstproject.Entities.ChefCuisinier;
import com.example.firstproject.Entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


public interface ChefCuisinierRepository extends JpaRepository<ChefCuisinier, Long> {
}
