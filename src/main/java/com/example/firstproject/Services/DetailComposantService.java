package com.example.firstproject.Services;

import com.example.firstproject.Entities.Composant;
import com.example.firstproject.Entities.DetailComposant;
import com.example.firstproject.Repositories.ComposantRepository;
import com.example.firstproject.Repositories.DetailComposantRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
@AllArgsConstructor
public class DetailComposantService implements IDetailComposantService {
    private DetailComposantRepository detailComposantRepository;
    @Override
    public List<DetailComposant> retrieveAllDetailComposants() {
        return (List<DetailComposant>) detailComposantRepository.findAll();
    }

    @Override
    public DetailComposant addDetailComposant(DetailComposant e) {
        return detailComposantRepository.save(e);
    }

    @Override
    public DetailComposant updateDetailComposant(DetailComposant e) {
        return detailComposantRepository.save(e);
    }

    @Override
    public Optional<DetailComposant> retrieveDetailComposant(Long idDetailComposant) {
        return detailComposantRepository.findById(idDetailComposant);
    }

    @Override
    public void removeDetailComposant(Long idDetailComposant) {
        detailComposantRepository.deleteById(idDetailComposant);
    }

    @Override
    public List<DetailComposant> addDetailComposants(List<DetailComposant> DetailComposants) {
        return (List<DetailComposant>) detailComposantRepository.saveAll(DetailComposants);
    }
}
