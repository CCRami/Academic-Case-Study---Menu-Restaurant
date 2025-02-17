package com.example.firstproject.Services;

import com.example.firstproject.Entities.ChaineRestauration;
import com.example.firstproject.Entities.Client;

import java.util.List;

public interface IChaineRestaurationService {

    List<ChaineRestauration> retrieveAllChaineResataution();
    ChaineRestauration addChaineResataution(ChaineRestauration c);
    ChaineRestauration updateChaineResataution(ChaineRestauration c);
    ChaineRestauration retrieveChaineResataution(Long idChaine);
    void removeChaineResataution(Long idChaine);
    List<ChaineRestauration> addChaineResataution (List<ChaineRestauration> chaineRestaurations);
}
