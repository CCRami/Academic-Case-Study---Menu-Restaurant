package com.example.firstproject.Services;

import com.example.firstproject.Entities.Composant;
import com.example.firstproject.Entities.DetailComposant;

import java.util.List;
import java.util.Optional;

public interface IDetailComposantService {
    List<DetailComposant> retrieveAllDetailComposants();
    DetailComposant addDetailComposant(DetailComposant c);
    DetailComposant updateDetailComposant(DetailComposant c);
    Optional<DetailComposant> retrieveDetailComposant(Long idDetailComposant);
    void removeDetailComposant(Long idDetailComposant);
    List<DetailComposant> addDetailComposants(List<DetailComposant> DetailComposant);
}
