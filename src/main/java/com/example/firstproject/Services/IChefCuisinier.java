package com.example.firstproject.Services;

import com.example.firstproject.Entities.ChaineRestauration;
import com.example.firstproject.Entities.ChefCuisinier;

import java.util.List;

public interface IChefCuisinier {
    List<ChefCuisinier> retrieveAllChefCuisinier();
    ChefCuisinier addChefCuisinier(ChefCuisinier c);
    ChefCuisinier updateChefCuisinier(ChefCuisinier c);
    ChefCuisinier retrieveChefCuisinier(Long idChaine);
    void removeChefCuisinier(Long idChaine);
    List<ChefCuisinier> addChefCuisinier(List<ChefCuisinier> chefCuisiniers);
}
