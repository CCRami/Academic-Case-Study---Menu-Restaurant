package com.example.firstproject.Repositories;

import com.example.firstproject.Entities.ChefCuisinier;
import com.example.firstproject.Entities.Client;
import org.springframework.data.repository.CrudRepository;

public interface ChefCuisinierRepository extends CrudRepository<ChefCuisinier, Long> {
}
