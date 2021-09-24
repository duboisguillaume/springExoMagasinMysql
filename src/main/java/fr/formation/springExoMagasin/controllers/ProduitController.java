package fr.formation.springExoMagasin.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.formation.springExoMagasin.models.Produit;
import fr.formation.springExoMagasin.services.ProduitService;


@RestController
@RequestMapping("produits")
public class ProduitController {
	
	private ProduitService produitService;

	public ProduitController(ProduitService produitService) {
		this.produitService = produitService;
	}

	
	@PostMapping
	public Produit save(@RequestBody Produit produit) {
		return produitService.save(produit);
	}
	
	@PutMapping
	public Produit put(@RequestBody Produit produit) {
		return produitService.save(produit);
	}

	@GetMapping
	public List<Produit> findAll() {
		return produitService.findAll();
	}

	@GetMapping("{id}")
	public Produit findById(@PathVariable Long id) {
		return produitService.findById(id);
	}

	@DeleteMapping("{id}")
	public void deleteById(@PathVariable Long id) {
		produitService.deleteById(id);
	}
	
	

}
