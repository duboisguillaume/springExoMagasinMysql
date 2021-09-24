package fr.formation.springExoMagasin.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.formation.springExoMagasin.models.Produit;

public interface ProduitRepository extends JpaRepository<Produit, Long>{

}
