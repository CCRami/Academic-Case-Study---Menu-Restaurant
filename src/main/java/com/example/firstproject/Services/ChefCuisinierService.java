package com.example.firstproject.Services;

import com.example.firstproject.Entities.ChefCuisinier;
import com.example.firstproject.Repositories.ChefCuisinierRepository;

import java.util.List;

public class ChefCuisinierService implements IChefCuisinier{

    ChefCuisinierRepository cuisinierRepository;
    @Override
    public List<ChefCuisinier> retrieveAllChefCuisinier() {
        return (List<ChefCuisinier>) cuisinierRepository.findAll();
    }

    @Override
    public ChefCuisinier addChefCuisinier(ChefCuisinier c) {
        return cuisinierRepository.save(c);
    }

    @Override
    public ChefCuisinier updateChefCuisinier(ChefCuisinier c) {
        return cuisinierRepository.save(c);
    }

    @Override
    public ChefCuisinier retrieveChefCuisinier(Long idChaine) {
        return cuisinierRepository.findById(idChaine).get();
    }

    @Override
    public void removeChefCuisinier(Long idChaine) {
            cuisinierRepository.deleteById(idChaine);
    }

    @Override
    public List<ChefCuisinier> addChefCuisinier(List<ChefCuisinier> chefCuisiniers) {
        return (List<ChefCuisinier>) cuisinierRepository.saveAll(chefCuisiniers);
    }
}
