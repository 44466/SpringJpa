package dev.dia.repository;
import dev.dia.model.Produit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author dia
 */
@Repository
    public interface ProduitRepository extends JpaRepository<Produit, Long> {}

