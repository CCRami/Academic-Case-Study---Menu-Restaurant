package com.example.firstproject.Services;

import com.example.firstproject.Entities.Composant;
import com.example.firstproject.Entities.Restaurant;
import com.example.firstproject.Repositories.ComposantRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
@AllArgsConstructor
public class ComposantService implements IComposantService {
    private ComposantRepository composantRepository;
    @Override
    public List<Composant> retrieveAllComposants() {
        return (List<Composant>) composantRepository.findAll();
    }

    @Override
    public Composant addComposant(Composant e) {
        return composantRepository.save(e);
    }

    @Override
    public Composant updateComposant(Composant e) {
        return composantRepository.save(e);
    }

    @Override
    public Optional<Composant> retrieveComposant(Long idComposant) {
        return composantRepository.findById(idComposant);
    }

    @Override
    public void removeComposant(Long idComposant) {
        composantRepository.deleteById(idComposant);
    }

    @Override
    public List<Composant> addComposants(List<Composant> Composants) {
        return (List<Composant>) composantRepository.saveAll(Composants);
    }
}
