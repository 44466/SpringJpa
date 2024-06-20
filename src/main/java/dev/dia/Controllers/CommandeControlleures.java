package dev.dia.Controllers;

import dev.dia.model.Commande;

import dev.dia.model.Produit;
import dev.dia.repository.CommandeRepository;
import dev.dia.repository.ProduitRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@ComponentScan
public class CommandeControlleures {
    @Autowired
    private CommandeRepository commandeRepository;
    ///
    @Autowired
    private ProduitRepository produitRepository;

    @PostMapping("/commande")
    Commande createSubject(@RequestBody Commande commande) {
        return commandeRepository.save(commande);
    }

//
    @PutMapping("/produits/{command_id}/produits/{produid_id}")
    Commande addPoduitToCommande(
            @PathVariable Long command_id,
            @PathVariable Long produid_id
    ) {
        Commande commande = commandeRepository.findById(command_id).get();
        Produit produit = produitRepository.findById(produid_id).get();
        commande.getProduits().add(produit);
        return commandeRepository.save(commande);

    }
}


