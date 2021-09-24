package fr.formation.springExoMagasin.services;

import java.util.List;

import org.springframework.stereotype.Service;

import fr.formation.springExoMagasin.models.Categorie;
import fr.formation.springExoMagasin.repositories.CategorieRepository;

@Service
public class CategorieService {
	
	private CategorieRepository categorieRepository;

	public CategorieService(CategorieRepository categorieRepository) {
		this.categorieRepository = categorieRepository;
	}

	public Categorie save(Categorie categorie) {
		return categorieRepository.save(categorie);
	}

	public List<Categorie> findAll() {
		return categorieRepository.findAll();
	}

	public Categorie findById(Long id) {
		return categorieRepository.findById(id).orElseThrow();
	}

	public void deleteById(Long id) {
		categorieRepository.deleteById(id);
	}

	
	

}
