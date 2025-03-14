package com.example.firstproject.Services;

import com.example.firstproject.Entities.ChaineRestauration;
import com.example.firstproject.Repositories.ChaineRestaurationRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class ChaineRestaurationService implements IChaineRestaurationService{

    ChaineRestaurationRepository chaineRestaurationRepository;
    @Override
    public List<ChaineRestauration> retrieveAllChaineResatautions() {
        return (List<ChaineRestauration>) chaineRestaurationRepository.findAll();
    }

    @Override
    public ChaineRestauration addChaineResataution(ChaineRestauration c) {
        return chaineRestaurationRepository.save(c);
    }

    @Override
    public ChaineRestauration updateChaineResataution(ChaineRestauration c) {
        return chaineRestaurationRepository.save(c);
    }

    @Override
    public ChaineRestauration retrieveChaineResataution(Long idChaine) {
        return chaineRestaurationRepository.findById(idChaine).get();
    }

    @Override
    public void removeChaineResataution(Long idChaine) {
            chaineRestaurationRepository.deleteById(idChaine);
    }

    @Override
    public List<ChaineRestauration> addChaineResatautions(List<ChaineRestauration> chaineRestaurations) {
        return (List<ChaineRestauration>) chaineRestaurationRepository.saveAll(chaineRestaurations);
    }
}
