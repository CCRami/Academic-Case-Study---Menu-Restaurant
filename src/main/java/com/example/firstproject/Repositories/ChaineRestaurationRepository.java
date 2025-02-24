package com.example.firstproject.Repositories;

import com.example.firstproject.Entities.ChaineRestauration;
import com.example.firstproject.Entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.RepositoryDefinition;
import org.springframework.stereotype.Repository;


public interface ChaineRestaurationRepository extends JpaRepository<ChaineRestauration, Long> {
}
