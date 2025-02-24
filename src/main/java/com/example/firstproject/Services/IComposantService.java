package com.example.firstproject.Services;

import com.example.firstproject.Entities.Composant;

import java.util.List;
import java.util.Optional;

public interface IComposantService {
    List<Composant> retrieveAllComposants();
    Composant addComposant(Composant c);
    Composant updateComposant(Composant c);
    Optional<Composant> retrieveComposant(Long idComposant);
    void removeComposant(Long idComposant);
    List<Composant> addComposants(List<Composant> composants);
}
