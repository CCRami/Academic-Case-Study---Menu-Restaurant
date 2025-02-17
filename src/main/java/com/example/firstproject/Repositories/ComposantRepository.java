package com.example.firstproject.Repositories;

import com.example.firstproject.Entities.Client;
import com.example.firstproject.Entities.Composant;
import org.springframework.data.repository.CrudRepository;

public interface ComposantRepository extends CrudRepository<Composant, Long> {
}
