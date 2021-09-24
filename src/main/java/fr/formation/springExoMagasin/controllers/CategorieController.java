package fr.formation.springExoMagasin.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.formation.springExoMagasin.models.Categorie;
import fr.formation.springExoMagasin.services.CategorieService;

@RestController
@RequestMapping("categories")
public class CategorieController {

	private CategorieService categorieService;

	public CategorieController(CategorieService categorieService) {
		this.categorieService = categorieService;
	}

	@PostMapping
	public Categorie save(@RequestBody Categorie categorie) {
		return categorieService.save(categorie);
	}
	
	@GetMapping
	public List<Categorie> findAll() {
		return categorieService.findAll();
	}

	@GetMapping("{id}")
	public Categorie findById(@PathVariable Long id) {
		return categorieService.findById(id);
	}

	@DeleteMapping("{id}")
	public void deleteById(@PathVariable Long id) {
		categorieService.deleteById(id);
	}
	
	
}
