package com.example.firstproject.Repositories;

import com.example.firstproject.Entities.Client;
import com.example.firstproject.Entities.DetailComposant;
import org.springframework.data.repository.CrudRepository;

public interface DetailComposantRepository extends CrudRepository<DetailComposant, Long> {
}
