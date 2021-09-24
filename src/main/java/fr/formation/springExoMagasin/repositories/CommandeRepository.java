package fr.formation.springExoMagasin.repositories;

import java.util.List;
import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.formation.springExoMagasin.models.Commande;

public interface CommandeRepository extends JpaRepository<Commande, Long>{

	public List<Commande> findByClientId(Long id);

}
