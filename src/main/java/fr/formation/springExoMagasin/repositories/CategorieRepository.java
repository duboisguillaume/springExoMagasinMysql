package fr.formation.springExoMagasin.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.formation.springExoMagasin.models.Categorie;

public interface CategorieRepository extends JpaRepository<Categorie, Long> {

}
