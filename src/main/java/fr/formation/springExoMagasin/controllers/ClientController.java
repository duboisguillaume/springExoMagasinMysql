package fr.formation.springExoMagasin.controllers;

import java.util.List;
import java.util.Set;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.formation.springExoMagasin.models.Client;
import fr.formation.springExoMagasin.models.Commande;
import fr.formation.springExoMagasin.services.ClientService;

@RestController
@RequestMapping("clients")
public class ClientController {
	
	private ClientService clientService;

	public ClientController(ClientService clientService) {
		this.clientService = clientService;
	}

	@PostMapping
	public Client save(@RequestBody Client client) {
		return clientService.save(client);
	}

	@GetMapping
	public List<Client> findAll() {
		return clientService.findAll();
	}

	@GetMapping("{id}")
	public Client findById(@PathVariable Long id) {
		return clientService.findById(id);
	}

	@DeleteMapping("{id}")
	public void deleteById(@PathVariable Long id) {
		clientService.deleteById(id);
	}
	
	@GetMapping("{id}/commandes")
	public List<Commande> findCommandesByClientId(@PathVariable Long id) {
		return clientService.findCommandesByClientId(id);
	}
	

}
