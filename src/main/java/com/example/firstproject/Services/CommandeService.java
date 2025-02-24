package com.example.firstproject.Services;

import com.example.firstproject.Entities.Commande;
import com.example.firstproject.Repositories.CommandeRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class CommandeService implements ICommandeService {
    private CommandeRepository commandeRepository;

        @Override
        public List<Commande> retrieveAllCommandes() {
            return (List<Commande>) commandeRepository.findAll();
        }

        @Override
        public Commande addCommande(Commande e) {
            return commandeRepository.save(e);
        }

        @Override
        public Commande updateCommande(Commande e) {
            return commandeRepository.save(e);
        }

        @Override
        public Commande retrieveCommande(Long idCommande) {
            return commandeRepository.findById(idCommande).get();
        }

        @Override
        public void removeCommande(Long idCommande) {
            commandeRepository.deleteById(idCommande);
        }

        @Override
        public List<Commande> addCommandes(List<Commande> commandes) {
            return (List<Commande>) commandeRepository.saveAll(commandes);
        }
}
