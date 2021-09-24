package fr.formation.springExoMagasin.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.formation.springExoMagasin.models.Commande;
import fr.formation.springExoMagasin.services.CommandeService;

@RestController
@RequestMapping("commandes")
public class CommandeController {
	
	private CommandeService commandeService;

	public CommandeController(CommandeService commandeService) {
		this.commandeService = commandeService;
	}

	@GetMapping
	public List<Commande> findAll() {
		return commandeService.findAll();
	}

	@GetMapping("{id}")
	public Commande findById(@PathVariable Long id) {
		return commandeService.findById(id);
	}

	@PostMapping
	public Commande save(@RequestBody Commande commande) {
		return commandeService.save(commande);
	}

	@DeleteMapping("{id}")
	public void deleteById(@PathVariable Long id) {
		commandeService.deleteById(id);
	}
	
	

}
