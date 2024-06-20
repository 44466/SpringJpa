package dev.dia.Controllers;



import dev.dia.model.Produit;
import dev.dia.repository.ProduitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@ComponentScan
public class ProduitControlleurs {
    @Autowired
    ProduitRepository produitRepository;

    @GetMapping("/produits")
    List<Produit> getStudents() {
        return produitRepository.findAll();
    }

    @PostMapping("/produit")
    Produit createProduit(@RequestBody Produit produit) {
        return produitRepository.save(produit);

    }


   }