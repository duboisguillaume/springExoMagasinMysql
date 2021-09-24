package fr.formation.springExoMagasin.services;

import java.util.List;

import org.springframework.stereotype.Service;

import fr.formation.springExoMagasin.models.Produit;
import fr.formation.springExoMagasin.repositories.ProduitRepository;

@Service
public class ProduitService {

	private ProduitRepository produitRepository;

	public ProduitService(ProduitRepository produitRepository) {
		this.produitRepository = produitRepository;
	}

	public Produit save(Produit produit) {
		return produitRepository.save(produit);
	}

	public List<Produit> findAll() {
		return produitRepository.findAll();
	}

	public Produit findById(Long id) {
		return produitRepository.findById(id).orElseThrow();
	}

	public void deleteById(Long id) {
		produitRepository.deleteById(id);
	}
	
	
}
